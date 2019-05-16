package mx.edu.ittepic.marcogaray.tpdm_u4_ejercicio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Lienzo extends View {
    Timer timer;
    int width= this.getResources().getDisplayMetrics().widthPixels;
    int height= this.getResources().getDisplayMetrics().heightPixels;
    Bola b1, b2, b3, b4, b5, b6, b7, b8;
    public Lienzo(Context context) {
        super(context);
        b1 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b2 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b3 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b4 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b5 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b6 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b7 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        b8 = new Bola(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);

        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                b1.mover(width,height);
                b2.mover(width,height);
                b3.mover(width,height);
                b4.mover(width,height);
                b5.mover(width,height);
                b6.mover(width,height);
                b7.mover(width,height);
                b8.mover(width,height);
            }
        },0,30);


    }

    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        c.drawColor(Color.LTGRAY);
        p.setColor(Color.rgb(b1.cR,b1.cG,b1.cB));
        b1.dibujar(c,p);
        p.setColor(Color.rgb(b2.cR,b2.cG,b2.cB));
        b2.dibujar(c,p);
        p.setColor(Color.rgb(b3.cR,b3.cG,b3.cB));
        b3.dibujar(c,p);
        p.setColor(Color.rgb(b4.cR,b4.cG,b4.cB));
        b4.dibujar(c,p);
        p.setColor(Color.rgb(b5.cR,b5.cG,b5.cB));
        b5.dibujar(c,p);
        p.setColor(Color.rgb(b6.cR,b6.cG,b6.cB));
        b6.dibujar(c,p);
        p.setColor(Color.rgb(b7.cR,b7.cG,b7.cB));
        b7.dibujar(c,p);
        p.setColor(Color.rgb(b8.cR,b8.cG,b8.cB));
        b8.dibujar(c,p);
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent me){
            //El evento onTouchEvent permite detectar los toques
            //de uno o más dedos que se hacen en el área de dibujo
            //me.getAction() = accion: presiono, soltar mover
            //      pos x pos y
            int accion = me.getAction();
            int posx = (int) me.getX();
            int posy = (int) me.getY();

            switch (accion){
                case MotionEvent.ACTION_DOWN:

                    break;
                case MotionEvent.ACTION_MOVE:

                    break;
                case MotionEvent.ACTION_UP:

                    break;
            }
            invalidate(); //Volver a pintar
            return true;
        }



}
