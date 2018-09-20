package com.example.sebastianlimaco.gamedevalpha;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class EnemyTerritory implements GameObject {
    private Rect rectangle;
    private int color;

    public EnemyTerritory(Rect rectangle, int color){
        this.rectangle = rectangle;
        this.color = color;
    }

    public boolean playerCollide(Player player){
        return Rect.intersects(rectangle, player.getRectangle());
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update() {

    }
}
