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


    //-------------------------- Ground Floor Johnson  ---------------------------------------------
    private void J001() { //J001
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 61 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    private void J002() { //J002
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 57 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 61 * pixel, //height
                P
        );
    }

    private void J004() { //J004
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 52 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 57 * pixel, //height
                P
        );
    }

    private void J005() { //J005
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 49.5 * pixel, //height
                P
        );
    }

    private void J005a() { //J005a
        C.drawRect(
                (float) 51 * pixel, //x
                (float) 49.5 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 52 * pixel, //height
                P
        );
    }

    private void J009() { //Room J009
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 41 * pixel,  //y
                (float) 61 * pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void J010() { //Room J010
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 61 * pixel, //width
                (float) 57.5 * pixel, //height
                P
        );
    }

    private void J011() { //J011b
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 61 * pixel,  //y
                (float) 62 * pixel, //width
                (float) 64.5 * pixel, //height
                P
        );
    }

    private void J018() { //J018
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 15 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 24 * pixel, //height
                P
        );
    }

    private void J019() { //J019
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 15 * pixel,  //y
                (float) 55 * pixel, //width
                (float) 11 * pixel, //height
                P
        );
    }

    private void J020() { //J020
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 11 * pixel,  //y
                (float) 58 * pixel, //width
                (float) 5.5 * pixel, //height
                P
        );
    }

    private void J023() { //J023
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 18 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 22 * pixel, //height
                P
        );
    }

    private void J024() { //J024
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 22 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 32 * pixel, //height
                P
        );
    }

    private void J026a() { //J026a
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 32 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 33.9 * pixel, //height
                P
        );
    }

    private void J026b() { //J026b
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 35.5 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 34 * pixel, //height
                P
        );
    }

    private void J026c() { //J026c
        C.drawRect(
                (float) 57 * pixel, //x
                (float) 35.5 * pixel,  //y
                (float) 60 * pixel, //width
                (float) 37 * pixel, //height
                P
        );
    }

    //-------------------------- Ground Floor Hamilton  --------------------------------------------

    private void H003() { //H003
        C.drawRect(
                (float) 43 * pixel, //x
                (float) 41 * pixel,  //y
                (float) 46 * pixel, //width
                (float) 44.5 * pixel, //height
                P
        );
    }

    //-------------------------- Ground Floor Nicolls  ---------------------------------------------

    private void N001() { //N001
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 44.5 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 51.5 * pixel, //height
                P
        );
    }

    private void N002() { //N002
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 35 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 41.5 * pixel, //height
                P
        );
    }

    private void N003() { //N003
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 29 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 35 * pixel, //height
                P
        );
    }

    private void N004() { //N004
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 29 * pixel, //height
                P
        );
    }

    private void N005() { //N005
        C.drawRect(
                (float) 3.5 * pixel, //x
                (float) 18 * pixel,  //y
                (float) 10 * pixel, //width
                (float) 24 * pixel, //height
                P
        );
    }

    private void N007() { //N007
        C.drawRect(
                (float) 12 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 30 * pixel, //height
                P
        );
    }

    private void N008() { //N008
        C.drawRect(
                (float) 12 * pixel, //x
                (float) 30 * pixel,  //y
                (float) 16 * pixel, //width
                (float) 36 * pixel, //height
                P
        );
    }

    //-------------------------- First Floor Johnson  ----------------------------------------------

    private void J101() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 59 * pixel, //width
                (float) 71.9 * pixel, //height
                P
        );
    }

    private void J102() {
        C.drawRect(
                (float) 45 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 50 * pixel, //width
                (float) 67.5 * pixel, //height
                P
        );
    }

    private void J103() {
        C.drawRect(
                (float) 39.5 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 45* pixel, //width
                (float) 67.5 * pixel, //height
                P
        );
    }

    private void J104a() {
        C.drawRect(
                (float) 50 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    private void J104b() {
        C.drawRect(
                (float) 47.3 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 50* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    private void J104c() {   C.drawRect(
            (float) 44.5 * pixel, //x
            (float) 69 * pixel,  //y
            (float) 47.3* pixel, //width
            (float) 71* pixel, //height
            P
    );
    }

    private void J104d() {
        C.drawRect(
                (float) 41.9 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 44.5* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    private void J104e() {
        C.drawRect(
                (float) 39.9 * pixel, //x
                (float) 69 * pixel,  //y
                (float) 42* pixel, //width
                (float) 71* pixel, //height
                P
        );
    }

    private void J105() {
        C.drawRect(
                (float) 52.5 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 64* pixel, //height
                P
        );
    }

    private void ITS() {
        C.drawRect(
                (float) 52.5* pixel, //x
                (float) 52.6 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 60.5* pixel, //height
                P
        );
    }

    private void J108() {
        C.drawRect(
                (float) 52.5 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 48.5* pixel, //width
                (float) 52.6* pixel, //height
                P
        );
    }

    private void J113() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 59* pixel, //width
                (float) 45* pixel, //height
                P
        );
    }

    private void J114a() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 48.5* pixel, //height
                P
        );
    }

    private void J114b() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 50.5* pixel, //height
                P
        );
    }

    private void J115() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 50.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 54.8* pixel, //height
                P
        );
    }

    private void J116() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 58 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 60.5* pixel, //height
                P
        );
    }

    private void J116a() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 54.8 * pixel,  //y
                (float) 55.9* pixel, //width
                (float) 57* pixel, //height
                P
        );
    }

    private void J116b() {
        C.drawRect(
                (float) 54.5 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 64* pixel, //height
                P
        );
    }

    private void J116c() {
        C.drawRect(
                (float) 55.9 * pixel, //x
                (float) 54.8 * pixel,  //y
                (float) 58.5* pixel, //width
                (float) 58* pixel, //height
                P
        );
    }

    private void J117a() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 33* pixel,  //y
                (float) 52* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    private void J117b() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 31 * pixel,  //y
                (float) 52* pixel, //width
                (float) 33* pixel, //height
                P
        );
    }

    private void J117d() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 28.5 * pixel,  //y
                (float) 52* pixel, //width
                (float) 31* pixel, //height
                P
        );
    }

    private void J118() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 24 * pixel,  //y
                (float) 52* pixel, //width
                (float) 28.5* pixel, //height
                P
        );
    }

    private void J119() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 19.5 * pixel,  //y
                (float) 52* pixel, //width
                (float) 24* pixel, //height
                P
        );
    }

    private void J120() {
        C.drawRect(
                (float) 46.5 * pixel, //x
                (float) 10 * pixel,  //y
                (float) 52* pixel, //width
                (float) 19.5* pixel, //height
                P
        );
    }

    private void J121() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 17 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 20* pixel, //height
                P
        );
    }

    private void J122() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 20* pixel,  //y
                (float) 57.5* pixel, //width
                (float) 22.3* pixel, //height
                P
        );
    }

    private void J123() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 22.3 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    private void J124() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 27* pixel, //height
                P
        );
    }

    private void J125() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 27 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 29* pixel, //height
                P
        );
    }

    private void J126() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 29 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 31.5* pixel, //height
                P
        );
    }

    private void J127() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 31.5 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    private void J128() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 34 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    private void J150() {
        C.drawRect(
                (float) 45.5 * pixel, //x
                (float) 2 * pixel,  //y
                (float) 54* pixel, //width
                (float) 8* pixel, //height
                P
        );
    }

    private void J151() {
        C.drawRect(
                (float) 45.5 * pixel, //x
                (float) 8 * pixel,  //y
                (float) 52* pixel, //width
                (float) 10* pixel, //height
                P
        );
    }

    private void J152() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 10 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 14* pixel, //height
                P
        );
    }

    private void J153() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 5 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 10* pixel, //height
                P
        );
    }

    private void J154() {
        C.drawRect(
                (float) 54 * pixel, //x
                (float) 2 * pixel,  //y
                (float) 57.5* pixel, //width
                (float) 5* pixel, //height
                P
        );
    }

    //-------------------------- First Floor Hamilton ----------------------------------------------

    private void H150() {
        C.drawRect(
                (float) 35 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 43.5 * pixel, //width
                (float) 45 * pixel, //height
                P
        );
    }

    private void H160() {
        C.drawRect(
                (float) 29 * pixel, //x
                (float) 39.5 * pixel,  //y
                (float) 31 * pixel, //width
                (float) 42.5 * pixel, //height
                P
        );
    }

    private void H161() {
        C.drawRect(
                (float) 31 * pixel, //x
                (float) 39.5 * pixel,  //y
                (float) 33 * pixel, //width
                (float) 42.5 * pixel, //height
                P
        );
    }

    private void BusStop() {
        C.drawRect(
                (float) 13 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 17.5 * pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    //-------------------------- First Floor Nicolls  ----------------------------------------------

    private void N101() {
        C.drawRect(
                (float) 10.8 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 13 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    private void N102() {
        C.drawRect(
                (float) 8.6 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 10.8 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    private void N103() {
        C.drawRect(
                (float) 6.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 8.6* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N104() {
        C.drawRect(
                (float) 4.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 6.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N105() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N106() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    private void N107() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.5 * pixel, //height
                P
        );
    }

    private void N108() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 42 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    private void N109() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 38.5 * pixel,  //y
                (float) 7* pixel, //width
                (float) 42 * pixel, //height
                P
        );
    }

    private void N110() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 33* pixel,  //y
            (float) 7* pixel, //width
            (float) 38.5* pixel, //height
            P
    );
    }

    private void N111() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 27 * pixel,  //y
            (float) 7* pixel, //width
            (float) 33 * pixel, //height
            P
    );
    }

    private void N112() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 22.9 * pixel,  //y
                (float) 7* pixel, //width
                (float) 27 * pixel, //height
                P
        );
    }

    private void N113() {
        C.drawRect(
            (float) 1 * pixel, //x
            (float) 17 * pixel,  //y
            (float) 7* pixel, //width
            (float) 22.9 * pixel, //height
            P
    );
    }

    private void N114() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 19.5* pixel,  //y
                (float) 13* pixel, //width
                (float) 26* pixel, //height
                P
        );
    }

    private void N115() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 26* pixel,  //y
                (float) 13* pixel, //width
                (float) 33* pixel, //height
                P
        );}

    private void N116() {
        C.drawRect(
                (float) 8.9*pixel, //x
                (float) 33* pixel,  //y
                (float) 13* pixel, //width
                (float) 37.5* pixel, //height
                P
        );}

    //-------------------------- Second Floor Johnson  ---------------------------------------------

    private void BWH() {
        C.drawRect(
                (float) 40 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 53* pixel, //width
                (float) 71 * pixel, //height
                P
        );
    }

    private void J201() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 66 * pixel,  //y
                (float) 59.5* pixel, //width
                (float) 72 * pixel, //height
                P
        );
    }

    private void J202() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 64 * pixel,  //y
                (float) 59.5* pixel, //width
                (float) 66 * pixel, //height
                P
        );
    }

    private void J203a() {
        C.drawRect(
                (float) 56 * pixel, //x
                (float) 62 * pixel,  //y
                (float) 59* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    private void J203b() {
        C.drawRect(
                (float) 56 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 59* pixel, //width
                (float) 62 * pixel, //height
                P
        );
    }

    private void J203() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 49 * pixel,  //y
                (float) 59* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    private void J204() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 59* pixel, //width
                (float) 49 * pixel, //height
                P
        );
    }

    private void J205() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 36.5 * pixel,  //y
                (float) 51* pixel, //width
                (float) 38.5* pixel, //height
                P
        );
    }

    private void J206() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 29.7 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    private void J207() {
        C.drawRect(
                (float) 49.5 * pixel, //x
                (float) 27.5 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 29.7* pixel, //height
                P
        );
    }

    private void J207a() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 49.5* pixel, //width
                (float) 29.7* pixel, //height
                P
        );
    }

    private void J208() {
        C.drawRect(
                (float) 49.5 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 27.5* pixel, //height
                P
        );
    }

    private void J209() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 23 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    private void J210() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 11.9 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 23* pixel, //height
                P
        );
    }

    private void J211() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 52.5* pixel, //width
                (float) 11.9* pixel, //height
                P
        );
    }

    private void J212() {
        C.drawRect(
                (float) 46 * pixel, //x
                (float) 1 * pixel,  //y
                (float) 58* pixel, //width
                (float) 9.5* pixel, //height
                P
        );
    }

    private void J214() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 11.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 13.5* pixel, //height
                P
        );
    }

    private void J214a() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 13.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 14.3* pixel, //height
                P
        );
    }

    private void J215a() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 14.3 * pixel,  //y
                (float) 62* pixel, //width
                (float) 18* pixel, //height
                P
        );
    }

    private void J215() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 21* pixel, //height
                P
        );
    }

    private void J216() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 21* pixel,  //y
                (float) 58* pixel, //width
                (float) 25* pixel, //height
                P
        );
    }

    private void J217() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 25 * pixel,  //y
                (float) 58* pixel, //width
                (float) 27* pixel, //height
                P
        );
    }

    private void J218() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 27 * pixel,  //y
                (float) 58* pixel, //width
                (float) 29.5* pixel, //height
                P
        );
    }

    private void J219() {

        C.drawRect(
                (float) 55 * pixel, //x
                (float) 29.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 31.5* pixel, //height
                P
        );
    }

    private void J220() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 31.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    private void J221() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 34 * pixel,  //y
                (float) 58* pixel, //width
                (float) 36.5* pixel, //height
                P
        );
    }

    private void J230() {
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 53* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void J232() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 53* pixel, //width
                (float) 58.5 * pixel, //height
                P
        );
    }

    private void J232b() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 58.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    private void J232a() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    //-------------------------- Second Floor Hamilton  --------------------------------------------

    private void H200() {
        C.drawRect(
                (float) 13 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 16* pixel, //width
                (float) 46 * pixel, //height
                P
        );
    }

    private void H201() {
        C.drawRect(
                (float) 16 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 18* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H201b() {
        C.drawRect(
                (float) 18 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 19.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H202() {
        C.drawRect(
                (float) 19.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 23* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H203() {
        C.drawRect(
                (float) 23 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 26.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H204() {
        C.drawRect(
                (float) 26.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 30.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H205a() {
        C.drawRect(
                (float) 30.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 32.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H205b() {
        C.drawRect(
                (float) 32.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 33.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H206() {
        C.drawRect(
                (float) 33.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 37* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H207() {
        C.drawRect(
                (float) 37 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 40.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H208() {
        C.drawRect(
                (float) 40.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 43.5* pixel, //width
                (float) 47 * pixel, //height
                P
        );
    }

    private void H209() {
        C.drawRect(
                (float) 16* pixel, //x
                (float) 39 * pixel,  //y
                (float) 18.5* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H210() {
        C.drawRect(
                (float) 18.5 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 20.5* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H211() {
        C.drawRect(
                (float) 20.5 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 23* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H212a() {
        C.drawRect(
                (float) 23 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 24.3* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H212() {
        C.drawRect(
                (float) 24.3 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 26.5* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H213() {
        C.drawRect(
                (float) 26.5 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 30.3* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H214() {
        C.drawRect(
                (float) 30.3 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 32.5* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H215() {
        C.drawRect(
                (float) 32.5 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 34.5* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H216() {
        C.drawRect(
                (float) 34.5 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 37* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H217() {
        C.drawRect(
                (float) 37 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 39* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H218() {
        C.drawRect(
                (float) 39 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 42* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H219() {
        C.drawRect(
                (float) 42 * pixel, //x
                (float) 39 * pixel,  //y
                (float) 44* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    //-------------------------- Second Floor Nicolls  ---------------------------------------------

    private void N201() {
        C.drawRect(
                (float) 10.8 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 13 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    private void N202() {
        C.drawRect(
                (float) 8.6 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 10.8 * pixel, //width
                (float) 51 * pixel, //height
                P
        );

    }

    private void N203() {
        C.drawRect(
                (float) 6.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 8.6* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N204() {
        C.drawRect(
                (float) 4.5 * pixel, //x
                (float) 47.5 * pixel,  //y
                (float) 6.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N205() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 48.5 * pixel,  //y
                (float) 4.5* pixel, //width
                (float) 51 * pixel, //height
                P
        );
    }

    private void N206() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 46.3 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48.5 * pixel, //height
                P
        );
    }

    private void N207() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46.3 * pixel, //height
                P
        );
    }

    private void N208() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 41.9 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 44 * pixel, //height
                P
        );
    }

    private void N209() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 39.3 * pixel,  //y
                (float) 6* pixel, //width
                (float) 41.9 * pixel, //height
                P
        );
    }

    private void N210a() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 37* pixel,  //y
                (float) 6* pixel, //width
                (float) 39.3* pixel, //height
                P
        );
    }

    private void N210b() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 35* pixel,  //y
                (float) 6* pixel, //width
                (float) 37* pixel, //height
                P
        );
    }

    private void N211() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 28 * pixel,  //y
                (float) 6* pixel, //width
                (float) 35 * pixel, //height
                P
        );
    }

    private void N212() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 21.5 * pixel,  //y
                (float) 6* pixel, //width
                (float) 28 * pixel, //height
                P
        );
    }

    private void N213() {
        C.drawRect(
                (float) 0.5 * pixel, //x
                (float) 16.9 * pixel,  //y
                (float) 6* pixel, //width
                (float) 21.5 * pixel, //height
                P
        );
    }

    private void N214() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 19.3* pixel,  //y
                (float) 13* pixel, //width
                (float) 22.5* pixel, //height
                P
        );
    }

    private void N215() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 22.5* pixel,  //y
                (float) 13* pixel, //width
                (float) 27* pixel, //height
                P
        );}

    private void N216() {
        C.drawRect(
                (float) 7.9*pixel, //x
                (float) 27* pixel,  //y
                (float) 13* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    //-------------------------- Third Floor Johnson -----------------------------------------------

    private void J301() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 63.5* pixel,  //y
                (float) 59* pixel, //width
                (float) 72 * pixel, //height
                P
        );
    }

    private void J302() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 60 * pixel,  //y
                (float) 59* pixel, //width
                (float) 63.5 * pixel, //height
                P
        );
    }

    private void J302a() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 57.5 * pixel,  //y
                (float) 60* pixel, //width
                (float) 60 * pixel, //height
                P
        );
    }

    private void J303() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 60* pixel, //width
                (float) 57.5 * pixel, //height
                P
        );
    }

    private void J305() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 60* pixel, //width
                (float) 46 * pixel, //height
                P
        );
    }

    private void J306() {
        C.drawRect(
                (float) 48 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 53* pixel, //width
                (float) 45 * pixel, //height
                P
        );
    }

    private void J308() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 53* pixel, //width
                (float) 56.5 * pixel, //height
                P
        );
    }

    private void J309() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 56.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 58.5 * pixel, //height
                P
        );
    }

    private void J310() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 58.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 60.5 * pixel, //height
                P
        );
    }

    private void J310a() {
        C.drawRect(
                (float) 49 * pixel, //x
                (float) 60.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 64 * pixel, //height
                P
        );
    }

    private void J313() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 34* pixel,  //y
                (float) 53* pixel, //width
                (float) 37.3* pixel, //height
                P
        );
    }

    private void J314() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 29.3* pixel,  //y
                (float) 53* pixel, //width
                (float) 34* pixel, //height
                P
        );
    }

    private void J315() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 21.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 29.3* pixel, //height
                P
        );
    }

    private void J316() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 21.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 29.3* pixel, //height
                P
        );
    }

    private void J317() {
        C.drawRect(
                (float) 49.9 * pixel, //x
                (float) 19.3 * pixel,  //y
                (float) 53* pixel, //width
                (float) 21.3* pixel, //height
                P
        );
    }

    private void J318() {
        C.drawRect(
                (float) 47 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 53* pixel, //width
                (float) 19.3* pixel, //height
                P
        );
    }

    private void J320() {
        C.drawRect(
                (float) 46 * pixel, //x
                (float) 1 * pixel,  //y
                (float) 58* pixel, //width
                (float) 9.5* pixel, //height
                P
        );
    }

    private void J321() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 9.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 11.9* pixel, //height
                P
        );
    }

    private void J322() {
        C.drawRect(
                (float) 58 * pixel, //x
                (float) 11.5 * pixel,  //y
                (float) 62* pixel, //width
                (float) 18* pixel, //height
                P
        );
    }

    private void J323() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 19* pixel, //height
                P
        );
    }

    private void J324() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 19 * pixel,  //y
                (float) 58* pixel, //width
                (float) 22* pixel, //height
                P
        );
    }

    private void J325() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 22 * pixel,  //y
                (float) 58* pixel, //width
                (float) 24.5* pixel, //height
                P
        );
    }

    private void J326() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 24.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 27.5* pixel, //height
                P
        );
    }

    private void J327() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 27.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 29.9* pixel, //height
                P
        );
    }

    private void J328() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 29.9 * pixel,  //y
                (float) 58* pixel, //width
                (float) 33.5* pixel, //height
                P
        );
    }

    private void J329() {
        C.drawRect(
                (float) 55 * pixel, //x
                (float) 33.5 * pixel,  //y
                (float) 58* pixel, //width
                (float) 36* pixel, //height
                P
        );
    }

    //-------------------------- Third Floor Hamilton ----------------------------------------------

    private void H300() {
        C.drawRect(
                (float) 13 * pixel, //x
                (float) 40 * pixel,  //y
                (float) 20* pixel, //width
                (float) 43 * pixel, //height
                P
        );
    }

    private void H301() {
        C.drawRect(
                (float) 21.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 26.5* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H302() {
        C.drawRect(
                (float) 26.5 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 31.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H303() {
        C.drawRect(
                (float) 31.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 35.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H304() {
        C.drawRect(
                (float) 35.9 * pixel, //x
                (float) 40.5 * pixel,  //y
                (float) 42* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H305() {
        C.drawRect(
                (float) 42 * pixel, //x
                (float) 41.5 * pixel,  //y
                (float) 48* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H310() {
        C.drawRect(
                (float) 16.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 19.5* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    private void H310a() {
        C.drawRect(
                (float) 19.5 * pixel, //x
                (float) 44 * pixel,  //y
                (float) 21.9* pixel, //width
                (float) 47.5 * pixel, //height
                P
        );
    }

    //-------------------------- Third Floor Nicolls -----------------------------------------------

    private void N301() {
        C.drawRect(
                (float) 10.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 13.3 * pixel, //width
                (float) 50.5 * pixel, //height
                P
        );

    }

    private void N302() {
        C.drawRect(
                (float) 8.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 10.9 * pixel, //width
                (float) 50.5 * pixel, //height
                P
        );

    }

    private void N303() {
        C.drawRect(
                (float) 6.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 8.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    private void N304() {
        C.drawRect(
                (float) 4.9 * pixel, //x
                (float) 47 * pixel,  //y
                (float) 6.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    private void N305() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 48 * pixel,  //y
                (float) 4.9* pixel, //width
                (float) 50.5 * pixel, //height
                P
        );
    }

    private void N306() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 46 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 48 * pixel, //height
                P
        );
    }

    private void N307() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 43.9 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 46 * pixel, //height
                P
        );
    }

    private void N308() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 41.5 * pixel,  //y
                (float) 3.6* pixel, //width
                (float) 43.9 * pixel, //height
                P
        );
    }

    private void N310() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 33.9 * pixel,  //y
                (float) 6* pixel, //width
                (float) 41.5 * pixel, //height
                P
        );
    }

    private void N311a() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 31 * pixel,  //y
                (float) 6* pixel, //width
                (float) 33.9 * pixel, //height
                P
        );
    }

    private void N311b() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 28 * pixel,  //y
                (float) 6* pixel, //width
                (float) 31 * pixel, //height
                P
        );
    }

    private void N312() {
        C.drawRect(
                (float) 1 * pixel, //x
                (float) 16.5 * pixel,  //y
                (float) 6* pixel, //width
                (float) 28 * pixel, //height
                P
        );
    }

    private void N314() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 19 * pixel,  //y
                (float) 13* pixel, //width
                (float) 24.5 * pixel, //height
                P
        );
    }

    private void N315() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 24.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 30.5 * pixel, //height
                P
        );
    }

    private void N315b() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 30.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 33.5 * pixel, //height
                P
        );
    }

    private void N315a() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 33.5 * pixel,  //y
                (float) 13* pixel, //width
                (float) 37 * pixel, //height
                P
        );
    }

    private void N316() {
        C.drawRect(
                (float) 8 * pixel, //x
                (float) 37 * pixel,  //y
                (float) 13* pixel, //width
                (float) 40 * pixel, //height
                P
        );
    }

    //-------------------------- Circling the Proper Room ------------------------------------------
    
    public void roomSelected(String roomToDraw, int position){
        if(roomToDraw.equals("J-001")){
            if(position == 0) {
                this.J001();
            }
        }
        if(roomToDraw.equals("J-002")){
            if(position == 0){
                this.J002();
            }
        }
        if(roomToDraw.equals("J-004")){
            if(position == 0){
                this.J004();
            }
        }
        if(roomToDraw.equals("J-004a")){
            if(position == 0){
                this.J004();
            }
        }
        if(roomToDraw.equals("J-005")){
            if(position == 0){
                this.J005();
            }
        }
        if(roomToDraw.equals("J-005a")){
            if(position == 0){
                this.J005a();
            }
        }
        if(roomToDraw.equals("J-009")){
            if(position == 0){
                this.J009();
            }
        }
        if(roomToDraw.equals("J-010")){
            if(position == 0){
                this.J010();
            }
        }
        if(roomToDraw.equals("J-011b")){
            if(position == 0){
                this.J011();
            }
        }
        if(roomToDraw.equals("J-018")){
            if(position == 0){
                this.J018();
            }
        }
        if(roomToDraw.equals("J-019")){
            if(position == 0){
                this.J019();
            }
        }
        if(roomToDraw.equals("J-020")){
            if(position == 0){
                this.J020();
            }
        }
        if(roomToDraw.equals("J-023")){
            if(position == 0){
                this.J023();
            }
        }
        if(roomToDraw.equals("J-024")){
            if(position == 0){
                this.J024();
            }
        }
        if(roomToDraw.equals("J-026a")){
            if(position == 0){
                this.J026a();
            }
        }
        if(roomToDraw.equals("J-026b")){
            if(position == 0){
                this.J026b();
            }
        }
        if(roomToDraw.equals("J-026c")){
            if(position == 0){
                this.J026c();
            }
        }
        if(roomToDraw.equals("H-003")){
            if(position == 0){
                this.H003();
            }
        }
        if(roomToDraw.equals("N-001")){
            if(position == 0){
                this.N001();
            }
        }
        if(roomToDraw.equals("N-002")){
            if(position == 0){
                this.N002();
            }
        }
        if(roomToDraw.equals("N-003")){
            if(position == 0){
                this.N003();
            }
        }
        if(roomToDraw.equals("N-004")){
            if(position == 0){
                this.N004();
            }
        }
        if(roomToDraw.equals("N-005")){
            if(position == 0){
                this.N005();
            }
        }
        if(roomToDraw.equals("N-007")){
            if(position == 0){
                this.N007();
            }
        }
        if(roomToDraw.equals("N-008")){
            if(position == 0){
                this.N008();
            }
        }
        if(roomToDraw.equals("J-101")){
            if(position == 1){
                this.J101();
            }
        }
        if(roomToDraw.equals("J-102")){
            if(position == 1){
                this.J102();
            }
        }
        if(roomToDraw.equals("J-103")){
            if(position == 1){
                this.J103();
            }
        }
        if(roomToDraw.equals("J-104a")){
            if(position == 1){
                this.J104a();
            }
        }
        if(roomToDraw.equals("J-104b")){
            if(position == 1){
                this.J104b();
            }
        }
        if(roomToDraw.equals("J-104c")){
            if(position == 1){
                this.J104c();
            }
        }
        if(roomToDraw.equals("J-104d")){
            if(position == 1){
                this.J104d();
            }
        }
        if(roomToDraw.equals("J-104e")){
            if(position == 1){
                this.J104e();
            }
        }
        if(roomToDraw.equals("J-105")){
            if(position == 1){
                this.J105();
            }
        }
        if(roomToDraw.equals("J-107")){
            if(position == 1){
                this.ITS();
            }
        }
        if(roomToDraw.equals("J-108")){
            if(position == 1){
                this.J108();
            }
        }
        if(roomToDraw.equals("J-113")){
            if(position == 1){
                this.J113();
            }
        }
        if(roomToDraw.equals("J-114a")){
            if(position == 1){
                this.J114a();
            }
        }
        if(roomToDraw.equals("J-114b")){
            if(position == 1){
                this.J114b();
            }
        }
        if(roomToDraw.equals("J-115")){
            if(position == 1){
                this.J115();
            }
        }
        if(roomToDraw.equals("J-116")){
            if(position == 1){
                this.J116();
            }
        }
        if(roomToDraw.equals("J-116a")){
            if(position == 1){
                this.J116a();
            }
        }
        if(roomToDraw.equals("J-116b")){
            if(position == 1){
                this.J116b();
            }
        }
        if(roomToDraw.equals("J-116c")){
            if(position == 1){
                this.J116c();
            }
        }
        if(roomToDraw.equals("J-117a")){
            if(position == 1){
                this.J117a();
            }
        }
        if(roomToDraw.equals("J-117b")){
            if(position == 1){
                this.J117b();
            }
        }
        if(roomToDraw.equals("J-117d")){
            if(position == 1){
                this.J117d();
            }
        }
        if(roomToDraw.equals("J-118")){
            if(position == 1){
                this.J118();
            }
        }
        if(roomToDraw.equals("J-119")){
            if(position == 1){
                this.J119();
            }
        }
        if(roomToDraw.equals("J-120")){
            if(position == 1){
                this.J120();
            }
        }
        if(roomToDraw.equals("J-121")){
            if(position == 1){
                this.J121();
            }
        }
        if(roomToDraw.equals("J-122")){
            if(position == 1){
                this.J122();
            }
        }
        if(roomToDraw.equals("J-123")){
            if(position == 1){
                this.J123();
            }
        }
        if(roomToDraw.equals("J-124")){
            if(position == 1){
                this.J124();
            }
        }
        if(roomToDraw.equals("J-125")){
            if(position == 1){
                this.J125();
            }
        }
        if(roomToDraw.equals("J-126")){
            if(position == 1){
                this.J126();
            }
        }
        if(roomToDraw.equals("J-127")){
            if(position == 1){
                this.J127();
            }
        }
        if(roomToDraw.equals("J-128")){
            if(position == 1){
                this.J128();
            }
        }
        if(roomToDraw.equals("J-150")){
            if(position == 1){
                this.J150();
            }
        }
        if(roomToDraw.equals("J-151")){
            if(position == 1){
                this.J151();
            }
        }
        if(roomToDraw.equals("J-152")){
            if(position == 1){
                this.J152();
            }
        }
        if(roomToDraw.equals("J-153")){
            if(position == 1){
                this.J153();
            }
        }
        if(roomToDraw.equals("J-154")){
            if(position == 1){
                this.J154();
            }
        }
        if(roomToDraw.equals("H-150")){
            if(position == 1){
                this.H150();
            }
        }
        if(roomToDraw.equals("H-160")){
            if(position == 1){
                this.H160();
            }
        }
        if(roomToDraw.equals("H-161")){
            if(position == 1){
                this.H161();
            }
        }
        if(roomToDraw.equals("H-126")){
            if(position == 1){
                this.BusStop();
            }
        }
        if(roomToDraw.equals("N-101")){
            if(position == 1){
                this.N101();
            }
        }
        if(roomToDraw.equals("N-102")){
            if(position == 1){
                this.N102();
            }
        }
        if(roomToDraw.equals("N-103")){
            if(position == 1){
                this.N103();
            }
        }
        if(roomToDraw.equals("N-104")){
            if(position == 1){
                this.N104();
            }
        }
        if(roomToDraw.equals("N-105")){
            if(position == 1){
                this.N105();
            }
        }
        if(roomToDraw.equals("N-106")){
            if(position == 1){
                this.N106();
            }
        }
        if(roomToDraw.equals("N-107")){
            if(position == 1){
                this.N107();
            }
        }
        if(roomToDraw.equals("N-108")){
            if(position == 1){
                this.N108();
            }
        }
        if(roomToDraw.equals("N-109")){
            if(position == 1){
                this.N109();
            }
        }
        if(roomToDraw.equals("N-110")){
            if(position == 1){
                this.N110();
            }
        }
        if(roomToDraw.equals("N-111")){
            if(position == 1){
                this.N111();
            }
        }
        if(roomToDraw.equals("N-112")){
            if(position == 1){
                this.N112();
            }
        }
        if(roomToDraw.equals("N-113")){
            if(position == 1){
                this.N113();
            }
        }
        if(roomToDraw.equals("N-114")){
            if(position == 1){
                this.N114();
            }
        }
        if(roomToDraw.equals("N-115")){
            if(position == 1){
                this.N115();
            }
        }
        if(roomToDraw.equals("N-116")){
            if(position == 1){
                this.N116();
            }
        }
        if(roomToDraw.equals("N-201")){
            if(position == 2){
                this.N201();
            }
        }
        if(roomToDraw.equals("N-202")){
            if(position == 2){
                this.N202();
            }
        }
        if(roomToDraw.equals("N-203")){
            if(position == 2){
                this.N203();
            }
        }
        if(roomToDraw.equals("N-204")){
            if(position == 2){
                this.N204();
            }
        }
        if(roomToDraw.equals("N-205")){
            if(position == 2){
                this.N205();
            }
        }
        if(roomToDraw.equals("N-206")){
            if(position == 2){
                this.N206();
            }
        }
        if(roomToDraw.equals("N-207")){
            if(position == 2){
                this.N207();
            }
        }
        if(roomToDraw.equals("N-208")){
            if(position == 2){
                this.N208();
            }
        }
        if(roomToDraw.equals("N-209")){
            if(position == 2){
                this.N209();
            }
        }
        if(roomToDraw.equals("N-210a")){
            if(position == 2){
                this.N210a();
            }
        }
        if(roomToDraw.equals("N-210b")){
            if(position == 2){
                this.N210b();
            }
        }
        if(roomToDraw.equals("N-211")){
            if(position == 2){
                this.N211();
            }
        }
        if(roomToDraw.equals("N-212")){
            if(position == 2){
                this.N212();
            }
        }
        if(roomToDraw.equals("N-213")){
            if(position == 2){
                this.N213();
            }
        }
        if(roomToDraw.equals("N-214")){
            if(position == 2){
                this.N214();
            }
        }
        if(roomToDraw.equals("N-215")){
            if(position == 2){
                this.N215();
            }
        }
        if(roomToDraw.equals("N-216")){
            if(position == 2){
                this.N216();
            }
        }
        if(roomToDraw.equals("H-200")){
            if(position == 2){
                this.H200();
            }
        }
        if(roomToDraw.equals("H-201")){
            if(position == 2){
                this.H201();
            }
        }
        if(roomToDraw.equals("H-201b")){
            if(position == 2){
                this.H201b();
            }
        }
        if(roomToDraw.equals("H-202")){
            if(position == 2){
                this.H202();
            }
        }
        if(roomToDraw.equals("H-203")){
            if(position == 2){
                this.H203();
            }
        }
        if(roomToDraw.equals("H-204")){
            if(position == 2){
                this.H204();
            }
        }
        if(roomToDraw.equals("H-205a")){
            if(position == 2){
                this.H205a();
            }
        }
        if(roomToDraw.equals("H-205b")){
            if(position == 2){
                this.H205b();
            }
        }
        if(roomToDraw.equals("H-206")){
            if(position == 2){
                this.H206();
            }
        }
        if(roomToDraw.equals("H-207")){
            if(position == 2){
                this.H207();
            }
        }
        if(roomToDraw.equals("H-208")){
            if(position == 2){
                this.H208();
            }
        }
        if(roomToDraw.equals("H-209")){
            if(position == 2){
                this.H209();
            }
        }
        if(roomToDraw.equals("H-210")){
            if(position == 2){
                this.H210();
            }
        }
        if(roomToDraw.equals("H-211")){
            if(position == 2){
                this.H211();
            }
        }
        if(roomToDraw.equals("H-212")){
            if(position == 2){
                this.H212();
            }
        }
        if(roomToDraw.equals("H-212a")){
            if(position == 2){
                this.H212a();
            }
        }
        if(roomToDraw.equals("H-213")){
            if(position == 2){
                this.H213();
            }
        }
        if(roomToDraw.equals("H-214")){
            if(position == 2){
                this.H214();
            }
        }
        if(roomToDraw.equals("H-215")){
            if(position == 2){
                this.H215();
            }
        }
        if(roomToDraw.equals("H-216")){
            if(position == 2){
                this.H216();
            }
        }
        if(roomToDraw.equals("H-217")){
            if(position == 2){
                this.H217();
            }
        }
        if(roomToDraw.equals("H-218")){
            if(position == 2){
                this.H218();
            }
        }
        if(roomToDraw.equals("H-219")){
            if(position == 2){
                this.H219();
            }
        }

        if(roomToDraw.equals("J-201")){
            if(position == 2) {
                J201();
            }
        }
        if(roomToDraw.equals("J-202")){
            if(position == 2) {
                J202();
            }
        }
        if(roomToDraw.equals("J-203b")){
            if(position == 2) {
                J203b();
            }
        }
        if(roomToDraw.equals("J-203a")){
            if(position == 2) {
                J203a();
            }
        }
        if(roomToDraw.equals("J-203")){
            if(position == 2) {
                J203();
            }
        }
        if(roomToDraw.equals("J-204")){
            if(position == 2) {
                J204();
            }
        }
        if(roomToDraw.equals("J-205")){
            if(position == 2) {
                J205();
            }
        }
        if(roomToDraw.equals("J-206")){
            if(position == 2) {
                J206();
            }
        }
        if(roomToDraw.equals("J-207a")){
            if(position == 2) {
                J207a();
            }
        }
        if(roomToDraw.equals("J-207")){
            if(position == 2) {
                J207();
            }
        }
        if(roomToDraw.equals("J-208")){
            if(position == 2) {
                J208();
            }
        }
        if(roomToDraw.equals("J-209")){
            if(position == 2) {
                J209();
            }
        }
        if(roomToDraw.equals("J-210")){
            if(position == 2) {
                J210();
            }
        }
        if(roomToDraw.equals("J-211")){
            if(position == 2) {
                J211();
            }
        }

        if(roomToDraw.equals("J-212")){
            if(position == 2) {
                J212();
            }
        }
        if(roomToDraw.equals("J-214")){
            if(position == 2) {
                J214();
            }
        }
        if(roomToDraw.equals("J-214a")){
            if(position == 2) {
                J214a();
            }
        }

        if(roomToDraw.equals("J-215a")){
            if(position == 2) {
                J215a();
            }
        }
        if(roomToDraw.equals("J-215")){
            if(position == 2) {
                J215();
            }
        }
        if(roomToDraw.equals("J-216")){
            if(position == 2) {
                J216();
            }
        }
        if(roomToDraw.equals("J-217")){
            if(position == 2) {
                J217();
            }
        }
        if(roomToDraw.equals("J-218")){
            if(position == 2) {
                J218();
            }
        }
        if(roomToDraw.equals("J-219")){
            if(position == 2) {
                J219();
            }
        }
        if(roomToDraw.equals("J-220")){
            if(position == 2) {
                J220();
            }
        }
        if(roomToDraw.equals("J-200")){
            if(position == 2) {
                BWH();
            }
        }
        if(roomToDraw.equals("J-221")){
            if(position == 2) {
                J221();
            }
        }
        if(roomToDraw.equals("J-230")){
            if(position == 2) {
                J230();
            }
        }
        if(roomToDraw.equals("J-232")){
            if(position == 2) {
                J232();
            }
        }
        if(roomToDraw.equals("J-232b")){
            if(position == 2) {
                J232b();
            }
        }
        if(roomToDraw.equals("J-232a")){
            if(position == 2) {
                J232a();
            }
        }




        if(roomToDraw.equals("J-301")){
            if(position == 3) {
                J301();
            }
        }
        if(roomToDraw.equals("J-302")){
            if(position == 3) {
                J302();
            }
        }
        if(roomToDraw.equals("J-302a")){
            if(position == 3) {
                J302a();
            }
        }
        if(roomToDraw.equals("J-303")){
            if(position == 3) {
                J303();
            }
        }
        if(roomToDraw.equals("J-305")){
            if(position == 3) {
                J305();
            }
        }
        if(roomToDraw.equals("J-306")){
            if(position == 3) {
                J306();
            }
        }
        if(roomToDraw.equals("J-308")){
            if(position == 3) {
                J308();
            }
        }
        if(roomToDraw.equals("J-309")){
            if(position == 3) {
                J309();
            }
        }
        if(roomToDraw.equals("J-310")){
            if(position == 3) {
                J310();
            }
        }
        if(roomToDraw.equals("J-310a")){
            if(position == 3) {
                J310a();
            }
        }
        if(roomToDraw.equals("J-313")){
            if(position == 3) {
                J313();
            }
        }
        if(roomToDraw.equals("J-314")){
            if(position == 3) {
                J314();
            }
        }
        if(roomToDraw.equals("J-315")){
            if(position == 3) {
                J315();
            }
        }
        if(roomToDraw.equals("J-316")){
            if(position == 3) {
                J316();
            }
        }
        if(roomToDraw.equals("J-317")){
            if(position == 3) {
                J317();
            }
        }
        if(roomToDraw.equals("J-318")){
            if(position == 3) {
                J318();
            }
        }
        if(roomToDraw.equals("J-320")){
            if(position == 3) {
                J320();
            }
        }
        if(roomToDraw.equals("J-321")){
            if(position == 3) {
                J321();
            }
        }
        if(roomToDraw.equals("J-322")){
            if(position == 3) {
                J322();
            }
        }
        if(roomToDraw.equals("J-323")){
            if(position == 3) {
                J323();
            }
        }
        if(roomToDraw.equals("J-324")){
            if(position == 3) {
                J324();
            }
        }
        if(roomToDraw.equals("J-325")){
            if(position == 3) {
                J325();
            }
        }
        if(roomToDraw.equals("J-326")){
            if(position == 3) {
                J326();
            }
        }
        if(roomToDraw.equals("J-327")){
            if(position == 3) {
                J327();
            }
        }
        if(roomToDraw.equals("J-328")){
            if(position == 3) {
                J328();
            }
        }
        if(roomToDraw.equals("J-329")){
            if(position == 3) {
                J329();
            }
        }
        if(roomToDraw.equals("H-300")){
            if(position == 3) {
                H300();
            }
        }
        if(roomToDraw.equals("H-301")){
            if(position == 3) {
                H301();
            }
        }
        if(roomToDraw.equals("H-302")){
            if(position == 3) {
                H302();
            }
        }
        if(roomToDraw.equals("H-303")){
            if(position == 3) {
                H303();
            }
        }
        if(roomToDraw.equals("H-304")){
            if(position == 3) {
                H304();
            }
        }
        if(roomToDraw.equals("H-305")){
            if(position == 3) {
                H305();
            }
        }
        if(roomToDraw.equals("H-310")){
            if(position == 3) {
                H310();
            }
        }
        if(roomToDraw.equals("H-310a")){
            if(position == 3) {
                H310a();
            }
        }
        if(roomToDraw.equals("N-301")){
            if(position == 3) {
                N301();
            }
        }
        if(roomToDraw.equals("N-302")){
            if(position == 3) {
                N302();
            }
        }
        if(roomToDraw.equals("N-303")){
            if(position == 3) {
                N303();
            }
        }
        if(roomToDraw.equals("N-304")){
            if(position == 3) {
                N304();
            }
        }
        if(roomToDraw.equals("N-305")){
            if(position == 3) {
                N305();
            }
        }
        if(roomToDraw.equals("N-306")){
            if(position == 3) {
                N306();
            }
        }
        if(roomToDraw.equals("N-307")){
            if(position == 3) {
                N307();
            }
        }
        if(roomToDraw.equals("N-308")){
            if(position == 3) {
                N308();
            }
        }
        if(roomToDraw.equals("N-310")){
            if(position == 3) {
                N310();
            }
        }
        if(roomToDraw.equals("N-311a")){
            if(position == 3) {
                N311a();
            }
        }
        if(roomToDraw.equals("N-311b")){
            if(position == 3) {
                N311b();
            }
        }
        if(roomToDraw.equals("N-312")){
            if(position == 3) {
                N312();
            }
        }
        if(roomToDraw.equals("N-314")){
            if(position == 3) {
                N314();
            }
        }
        if(roomToDraw.equals("N-315")){
            if(position == 3) {
                N315();
            }
        }
        if(roomToDraw.equals("N-315b")){
            if(position == 3) {
                N315b();
            }
        }
        if(roomToDraw.equals("N-315a")){
            if(position == 3) {
                N315a();
            }
        }
        if(roomToDraw.equals("N-316")){
            if(position == 3) {
                N316();
            }
        }
    }
}