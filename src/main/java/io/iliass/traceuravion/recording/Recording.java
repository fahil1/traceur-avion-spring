package io.iliass.traceuravion.recording;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Recordings")
public class Recording {
    @Id
    private String id;
    private String icao;
    private String call_sign;
    private List<Position> positions;
    private Date createdAt;

    public Recording() {
    }

    public Recording(String id, String icao, String call_sign, Date createdAt) {
        this.id = id;
        this.icao = icao;
        this.call_sign = call_sign;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "id='" + id + '\'' +
                ", icao='" + icao + '\'' +
                ", call_sign='" + call_sign + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
