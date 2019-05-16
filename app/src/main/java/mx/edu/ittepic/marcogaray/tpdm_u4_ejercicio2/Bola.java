package mx.edu.ittepic.marcogaray.tpdm_u4_ejercicio2;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Bola {
    int tamaño, desplazamientoX, desplazamientoY, cR, cB, cG, x, y;

    public Bola(Lienzo lienzo, int posx, int posy){
        x = posx;
        y = posy;
        tamaño = (int)(Math.random()*300)+20;
        cR = (int) (Math.random()*255)+1;
        cG = (int) (Math.random()*255)+1;
        cB = (int) (Math.random()*255)+1;

        //Generando si va a la izq o derecha en modo random
        if(Math.random()*10<5){
        desplazamientoX = 5;
        }else{
            desplazamientoX = -5;
            }

        //generando si sube o baja
        if(Math.random()*10 < 5){
            desplazamientoY = 5;
        }else{
            desplazamientoY = -5;
        }

    }

    public void mover(int ancho,int alto){
        if(x<=0) desplazamientoX=10;
        if(y<=0) desplazamientoY=10;
        if(x>=ancho) desplazamientoX=(desplazamientoX*-1);
        if(y>=alto) desplazamientoY=(desplazamientoY*-1);
        x+=desplazamientoX;
        y+=desplazamientoY;
    }

    public void dibujar(Canvas c, Paint p) {
        c.drawCircle(x,y,tamaño,p);
    }


}
