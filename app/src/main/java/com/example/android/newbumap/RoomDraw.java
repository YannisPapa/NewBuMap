package com.example.android.newbumap;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by jessi on 2017-04-03.
 */

public class RoomDraw {
    private Paint P;
    private Canvas C;
    private float pixel;

    public RoomDraw(Paint pai, Canvas can, float px) {
        P = pai;
        C = can;
        pixel = px;
    }

    public void changePaint(Paint p) {
        P = p;
    }


    /**
     * ------------------------- Basement Johnson -------------------------
     **/
    //J001 Basement, Johnson, Bottom
    public void BJB001() { //J001
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 61 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    //J002 Basement, Johnson, Bottom
    public void BJB002() { //J002
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 57 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 61 * pixel, //height
                P
        );
    }

    //J004 Basement, Johnson, Bottom
    public void BJB004() { //J004
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 52 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 57 * pixel, //height
                P
        );
    }

    //J005 Basement, Johnson, Bottom
    public void BJB005() { //J005
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 49.5 * pixel, //height
                P
        );
    }

    //J005a Basement, Johnson, Bottom
    public void BJB005a() { //J005a
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 49.5 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 52 * pixel, //height
                P
        );
    }

    //J009 Basement, Johnson, Bottom
    public void BJB009() { //Room J009
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 41 * pixel,  //y
                (float) 61 * pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    //J010 Basement, Johnson, Bottom
    public void BJB010() { //Room J010
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 61 * pixel, //width
                (float) 57.5 * pixel, //height
                P
        );
    }

    //J011 Basement, Johnson, Bottom
    public void BJB011() { //J011b
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 61 * pixel,  //y
                (float) 62 * pixel, //width
                (float) 64.5 * pixel, //height
                P
        );
    }

    //J018 Basement, Johnson, Bottom
    public void BJB018() { //J018
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 15 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 24 * pixel, //height
                P
        );
    }

    //J019 Basement, Johnson, Bottom
    public void BJB019() { //J019
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 15 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 11 * pixel, //height
                P
        );
    }

    //J020 Basement, Johnson, Bottom
    public void BJB020() { //J020
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 11 * pixel,  //y
                (float) 58 * pixel, //width
                (float) 5.5 * pixel, //height
                P
        );
    }

    //J023 Basement, Johnson, Bottom
    public void BJB023() { //J023
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 18 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 22 * pixel, //height
                P
        );
    }

    //J024 Basement, Johnson, Bottom
    public void BJB024() { //J024
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 22 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 32 * pixel, //height
                P
        );
    }

    //J026a Basement, Johnson, Bottom
    public void BJB026a() { //J026a
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 32 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 33.9 * pixel, //height
                P
        );
    }

    //J026b Basement, Johnson, Bottom
    public void BJB026b() { //J026b
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 35.5 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 34 * pixel, //height
                P
        );
    }   //J026c Basement, Johnson, Bottom

    public void BJB026c() { //J026c
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 35.5 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 37 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- Basement Hamilton -------------------------
     **/
    //H003 Basement, Hamilton, Bottom
    public void BHB003() { //H003
        C.drawRect(
                (float) 43 * pixel, //x
                (float) 41 * pixel,  //y
                (float) 46 * pixel, //width
                (float) 44.5 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- Basement Nicolls -------------------------
     **/
    //H001 Basement,Nicolls , Bottom
    public void BNB001() { //N001
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 44.5 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 51.5 * pixel, //height
                P
        );
    }

    //H002 Basement,Nicolls , Bottom
    public void BNB002() { //N002
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 35 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 41.5 * pixel, //height
                P
        );
    }

    //H003 Basement,Nicolls , Bottom
    public void BNB003() { //N003
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 29 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 35 * pixel, //height
                P
        );
    }

    //H004 Basement,Nicolls , Bottom
    public void BNB004() { //N004
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 29 * pixel, //height
                P
        );
    }

    //H005 Basement, Nicolls , Bottom
    public void BNB005() { //N005
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 18 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 24 * pixel, //height
                P
        );
    }

    //H007 Basement,Nicolls , Bottom
    public void BNB007() { //N007
        C.drawRect(
                (float) 12 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 30 * pixel, //height
                P
        );
    }

    //H008 Basement,Nicolls , Bottom
    public void BNB008() { //N008
        C.drawRect(
                (float) 12 * pixel, //x
                (float) 30 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 36 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- First floor Hamilton -------------------------
     **/
    public void FFH150() {
        C.drawRect(
                (float) 35 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 43.5 * pixel, //width
                (float) 45 * pixel, //height
                P
        );
    }

    public void FFH160() {
        C.drawRect(
                (float) 29 * pixel, //x
                (float) 39.5 * pixel,  //y
                (float) 31 * pixel, //width
                (float) 42.5 * pixel, //height
                P
        );
    }
    public void FFH161() {
        C.drawRect(
                (float) 31 * pixel, //x
                (float) 39.5 * pixel,  //y
                (float) 33 * pixel, //width
                (float) 42.5 * pixel, //height
                P
        );
    }


    public void FFHBSC() {
        C.drawRect(
                (float) 13 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 17.5 * pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- First floor Nicolls -------------------------
     **/
    public void FFN101() {
        C.drawRect(
                (float) 10.8 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 13 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void FFN102() {
        C.drawRect(
                (float) 8.6 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 10.8 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void FFN103() {
        C.drawRect(
                (float) 6.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 8.6* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void FFN104() {
        C.drawRect(
                (float) 4.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 6.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void FFN105() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void FFN106() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    public void FFN107() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.5 * pixel, //height
                P
        );
    }

    public void FFN108() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    public void FFN109() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 38.5 * pixel,  //y
                (float) 7* pixel, //width
                (float) 42 * pixel, //height
                P
        );
    }

    public void FFN110() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 33* pixel,  //y
            (float) 7* pixel, //width
            (float) 38.5* pixel, //height
            P
    );
    }

    public void FFN111() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 27 * pixel,  //y
            (float) 7* pixel, //width
            (float) 33 * pixel, //height
            P
    );
    }

    public void FFN112() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 22.9 * pixel,  //y
                (float) 7* pixel, //width
                (float) 27 * pixel, //height
                P
        );
    }

    public void FFN113() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 17 * pixel,  //y
            (float) 7* pixel, //width
            (float) 22.9 * pixel, //height
            P
    );
    }

    public void FFN114() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 19.5* pixel,  //y
                (float) 13* pixel, //width
                (float) 26* pixel, //height
                P
        );
    }

    public void FFN115() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 26* pixel,  //y
                (float) 13* pixel, //width
                (float) 33* pixel, //height
                P
        );}
    public void FFN116() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 33* pixel,  //y
                (float) 13* pixel, //width
                (float) 37.5* pixel, //height
                P
        );}
    /**
     * ------------------------- First floor Johnson -------------------------
     **/

    public void FFJ101() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 59 * pixel, //width
                (float) 71.9 * pixel, //height
                P
        );
    }

    public void FFJ102() {
        C.drawRect(
            (float) 45 * pixel, //x
            (float) 64 * pixel,  //y
            (float) 50 * pixel, //width
            (float) 67.5 * pixel, //height
            P
    );
    }

    public void FFJ103() {
        C.drawRect(
                (float) 39.5 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 45* pixel, //width
                (float) 67.5 * pixel, //height
                P
        );
    }

    public void FFJ104a() {
        C.drawRect(
                (float) 50 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    public void FFJ104b() {
        C.drawRect(
                (float) 47.3 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 50* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    public void FFJ104c() {   C.drawRect(
            (float) 44.5 * pixel, //x
            (float) 69 * pixel,  //y
            (float) 47.3* pixel, //width
            (float) 71* pixel, //height
            P
    );
    }

    public void FFJ104d() {
        C.drawRect(
                (float) 41.9 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 44.5* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    public void FFJ104e() {
        C.drawRect(
                (float) 39.9 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 42* pixel, //width
                (float) 71* pixel, //height
                P
        );
    }

    public void FFJ105() {
        C.drawRect(
                (float) 52.5 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 64* pixel, //height
                P
        );
    }

    public void FFJITS() {
        C.drawRect(
                (float) 52.5* pixel, //x
                (float) 52.6 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 60.5* pixel, //height
                P
        );
    }

    public void FFJ108() {
        C.drawRect(
                (float) 52.5 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 52.6* pixel, //height
                P
        );
    }

    public void FFJ113() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 59* pixel, //width
                (float) 45* pixel, //height
                P
        );
    }

    public void FFJ114a() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 48.5* pixel, //height
                P
        );
    }

    public void FFJ114b() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 50.5* pixel, //height
                P
        );
    }

    public void FFJ115() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 50.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 54.8* pixel, //height
                P
        );
    }

    public void FFJ116() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 58 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 60.5* pixel, //height
                P
        );
    }

    public void FFJ116a() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 54.8 * pixel,  //y
                (float) 55.9* pixel, //width
                (float) 57* pixel, //height
                P
        );
    }

    public void FFJ116b() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 64* pixel, //height
                P
        );
    }

    public void FFJ116c() {
        C.drawRect(
                (float) 55.9 * pixel, //x
                (float) 54.8 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 58* pixel, //height
                P
        );
    }

    public void FFJ117() {
    }

    public void FFJ117a() {
    }

    public void FFJ117b() {
    }

    public void FFJ117d() {
    }

    public void FFJ118() {
    }

    public void FFJ119() {
    }

    public void FFJ120() {
    }

    public void FFJ121() {
    }

    public void FFJ122() {
    }

    public void FFJ123() {
    }

    public void FFJ124() {
    }

    public void FFJ125() {
    }

    public void FFJ126() {
    }

    public void FFJ127() {
    }

    public void FFJ128() {
    }

    public void FFJ150() {
    }

    public void FFJ151() {
    }

    public void FFJ152() {
    }

    public void FFJ153() {
    }

    public void FFJ154() {
    }

    /**
     * ------------------------- Second floor Hamilton -------------------------
     **/
    public void SFH200() {
    }

    public void SFH201() {
    }

    public void SFH201b() {
    }

    public void SFH202() {
    }

    public void SFH203() {
    }

    public void SFH204() {
    }

    public void SFH205a() {
    }

    public void SFH205b() {
    }

    public void SFH206() {
    }

    public void SFH207() {
    }

    public void SFH208() {
    }

    public void SFH209() {
    }

    public void SFH210() {
    }

    public void SFH211() {
    }

    public void SFH212a() {
    }

    public void SFH212() {
    }

    public void SFH213() {
    }

    public void SFH214() {
    }

    public void SFH215() {
    }

    public void SFH216() {
    }

    public void SFH217() {
    }

    public void SFH218() {
    }

    public void SFH219() {
    }

    /**
     * ------------------------- Second floor Nicolls-------------------------
     **/
    public void SFN201() {
        C.drawRect(
                (float) 10.8 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 13 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void SFN202() {
        C.drawRect(
                (float) 8.6 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 10.8 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void SFN203() {
        C.drawRect(
                (float) 6.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 8.6* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void SFN204() {
        C.drawRect(
                (float) 4.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 6.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void SFN205() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void SFN206() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    public void SFN207() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.5 * pixel, //height
                P
        );
    }

    public void SFN208() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    public void SFN209() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 38.5 * pixel,  //y
                (float) 7* pixel, //width
                (float) 42 * pixel, //height
                P
        );
    }

    public void SFN210a() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 33* pixel,  //y
                (float) 7* pixel, //width
                (float) 38.5* pixel, //height
                P
        );
    }

    public void SFN210b() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 33* pixel,  //y
                (float) 7* pixel, //width
                (float) 38.5* pixel, //height
                P
        );
    }

    public void SFN211() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 27 * pixel,  //y
                (float) 7* pixel, //width
                (float) 33 * pixel, //height
                P
        );
    }

    public void SFN212() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 22.9 * pixel,  //y
                (float) 7* pixel, //width
                (float) 27 * pixel, //height
                P
        );
    }

    public void SFN213() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 17 * pixel,  //y
                (float) 7* pixel, //width
                (float) 22.9 * pixel, //height
                P
        );
    }

    public void SFN214() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 19.5* pixel,  //y
                (float) 13* pixel, //width
                (float) 26* pixel, //height
                P
        );
    }

    public void SFN115() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 26* pixel,  //y
                (float) 13* pixel, //width
                (float) 33* pixel, //height
                P
        );}
    public void SFN116() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 33* pixel,  //y
                (float) 13* pixel, //width
                (float) 37.5* pixel, //height
                P
        );
    }
    /**
     * ------------------------- Second floor Johnson -------------------------
     **/

    public void SFJBWH() {
    }

    public void SFJ201() {
    }

    public void SFJ202() {
    }

    public void SFJ203a() {
    }

    public void SFJ203b() {
    }

    public void SFJ203() {
    }

    public void SFJ204() {
    }

    public void SFJ205() {
    }

    public void SFJ206() {
    }

    public void SFJ207() {
    }

    public void SFJ207a() {
    }

    public void SFJ208() {
    }

    public void SFJ209() {
    }

    public void SFJ210() {
    }

    public void SFJ211() {
    }

    public void SFJ212() {

    }
    public void SFJ214() {

    }
    public void SFJ214a() {

    }
    public void SFJ215() {

    }
    public void SFJ215a() {

    }

    public void SFJ216() {
    }

    public void SFJ217() {
    }

    public void SFJ218() {
    }

    public void SFJ219() {
    }

    public void SFJ220() {
    }

    public void SFJ221() {
    }

    public void SFJ230() {
    }

    public void SFJ232() {
    }

    public void SFJ232b() {
    }

    public void SFJ232a() {
    }

    /**
     * ------------------------- Third floor Hamilton -------------------------
     **/
    public void TFH300() {
    }

    public void TFH301() {
    }

    public void TFH302() {
    }

    public void TFH303() {
    }

    public void TFH304() {
    }

    public void TFH305() {
    }

    public void TFH310() {
    }

    public void TFH310a() {
    }

    /**
     * ------------------------- Third floor Nicolls -------------------------
     **/
    public void TFN301() {
        C.drawRect(
                (float) 10.8 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 13 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void TFN302() {
        C.drawRect(
                (float) 8.6 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 10.8 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    public void TFN303() {
        C.drawRect(
                (float) 6.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 8.6* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void TFN304() {
        C.drawRect(
                (float) 4.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 6.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void TFN305() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void TFN306() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    public void TFN307() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.5 * pixel, //height
                P
        );
    }

    public void TFN308() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    public void TFN310() {
    }

    public void TFN311a() {
    }

    public void TFN311b() {
    }

    public void TFN312() {
    }

    public void TFN314() {
    }

    public void TFN315() {
    }

    public void TFN315a() {
    }

    public void TFN315b() {

    }

    public void TFN316() {
    }

    /**
     * ------------------------- Third floor Johnson -------------------------
     **/
    public void TFJ301() {
    }

    public void TFJ302() {
    }

    public void TFJ302a() {
    }

    public void TFJ303() {
    }

    public void TFJ305() {
    }

    public void TFJ306() {
    }

    public void TFJ308() {
    }

    public void TFJ309() {
    }

    public void TFJ310() {
    }

    public void TFJ310a() {
    }

    public void TFJ313() {
    }

    public void TFJ314() {
    }

    public void TFJ315() {
    }

    public void TFJ316() {
    }

    public void TFJ317() {
    }

    public void TFJ318() {
    }

    public void TFJ320() {
    }

    public void TFJ321() {
    }

    public void TFJ322() {
    }

    public void TFJ323() {
    }

    public void TFJ324() {
    }

    public void TFJ325() {
    }

    public void TFJ326() {
    }

    public void TFJ327() {
    }

    public void TFJ328() {
    }

    public void TFJ329() {
    }

    public void roomSelected(String roomToDraw, int position){
        if(roomToDraw.equals("J-001")){
            if(position == 0) {
                this.BJB001();
            }
        }

        if(roomToDraw.equals("J-201")){
            if(position == 2) {
                SFJ201();
            }
        }
        if(roomToDraw.equals("J-202")){
            if(position == 2) {
                SFJ202();
            }
        }
        if(roomToDraw.equals("J-203b")){
            if(position == 2) {
                SFJ203b();
            }
        }
        if(roomToDraw.equals("J-203a")){
            if(position == 2) {
                SFJ203a();
            }
        }
        if(roomToDraw.equals("J-203")){
            if(position == 2) {
                SFJ203();
            }
        }
        if(roomToDraw.equals("J-204")){
            if(position == 2) {
                SFJ204();
            }
        }
        if(roomToDraw.equals("J-205")){
            if(position == 2) {
                SFJ205();
            }
        }
        if(roomToDraw.equals("J-206")){
            if(position == 2) {
                SFJ206();
            }
        }
        if(roomToDraw.equals("J-207a")){
            if(position == 2) {
                SFJ207a();
            }
        }
        if(roomToDraw.equals("J-207")){
            if(position == 2) {
                SFJ207();
            }
        }
        if(roomToDraw.equals("J-208")){
            if(position == 2) {
                SFJ208();
            }
        }
        if(roomToDraw.equals("J-209")){
            if(position == 2) {
                SFJ209();
            }
        }
        if(roomToDraw.equals("J-210")){
            if(position == 2) {
                SFJ210();
            }
        }
        if(roomToDraw.equals("J-211")){
            if(position == 2) {
                SFJ211();
            }
        }

        if(roomToDraw.equals("J-212")){
            if(position == 2) {
                SFJ212();
            }
        }
        if(roomToDraw.equals("J-214")){
            if(position == 2) {
                SFJ214();
            }
        }
        if(roomToDraw.equals("J-214a")){
            if(position == 2) {
                SFJ214a();
            }
        }

        if(roomToDraw.equals("J-215a")){
            if(position == 2) {
                SFJ215a();
            }
        }
        if(roomToDraw.equals("J-215")){
            if(position == 2) {
                SFJ215();
            }
        }
        if(roomToDraw.equals("J-216")){
            if(position == 2) {
                SFJ216();
            }
        }
        if(roomToDraw.equals("J-217")){
            if(position == 2) {
                SFJ217();
            }
        }
        if(roomToDraw.equals("J-218")){
            if(position == 2) {
                SFJ218();
            }
        }
        if(roomToDraw.equals("J-219")){
            if(position == 2) {
                SFJ219();
            }
        }
        if(roomToDraw.equals("J-220")){
            if(position == 2) {
                SFJ220();
            }
        }
        if(roomToDraw.equals("J-200")){
            if(position == 2) {
                SFJBWH();
            }
        }
        if(roomToDraw.equals("J-221")){
            if(position == 2) {
                SFJ221();
            }
        }
        if(roomToDraw.equals("J-230")){
            if(position == 2) {
                SFJ230();
            }
        }
        if(roomToDraw.equals("J-232")){
            if(position == 2) {
                SFJ232();
            }
        }
        if(roomToDraw.equals("J-232b")){
            if(position == 2) {
                SFJ232b();
            }
        }
        if(roomToDraw.equals("J-232a")){
            if(position == 2) {
                SFJ232a();
            }
        }




        if(roomToDraw.equals("J-301")){
            if(position == 3) {
                TFJ301();
            }
        }
        if(roomToDraw.equals("J-302")){
            if(position == 3) {
                TFJ302();
            }
        }
        if(roomToDraw.equals("J-302a")){
            if(position == 3) {
                TFJ302a();
            }
        }
        if(roomToDraw.equals("J-303")){
            if(position == 3) {
                TFJ303();
            }
        }
        if(roomToDraw.equals("J-305")){
            if(position == 3) {
                TFJ305();
            }
        }
        if(roomToDraw.equals("J-306")){
            if(position == 3) {
                TFJ306();
            }
        }
        if(roomToDraw.equals("J-308")){
            if(position == 3) {
                TFJ308();
            }
        }
        if(roomToDraw.equals("J-309")){
            if(position == 3) {
                TFJ309();
            }
        }
        if(roomToDraw.equals("J-310")){
            if(position == 3) {
                TFJ310();
            }
        }
        if(roomToDraw.equals("J-310a")){
            if(position == 3) {
                TFJ310a();
            }
        }
        if(roomToDraw.equals("J-313")){
            if(position == 3) {
                TFJ313();
            }
        }
        if(roomToDraw.equals("J-314")){
            if(position == 3) {
                TFJ314();
            }
        }
        if(roomToDraw.equals("J-315")){
            if(position == 3) {
                TFJ315();
            }
        }
        if(roomToDraw.equals("J-316")){
            if(position == 3) {
                TFJ316();
            }
        }
        if(roomToDraw.equals("J-317")){
            if(position == 3) {
                TFJ317();
            }
        }
        if(roomToDraw.equals("J-318")){
            if(position == 3) {
                TFJ318();
            }
        }
        if(roomToDraw.equals("J-320")){
            if(position == 3) {
                TFJ320();
            }
        }
        if(roomToDraw.equals("J-321")){
            if(position == 3) {
                TFJ321();
            }
        }
        if(roomToDraw.equals("J-322")){
            if(position == 3) {
                TFJ322();
            }
        }
        if(roomToDraw.equals("J-323")){
            if(position == 3) {
                TFJ323();
            }
        }
        if(roomToDraw.equals("J-324")){
            if(position == 3) {
                TFJ324();
            }
        }
        if(roomToDraw.equals("J-325")){
            if(position == 3) {
                TFJ325();
            }
        }
        if(roomToDraw.equals("J-326")){
            if(position == 3) {
                TFJ326();
            }
        }
        if(roomToDraw.equals("J-327")){
            if(position == 3) {
                TFJ327();
            }
        }
        if(roomToDraw.equals("J-328")){
            if(position == 3) {
                TFJ328();
            }
        }
        if(roomToDraw.equals("J-329")){
            if(position == 3) {
                TFJ329();
            }
        }
        if(roomToDraw.equals("H-300")){
            if(position == 3) {
                TFH300();
            }
        }
        if(roomToDraw.equals("H-301")){
            if(position == 3) {
                TFH301();
            }
        }
        if(roomToDraw.equals("H-302")){
            if(position == 3) {
                TFH302();
            }
        }
        if(roomToDraw.equals("H-303")){
            if(position == 3) {
                TFH303();
            }
        }
        if(roomToDraw.equals("H-304")){
            if(position == 3) {
                TFH304();
            }
        }
        if(roomToDraw.equals("H-305")){
            if(position == 3) {
                TFH305();
            }
        }
        if(roomToDraw.equals("H-310")){
            if(position == 3) {
                TFH310();
            }
        }
        if(roomToDraw.equals("H-310a")){
            if(position == 3) {
                TFH310a();
            }
        }
        if(roomToDraw.equals("N-301")){
            if(position == 3) {
                TFN301();
            }
        }
        if(roomToDraw.equals("N-302")){
            if(position == 3) {
                TFN302();
            }
        }
        if(roomToDraw.equals("N-303")){
            if(position == 3) {
                TFN303();
            }
        }
        if(roomToDraw.equals("N-304")){
            if(position == 3) {
                TFN304();
            }
        }
        if(roomToDraw.equals("N-305")){
            if(position == 3) {
                TFN305();
            }
        }
        if(roomToDraw.equals("N-306")){
            if(position == 3) {
                TFN306();
            }
        }
        if(roomToDraw.equals("N-307")){
            if(position == 3) {
                TFN307();
            }
        }
        if(roomToDraw.equals("N-308")){
            if(position == 3) {
                TFN308();
            }
        }
        if(roomToDraw.equals("N-310")){
            if(position == 3) {
                TFN310();
            }
        }
        if(roomToDraw.equals("N-311a")){
            if(position == 3) {
                TFN311a();
            }
        }
        if(roomToDraw.equals("N-311b")){
            if(position == 3) {
                TFN311b();
            }
        }
        if(roomToDraw.equals("N-312")){
            if(position == 3) {
                TFN312();
            }
        }
        if(roomToDraw.equals("N-314")){
            if(position == 3) {
                TFN314();
            }
        }
        if(roomToDraw.equals("N-315")){
            if(position == 3) {
                TFN315();
            }
        }
        if(roomToDraw.equals("N-315b")){
            if(position == 3) {
                TFN315b();
            }
        }
        if(roomToDraw.equals("N-315a")){
            if(position == 3) {
                TFN315a();
            }
        }
        if(roomToDraw.equals("N-316")){
            if(position == 3) {
                TFN316();
            }
        }


    }

}