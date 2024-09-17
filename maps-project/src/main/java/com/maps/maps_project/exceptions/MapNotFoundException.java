package com.maps.maps_project.exceptions;

public class MapNotFoundException extends RuntimeException{
    public MapNotFoundException(){
        super("Map not found");
    }
}
