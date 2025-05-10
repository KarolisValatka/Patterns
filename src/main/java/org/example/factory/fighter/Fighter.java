package org.example.factory.fighter;

import org.example.factory.style.Style;

public class Fighter extends Style {

    private long height;
    private double weight;
    private String country;
    private int age;
    private String fullName;

    public Fighter(
            long height,
            double weight,
            String country,
            int age,
            String fullName,
            long bjj,
            long wrestling,
            long striking
    ) {
        this.height = height;
        this. weight = weight;
        this.age = age;
        this.country = country;
        this.fullName = fullName;
        setBjj(bjj);
        setStriking(striking);
        setWrestling(wrestling);
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
