package org.example.builder.model;

public class Plate {

    private int id;
    private String color;
    private Content content;

    public Plate(int id, String color, Content content) {
        this.id = id;
        this.color = color;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
