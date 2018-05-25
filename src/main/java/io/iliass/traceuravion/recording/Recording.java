package io.iliass.traceuravion.recording;

import io.iliass.traceuravion.antenna.Antenna;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "Recordings")
public class Recording {
    @Id
    private String id;
    private String icao;
    private String call_sign;
    private Antenna antenna;
    private List<Position> positions;
    private Long totalPositions;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date createdAt;

    public Recording() {
    }

    public Recording(String id, String icao, String call_sign, Antenna antenna, List<Position> positions, Long totalPositions, Date createdAt) {
        this.id = id;
        this.icao = icao;
        this.call_sign = call_sign;
        this.antenna = antenna;
        this.positions = positions;
        this.totalPositions = totalPositions;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getCall_sign() {
        return call_sign;
    }

    public void setCall_sign(String call_sign) {
        this.call_sign = call_sign;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Long getTotalPositions() {
        return totalPositions;
    }

    public void setTotalPositions(Long totalPositions) {
        this.totalPositions = totalPositions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Antenna getAntenna() {
        return antenna;
    }

    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "id='" + id + '\'' +
                ", icao='" + icao + '\'' +
                ", call_sign='" + call_sign + '\'' +
                ", positions=" + positions +
                ", totalPositions=" + totalPositions +
                ", createdAt=" + createdAt +
                '}';
    }
}
