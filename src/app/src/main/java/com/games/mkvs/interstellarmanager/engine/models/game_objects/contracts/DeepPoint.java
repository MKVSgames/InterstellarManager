package com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts;

/**
 * Created by Martin on 27.12.2018 г..
 */

public class DeepPoint {
    private float x;
    private float y;
    private float z;

    public DeepPoint(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setZ(float value) {
        this.z = value;
    }

    public void setY(float value) {
        this.y = value;
    }

    public void setX(float value) {
        this.x = value;
    }
}
