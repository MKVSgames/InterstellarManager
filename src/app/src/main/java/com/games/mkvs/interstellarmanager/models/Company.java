package com.games.mkvs.interstellarmanager.models;

import com.games.mkvs.interstellarmanager.models.rockets.Rocket;

import java.util.List;

public class Company {
    public String name;
    public long budget;
    public List<Rocket> rockets;
    public long marketValue;

    public Company(String name, long budget, List<Rocket> rockets, long marketValue) {
       this.name=name;
       this.budget=budget;
       this.rockets=rockets;
       this.marketValue=marketValue;
    }


}
