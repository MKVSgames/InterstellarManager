package com.games.mkvs.interstellarmanager.engine.models.menu_background;

import android.content.Context;
import android.view.MotionEvent;

import com.games.mkvs.interstellarmanager.engine.GamePanel;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;
import com.games.mkvs.interstellarmanager.engine.services.DrawingService;

import java.util.List;

/**
 * Created by Martin on 29.12.2018 г..
 */

public class StarsBackgroundPanel extends GamePanel {
    public StarsBackgroundPanel(Context context, DrawingService drawingService, List<Object3D> figures) {
        super(context, drawingService, figures);
    }

    @Override
    public void update() {
        for(int i = 0; i < figures.size(); i++) {
            Object3D figure = figures.get(i);
            figure.rotateX3D(1);
            figure.rotateY3D(1);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
