package org.example.builder.dto;

public class PlateDto {

    private String matter;
    private String color;

    public PlateDto(String color, String content) {
        this.matter = content;
        this.color = color;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
