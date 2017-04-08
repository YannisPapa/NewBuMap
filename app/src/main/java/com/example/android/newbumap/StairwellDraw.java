package com.example.android.newbumap;

import android.graphics.Paint;
import android.graphics.Canvas;

/*This Class and its Functions are used to draw the circle's around the different stairwells
* depending on the users selection.*/

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

    //-------------------------- Ground Floor ------------------------------------------------------

    //Stairwell at Basement, Nicolls, Top
    public void nGroundTop() {
        C.drawCircle( //N Top
                (float)13.5*pixel, //x val
                (float)19.1*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Nicolls, Bottom
    public void nGroundBottom() {
        C.drawCircle( //N Bottom
                (float)13.7*pixel, //x val
                (float)42.75*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Top
    public void jGroundTop() {
        C.drawCircle( //J Top
                (float)58.6*pixel, //x val
                (float)16.6*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Middle
    public void jGroundMiddle() {
        C.drawCircle( //J Mid
                (float)58.5*pixel, //x val
                (float)39*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Basement, Johnson, Bottom
    public void jGroundBottom() {
        C.drawCircle( //J Bottom
                (float)56*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    //-------------------------- First Floor  ------------------------------------------------------

    //Stairwell at First Floor, Nicolls, Top
    public void nFirstTop() {
        C.drawCircle( //N Top
                (float)10.75*pixel, //x val
                (float)18.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Nicolls, Bottom
    public void nFirstBottom() {
        C.drawCircle( //N Bottom
                (float)11*pixel, //x val
                (float)42*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Hamilton
    public void hFirst() {
        C.drawCircle( //H Mid
                (float)45.38*pixel, //x val
                (float)42.5*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Top
    public void jFirstTop() {
        C.drawCircle( //J Top
                (float)56*pixel, //x val
                (float)15.75*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Middle
    public void jFirstMiddle() {
        C.drawCircle( //J Mid
                (float)56*pixel, //x val
                (float)38.3*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at First Floor, Johnson, Bottom
    public void jFirstBottom() {
        C.drawCircle( //J Bottom
                (float)53.4*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    //-------------------------- Second Floor  -----------------------------------------------------

    //Stairwell at Second Floor, Nicolls, Top
    public void nSecondTop() {
        C.drawCircle( //N Top
                (float)10.6*pixel, //x val
                (float)18*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Nicolls, Bottom
    public void nSecondBottom() {
        C.drawCircle( //N Bottom
                (float)10*pixel, //x val
                (float)41.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Hamilton
    public void hSecond() {
        C.drawCircle( //H Mid
                (float)46*pixel, //x val
                (float)42*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Top
    public void jSecondTop() {
        C.drawCircle( //J Top
                (float)56.2*pixel, //x val
                (float)15.4*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Middle
    public void jSecondMiddle() {
        C.drawCircle( //J Mid
                (float)56.5*pixel, //x val
                (float)38.3*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Second Floor, Johnson, Bottom
    public void jSecondBottom() {
        C.drawCircle( //J Bottom
                (float)54*pixel, //x val
                (float)70*pixel, //y val
                100,
                P
        );
    }

    //-------------------------- Third Floor  ------------------------------------------------------

    //Stairwell at Third Floor, Nicolls, Top
    public void nThirdTop() {
        C.drawCircle( //N Top
                (float)10.7*pixel, //x val
                (float)17.9*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Nicolls, Bottom
    public void nThirdBottom() {
        C.drawCircle( //N Bottom
                (float)11*pixel, //x val
                (float)41.5*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Hamilton
    public void hThird() {
        C.drawCircle( //H Mid
                (float)44.2*pixel, //x val
                (float)40.5*pixel, //y val
                75,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Top
    public void jThirdTop() {
        C.drawCircle( //J Top
                (float)56.5*pixel, //x val
                (float)15.1*pixel, //y val
                100,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Middle
    public void jThirdMiddle() {
        C.drawCircle( //J Mid
                (float)56.5*pixel, //x val
                (float)38.1*pixel, //y val
                115,
                P
        );
    }

    //Stairwell at Third Floor, Johnson, Bottom
    public void jThirdBottom() {
        C.drawCircle( //J Bottom
                (float)54*pixel, //x val
                (float)68.8*pixel, //y val
                100,
                P
        );
    }
}
