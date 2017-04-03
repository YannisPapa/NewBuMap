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
    }

    public void FFH160() {
    }

    public void FFH161() {
    }

    public void FFHBSC() {
    }

    /**
     * ------------------------- First floor Nicolls -------------------------
     **/
    public void FFN101() {
    }

    public void FFN102() {
    }

    public void FFN103() {
    }

    public void FFN104() {
    }

    public void FFN105() {
    }

    public void FFN106() {
    }

    public void FFN107() {
    }

    public void FFN108() {
    }

    public void FFN109() {
    }

    public void FFN110() {
    }

    public void FFN111() {
    }

    public void FFN112() {
    }

    public void FFN113() {
    }

    public void FFN114() {
    }

    public void FFN115() {
    }

    /**
     * ------------------------- First floor Johnson -------------------------
     **/

    public void FFJ101() {
    }

    public void FFJ102() {
    }

    public void FFJ103() {
    }

    public void FFJ104a() {
    }

    public void FFJ104b() {
    }

    public void FFJ104c() {
    }

    public void FFJ104d() {
    }

    public void FFJ104e() {
    }

    public void FFJ105() {
    }

    public void FFJITS() {
    }

    public void FFJ108() {
    }

    public void FFJ113() {
    }

    public void FFJ114() {
    }

    public void FFJ114a() {
    }

    public void FFJ114b() {
    }

    public void FFJ115() {
    }

    public void FFJ116() {
    }

    public void FFJ116a() {
    }

    public void FFJ116b() {
    }

    public void FFJ116c() {
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
    }

    public void SFN202() {
    }

    public void SFN203() {
    }

    public void SFN204() {
    }

    public void SFN205() {
    }

    public void SFN206() {
    }

    public void SFN207() {
    }

    public void SFN208() {
    }

    public void SFN209() {
    }

    public void SFN210a() {
    }

    public void SFN210b() {
    }

    public void SFN211() {
    }

    public void SFN212() {
    }

    public void SFN213() {
    }

    public void SFN214() {
    }

    public void SFN215() {
    }

    public void SFN216() {
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

    public void SFJ215() {
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

    public void SFJ21532b() {
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
    }

    public void TFN302() {
    }

    public void TFN303() {
    }

    public void TFN304() {
    }

    public void TFN305() {
    }

    public void TFN306() {
    }

    public void TFN307() {
    }

    public void TFN308() {
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
}