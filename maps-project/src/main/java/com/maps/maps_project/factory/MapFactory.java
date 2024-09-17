package com.maps.maps_project.factory;

import com.maps.maps_project.dtos.MapRequestDTO;
import com.maps.maps_project.dtos.MapResponseDTO;
import com.maps.maps_project.model.Map;

import java.util.List;
import java.util.stream.Collectors;

public class MapFactory {
    public static MapResponseDTO convertMapToDTO(Map map) {
        return new MapResponseDTO(map.getId(), map.getName(), map.getDescription(), map.getPopulation(), map.getSize());
    }

    public static Map convertDTOToMap(MapRequestDTO mapRequestDTO) {
        return new Map(mapRequestDTO.name(), mapRequestDTO.description(), mapRequestDTO.population(), mapRequestDTO.size());
    }

    public static List<MapResponseDTO> convertListToDTOList(List<Map> maps) {
        return maps
                .stream()
                .map(map -> new MapResponseDTO(map.getId(), map.getName(), map.getDescription(), map.getPopulation(), map.getSize()))
                .collect(Collectors.toList());
    }
}
