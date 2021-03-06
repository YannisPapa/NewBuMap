package com.example.android.newbumap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/*This Class and its Functions draw the segmented floor paths depending on the user's selection.*/

public class FloorDraw {

    private Canvas c;
    private Paint p;
    private float px;

    //constructor for FloorDraw
    public FloorDraw(Canvas canvas, Paint paint, float px){
        c = canvas;
        p = paint;
        this.px = px;
    }

    //-------------------------- Ground Floor  -----------------------------------------------------

    public void nicollsGroundTop() {
        //line to N005, N004 and N007
        c.drawLine(
                (float)11*px, // startX
                (float)18*px, // startY
                (float)11*px, // stopX
                (float)30*px, // stopY
                p // Paint
        );

    }

    public void nicollsGroundBottom() {
        //line to N008, N003, N002, N001
        c.drawLine(
                (float)11*px, // startX
                (float)30*px, // startY
                (float)11*px, // stopX
                (float)43.5*px, // stopY
                p // Paint
        );
        //small angle'd line
        c.drawLine(
                (float)11*px, // startX
                (float)43.5*px, // startY
                (float)15.5*px, // stopX
                (float)45.2*px, // stopY
                p // Paint
        );
    }

    public void nicollsGroundFloor(){
        //big line going across nicolls ground floor
        nicollsGroundTop();
        nicollsGroundBottom();
    }

    public void hamiltonGroundFloor(){
        //line going across hamilton ground floor
        c.drawLine(
                (float)15.5*px, // startX
                (float)45.2*px, // startY
                (float)56*px, // stopX
                (float)45.2*px, // stopY
                p // Paint
        );
    }

    public void johnsonGroundTop() {
        //line from J020 to J024
        c.drawLine(
                (float)56*px, // startX
                (float)11.5*px, // startY
                (float)56*px, // stopX
                (float)26*px, // stopY
                p // Paint
        );

    }

    public void johnsonGroundMid() {
        //line from J024 to J010
        c.drawLine(
                (float)56*px, // startX
                (float)26*px, // startY
                (float)56*px, // stopX
                (float)53*px, // stopY
                p // Paint
        );
    }

    public void johnsonGroundBottom() {
        //line going from bathrooms to J004
        c.drawLine(
                (float)56*px, // startX
                (float)53*px, // startY
                (float)56*px, // stopX
                (float)67*px, // stopY
                p // Paint
        );
    }

    public void johnsonGroundFloor(){
        //line going across johnson ground floor
        johnsonGroundTop();
        johnsonGroundMid();
        johnsonGroundBottom();
    }

    //-------------------------- First Floor  ------------------------------------------------------

    public void nicollsFirstTop() {
        c.drawLine(
                (float)8.25*px, // startX
                (float)18*px, // startY
                (float)8.25*px, // stopX
                (float)34*px, // stopY
                p // Paint
        );
    }

    public void nicollsFirstBottom() {
        //line going across nicolls N110 to bottom
        c.drawLine(
                (float)8.25*px, // startX
                (float)34*px, // startY
                (float)8.25*px, // stopX
                (float)44.6*px, // stopY
                p // Paint
        );
        //line connecting to hamilton and going to busstop
        c.drawLine(
                (float)8.25*px, // startX
                (float)44.6*px, // startY
                (float)18*px, // stopX
                (float)44.6*px, // stopY
                p // Paint
        );
    }

    public void nicollsFirstFloor(){
        nicollsFirstTop();
        nicollsFirstBottom();
    }

    public void hamiltonFirstFloor(){
        //line going in front of nelly's old office
        c.drawLine(
                (float)30*px, // startX
                (float)43*px, // startY
                (float)34.7*px, // stopX
                (float)43*px, // stopY
                p // Paint
        );
        //line going in front of the hamilton lab on first floor
        c.drawLine(
                (float)34.7*px, // startX
                (float)43*px, // startY
                (float)34.7*px, // stopX
                (float)46*px, // stopY
                p // Paint
        );
        //most bottom line of hamilton first floor
        c.drawLine(
                (float)34.7*px, // startX
                (float)46*px, // startY
                (float)41*px, // stopX
                (float)46*px, // stopY
                p // Paint
        );
        //line connecting hamilton to johnson
        c.drawLine(
                (float)41*px, // startX
                (float)45.4*px, // startY
                (float)53.5*px, // stopX
                (float)45.4*px, // stopY
                p // Paint
        );
        //small line connecting the two lines above
        c.drawLine(
                (float)41*px, // startX
                (float)46*px, // startY
                (float)41*px, // stopX
                (float)45.4*px, // stopY
                p // Paint
        );
    }

    public void johnsonFirstTop() {
        //from j-150 to j-123
        c.drawLine(
                (float)53.5*px, // startX
                (float)9*px, // startY
                (float)53.5*px, // stopX
                (float)24*px, // stopY
                p // Paint
        );
    }

    public void johnsonFirstMid() {
        //from j-118/j124 to ITS(j-107)/j-115
        c.drawLine(
                (float)53.5*px, // startX
                (float)24*px, // startY
                (float)53.5*px, // stopX
                (float)57*px, // stopY
                p // Paint
        );
    }

    public void johnsonFirstBottom() {
        //from j-116 to the bottom of johnson
        c.drawLine(
                (float)53.5*px, // startX
                (float)57*px, // startY
                (float)53.5*px, // stopX
                (float)66.8*px, // stopY
                p // Paint
        );
        //little line connected to the big line
        c.drawLine(
                (float)53.5*px, // startX
                (float)66.8*px, // startY
                (float)51.5*px, // stopX
                (float)66.8*px, // stopY
                p // Paint
        );
        //little vertical line
        c.drawLine(
                (float)51.5*px, // startX
                (float)66.8*px, // startY
                (float)51.5*px, // stopX
                (float)68.25*px, // stopY
                p // Paint
        );
        //medium line at the bottom of johnson first floor
        c.drawLine(
                (float)51.5*px, // startX
                (float)68.25*px, // startY
                (float)40.5*px, // stopX
                (float)68.25*px, // stopY
                p // Paint
        );
    }

    public void johnsonFirstFloor(){
        johnsonFirstTop();
        johnsonFirstMid();
        johnsonFirstBottom();

    }

    //-------------------------- Second Floor  -----------------------------------------------------

    public void nicollsSecondTop() {
        //line from top to N216
        c.drawLine(
                (float)6.75*px, // startX
                (float)17*px, // startY
                (float)6.75*px, // stopX
                (float)34*px, // stopY
                p // Paint
        );
    }

    public void nicollsSecondBottom() {
        //line from N216 to bottom
        c.drawLine(
                (float)6.75*px, // startX
                (float)34*px, // startY
                (float)6.75*px, // stopX
                (float)43.4*px, // stopY
                p // Paint
        );
        //line underneath big line
        c.drawLine(
                (float)4*px, // startX
                (float)43.4*px, // startY
                (float)10.25*px, // stopX
                (float)43.4*px, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton
        c.drawLine(
                (float)10.25*px, // startX
                (float)43.4*px, // startY
                (float)10.25*px, // stopX
                (float)46.8*px, // stopY
                p // Paint
        );
        //most bottom line in norton second floor
        c.drawLine(
                (float)10.25*px, // startX
                (float)46.8*px, // startY
                (float)4*px, // stopX
                (float)46.8*px, // stopY
                p // Paint
        );
        //line heading to hamilton second floor
        c.drawLine(
                (float)10.25*px, // startX
                (float)43.6*px, // startY
                (float)13.2*px, // stopX
                (float)43.6*px, // stopY
                p // Paint
        );
    }

    public void nicollsSecondFloor(){
        nicollsSecondTop();
        nicollsSecondBottom();
    }

    public void hamiltonSecondFloor(){
        //big line going across main section
        c.drawLine(
                (float)13.2*px, // startX
                (float)43.6*px, // startY
                (float)43.5*px, // stopX
                (float)43.6*px, // stopY
                p // Paint
        );
        //angled line
        c.drawLine(
                (float)43.5*px, // startX
                (float)43.6*px, // startY
                (float)45*px, // stopX
                (float)45.5*px, // stopY
                p // Paint
        );
        //small line connecting to johnson
        c.drawLine(
                (float)45*px, // startX
                (float)45.5*px, // startY
                (float)54*px, // stopX
                (float)45.5*px, // stopY
                p // Paint
        );
    }

    public void johnsonSecondTop() {
        //line from top to J208
        c.drawLine(
                (float)54*px, // startX
                (float)10*px, // startY
                (float)54*px, // stopX
                (float)26.5*px, // stopY
                p // Paint
        );
    }

    public void johnsonSecondMid() {
        //line from J208 to J232
        c.drawLine(
                (float)54*px, // startX
                (float)26.5*px, // startY
                (float)54*px, // stopX
                (float)56*px, // stopY
                p // Paint
        );
    }

    public void johnsonSecondBottom() {
        //line from J232b to bottom
        c.drawLine(
                (float)54*px, // startX
                (float)56*px, // startY
                (float)54*px, // stopX
                (float)66.8*px, // stopY
                p // Paint
        );
    }

    public void johnsonSecondFloor(){
        //line going across johnson second floor
        johnsonSecondTop();
        johnsonSecondMid();
        johnsonSecondBottom();
    }

    //-------------------------- Third Floor  ------------------------------------------------------

    public void nicollsThirdTop() {
        //line from top to N315b
        c.drawLine(
                (float)7*px, // startX
                (float)17*px, // startY
                (float)7*px, // stopX
                (float)31*px, // stopY
                p // Paint
        );
    }

    public void nicollsThirdBottom() {
        //line from N315b to bottom
        c.drawLine(
                (float)7*px, // startX
                (float)31*px, // startY
                (float)7*px, // stopX
                (float)43.25*px, // stopY
                p // Paint
        );
        //line under the big line
        c.drawLine(
                (float)4.25*px, // startX
                (float)43.25*px, // startY
                (float)13.2*px, // stopX
                (float)43.25*px, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton third floor
        c.drawLine(
                (float)10.5*px, // startX
                (float)43.25*px, // startY
                (float)10.5*px, // stopX
                (float)46.5*px, // stopY
                p // Paint
        );
        //vertical line all the way on the left
        c.drawLine(
                (float)4.25*px, // startX
                (float)43.25*px, // startY
                (float)4.25*px, // stopX
                (float)46.5*px, // stopY
                p // Paint
        );
        //most bottom line in norton third floor
        c.drawLine(
                (float)4.25*px, // startX
                (float)46.5*px, // startY
                (float)10.5*px, // stopX
                (float)46.5*px, // stopY
                p // Paint
        );
    }

    public void nicollsThirdFloor(){
        nicollsThirdTop();
        nicollsThirdBottom();
    }

    public void hamiltonThirdFloor(){
        //line connecting to nicolls third floor
        c.drawLine(
                (float)13.2*px, // startX
                (float)43.25*px, // startY
                (float)20.5*px, // stopX
                (float)43.25*px, // stopY
                p // Paint
        );
        //angled line near nicolls third floor
        c.drawLine(
                (float)20.5*px, // startX
                (float)43.25*px, // startY
                (float)21.5*px, // stopX
                (float)39.75*px, // stopY
                p // Paint
        );
        //big line going across most of hamilton third floor
        c.drawLine(
                (float)21.5*px, // startX
                (float)39.75*px, // startY
                (float)41*px, // stopX
                (float)39.75*px, // stopY
                p // Paint
        );
        //little angled line at the end of hamilton third floor
        c.drawLine(
                (float)41*px, // startX
                (float)39.75*px, // startY
                (float)42*px, // stopX
                (float)40.75*px, // stopY
                p // Paint
        );
    }

    public void johnsonThirdTop() {
        //top to J326
        c.drawLine(
                (float)54*px, // startX
                (float)10*px, // startY
                (float)54*px, // stopX
                (float)26*px, // stopY
                p // Paint
        );
    }

    public void johnsonThirdMid() {
        //J326 to J309
        c.drawLine(
                (float)54*px, // startX
                (float)26*px, // startY
                (float)54*px, // stopX
                (float)55*px, // stopY
                p // Paint
        );
    }

    public void johnsonThirdBottom() {
        //J309 to bottom
        c.drawLine(
                (float)54*px, // startX
                (float)55*px, // startY
                (float)54*px, // stopX
                (float)66.5*px, // stopY
                p // Paint
        );
    }

    public void johnsonThirdFloor(){
        johnsonThirdTop();
        johnsonThirdMid();
        johnsonThirdBottom();
    }
}
