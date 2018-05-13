package io.iliass.traceuravion.antenna;

import java.util.Date;

public class Poi {
    private String name;
    private double position[] = new double[2];
    private double distance;
    private float azimuth;
    private Date createdAt = new Date();

    public Poi() {
    }

    public Poi(String name, double[] position) {
        this.name = name;
        this.position = position;
        this.distance = 0;
        this.azimuth = 0L;
    }

    public Poi(String name, double[] position, double distance, float azimuth) {
        this.name = name;
        this.position = position;
        this.distance = distance;
        this.azimuth = azimuth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public float getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
    }
}
