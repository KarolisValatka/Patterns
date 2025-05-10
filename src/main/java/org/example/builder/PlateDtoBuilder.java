package org.example.builder;

import org.example.builder.dto.PlateDto;
import org.example.builder.model.Content;

public interface PlateDtoBuilder {

    PlateDtoBuilder withColor(String color);
    PlateDtoBuilder withContent(String content);
    PlateDto build();
    PlateDto getPlateDto();
}
