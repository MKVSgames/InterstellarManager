package com.games.mkvs.interstellarmanager.models;

import java.util.List;

public class World {
    public String name;
    public List<Planet> planets;
    public Position position;

    public World(String name, List<Planet> planets, Position position) {
       this.name=name;
       this.planets=planets;
       this.position=position;
    }

}
