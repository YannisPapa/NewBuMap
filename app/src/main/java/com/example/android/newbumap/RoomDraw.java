package com.example.android.newbumap;

import android.graphics.Canvas;
import android.graphics.Paint;

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

    public void FFJ117a() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 33* pixel,  //y
                (float) 52* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    public void FFJ117b() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 31 * pixel,  //y
                (float) 52* pixel, //width
                (float) 33* pixel, //height
                P
        );
    }

    public void FFJ117d() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 28.5 * pixel,  //y
                (float) 52* pixel, //width
                (float) 31* pixel, //height
                P
        );
    }

    public void FFJ118() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 52* pixel, //width
                (float) 28.5* pixel, //height
                P
        );
    }

    public void FFJ119() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 19.5 * pixel,  //y
                (float) 52* pixel, //width
                (float) 24* pixel, //height
                P
        );
    }

    public void FFJ120() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 10 * pixel,  //y
                (float) 52* pixel, //width
                (float) 19.5* pixel, //height
                P
        );
    }

    public void FFJ121() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 17 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 20* pixel, //height
                P
        );
    }

    public void FFJ122() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 20* pixel,  //y
                (float) 57.5* pixel, //width
                (float) 22.3* pixel, //height
                P
        );
    }

    public void FFJ123() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 22.3 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    public void FFJ124() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 27* pixel, //height
                P
        );
    }

    public void FFJ125() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 27 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 29* pixel, //height
                P
        );
    }

    public void FFJ126() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 29 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 31.5* pixel, //height
                P
        );
    }

    public void FFJ127() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 31.5 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    public void FFJ128() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 34 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    public void FFJ150() {
        C.drawRect(
                (float) 45.5 * pixel, //x
                (float) 2 * pixel,  //y
                (float) 54* pixel, //width
                (float) 8* pixel, //height
                P
        );
    }

    public void FFJ151() {
        C.drawRect(
                (float) 45.5 * pixel, //x
                (float) 8 * pixel,  //y
                (float) 52* pixel, //width
                (float) 10* pixel, //height
                P
        );
    }

    public void FFJ152() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 10 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 14* pixel, //height
                P
        );
    }

    public void FFJ153() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 5 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 10* pixel, //height
                P
        );
    }

    public void FFJ154() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 2 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 5* pixel, //height
                P
        );
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
                (float) 0.5 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    public void SFN206() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 46.3 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    public void SFN207() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.3 * pixel, //height
                P
        );
    }

    public void SFN208() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 41.9 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    public void SFN209() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 39.3 * pixel,  //y
                (float) 6* pixel, //width
                (float) 41.9 * pixel, //height
                P
        );
    }

    public void SFN210a() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 37* pixel,  //y
                (float) 6* pixel, //width
                (float) 39.3* pixel, //height
                P
        );
    }

    public void SFN210b() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 35* pixel,  //y
                (float) 6* pixel, //width
                (float) 37* pixel, //height
                P
        );
    }

    public void SFN211() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 28 * pixel,  //y
                (float) 6* pixel, //width
                (float) 35 * pixel, //height
                P
        );
    }

    public void SFN212() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 21.5 * pixel,  //y
                (float) 6* pixel, //width
                (float) 28 * pixel, //height
                P
        );
    }

    public void SFN213() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 16.9 * pixel,  //y
                (float) 6* pixel, //width
                (float) 21.5 * pixel, //height
                P
        );
    }

    public void SFN214() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 19.3* pixel,  //y
                (float) 13* pixel, //width
                (float) 22.5* pixel, //height
                P
        );
    }

    public void SFN215() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 22.5* pixel,  //y
                (float) 13* pixel, //width
                (float) 27* pixel, //height
                P
        );}
    public void SFN216() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 27* pixel,  //y
                (float) 13* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }
    /**
     * ------------------------- Second floor Johnson -------------------------
     **/

    public void SFJBWH() {
        C.drawRect(
                (float) 40 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 53* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    public void SFJ201() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 66 * pixel,  //y
                (float) 59.5* pixel, //width
                (float) 72 * pixel, //height
                P
        );
    }

    public void SFJ202() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 59.5* pixel, //width
                (float) 66 * pixel, //height
                P
        );
    }

    public void SFJ203a() {
        C.drawRect(
                (float) 56 * pixel, //x
                (float) 62 * pixel,  //y
                (float) 59* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    public void SFJ203b() {
        C.drawRect(
                (float) 56 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 59* pixel, //width
                (float) 62 * pixel, //height
                P
        );
    }

    public void SFJ203() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 49 * pixel,  //y
                (float) 59* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    public void SFJ204() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 59* pixel, //width
                (float) 49 * pixel, //height
                P
        );
    }

    public void SFJ205() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 36.5 * pixel,  //y
                (float) 51* pixel, //width
                (float) 38.5* pixel, //height
                P
        );
    }

    public void SFJ206() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 29.7 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    public void SFJ207() {
        C.drawRect(
                (float) 49.5 * pixel, //x
                (float) 27.5 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 29.7* pixel, //height
                P
        );
    }

    public void SFJ207a() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 49.5* pixel, //width
                (float) 29.7* pixel, //height
                P
        );
    }

    public void SFJ208() {
        C.drawRect(
                (float) 49.5 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 27.5* pixel, //height
                P
        );
    }

    public void SFJ209() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 23 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    public void SFJ210() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 11.9 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 23* pixel, //height
                P
        );
    }

    public void SFJ211() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 11.9* pixel, //height
                P
        );
    }

    public void SFJ212() {
        C.drawRect(
                (float) 46 * pixel, //x
                (float) 1 * pixel,  //y
                (float) 58* pixel, //width
                (float) 9.5* pixel, //height
                P
        );
    }
    public void SFJ214()
    {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 11.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 13.5* pixel, //height
                P
        );
    }
    public void SFJ214a() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 13.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 14.3* pixel, //height
                P
        );
    }
    public void SFJ215a() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 14.3 * pixel,  //y
                (float) 62* pixel, //width
                (float) 18* pixel, //height
                P
        );
    }
    public void SFJ215() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 21* pixel, //height
                P
        );
    }

    public void SFJ216() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 21* pixel,  //y
                (float) 58* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    public void SFJ217() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 58* pixel, //width
                (float) 27* pixel, //height
                P
        );
    }

    public void SFJ218() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 27 * pixel,  //y
                (float) 58* pixel, //width
                (float) 29.5* pixel, //height
                P
        );
    }

    public void SFJ219() {

        C.drawRect(
                (float) 55 * pixel, //x
                (float) 29.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 31.5* pixel, //height
                P
        );
    }

    public void SFJ220() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 31.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    public void SFJ221() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 34 * pixel,  //y
                (float) 58* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    public void SFJ230() {
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 53* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    public void SFJ232() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 53* pixel, //width
                (float) 58.5 * pixel, //height
                P
        );
    }

    public void SFJ232b() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 58.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    public void SFJ232a() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- Third floor Hamilton -------------------------
     **/
    public void TFH300() {
        C.drawRect(
                (float) 13 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 20* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    public void TFH301() {
        C.drawRect(
                (float) 21.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 26.5* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH302() {
        C.drawRect(
                (float) 26.5 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 31.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH303() {
        C.drawRect(
                (float) 31.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 35.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH304() {
        C.drawRect(
                (float) 35.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 42* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH305() {
        C.drawRect(
                (float) 42 * pixel, //x
                (float) 41.5 * pixel,  //y
                (float) 48* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH310() {
        C.drawRect(
                (float) 16.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 19.5* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    public void TFH310a() {
        C.drawRect(
                (float) 19.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 21.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- Third floor Nicolls -------------------------
     **/
    public void TFN301() {
        C.drawRect(
                (float) 10.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 13.3 * pixel, //width
                (float) 50.5 * pixel, //height
                P
        );

    }

    public void TFN302() {
        C.drawRect(
                (float) 8.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 10.9 * pixel, //width
                (float) 50.5 * pixel, //height
                P
        );

    }

    public void TFN303() {
        C.drawRect(
                (float) 6.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 8.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    public void TFN304() {
        C.drawRect(
                (float) 4.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 6.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    public void TFN305() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48 * pixel,  //y
                (float) 4.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    public void TFN306() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48 * pixel, //height
                P
        );
    }

    public void TFN307() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 43.9 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46 * pixel, //height
                P
        );
    }

    public void TFN308() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 41.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 43.9 * pixel, //height
                P
        );
    }

    public void TFN310() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 33.9 * pixel,  //y
                (float) 6* pixel, //width
                (float) 41.5 * pixel, //height
                P
        );
    }

    public void TFN311a() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 31 * pixel,  //y
                (float) 6* pixel, //width
                (float) 33.9 * pixel, //height
                P
        );
    }

    public void TFN311b() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 28 * pixel,  //y
                (float) 6* pixel, //width
                (float) 31 * pixel, //height
                P
        );
    }

    public void TFN312() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 6* pixel, //width
                (float) 28 * pixel, //height
                P
        );
    }

    public void TFN314() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 19 * pixel,  //y
                (float) 13* pixel, //width
                (float) 24.5 * pixel, //height
                P
        );
    }

    public void TFN315() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 24.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 30.5 * pixel, //height
                P
        );
    }

    public void TFN315b() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 30.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 33.5 * pixel, //height
                P
        );
    }

    public void TFN315a() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 33.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 37 * pixel, //height
                P
        );
    }
    public void TFN316() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 37 * pixel,  //y
                (float) 13* pixel, //width
                (float) 40 * pixel, //height
                P
        );
    }

    /**
     * ------------------------- Third floor Johnson -------------------------
     **/
    public void TFJ301() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 63.5* pixel,  //y
                (float) 59* pixel, //width
                (float) 72 * pixel, //height
                P
        );
    }

    public void TFJ302() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 60 * pixel,  //y
                (float) 59* pixel, //width
                (float) 63.5 * pixel, //height
                P
        );
    }

    public void TFJ302a() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 57.5 * pixel,  //y
                (float) 60* pixel, //width
                (float) 60 * pixel, //height
                P
        );
    }

    public void TFJ303() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 60* pixel, //width
                (float) 57.5 * pixel, //height
                P
        );
    }

    public void TFJ305() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 60* pixel, //width
                (float) 46 * pixel, //height
                P
        );
    }

    public void TFJ306() {
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 53* pixel, //width
                (float) 45 * pixel, //height
                P
        );
    }

    public void TFJ308() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 53* pixel, //width
                (float) 56.5 * pixel, //height
                P
        );
    }

    public void TFJ309() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 56.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 58.5 * pixel, //height
                P
        );
    }

    public void TFJ310() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 58.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    public void TFJ310a() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    public void TFJ313() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 34* pixel,  //y
                (float) 53* pixel, //width
                (float) 37.3* pixel, //height
                P
        );
    }

    public void TFJ314() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 29.3* pixel,  //y
                (float) 53* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    public void TFJ315() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 21.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 29.3* pixel, //height
                P
        );
    }

    public void TFJ316() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 21.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 29.3* pixel, //height
                P
        );
    }

    public void TFJ317() {
        C.drawRect(
                (float) 49.9 * pixel, //x
                (float) 19.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 21.3* pixel, //height
                P
        );
    }

    public void TFJ318() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 19.3* pixel, //height
                P
        );
    }

    public void TFJ320() {
        C.drawRect(
                (float) 46 * pixel, //x
                (float) 1 * pixel,  //y
                (float) 58* pixel, //width
                (float) 9.5* pixel, //height
                P
        );
    }

    public void TFJ321() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 11.9* pixel, //height
                P
        );
    }

    public void TFJ322() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 11.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 18* pixel, //height
                P
        );
    }

    public void TFJ323() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 19* pixel, //height
                P
        );
    }

    public void TFJ324() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 19 * pixel,  //y
                (float) 58* pixel, //width
                (float) 22* pixel, //height
                P
        );
    }

    public void TFJ325() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 22 * pixel,  //y
                (float) 58* pixel, //width
                (float) 24.5* pixel, //height
                P
        );
    }

    public void TFJ326() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 24.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 27.5* pixel, //height
                P
        );
    }

    public void TFJ327() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 27.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 29.9* pixel, //height
                P
        );
    }

    public void TFJ328() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 29.9 * pixel,  //y
                (float) 58* pixel, //width
                (float) 33.5* pixel, //height
                P
        );
    }

    public void TFJ329() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 33.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 36* pixel, //height
                P
        );
    }
    public void roomSelected(String roomToDraw, int position){
        if(roomToDraw.equals("J-001")){
            if(position == 0) {
                this.BJB001();
            }
        }
        if(roomToDraw.equals("J-002")){
            if(position == 0){
                this.BJB002();
            }
        }
        if(roomToDraw.equals("J-004")){
            if(position == 0){
                this.BJB004();
            }
        }
        if(roomToDraw.equals("J-004a")){
            if(position == 0){
                this.BJB004();
            }
        }
        if(roomToDraw.equals("J-005")){
            if(position == 0){
                this.BJB005();
            }
        }
        if(roomToDraw.equals("J-005a")){
            if(position == 0){
                this.BJB005a();
            }
        }
        if(roomToDraw.equals("J-009")){
            if(position == 0){
                this.BJB009();
            }
        }
        if(roomToDraw.equals("J-010")){
            if(position == 0){
                this.BJB010();
            }
        }
        if(roomToDraw.equals("J-011b")){
            if(position == 0){
                this.BJB011();
            }
        }
        if(roomToDraw.equals("J-018")){
            if(position == 0){
                this.BJB018();
            }
        }
        if(roomToDraw.equals("J-019")){
            if(position == 0){
                this.BJB019();
            }
        }
        if(roomToDraw.equals("J-020")){
            if(position == 0){
                this.BJB020();
            }
        }
        if(roomToDraw.equals("J-023")){
            if(position == 0){
                this.BJB023();
            }
        }
        if(roomToDraw.equals("J-024")){
            if(position == 0){
                this.BJB024();
            }
        }
        if(roomToDraw.equals("J-026a")){
            if(position == 0){
                this.BJB026a();
            }
        }
        if(roomToDraw.equals("J-026b")){
            if(position == 0){
                this.BJB026b();
            }
        }
        if(roomToDraw.equals("J-026c")){
            if(position == 0){
                this.BJB026c();
            }
        }
        if(roomToDraw.equals("H-003")){
            if(position == 0){
                this.BHB003();
            }
        }
        if(roomToDraw.equals("N-001")){
            if(position == 0){
                this.BNB001();
            }
        }
        if(roomToDraw.equals("N-002")){
            if(position == 0){
                this.BNB002();
            }
        }
        if(roomToDraw.equals("N-003")){
            if(position == 0){
                this.BNB003();
            }
        }
        if(roomToDraw.equals("N-004")){
            if(position == 0){
                this.BNB004();
            }
        }
        if(roomToDraw.equals("N-005")){
            if(position == 0){
                this.BNB005();
            }
        }
        if(roomToDraw.equals("N-007")){
            if(position == 0){
                this.BNB007();
            }
        }
        if(roomToDraw.equals("N-008")){
            if(position == 0){
                this.BNB008();
            }
        }
        if(roomToDraw.equals("J-101")){
            if(position == 1){
                this.FFJ101();
            }
        }
        if(roomToDraw.equals("J-102")){
            if(position == 1){
                this.FFJ102();
            }
        }
        if(roomToDraw.equals("J-103")){
            if(position == 1){
                this.FFJ103();
            }
        }
        if(roomToDraw.equals("J-104a")){
            if(position == 1){
                this.FFJ104a();
            }
        }
        if(roomToDraw.equals("J-104b")){
            if(position == 1){
                this.FFJ104b();
            }
        }
        if(roomToDraw.equals("J-104c")){
            if(position == 1){
                this.FFJ104c();
            }
        }
        if(roomToDraw.equals("J-104d")){
            if(position == 1){
                this.FFJ104d();
            }
        }
        if(roomToDraw.equals("J-104e")){
            if(position == 1){
                this.FFJ104e();
            }
        }
        if(roomToDraw.equals("J-105")){
            if(position == 1){
                this.FFJ105();
            }
        }
        if(roomToDraw.equals("J-107")){
            if(position == 1){
                this.FFJITS();
            }
        }
        if(roomToDraw.equals("J-108")){
            if(position == 1){
                this.FFJ108();
            }
        }
        if(roomToDraw.equals("J-113")){
            if(position == 1){
                this.FFJ113();
            }
        }
        if(roomToDraw.equals("J-114a")){
            if(position == 1){
                this.FFJ114a();
            }
        }
        if(roomToDraw.equals("J-114")){
            if(position == 1){
                this.FFJ114b();
            }
        }
        if(roomToDraw.equals("J-116")){
            if(position == 1){
                this.FFJ116();
            }
        }
        if(roomToDraw.equals("J-116a")){
            if(position == 1){
                this.FFJ116a();
            }
        }
        if(roomToDraw.equals("J-116b")){
            if(position == 1){
                this.FFJ116b();
            }
        }
        if(roomToDraw.equals("J-116c")){
            if(position == 1){
                this.FFJ116c();
            }
        }
        if(roomToDraw.equals("J-117a")){
            if(position == 1){
                this.FFJ117a();
            }
        }
        if(roomToDraw.equals("J-117b")){
            if(position == 1){
                this.FFJ117b();
            }
        }
        if(roomToDraw.equals("J-117d")){
            if(position == 1){
                this.FFJ117d();
            }
        }
        if(roomToDraw.equals("J-118")){
            if(position == 1){
                this.FFJ118();
            }
        }
        if(roomToDraw.equals("J-119")){
            if(position == 1){
                this.FFJ119();
            }
        }
        if(roomToDraw.equals("J-120")){
            if(position == 1){
                this.FFJ120();
            }
        }
        if(roomToDraw.equals("J-121")){
            if(position == 1){
                this.FFJ121();
            }
        }
        if(roomToDraw.equals("J-122")){
            if(position == 1){
                this.FFJ122();
            }
        }
        if(roomToDraw.equals("J-123")){
            if(position == 1){
                this.FFJ123();
            }
        }
        if(roomToDraw.equals("J-124")){
            if(position == 1){
                this.FFJ124();
            }
        }
        if(roomToDraw.equals("J-125")){
            if(position == 1){
                this.FFJ125();
            }
        }
        if(roomToDraw.equals("J-126")){
            if(position == 1){
                this.FFJ126();
            }
        }
        if(roomToDraw.equals("J-127")){
            if(position == 1){
                this.FFJ127();
            }
        }
        if(roomToDraw.equals("J-128")){
            if(position == 1){
                this.FFJ128();
            }
        }
        if(roomToDraw.equals("J-150")){
            if(position == 1){
                this.FFJ150();
            }
        }
        if(roomToDraw.equals("J-151")){
            if(position == 1){
                this.FFJ151();
            }
        }
        if(roomToDraw.equals("J-152")){
            if(position == 1){
                this.FFJ152();
            }
        }
        if(roomToDraw.equals("J-153")){
            if(position == 1){
                this.FFJ153();
            }
        }
        if(roomToDraw.equals("J-154")){
            if(position == 1){
                this.FFJ154();
            }
        }
        if(roomToDraw.equals("H-150")){
            if(position == 1){
                this.FFH150();
            }
        }
        if(roomToDraw.equals("H-160")){
            if(position == 1){
                this.FFH160();
            }
        }
        if(roomToDraw.equals("H-161")){
            if(position == 1){
                this.FFH161();
            }
        }
        if(roomToDraw.equals("H-126")){
            if(position == 1){
                this.FFHBSC();
            }
        }
        if(roomToDraw.equals("N-101")){
            if(position == 1){
                this.FFN101();
            }
        }
        if(roomToDraw.equals("N-102")){
            if(position == 1){
                this.FFN102();
            }
        }
        if(roomToDraw.equals("N-103")){
            if(position == 1){
                this.FFN103();
            }
        }
        if(roomToDraw.equals("N-104")){
            if(position == 1){
                this.FFN104();
            }
        }
        if(roomToDraw.equals("N-105")){
            if(position == 1){
                this.FFN105();
            }
        }
        if(roomToDraw.equals("N-106")){
            if(position == 1){
                this.FFN106();
            }
        }
        if(roomToDraw.equals("N-107")){
            if(position == 1){
                this.FFN107();
            }
        }
        if(roomToDraw.equals("N-108")){
            if(position == 1){
                this.FFN108();
            }
        }
        if(roomToDraw.equals("N-109")){
            if(position == 1){
                this.FFN109();
            }
        }
        if(roomToDraw.equals("N-110")){
            if(position == 1){
                this.FFN110();
            }
        }
        if(roomToDraw.equals("N-111")){
            if(position == 1){
                this.FFN111();
            }
        }
        if(roomToDraw.equals("N-112")){
            if(position == 1){
                this.FFN112();
            }
        }
        if(roomToDraw.equals("N-113")){
            if(position == 1){
                this.FFN113();
            }
        }
        if(roomToDraw.equals("N-114")){
            if(position == 1){
                this.FFN114();
            }
        }
        if(roomToDraw.equals("N-115")){
            if(position == 1){
                this.FFN115();
            }
        }
        if(roomToDraw.equals("N-116")){
            if(position == 1){
                this.FFN116();
            }
        }
        if(roomToDraw.equals("N-201")){
            if(position == 2){
                this.SFN201();
            }
        }
        if(roomToDraw.equals("N-202")){
            if(position == 2){
                this.SFN202();
            }
        }
        if(roomToDraw.equals("N-203")){
            if(position == 2){
                this.SFN203();
            }
        }
        if(roomToDraw.equals("N-204")){
            if(position == 2){
                this.SFN204();
            }
        }
        if(roomToDraw.equals("N-205")){
            if(position == 2){
                this.SFN205();
            }
        }
        if(roomToDraw.equals("N-206")){
            if(position == 2){
                this.SFN206();
            }
        }
        if(roomToDraw.equals("N-207")){
            if(position == 2){
                this.SFN207();
            }
        }
        if(roomToDraw.equals("N-208")){
            if(position == 2){
                this.SFN208();
            }
        }
        if(roomToDraw.equals("N-209")){
            if(position == 2){
                this.SFN209();
            }
        }
        if(roomToDraw.equals("N-210a")){
            if(position == 2){
                this.SFN210a();
            }
        }
        if(roomToDraw.equals("N-210b")){
            if(position == 2){
                this.SFN210b();
            }
        }
        if(roomToDraw.equals("N-211")){
            if(position == 2){
                this.SFN211();
            }
        }
        if(roomToDraw.equals("N-212")){
            if(position == 2){
                this.SFN212();
            }
        }
        if(roomToDraw.equals("N-213")){
            if(position == 2){
                this.SFN213();
            }
        }
        if(roomToDraw.equals("N-214")){
            if(position == 2){
                this.SFN214();
            }
        }
        if(roomToDraw.equals("N-215")){
            if(position == 2){
                this.SFN215();
            }
        }
        if(roomToDraw.equals("N-216")){
            if(position == 2){
                this.SFN216();
            }
        }
        if(roomToDraw.equals("H-200")){
            if(position == 2){
                this.SFH200();
            }
        }
        if(roomToDraw.equals("H-201")){
            if(position == 2){
                this.SFH201();
            }
        }
        if(roomToDraw.equals("H-201b")){
            if(position == 2){
                this.SFH201b();
            }
        }
        if(roomToDraw.equals("H-202")){
            if(position == 2){
                this.SFH202();
            }
        }
        if(roomToDraw.equals("H-203")){
            if(position == 2){
                this.SFH203();
            }
        }
        if(roomToDraw.equals("H-204")){
            if(position == 2){
                this.SFH204();
            }
        }
        if(roomToDraw.equals("H-205a")){
            if(position == 2){
                this.SFH205a();
            }
        }
        if(roomToDraw.equals("H-205b")){
            if(position == 2){
                this.SFH205b();
            }
        }
        if(roomToDraw.equals("H-206")){
            if(position == 2){
                this.SFH206();
            }
        }
        if(roomToDraw.equals("H-207")){
            if(position == 2){
                this.SFH207();
            }
        }
        if(roomToDraw.equals("H-208")){
            if(position == 2){
                this.SFH208();
            }
        }
        if(roomToDraw.equals("H-209")){
            if(position == 2){
                this.SFH209();
            }
        }
        if(roomToDraw.equals("H-210")){
            if(position == 2){
                this.SFH210();
            }
        }
        if(roomToDraw.equals("H-211")){
            if(position == 2){
                this.SFH211();
            }
        }
        if(roomToDraw.equals("H-212")){
            if(position == 2){
                this.SFH212();
            }
        }
        if(roomToDraw.equals("H-212a")){
            if(position == 2){
                this.SFH212a();
            }
        }
        if(roomToDraw.equals("H-213")){
            if(position == 2){
                this.SFH213();
            }
        }
        if(roomToDraw.equals("H-214")){
            if(position == 2){
                this.SFH214();
            }
        }
        if(roomToDraw.equals("H-215")){
            if(position == 2){
                this.SFH215();
            }
        }
        if(roomToDraw.equals("H-216")){
            if(position == 2){
                this.SFH216();
            }
        }
        if(roomToDraw.equals("H-217")){
            if(position == 2){
                this.SFH217();
            }
        }
        if(roomToDraw.equals("H-218")){
            if(position == 2){
                this.SFH218();
            }
        }
        if(roomToDraw.equals("H-219")){
            if(position == 2){
                this.SFH219();
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