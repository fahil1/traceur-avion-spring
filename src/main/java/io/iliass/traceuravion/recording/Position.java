package io.iliass.traceuravion.recording;

import java.util.Arrays;
import java.util.Date;

public class Position {
    private float altitude;
    private double position[] = new double[2];
    private float speed;
    private float heading;
    private float vertical_rate;
    private Date occuredAt;

    public Position() {
    }

    public Position(float altitude, double[] position, float speed, float heading, float vertical_rate, Date occuredAt) {
        this.altitude = altitude;
        this.position = position;
        this.speed = speed;
        this.heading = heading;
        this.vertical_rate = vertical_rate;
        this.occuredAt = occuredAt;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getHeading() {
        return heading;
    }

    public void setHeading(float heading) {
        this.heading = heading;
    }

    public float getVertical_rate() {
        return vertical_rate;
    }

    public void setVertical_rate(float vertical_rate) {
        this.vertical_rate = vertical_rate;
    }

    public Date getOccuredAt() {
        return occuredAt;
    }

    public void setOccuredAt(Date occuredAt) {
        this.occuredAt = occuredAt;
    }

    @Override
    public String toString() {
        return "Position{" +
                "altitude=" + altitude +
                ", position=" + Arrays.toString(position) +
                ", speed=" + speed +
                ", heading=" + heading +
                ", vertical_rate=" + vertical_rate +
                ", occuredAt=" + occuredAt +
                '}';
    }
}
