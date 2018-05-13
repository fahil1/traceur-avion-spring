package io.iliass.traceuravion.antenna;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Document(collection = "Antennas")
public class Antenna {
    @Id
    private String id;
    private String name;
    private float frequency;
    private double position[] = new double[2];
    List<Poi> poiList = new ArrayList<>();
    private int totalPois;
    private AngleOfView angleOfView = null;
    private Date createdAt = new Date();

    public Antenna() {
    }

    public Antenna(String name, float frequency, double[] position, List<Poi> poiList, int totalPois, AngleOfView angleOfView) {
        this.name = name;
        this.frequency = frequency;
        this.position = position;
        this.poiList = poiList;
        this.totalPois = totalPois;
        this.angleOfView = angleOfView;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public List<Poi> getPoiList() {
        return poiList;
    }

    public void setPoiList(List<Poi> poiList) {
        this.poiList = poiList;
    }

    public int getTotalPois() {
        return totalPois;
    }

    public void setTotalPois(int totalPois) {
        this.totalPois = totalPois;
    }

    public AngleOfView getAngleOfView() {
        return angleOfView;
    }

    public void setAngleOfView(AngleOfView angleOfView) {
        this.angleOfView = angleOfView;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Antenna{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                ", position=" + Arrays.toString(position) +
                ", poiList=" + poiList +
                ", totalPois=" + totalPois +
                ", angleOfView=" + angleOfView +
                ", createdAt=" + createdAt +
                '}';
    }
}
