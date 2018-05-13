package io.iliass.traceuravion.antenna;

public class AngleOfView {
    private float angleRange;
    private float angleCenter;

    public AngleOfView() {
    }

    public AngleOfView(float angleRange, float angleCenter) {
        this.angleRange = angleRange;
        this.angleCenter = angleCenter;
    }

    public float getAngleRange() {
        return angleRange;
    }

    public void setAngleRange(float angleRange) {
        this.angleRange = angleRange;
    }

    public float getAngleCenter() {
        return angleCenter;
    }

    public void setAngleCenter(float angleCenter) {
        this.angleCenter = angleCenter;
    }

    @Override
    public String toString() {
        return "AngleOfView{" +
                "angleRange=" + angleRange +
                ", angleCenter=" + angleCenter +
                '}';
    }
}
