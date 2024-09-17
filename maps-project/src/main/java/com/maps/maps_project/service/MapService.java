package com.maps.maps_project.service;

import com.maps.maps_project.dtos.MapRequestDTO;
import com.maps.maps_project.dtos.MapResponseDTO;
import com.maps.maps_project.factory.MapFactory;
import com.maps.maps_project.model.Map;
import com.maps.maps_project.repository.MapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {
    private final MapRepository mapRepository;

    public MapService(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }

    public MapResponseDTO createMap(MapRequestDTO mapRequestDTO){
        Map map = mapRepository.save(MapFactory.convertDTOToMap(mapRequestDTO));
        return MapFactory.convertMapToDTO(map);
    }

    public List<MapResponseDTO> getAllMaps(){
        return MapFactory.convertListToDTOList(mapRepository.findAll());
    }

    public String deleteMap(String id){
        mapRepository.deleteById(id);

        return "Map deleted";
    }

    public MapResponseDTO getMap(String id){
        return MapFactory.convertMapToDTO(mapRepository.findById(id).orElseThrow());
    }
}
