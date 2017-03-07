package rynkovoy.mysolarsystem;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Rynkovoy on 10/13/2016.
 */

public class SolarSystem extends View {

    public SolarSystem(Context context) {
        super(context);
    }

    Paint sun = new Paint();
    Paint mercury = new Paint();
    Paint venus = new Paint();
    Paint ears = new Paint();

    Paint circles = new Paint();

    boolean stars = true;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);

        if (stars) {
            for (int i = 0; i < 250; i++) {
                circles.setColor(Color.rgb(250, 250, 250));
                canvas.drawCircle((float) (Math.random()*1080), (float) (Math.random()*1920), 1, circles);
            }
            for (int i = 0; i < 40; i++) {
                circles.setColor(Color.rgb(250, 250, 250));
                canvas.drawCircle((float) (Math.random()*1080), (float) (Math.random()*1920), 3, circles);
            }
            for (int i = 0; i < 20; i++) {
                circles.setColor(Color.rgb(250, 250, 250));
                canvas.drawCircle((float) (Math.random()*1080), (float) (Math.random()*1920), 4, circles);
            }
            stars = false;
        }

        circles.setColor(Color.argb(50, 250, 250, 250));
        circles.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(550, 800, 160, circles);
        canvas.drawCircle(550, 800, 275, circles);
        canvas.drawCircle(550, 800, 425, circles);

        sun.setColor(Color.YELLOW);
        canvas.drawCircle(550, 800, 100, sun);

        mercury.setColor(Color.rgb(184, 134, 11));
        canvas.drawCircle(700, 750, 30, mercury);

        venus.setColor(Color.rgb(160, 82, 45));
        canvas.drawCircle(650, 550, 45, venus);

        ears.setColor(Color.rgb(0, 0, 128));
        canvas.drawCircle(250, 500, 60, ears);


    }
}
