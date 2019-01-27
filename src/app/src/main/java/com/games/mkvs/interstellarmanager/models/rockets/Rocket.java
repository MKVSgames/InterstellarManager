package com.games.mkvs.interstellarmanager.models.rockets;

public class Rocket {
    public String name;
    public long price;
    public RocketOverall rocketOverall;
    public RocketStatus rocketStatus;

    public Rocket(String name, long price, RocketOverall rocketOverall, RocketStatus rocketStatus) {
        this.name=name;
        this.price=price;
        this.rocketOverall = rocketOverall;
        this.rocketStatus = rocketStatus;
    }


}
