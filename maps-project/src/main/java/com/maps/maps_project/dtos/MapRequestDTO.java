package com.maps.maps_project.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MapRequestDTO(
        @NotBlank
        String name,
        @NotBlank
        String description,
        @NotNull
        int population,
        @NotNull
        int size) {
}
