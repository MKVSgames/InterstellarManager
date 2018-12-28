package com.games.mkvs.interstellarmanager.engine.services;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

import com.games.mkvs.interstellarmanager.engine.GamePanel;

/**
 * Created by Martin on 28.12.2018 г..
 */

public class CanvasService {
    public static void updateAndDraw(GamePanel gamePanel) {
        SurfaceHolder surfaceHolder = gamePanel.getHolder();
        Canvas canvas = null;
        try {
            canvas = surfaceHolder.lockCanvas();
            synchronized (surfaceHolder) {
                gamePanel.update();
                gamePanel.draw(canvas);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(canvas!=null) {
                try {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
