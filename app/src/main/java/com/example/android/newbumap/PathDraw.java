package com.example.android.newbumap;

import android.graphics.Canvas;
import android.graphics.Paint;

public class PathDraw {

    Canvas c;
    Paint p;

    public PathDraw(Canvas canvas, Paint paint){
        c = canvas;
        p = paint;
    }

    public void nicollsGroundFloor(){
        //big line going across nicolls ground floor
        c.drawLine(
                530, // startX
                860, // startY
                530, // stopX
                2100, // stopY
                p // Paint
        );
        //small angle'd line
        c.drawLine(
                530, // startX
                2100, // startY
                740, // stopX
                2175, // stopY
                p // Paint
        );
    }
    public void hamiltonGroundFloor(){
        //line going across hamilton ground floor
        c.drawLine(
                740, // startX
                2175, // startY
                2675, // stopX
                2175, // stopY
                p // Paint
        );
    }
    public void johnsonGroundFloor(){
        //line going across johnson ground floor
        c.drawLine(
                2675, // startX
                520, // startY
                2675, // stopX
                3250, // stopY
                p // Paint
        );
    }
    public void nicollsFirstFloor(){
        //line going across nicolls first floor
        c.drawLine(
                400, // startX
                860, // startY
                400, // stopX
                2120, // stopY
                p // Paint
        );
        //line connecting to hamilton and going to busstop
        c.drawLine(
                400, // startX
                2120, // startY
                880, // stopX
                2120, // stopY
                p // Paint
        );
    }
    public void hamiltonFirstFloor(){
        //most bottom line of hamilton first floor
        c.drawLine(
                1665, // startX
                2210, // startY
                1950, // stopX
                2210, // stopY
                p // Paint
        );
        //line connecting hamilton to johnson
        c.drawLine(
                1950, // startX
                2180, // startY
                2565, // stopX
                2180, // stopY
                p // Paint
        );
        //small line connecting the two lines above
        c.drawLine(
                1950, // startX
                2210, // startY
                1950, // stopX
                2180, // stopY
                p // Paint
        );
        //line going in front of the hamilton lab on first floor
        c.drawLine(
                1665, // startX
                2065, // startY
                1665, // stopX
                2210, // stopY
                p // Paint
        );
        //line going in front of nelly's old office
        c.drawLine(
                1450, // startX
                2065, // startY
                1665, // stopX
                2065, // stopY
                p // Paint
        );
    }
    public void johnsonFirstFloor(){
        //big line going across johnson first floor
        c.drawLine(
                2565, // startX
                430, // startY
                2565, // stopX
                3210, // stopY
                p // Paint
        );
        //little line connected to the big line
        c.drawLine(
                2480, // startX
                3210, // startY
                2565, // stopX
                3210, // stopY
                p // Paint
        );
        //little vertical line
        c.drawLine(
                2480, // startX
                3210, // startY
                2480, // stopX
                3270, // stopY
                p // Paint
        );
        //medium line at the bottom of johnson first floor
        c.drawLine(
                2480, // startX
                3270, // startY
                1920, // stopX
                3270, // stopY
                p // Paint
        );
    }
    public void nicollsSecondFloor(){
        //big line from top to bottom
        c.drawLine(
                325, // startX
                840, // startY
                325, // stopX
                2080, // stopY
                p // Paint
        );
        //smaller line under the big line
        c.drawLine(
                200, // startX
                2080, // startY
                490, // stopX
                2080, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton
        c.drawLine(
                490, // startX
                2080, // startY
                490, // stopX
                2250, // stopY
                p // Paint
        );
        //most bottom line in norton second floor
        c.drawLine(
                200, // startX
                2250, // startY
                490, // stopX
                2250, // stopY
                p // Paint
        );
        //line heading to hamilton second floor
        c.drawLine(
                490, // startX
                2095, // startY
                625, // stopX
                2095, // stopY
                p // Paint
        );
    }
    public void hamiltonSecondFloor(){
        //big line going across main section
        c.drawLine(
                625, // startX
                2095, // startY
                2090, // stopX
                2095, // stopY
                p // Paint
        );
        //angled line
        c.drawLine(
                2090, // startX
                2095, // startY
                2150, // stopX
                2180, // stopY
                p // Paint
        );
        //small line connecting to johnson
        c.drawLine(
                2150, // startX
                2180, // startY
                2580, // stopX
                2180, // stopY
                p // Paint
        );
    }
    public void johnsonSecondFloor(){
        //line going across johnson second floor
        c.drawLine(
                2580, // startX
                480, // startY
                2580, // stopX
                3200, // stopY
                p // Paint
        );
    }
    public void nicollsThirdFloor(){
        //big line from top to bottom
        c.drawLine(
                335, // startX
                820, // startY
                335, // stopX
                2070, // stopY
                p // Paint
        );
        //smaller line under the big line
        c.drawLine(
                210, // startX
                2070, // startY
                500, // stopX
                2070, // stopY
                p // Paint
        );
        //vertical line all the way on the left
        c.drawLine(
                210, // startX
                2070, // startY
                210, // stopX
                2230, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton third floor
        c.drawLine(
                500, // startX
                2070, // startY
                500, // stopX
                2230, // stopY
                p // Paint
        );
        //most bottom line in norton third floor
        c.drawLine(
                210, // startX
                2230, // startY
                500, // stopX
                2230, // stopY
                p // Paint
        );
        //line heading to hamilton third floor
        c.drawLine(
                500, // startX
                2075, // startY
                625, // stopX
                2075, // stopY
                p // Paint
        );
    }
    public void hamiltonThirdFloor(){
        //line connecting to nicolls third floor
        c.drawLine(
                625, // startX
                2075, // startY
                980, // stopX
                2075, // stopY
                p // Paint
        );
        //angled line near nicolls third floor
        c.drawLine(
                980, // startX
                2075, // startY
                1030, // stopX
                1910, // stopY
                p // Paint
        );
        //big line going across most of hamilton third floor
        c.drawLine(
                1030, // startX
                1910, // startY
                2000, // stopX
                1910, // stopY
                p // Paint
        );
        //little angled line at the end of hamilton third floor
        c.drawLine(
                2000, // startX
                1910, // startY
                2020, // stopX
                1960, // stopY
                p // Paint
        );

    }
    public void johnsonThirdFloor(){
        //top big line going across johnson third floor
        c.drawLine(
                2580, // startX
                480, // startY
                2580, // stopX
                1920, // stopY
                p // Paint
        );
        //bottom big line going across johnson third floor
        c.drawLine(
                2600, // startX
                1920, // startY
                2600, // stopX
                3200, // stopY
                p // Paint
        );
        //little line connecting the two big lines
        c.drawLine(
                2580, // startX
                1920, // startY
                2600, // stopX
                1920, // stopY
                p // Paint
        );
    }
}
