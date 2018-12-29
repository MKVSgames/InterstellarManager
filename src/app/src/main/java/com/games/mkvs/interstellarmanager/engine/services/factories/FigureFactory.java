package com.games.mkvs.interstellarmanager.engine.services.factories;

import android.graphics.Paint;

import com.games.mkvs.interstellarmanager.constants.Constants;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.ComplexObject;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Cube;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Parallelepiped;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Plane;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Pyramid;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Sphere;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.DeepPoint;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;

import java.util.ArrayList;

/**
 * Created by Martin on 28.12.2018 г..
 */

public class FigureFactory {
    private static FigureFactory instance;
    private boolean centered;

    private FigureFactory() {
        this.centered = true;
    }

    public static FigureFactory getInstance() {
        if(instance == null) {
            instance = new FigureFactory();
        }

        return instance;
    }

    public Cube createCube(float x, float y, float z, float edgeLength, Paint edgePaint, Paint wallPaint, float rotation) {
        DeepPoint dp = centerInScreen(x, y, z);
        Cube cube = new Cube(dp.getX(), dp.getY(), dp.getZ(), edgeLength, edgePaint, wallPaint, rotation);
        return cube;
    }

    public Parallelepiped createParallelepiped(float x, float y, float z,
                                               float aLength, float bLength, float cLength,
                                               Paint edgePaint, Paint wallPaint, float rotation) {
        DeepPoint dp = centerInScreen(x, y, z);
        Parallelepiped para = new Parallelepiped(dp.getX(), dp.getY(), dp.getZ(), aLength, bLength, cLength, edgePaint, wallPaint, rotation);
        return para;
    }

    public Pyramid createPyramid(float x, float y, float z, Paint edgePaint,
                                 Paint wallPaint, float rotation, float aLength, float bLength, float h) {
        DeepPoint dp = centerInScreen(x, y, z);
        Pyramid pyramid = new Pyramid(dp.getX(), dp.getY(), dp.getZ(), edgePaint, wallPaint, rotation, aLength, bLength, h);
        return pyramid;
    }

    public Plane createPlane(float x, float y, float z, Paint edgePaint, Paint wallPaint,
                             float rotation, float aLength, float bLength) {
        DeepPoint dp = centerInScreen(x, y, z);
        Plane plane = new Plane(dp.getX(), dp.getY(), dp.getZ(), edgePaint, wallPaint, rotation, aLength, bLength);
        return plane;
    }

    public Sphere createSphere(float x, float y, float z, Paint edgePaint, Paint wallPaint,
                               float rotation, float radius) {
        DeepPoint dp = centerInScreen(x, y, z);
        Sphere sphere = new Sphere(dp.getX(), dp.getY(), dp.getZ(), edgePaint, wallPaint, rotation, radius);
        return sphere;
    }

    public ComplexObject createComplexObject(float x, float y, float z, Paint edgePaint,
                                             Paint wallPaint, float rotation, ArrayList<Object3D> objects) {
        DeepPoint dp = centerInScreen(x, y, z);
        ComplexObject complexObject = new ComplexObject(dp.getX(), dp.getY(), dp.getZ(), edgePaint, wallPaint, rotation, objects);
        return complexObject;
    }

    public boolean isCentered() {
        return centered;
    }

    public void setCentered(boolean centered) {
        this.centered = centered;
    }

    private DeepPoint centerInScreen(float x, float y, float z) {
        if(isCentered()) {
            x += Constants.SCREEN_WIDTH / 2;
            y += Constants.SCREEN_HEIGHT / 2;
        }
        return new DeepPoint(x, y, z);
    }
}
