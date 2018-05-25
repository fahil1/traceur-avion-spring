package io.iliass.traceuravion.statistics;

import java.util.List;

public class Stats {
    private Long countAntennas;
    private Long countPOIs;
    private Long countRecordings;
    private Long countPositions;
    private Long countDirectionnal;
    private Long countOmni;
    private List<SingleDate> singleDateList;

    public Stats() {
    }

    public Long getCountAntennas() {
        return countAntennas;
    }

    public void setCountAntennas(Long countAntennas) {
        this.countAntennas = countAntennas;
    }

    public Long getCountPOIs() {
        return countPOIs;
    }

    public void setCountPOIs(Long countPOIs) {
        this.countPOIs = countPOIs;
    }

    public Long getCountRecordings() {
        return countRecordings;
    }

    public void setCountRecordings(Long countRecordings) {
        this.countRecordings = countRecordings;
    }

    public Long getCountPositions() {
        return countPositions;
    }

    public void setCountPositions(Long countPositions) {
        this.countPositions = countPositions;
    }

    public Long getCountDirectionnal() {
        return countDirectionnal;
    }

    public void setCountDirectionnal(Long countDirectionnal) {
        this.countDirectionnal = countDirectionnal;
    }

    public Long getCountOmni() {
        return countOmni;
    }

    public void setCountOmni(Long countOmni) {
        this.countOmni = countOmni;
    }

    public List<SingleDate> getSingleDateList() {
        return singleDateList;
    }

    public void setSingleDateList(List<SingleDate> singleDateList) {
        this.singleDateList = singleDateList;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "countAntennas=" + countAntennas +
                ", countPOIs=" + countPOIs +
                ", countRecordings=" + countRecordings +
                ", countPositions=" + countPositions +
                '}';
    }
}
