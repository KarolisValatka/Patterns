package org.example.factory.style;

public abstract class Style {
    private long striking;
    private long wrestling;
    private long bjj;

    public Style(long striking, long wrestling, long bjj) {
        this.bjj = bjj;
        this.striking = striking;
        this.wrestling = wrestling;
    }

    public long getStriking() {
        return striking;
    }

    public void setStriking(long striking) {
        this.striking = striking;
    }

    public long getWrestling() {
        return wrestling;
    }

    public void setWrestling(long wrestling) {
        this.wrestling = wrestling;
    }

    public long getBjj() {
        return bjj;
    }

    public void setBjj(long bjj) {
        this.bjj = bjj;
    }

    @Override
    public String toString() {
        return "Style{" +
                "striking=" + striking +
                ", wrestling=" + wrestling +
                ", bjj=" + bjj +
                '}';
    }
}
