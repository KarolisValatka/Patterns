package org.example.builder;

import org.example.builder.dto.PlateDto;
import org.example.builder.model.Content;
import org.example.builder.model.Plate;

public class Director {

    public static void main(String[] args) {
        Plate plate = new Plate(1, "ginger", new Content("Watermelon"));
        PlateDtoBuilder builder = new PlateWebDtoBuilder();

        PlateDto dto = directorPlateBuilder(builder, plate);

        System.out.println(dto.getColor() + dto.getMatter());
    }

    private static PlateDto directorPlateBuilder(PlateDtoBuilder builder, Plate plate) {
        return builder
                .withColor(plate.getColor())
                .withContent(plate.getContent().getMatter())
                .build();
    }
}
