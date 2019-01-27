package com.games.mkvs.interstellarmanager.models.rockets;

import com.games.mkvs.interstellarmanager.models.Planet;

public class RocketStatus {
    public boolean isInFlight;
    public Planet onPlanet;
    public CrashStatus rocketCondition;

    public RocketStatus(boolean isInFlight, Planet onPlanet, CrashStatus rocketCondition) {
        this.isInFlight = isInFlight;
        this.onPlanet = onPlanet;
        this.rocketCondition = rocketCondition;
    }
}
