package com.maps.maps_project.controller;

import com.maps.maps_project.dtos.MapRequestDTO;
import com.maps.maps_project.dtos.MapResponseDTO;
import com.maps.maps_project.service.MapService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MapController {

    public MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @PostMapping
    public ResponseEntity<MapResponseDTO> createMap(@RequestBody MapRequestDTO mapRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mapService.createMap(mapRequestDTO));
    }

    @GetMapping
    public ResponseEntity<List<MapResponseDTO>> getMaps() {
        return ResponseEntity.ok(mapService.getAllMaps());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MapResponseDTO> getMapById(@PathVariable("id") String id) {
        return ResponseEntity.ok(mapService.getMap(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteMap(@PathVariable("id") String id) {
        mapService.deleteMap(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MapResponseDTO> updateMap(@PathVariable("id") String id, @RequestBody MapRequestDTO mapRequest) {
        return ResponseEntity.ok(mapService.updateMap(id, mapRequest));
    }
}
