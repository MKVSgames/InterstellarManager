package com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts;

/**
 * Created by Martin on 27.12.2018 г..
 */

public interface Rotatable {
    void rotateX3D(float delta);

    void rotateY3D(float delta);

    void rotateZ3D(float delta);
}
