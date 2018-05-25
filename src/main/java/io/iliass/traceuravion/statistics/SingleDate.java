package io.iliass.traceuravion.statistics;

public class SingleDate {
    private String date;
    private Long count;

    public SingleDate() {
    }

    public SingleDate(String date, Long count) {
        this.date = date;
        this.count = count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SingleDate{" +
                "date='" + date + '\'' +
                ", count=" + count +
                '}';
    }
}
