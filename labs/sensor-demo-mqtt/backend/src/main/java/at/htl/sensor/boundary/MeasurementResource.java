package at.htl.sensor.boundary;

import at.htl.sensor.control.MeasurementRepository;
import at.htl.sensor.entity.Measurement;
import jakarta.inject.Inject;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.List;

@Path("/api/measurements")
public class MeasurementResource {

    @Inject
    MeasurementRepository repository;

    @GET
    public List<Measurement> getAll(
            @QueryParam("sensor") String sensor,
            @QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("size") @DefaultValue("50") int size) {
        if (sensor != null && !sensor.isBlank()) {
            return repository.findBySensorPaged(sensor, page, size);
        }
        return repository.findAllPaged(page, size);
    }

    @GET
    @Path("/latest")
    public List<Measurement> getLatest() {
        return repository.findLatestPerSensor();
    }
}
