package com.games.mkvs.interstellarmanager.engine;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.GameObject;
import com.games.mkvs.interstellarmanager.engine.thread.GameThread;

/**
 * Created by Martin on 28.12.2018 г..
 */

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback, GameObject {

    private GameThread thread;

    public GamePanel(Context context) {
        super(context);

        getHolder().addCallback(this);

        setFocusable(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.thread = new GameThread(this);
        thread.setRunning(true);

        thread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void update() {

    }
}
