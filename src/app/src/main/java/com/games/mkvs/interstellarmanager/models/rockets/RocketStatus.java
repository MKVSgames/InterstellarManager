package com.games.mkvs.interstellarmanager.models.rockets;

import com.games.mkvs.interstellarmanager.models.Planet;

public class RocketStatus {
    public boolean isInFlight;
    public Planet planet;
    public CrashStatus rocketStatus;

    public RocketStatus(boolean isInFlight, Planet planet, CrashStatus rocketStatus) {
        this.isInFlight = isInFlight;
        this.planet = planet;
        this.rocketStatus = rocketStatus;
    }
}
