package com.example.sebastianlimaco.gamedevalpha;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;

public class GameplayScene implements Scene{

    private Player player;
    private Point playerPoint;

    public GameplayScene(){
        player = new Player(new Rect(100,100,200,200), Color.rgb(255,0,0));
        playerPoint = new Point(400, 200);
    }
    @Override
    public void update() {
        player.update(playerPoint);
    }


    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        player.draw(canvas);
    }

    @Override
    public void terminate() {
        SceneManager.ACTIVE_SCENE = 0;

    }

    @Override
    public void receiveTouch(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN: //pressing
            case MotionEvent.ACTION_MOVE: //moving finger
                playerPoint.set((int) event.getX(), (int) event.getY());

        }
    }
}
