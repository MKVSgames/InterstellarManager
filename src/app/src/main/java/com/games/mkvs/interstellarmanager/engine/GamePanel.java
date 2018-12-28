package com.games.mkvs.interstellarmanager.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.games.mkvs.interstellarmanager.constants.Constants;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.GameObject;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;
import com.games.mkvs.interstellarmanager.engine.services.DrawingService;
import com.games.mkvs.interstellarmanager.engine.thread.GameThread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 28.12.2018 г..
 */

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback, GameObject {
    private final DrawingService drawingService;
    public List<Object3D> figures;
    private GameThread thread;

    private float x1;
    private float y1;
    private float x2;
    private float y2;

    public GamePanel(Context context, DrawingService drawingService, List<Object3D> figures) {
        super(context);
        this.drawingService = drawingService;
        this.figures = figures;

        getHolder().addCallback(this);

        setFocusable(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                x2 = event.getX();
                y2 = event.getY();
                float deltaX = x2 - x1;
                float deltaY = y2 - y1;

                for(int i = 0; i < figures.size(); i++)
                {
                    Object3D figure = figures.get(i);
                    moveObject(deltaX, deltaY, figure);
                }
                x1 = x2;
                y1 = y2;
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                deltaX = x2 - x1;
                deltaY = y2 - y1;
                for(int i = 0; i < figures.size(); i++)
                {
                    Object3D figure = figures.get(i);
                    moveObject(deltaX, deltaY, figure);
                }
                break;
        }
        return true;
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

    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawingService.drawFigures(canvas, figures);
    }

    private void moveObject(float deltaX, float deltaY, Object3D figure) {
        figure.rotateX3D(deltaY * Constants.ROTATINGCOEF);
        figure.rotateY3D(deltaX * Constants.ROTATINGCOEF);
    }
}
