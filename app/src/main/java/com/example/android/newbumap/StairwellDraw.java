package com.example.android.newbumap;

import android.graphics.Paint;
import android.graphics.Canvas;

public class StairwellDraw {
    private Paint P;
    private Canvas C;
    private float pixel;

    public StairwellDraw(Paint pai, Canvas can, float px) {
        P = pai;
        C = can;
        pixel = px;
    }

    public void changePaint(Paint p) {
        P = p;
    }

    /** ------------------------- Basement ------------------------- **/

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

    /** ------------------------- First Floor ------------------------- **/

    //Stairwell at First Floor, Nicolls, Top
    public void FFNT() {
        C.drawCircle( //N Top
                (float)10.75*pixel, //x val
                (float)18.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Nicolls, Bottom
    public void FFNB() {
        C.drawCircle( //N Bottom
                (float)11*pixel, //x val
                (float)42*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Hamilton
    public void FFHM() {
        C.drawCircle( //H Mid
                (float)45.38*pixel, //x val
                (float)42.5*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Top
    public void FFJT() {
        C.drawCircle( //J Top
                (float)56*pixel, //x val
                (float)15.75*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Middle
    public void FFJM() {
        C.drawCircle( //J Mid
                (float)56*pixel, //x val
                (float)38.3*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Bottom
    public void FFJB() {
        C.drawCircle( //J Bottom
                (float)53.4*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    /** ------------------------- Second Floor ------------------------- **/

    //Stairwell at Second Floor, Nicolls, Top
    public void SFNT() {
        C.drawCircle( //N Top
                (float)10.6*pixel, //x val
                (float)18*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Nicolls, Bottom
    public void SFNB() {
        C.drawCircle( //N Bottom
                (float)10*pixel, //x val
                (float)41.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Hamilton
    public void SFHM() {
        C.drawCircle( //H Mid
                (float)46*pixel, //x val
                (float)42*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Top
    public void SFJT() {
        C.drawCircle( //J Top
                (float)56.2*pixel, //x val
                (float)15.4*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Middle
    public void SFJM() {
        C.drawCircle( //J Mid
                (float)56.5*pixel, //x val
                (float)38.3*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Bottom
    public void SFJB() {
        C.drawCircle( //J Bottom
                (float)54*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    /** ------------------------- Third Floor ------------------------- **/

    //Stairwell at Third Floor, Nicolls, Top
    public void TFNT() {
        C.drawCircle( //N Top
                (float)10.7*pixel, //x val
                (float)17.9*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Nicolls, Bottom
    public void TFNB() {
        C.drawCircle( //N Bottom
                (float)11*pixel, //x val
                (float)41.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Hamilton
    public void TFHM() {
        C.drawCircle( //H Mid
                (float)44.2*pixel, //x val
                (float)40.5*pixel, //y val
                75,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Top
    public void TFJT() {
        C.drawCircle( //J Top
                (float)56.5*pixel, //x val
                (float)15.1*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Middle
    public void TFJM() {
        C.drawCircle( //J Mid
                (float)56.5*pixel, //x val
                (float)38.1*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Bottom
    public void TFJB() {
        C.drawCircle( //J Bottom
                (float)54*pixel, //x val
                (float)68.8*pixel, //y val
                100,
                P
        );
    }
}
