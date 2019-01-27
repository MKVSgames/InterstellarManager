package com.games.mkvs.interstellarmanager.models;

import com.games.mkvs.interstellarmanager.models.rockets.Rocket;

import java.util.List;

public class Market {
    public List<Rocket> rockets;

    public Market(List<Rocket> rockets) {
        this.rockets=rockets;
    }

}
