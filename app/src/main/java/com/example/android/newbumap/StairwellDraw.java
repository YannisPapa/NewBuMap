package com.example.android.newbumap;

import android.graphics.Paint;
import android.graphics.Canvas;

/**
 * Created by Mareep on 3/26/17.
 */

public class StairwellDraw {
    private Paint P;
    private Canvas C;
    private float pixel;

    public StairwellDraw(Paint pai, Canvas can, float px) {
        P = pai;
        C = can;
        pixel = px;
    }

    //Stairwell at Basement, Nicolls, Top
    public void BNT() {
        C.drawCircle( //N Top
                (float)13.5*pixel, //x val
                (float)19.1*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Nicolls, Bottom
    public void BNB() {
        C.drawCircle( //N Bottom
                (float)13.7*pixel, //x val
                (float)42.75*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Top
    public void BJT() {
        C.drawCircle( //J Top
                (float)58.6*pixel, //x val
                (float)16.6*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Middle
    public void BJM() {
        C.drawCircle( //J Mid
                (float)58.5*pixel, //x val
                (float)39*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Bottom
    public void BJB() {
        C.drawCircle( //J Bottom
                (float)56*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Nicolls, Top
    public void FFNT() {
        C.drawCircle( //N Top
                700,  //x val
                1175, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Nicolls, Bottom
    public void FFNB() {
        C.drawCircle( //N Bottom
                693, //x val
                2690, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Hamilton
    public void FFHM() {
        C.drawCircle( //H Mid
                2903, //x val
                2715, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Top
    public void FFJT() {
        C.drawCircle( //J Top
                3580, //x val
                1005, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Middle
    public void FFJM() {
        C.drawCircle( //J Mid
                3580, //x val
                2450, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Bottom
    public void FFJB() {
        C.drawCircle( //J Bottom
                3420, //x val
                4450, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Nicolls, Top
    public void SFNT() {
        C.drawCircle( //N Top
                675,  //x val
                1155, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Nicolls, Bottom
    public void SFNB() {
        C.drawCircle( //N Bottom
                693, //x val
                2675, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Hamilton
    public void SFHM() {
        C.drawCircle( //H Mid
                2930, //x val
                2707, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Top
    public void SFJT() {
        C.drawCircle( //J Top
                3610, //x val
                975, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Middle
    public void SFJM() {
        C.drawCircle( //J Mid
                3605, //x val
                2450, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Bottom
    public void SFJB() {
        C.drawCircle( //J Bottom
                3460, //x val
                4450, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Nicolls, Top
    public void TFNT() {
        C.drawCircle( //N Top
                675,  //x val
                1150, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Nicolls, Bottom
    public void TFNB() {
        C.drawCircle( //N Bottom
                693, //x val
                2665, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Hamilton
    public void TFHM() {
        C.drawCircle( //H Mid
                2875, //x val
                2595, //y val
                75,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Top
    public void TFJT() {
        C.drawCircle( //J Top
                3610, //x val
                970, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Middle
    public void TFJM() {
        C.drawCircle( //J Mid
                3615, //x val
                2438, //y val
                115,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Bottom
    public void TFJB() {
        C.drawCircle( //J Bottom
                3460, //x val
                4435, //y val
                100,
                P
        );
    }
}
