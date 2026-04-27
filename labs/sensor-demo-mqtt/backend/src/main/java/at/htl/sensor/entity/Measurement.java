package at.htl.sensor.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "measurement")
public class Measurement extends PanacheEntity {

    @Column(nullable = false)
    public String sensor;

    @Column(nullable = false)
    public double value;

    @Column(nullable = false)
    public String unit;

    @Column(name = "timestamp", nullable = false)
    public LocalDateTime timestamp;

    public Measurement() {
    }

    public Measurement(String sensor, double value, String unit, LocalDateTime timestamp) {
        this.sensor = sensor;
        this.value = value;
        this.unit = unit;
        this.timestamp = timestamp;
    }
}
