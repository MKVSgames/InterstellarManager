package com.games.mkvs.interstellarmanager.engine.models.game_objects;

import android.graphics.Paint;

import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.DeepPoint;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;

import java.util.ArrayList;

/**
 * Created by Martin on 27.12.2018 г..
 */

public class Parallelepiped extends Object3D {
    public Parallelepiped(float x, float y, float z, float aLength, float bLength, float cLength, Paint edgePaint, Paint wallPaint, float rotation)
    {
        super(x, y, z, edgePaint, wallPaint, rotation);
        DeepPoint a = new DeepPoint(0-aLength/2, 0-bLength/2, 0-cLength/2);
        DeepPoint b = new DeepPoint(0-aLength/2, 0+bLength/2, 0-cLength/2);
        DeepPoint c = new DeepPoint(0+aLength/2, 0+bLength/2, 0-cLength/2);
        DeepPoint d = new DeepPoint(0+aLength/2, 0-bLength/2, 0-cLength/2);
        DeepPoint a1 = new DeepPoint(0-aLength/2, 0-bLength/2, 0+cLength/2);
        DeepPoint b1 = new DeepPoint(0-aLength/2, 0+bLength/2, 0+cLength/2);
        DeepPoint c1 = new DeepPoint(0+aLength/2, 0+bLength/2, 0+cLength/2);
        DeepPoint d1 = new DeepPoint(0+aLength/2, 0-bLength/2, 0+cLength/2);
        points = new DeepPoint[] {a, b, c, d, a1, b1, c1, d1};
        parts = new ArrayList<>();
        parts.add(new DeepPoint[] {a, b});
        parts.add(new DeepPoint[] {b, c});
        parts.add(new DeepPoint[] {c, d});
        parts.add(new DeepPoint[] {d, a});
        parts.add(new DeepPoint[] {a1, b1});
        parts.add(new DeepPoint[] {b1, c1});
        parts.add(new DeepPoint[] {c1, d1});
        parts.add(new DeepPoint[] {d1, a1});
        parts.add(new DeepPoint[] {a, a1});
        parts.add(new DeepPoint[] {b, b1});
        parts.add(new DeepPoint[] {c, c1});
        parts.add(new DeepPoint[] {d, d1});

        parts.add(new DeepPoint[] {a, b, c, d});
        parts.add(new DeepPoint[] {a1, b1, c1, d1});
        parts.add(new DeepPoint[] {a, b, b1, a1});
        parts.add(new DeepPoint[] {b, c, c1, b1});
        parts.add(new DeepPoint[] {c, d, d1, c1});
        parts.add(new DeepPoint[] {d, a, a1, d1});

        setDrawingParts();
    }
}
