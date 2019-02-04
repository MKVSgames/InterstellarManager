package com.games.mkvs.interstellarmanager.models;

public class Planet {
    public String name;
    public Position position;
    public World world;


    public Planet(String name, Position position, World world) {
      this.name=name;
      this.position=position;
      this.world=world;
    }


}
