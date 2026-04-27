package at.htl.sensor.control;

import at.htl.sensor.entity.Measurement;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class MeasurementRepository implements PanacheRepository<Measurement> {

    public List<Measurement> findAllPaged(int page, int size) {
        return findAll(Sort.by("timestamp").descending())
                .page(Page.of(page, size))
                .list();
    }

    public List<Measurement> findBySensorPaged(String sensor, int page, int size) {
        return find("sensor", Sort.by("timestamp").descending(), sensor)
                .page(Page.of(page, size))
                .list();
    }

    public List<Measurement> findLatestPerSensor() {
        return list("""
                SELECT m FROM Measurement m
                WHERE m.timestamp = (
                    SELECT MAX(m2.timestamp) FROM Measurement m2
                    WHERE m2.sensor = m.sensor
                )
                ORDER BY m.sensor
                """);
    }
}
