package com.example.android.newbumap;

import android.util.Log;

public class PathDraw {
    private FloorDraw F;
    private StairwellDraw S;
    private int position;
    private String buildFrom;
    private String floorFrom;
    private int roomFrom;
    private int roomTo;

    public PathDraw(FloorDraw f, StairwellDraw s, int p, String fromB, String fromF, int fromRoom, int toRoom) {
        Log.d("test", String.valueOf(p));
        F = f;
        S = s;
        position = p;
        buildFrom = fromB;
        floorFrom = fromF;
        roomFrom = fromRoom;
        roomTo = toRoom;

    }

    //--------------- Pathing from Johnson Ground Floor --------------------------------------------

    public void johnsonGFtoJohnsonGF() {
        F.johnsonGroundFloor();
    }

    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoNicollsGF() {
        if (position == 0) {
            F.johnsonGroundMid();
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();

            if(buildFrom.equals("Nicolls")) {
                if (roomFrom == 4 || roomFrom == 5 || roomFrom == 7){
                    F.nicollsGroundTop();
                }
            } else {
                if (roomTo == 4 || roomTo == 5 || roomTo == 7){
                    F.nicollsGroundTop();
                }
            }

            if (buildFrom.equals("Johnson")) {
                if(roomFrom < 24 && roomFrom >10) {
                    F.johnsonGroundTop();
                }
                if(roomFrom < 5) {
                    F.johnsonGroundBottom();
                }
            } else {
                if(roomTo < 24 && roomTo >10) {
                    F.johnsonGroundTop();
                }
                if(roomTo < 5) {
                    F.johnsonGroundBottom();
                }
            }

        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoHamiltonGF() {
        if (position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            if(roomTo < 24 && roomTo >10 || roomFrom < 24 && roomFrom > 10) {
                F.johnsonGroundTop();
            }
            if(roomTo < 5 || roomFrom < 5) {
                F.johnsonGroundBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoJohnson1F() {
        //rooms near top stairs
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                if(position == 0){
                    F.johnsonGroundTop();
                    S.BJT();
                }
                if(position == 1){
                    F.johnsonFirstTop();
                    S.FFJT();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundTop();
                    S.BJT();
                }
                if(position == 1){
                    F.johnsonFirstTop();
                    F.johnsonFirstMid();
                    S.FFJT();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundTop();
                    S.BJT();
                }
                if(position == 1){
                    F.johnsonFirstFloor();
                    S.FFJT();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstTop();
                    S.FFJM();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    S.FFJM();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                    S.FFJM();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.BJB();
                }
                if(position == 1){
                    F.johnsonFirstFloor();
                    S.FFJB();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.BJB();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                    S.FFJB();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.BJB();
                }
                if(position == 1){
                    F.johnsonFirstBottom();
                    S.FFJB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoHamilton1F () {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(roomTo == 126) {
                if (position == 0) {
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
            else{
                if (position == 0) {
                    F.johnsonGroundTop();
                    S.BJT();
                }
                if (position == 1) {
                    F.johnsonFirstTop();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.FFJT();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(roomTo == 126) {
                if (position == 0) {
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
            else{
                if(position == 0){
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.FFJM();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(roomTo == 126) {
                if (position == 0) {
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
            else{
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.BJB();
                }
                if(position == 1){
                    F.johnsonFirstBottom();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.FFJB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoNicolls1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(roomTo >= 111 && roomTo < 116){
                if(position == 0){
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.FFNB();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(roomTo >= 111 && roomTo < 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.FFNB();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(roomTo >= 111 && roomTo < 116){
                if(position == 0){
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.FFNB();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.FFNB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.BJT();
            }
            if(position == 1){
                S.FFJT();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondTop();
                    S.SFJT();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondFloor();
                    S.SFJT();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    S.SFJT();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    S.SFJM();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    S.SFJM();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondMid();
                    S.SFJM();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.BJB();
            }
            if(position == 1){
                S.FFJB();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondFloor();
                    S.SFJB();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondBottom();
                    S.SFJB();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    S.SFJB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.BJT();
            }
            if(position == 1){
                S.FFJT();
            }
            if(position == 2){
                S.SFJT();
                F.johnsonSecondTop();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
            }
            if(position == 2){
                S.SFJM();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.BJB();
            }
            if(position == 1){
                S.FFJB();
            }
            if(position == 2){
                S.SFJB();
                F.johnsonSecondBottom();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.BJT();
            }
            if(position == 1){
                S.FFJT();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.SFJT();
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.SFJT();
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondBottom();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.SFJM();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.SFJM();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondBottom();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.BJB();
            }
            if(position == 1){
                S.FFJB();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.SFJB();
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.SFJB();
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoJohnson3F() {

    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoHamilton3F() {

    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoNicolls3F() {

    }

    //--------------- Pathing from Nicolls Ground Floor --------------------------------------------

    public void nicollsGFtoNicollsGF() {

    }

    public void nicollsGFtoHamiltonGF() {
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundFloor();
        }
    }

    public void nicollsGFtoJohnson1F() {

    }

    public void nicollsGFtoHamilton1F() {

    }

    public void nicollsGFtoNicolls1F() {

    }

    public void nicollsGFtoJohnson2F() {

    }

    public void nicollsGFtoHamilton2F() {

    }

    public void nicollsGFtoNicolls2F() {

    }

    public void nicollsGFtoJohnson3F() {

    }

    public void nicollsGFtoHamilton3F() {

    }

    public void nicollsGFtoNicolls3F() {

    }

    //--------------- Pathing from Hamilton Ground Floor ---------------

    public void hamiltonGFtoHamiltonGF() {

    }

    public void hamiltonGFtoJohnson1F() {

    }

    public void hamiltonGFtoHamilton1F() {

    }

    public void hamiltonGFtoNicolls1F() {

    }

    public void hamiltonGFtoJohnson2F() {

    }

    public void hamiltonGFtoHamilton2F() {

    }

    public void hamiltonGFtoNicolls2F() {

    }

    public void hamiltonGFtoJohnson3F() {

    }

    public void hamiltonGFtoHamilton3F() {

    }

    public void hamiltonGFtoNicolls3F() {

    }

    //--------------- Pathing from Johnson First Floor ---------------

    public void johnson1FtoJohnson1F() {

    }

    public void johnson1FtoHamilton1F() {

    }

    public void johnson1FtoNicolls1F() {

    }

    public void johnson1FtoJohnson2F() {

    }

    public void johnson1FtoHamilton2F() {

    }

    public void johnson1FtoNicolls2F() {

    }

    public void johnson1FtoJohnson3F() {

    }

    public void johnson1FtoHamilton3F() {

    }

    public void johnson1FtoNicolls3F() {

    }

    //--------------- Pathing from Nicolls First Floor ---------------

    public void nicolls1FtoNicolls1F() {

    }

    public void nicolls1FtoHamilton1F() {

    }

    public void nicolls1FtoJohnson2F() {

    }

    public void nicolls1FtoHamilton2F() {

    }

    public void nicolls1FtoNicolls2F() {

    }

    public void nicolls1FtoJohnson3F() {

    }

    public void nicolls1FtoHamilton3F() {

    }

    public void nicolls1FtoNicolls3F() {

    }

    //--------------- Pathing from Hamilton First Floor ---------------

    public void hamilton1FtoHamilton1F() {

    }

    public void hamilton1FtoJohnson2F() {

    }

    public void hamilton1FtoHamilton2F() {

    }

    public void hamilton1FtoNicolls2F() {

    }

    public void hamilton1FtoJohnson3F() {

    }

    public void hamilton1FtoHamilton3F() {

    }

    public void hamilton1FtoNicolls3F() {

    }


    //--------------- Pathing from Johnson Second Floor ---------------

    public void johnson2FtoJohnson2F() {

    }

    public void johnson2FtoHamilton2F() {

    }

    public void johnson2FtoNicolls2F() {

    }

    public void johnson2FtoJohnson3F() {

    }

    public void johnson2FtoHamilton3F() {

    }

    public void johnson2FtoNicolls3F() {

    }

    //--------------- Pathing from Nicolls Second Floor ---------------

    public void nicolls2FtoNicolls2F() {
        if(position == 2) {
            F.nicollsSecondFloor();
        }
    }

    public void nicolls2FtoHamilton2F() {

    }

    public void nicolls2FtoJohnson3F() {

    }

    public void nicolls2FtoHamilton3F() {

    }

    public void nicolls2FtoNicolls3F() {
        Log.d("testing", "hellooooooo");
        Log.d("testing", Integer.toString(roomFrom));
        Log.d("testing", Integer.toString(position));

        if(position == 2) {
            Log.d("testing", "on two");
            F.nicollsSecondFloor();

            if(floorFrom == "Second") {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }



            if (roomFrom > 310 && roomFrom < 315) {
                S.SFNT();
            } else {
                S.SFNB();
            }

        }

        if(position == 3) {
            Log.d("testing", "on three");
            if(floorFrom == "Second") {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomFrom > 310 && roomFrom < 315) {
                S.TFNT();
                F.nicollsThirdTop();
            } else {
                S.TFNB();
                F.nicollsThirdBottom();
            }
        }
    }

    //--------------- Pathing from Hamilton Second Floor ---------------

    public void hamilton2FtoHamilton2F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
        }
    }

    public void hamilton2FtoJohnson3F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.SFJM();
        }
        if(position == 3) {
            S.TFJM();

            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
                F.johnsonThirdMid();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
                F.johnsonThirdMid();
            } else {
                F.johnsonThirdMid();
            }

        }
    }

    public void hamilton2FtoHamilton3F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
            S.SFHM();
        }
        if(position == 3) {
            F.hamiltonThirdFloor();
            S.TFHM();
        }
    }

    public void hamilton2FtoNicolls3F() {
        if(position == 2) {
            S.SFHM();
            F.hamiltonSecondFloor();
        }
        if(position == 3) {
            S.TFHM();
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();

            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            if (roomFrom > 310 && roomFrom < 315) {
                F.nicollsThirdTop();
            }



        }
    }

    //--------------- Pathing from Johnson Third Floor ---------------

    public void johnson3FtoJohnson3F() {
        if(position == 3) {
            F.johnsonThirdFloor();
        }
    }


    public void johnson3FtoHamilton3F() {
        if(position == 3) {
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();
            S.TFNB();
            S.TFJM();

            if(buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
                F.johnsonThirdMid();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
                F.johnsonThirdMid();
            } else {
                F.johnsonThirdMid();
            }

        }

        if (position == 2) {
            F.nicollsSecondBottom();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.SFJM();
            S.SFNB();
        }
    }


    public void johnson3FtoNicolls3F() {
        if(position == 3) {
            F.nicollsThirdBottom();
            F.johnsonThirdMid();
            S.SFNB();
            S.SFJM();

            if(buildFrom.equals("Nicolls")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomTo < 315 && roomTo > 310) {
                F.nicollsThirdTop();
            }

            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
            }

        }

        if (position == 2) {
            F.nicollsSecondBottom();
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
            S.SFNB();
            S.SFJM();
        }
    }

    //--------------- Pathing from Nicolls Third Floor ---------------

    public void nicolls3FtoNicolls3F() {
        if(position == 3) {
            F.nicollsThirdFloor();
        }
    }

    public void nicolls3FtoHamilton3F() {
        if (position == 3) {
            F.nicollsThirdBottom();
            F.hamiltonThirdFloor();
            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            if (roomFrom > 310 && roomFrom < 315) {
                F.nicollsThirdTop();
            }
        }
    }

    //--------------- Pathing from Hamilton Third Floor ---------------

    public void hamilton3FtoHamilton3F() {
        if(position == 3) {
            F.hamiltonThirdFloor();
        }
    }

}
