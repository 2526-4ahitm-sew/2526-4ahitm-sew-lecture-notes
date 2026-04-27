package at.htl.sensor.mqtt;

import at.htl.sensor.control.MeasurementRepository;
import at.htl.sensor.entity.Measurement;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import java.time.LocalDateTime;

@ApplicationScoped
public class SensorMessageConsumer {

    @Inject
    MeasurementRepository repository;

    @Incoming("nili3-co2")
    @Transactional
    public void consumeCo2(byte[] payload) {
        persist("nili3_co2", payload, "ppm");
    }

    @Incoming("nili3-temperature")
    @Transactional
    public void consumeTemperature(byte[] payload) {
        persist("nili3_temperature", payload, "°C");
    }

    private void persist(String sensor, byte[] payload, String unit) {
        String raw = new String(payload).trim();
        try {
            double value = Double.parseDouble(raw);
            var measurement = new Measurement(sensor, value, unit, LocalDateTime.now());
            repository.persist(measurement);
            Log.infof("%s: %.2f %s", sensor, value, unit);
        } catch (NumberFormatException e) {
            Log.warnf("Invalid payload for %s: '%s'", sensor, raw);
        }
    }
}
