package com.games.mkvs.interstellarmanager.engine.models.menu_background;

import android.graphics.Paint;

import com.games.mkvs.interstellarmanager.constants.Constants;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.ComplexObject;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.Sphere;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;
import com.games.mkvs.interstellarmanager.engine.services.PaintService;

import java.util.ArrayList;

/**
 * Created by Martin on 29.12.2018 г..
 */

public class StarsBackground {

    public static ComplexObject getBackground() {
        ArrayList<Object3D> starts = new ArrayList<>();
        Paint edgePaint = PaintService.createEdgePaint("");
        Paint wallPaint = PaintService.createWallPaint("white");
        for(int i = 0; i < 200; i++) {
            float x = getDimensionValue();
            float y = getDimensionValue();
            float z = getDimensionValue();
            Sphere star = new Sphere(x, y, z,
                    edgePaint,
                    wallPaint,
                    1,
                    2);
            starts.add(star);
        }

        ComplexObject starSystem = new ComplexObject(Constants.SCREEN_WIDTH / 2,
                Constants.SCREEN_HEIGHT / 2, 0, edgePaint, wallPaint, 0.2f, starts);
        return starSystem;
    }

    private static float getDimensionValue() {
        return (float) Math.random() * 5000 - 2500;
    }
}
