package com.games.mkvs.interstellarmanager.engine.thread;

import android.view.SurfaceHolder;

import com.games.mkvs.interstellarmanager.engine.GamePanel;

/**
 * Created by Martin on 28.12.2018 г..
 */

public class GameThread extends Thread {
    private final SurfaceHolder surfaceHolder;
    private final GamePanel gamePanel;

    public GameThread(SurfaceHolder surfaceHolder, GamePanel panel) {
        this.surfaceHolder = surfaceHolder;
        this.gamePanel = panel;
    }

    /*@Override
    public void run() {
        long startTime;
        long timeMillis = 1000 / MAX_FPS;
        long waitTime;
        int frameCount = 0;
        long totalTime = 0;
        long targetTime = 1000 / MAX_FPS;

        while (running) {
            startTime = System.nanoTime();
            canvas = null;

            try {
                canvas = this.surfaceHolder.lockCanvas();
                synchronized (surfaceHolder) {
                    this.gamePanel.update();
                    this.gamePanel.draw(canvas);
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

            timeMillis = (System.nanoTime() - startTime) / 1000000;
            waitTime = targetTime - timeMillis;

            try {
                if(waitTime > 0) {
                    this.sleep(50);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            totalTime = System.nanoTime() - startTime;
            frameCount++;

            if(frameCount==MAX_FPS) {
                averageFPS = 1000/((totalTime/frameCount)/1000000);
                frameCount = 0;
                totalTime = 0;
            }
        }
    }*/
}
