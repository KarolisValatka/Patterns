package org.example.builder;

import org.example.builder.dto.PlateDto;
import org.example.builder.model.Content;

public class PlateWebDtoBuilder implements PlateDtoBuilder {
    private String plateColor;
    private String matter;
    private PlateDto plateDto;

    @Override
    public PlateDtoBuilder withColor(String color) {
        plateColor = color;
        return this;
    }

    @Override
    public PlateDtoBuilder withContent(String content) {
        matter = content;
        return this;
    }

    @Override
    public PlateDto build() {
        plateDto = new PlateDto(this.plateColor, this.matter);
        return plateDto;
    }

    @Override
    public PlateDto getPlateDto() {
        return plateDto;
    }
}
