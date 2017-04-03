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
                if(roomFrom >= 18 && roomFrom < 26) {
                    F.johnsonGroundTop();
                }
                if(roomFrom < 5 || roomFrom == 11) {
                    F.johnsonGroundBottom();
                }
            } else {
                if(roomFrom >= 18 && roomFrom < 26) {
                    F.johnsonGroundTop();
                }
                if(roomFrom < 5 || roomFrom == 11) {
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
            if(roomFrom >= 18 && roomFrom < 26) {
                F.johnsonGroundTop();
            }
            if(roomFrom < 5 || roomFrom == 11) {
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
        if(floorFrom.equals("Third Floor")){
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
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdTop();
                    S.TFJT();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdFloor();
                    S.TFJT();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                    S.TFJT();
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
            if(position == 2){
                S.SFJM();
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                    S.TFJM();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                    S.TFJM();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdMid();
                    S.TFJM();
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
            if(position == 2){
                S.SFJB();
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdFloor();
                    S.TFJB();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdBottom();
                    S.TFJB();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                    S.TFJB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.FFHM();
            }
            if(position == 2){
                S.SFHM();
            }
            if(position == 3){
                S.TFHM();
                F.hamiltonThirdFloor();
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.FFHM();
            }
            if(position == 2){
                S.SFHM();
            }
            if(position == 3){
                S.TFHM();
                F.hamiltonThirdFloor();
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                F.johnsonGroundMid();
                S.BJM();
            }
            if(position == 1){
                S.FFJM();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.FFHM();
            }
            if(position == 2){
                S.SFHM();
            }
            if(position == 3){
                S.TFHM();
                F.hamiltonThirdFloor();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnsonGFtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                F.johnsonGroundMid();
                F.hamiltonGroundFloor();
                F.nicollsGroundBottom();
                S.BNB();
            }
            if(position == 1){
                S.FFNB();
            }
            if(position == 2){
                S.SFNB();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdBottom();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                F.hamiltonGroundFloor();
                F.nicollsGroundBottom();
                S.BNB();
            }
            if(position == 1){
                S.FFNB();
            }
            if(position == 2){
                S.SFNB();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdBottom();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                F.johnsonGroundMid();
                F.hamiltonGroundFloor();
                F.nicollsGroundBottom();
                S.BNB();
            }
            if(position == 1){
                S.FFNB();
            }
            if(position == 2){
                S.SFNB();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.TFNB();
                    F.nicollsThirdBottom();
                }
            }
        }
    }

    //--------------- Pathing from Nicolls Ground Floor --------------------------------------------

    public void nicollsGFtoNicollsGF() {
        if(position == 0){
            F.nicollsGroundFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoHamiltonGF() {
        if(position == 0){
            F.hamiltonGroundFloor();
            if(buildFrom.equals("Nicolls")){
                if(roomFrom>=3&&roomFrom<=7){
                    F.nicollsGroundFloor();
                }
                else {
                    F.nicollsGroundBottom();
                }
            }
            else{
                if(roomTo>=3&&roomTo<=7){
                    F.nicollsGroundFloor();
                }
                else {
                    F.nicollsGroundBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoJohnson1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
        }
        if(roomFrom>=3&&roomFrom<=7){
            if(position == 0){
                F.nicollsGroundFloor();
            }
            if(position == 1){
                S.FFJM();
                if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                    F.johnsonFirstMid();
                    F.johnsonFirstTop();
                }else if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                }else{
                    F.johnsonFirstMid();
                }
            }
        }
        else {
            if(position == 0) {
                F.nicollsGroundBottom();
            }
            if(position == 1){
                S.FFJM();
                if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                    F.johnsonFirstMid();
                    F.johnsonFirstTop();
                }else if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                }else{
                    F.johnsonFirstMid();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoHamilton1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom>=3&&roomFrom<=7){
            if(roomTo==126) {
                if(position == 0){
                    F.nicollsGroundFloor();
                    S.BNB();
                }
                if(position == 1){
                    S.FFNB();
                    F.nicollsFirstBottom();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundFloor();
                    F.hamiltonGroundFloor();
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    S.FFJM();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                }
            }
        }
        else {
            if(roomTo==126) {
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    S.FFNB();
                    F.nicollsFirstBottom();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundBottom();
                    F.hamiltonGroundFloor();
                    F.johnsonGroundMid();
                    S.BJM();
                }
                if(position == 1){
                    S.FFJM();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoNicolls1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom>=3&&roomFrom<=7){
            if(roomTo >= 111 && roomTo < 116) {
                if(position == 0){
                    F.nicollsGroundTop();
                    S.BNT();
                }
                if(position == 1){
                    S.FFNT();
                    F.nicollsFirstTop();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundTop();
                    S.BNT();
                }
                if(position == 1){
                    S.FFNT();
                    F.nicollsFirstFloor();
                }
            }
        }
        else {
            if(roomTo >= 111 && roomTo < 116) {
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    S.FFNB();
                    F.nicollsFirstFloor();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.BNB();
                }
                if(position == 1){
                    S.FFNB();
                    F.nicollsFirstBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.FFJM();
        }
        if(position == 2){
            S.SFJM();
            F.johnsonSecondMid();
            if(roomTo>208 && roomTo<217){
                F.johnsonSecondTop();
            }
            if((roomTo>=200&&roomTo<=203)||roomTo==232){
                F.johnsonSecondBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            S.BNB();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.FFNB();
        }
        if(position == 2){
            S.SFNB();
            F.nicollsSecondBottom();
            F.hamiltonSecondFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if (roomFrom >= 3 && roomFrom <= 7) {
            if(position == 0) {
                F.nicollsGroundTop();
                S.BNT();
            }
            if(position == 1){
                S.FFNT();
            }
            if(position == 2){
                S.SFNT();
                if(roomTo>=211&&roomTo<=216){
                    F.nicollsSecondTop();
                }else{
                    F.nicollsSecondFloor();
                }
            }
        } else {
            if(position == 0) {
                F.nicollsGroundBottom();
                S.BNB();
            }
            if(position == 1){
                S.FFNB();
            }
            if(position == 2){
                S.SFNB();
                if(roomTo>=211&&roomTo<=216){
                    F.nicollsSecondFloor();
                }else{
                    F.nicollsSecondBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.FFJM();
        }
        if(position == 2){
            S.SFJM();
        }
        if(position == 3){
            S.TFJM();
            F.johnsonThirdMid();
            if(roomTo>=315 && roomTo<326){
                F.johnsonThirdTop();
            }
            if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                F.johnsonThirdBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            S.BNB();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.FFNB();
        }
        if(position == 2){
            S.SFNB();
        }
        if(position == 3){
            S.TFNB();
            F.nicollsThirdBottom();
            F.hamiltonThirdFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void nicollsGFtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if (roomFrom >= 3 && roomFrom <= 7) {
            if(position == 0) {
                F.nicollsGroundTop();
                S.BNT();
            }
            if(position == 1){
                S.FFNT();
            }
            if(position == 2){
                S.SFNT();
            }
            if(position == 3){
                S.TFNT();
                if(roomTo>=311&&roomTo<=315){
                    F.nicollsThirdTop();
                }else{
                    F.nicollsThirdFloor();
                }
            }
        } else {
            if(position == 0) {
                F.nicollsGroundBottom();
                S.BNB();
            }
            if(position == 1){
                S.FFNB();
            }
            if(position == 2){
                S.SFNB();
            }
            if(position == 3){
                S.TFNB();
                if(roomTo>=311&&roomTo<=315){
                    F.nicollsThirdFloor();
                }else{
                    F.nicollsThirdBottom();
                }
            }
        }
    }
    //--------------- Pathing from Hamilton Ground Floor ---------------
    public void hamiltonGFtoHamiltonGF() {
        if(position == 0){
            F.hamiltonGroundFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoJohnson1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
        }
        if(position == 1){
            F.johnsonFirstMid();
            S.FFJM();
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                F.johnsonFirstTop();
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                F.johnsonFirstBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoHamilton1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            if(roomTo==126){
                F.nicollsGroundBottom();
                S.BNB();
            }else{
                F.johnsonGroundMid();
                S.BJM();
            }
        }
        if(position == 1){
            if(roomTo==126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.johnsonFirstMid();
                S.FFJM();
                F.hamiltonFirstFloor();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoNicolls1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.BNB();
        }
        if(position == 1){
            S.FFNB();
            if(roomTo >= 111 && roomTo < 116) {
                F.nicollsFirstFloor();
            }else{
                F.nicollsFirstBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
        }
        if(position == 1){
            S.FFJM();
        }
        if(position == 2){
            S.SFJM();
            F.johnsonSecondMid();
            if(roomTo>208 && roomTo<217){
                F.johnsonSecondTop();
            }
            if((roomTo>=200&&roomTo<=203)||roomTo==232){
                F.johnsonSecondBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
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
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.BNB();
        }
        if(position == 1){
            S.FFNB();
        }
        if(position == 2){
            S.SFNB();
            if(roomTo>=211&&roomTo<=216){
                F.nicollsSecondFloor();
            }else{
                F.nicollsSecondBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.BJM();
        }
        if(position == 1){
            S.FFJM();
        }
        if(position == 2){
            S.SFJM();
        }
        if(position == 3){
            S.TFJM();
            F.johnsonThirdMid();
            if(roomTo>=315 && roomTo<326){
                F.johnsonThirdTop();
            }
            if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                F.johnsonThirdBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.BNB();
        }
        if(position == 1){
            S.FFNB();
        }
        if(position == 2){
            S.SFNB();
        }
        if(position == 3){
            S.TFNB();
            F.nicollsThirdBottom();
            F.hamiltonThirdFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void hamiltonGFtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.BNB();
        }
        if(position == 1){
            S.FFNB();
        }
        if(position == 2){
            S.SFNB();
        }
        if(position == 3){
            S.TFNB();
            if(roomTo>=311&&roomTo<=315){
                F.nicollsThirdFloor();
            }else{
                F.nicollsThirdBottom();
            }
        }
    }
    //--------------- Pathing from Johnson First Floor ---------------------------------------------
    public void johnson1FtoJohnson1F() {
        if(position == 0){
            F.johnsonFirstFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoHamilton1F() {
        if(position == 1){
            F.johnsonFirstMid();
            if(buildFrom.equals("Johnson")){
                if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                    F.johnsonFirstTop();
                }
                if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                    F.johnsonFirstBottom();
                }
                if(roomTo==126){
                    S.FFJM();
                    S.FFNB();
                    F.nicollsFirstBottom();
                }else{
                    F.hamiltonFirstFloor();
                }
            }else{
                if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                    F.johnsonFirstTop();
                }
                if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                    F.johnsonFirstBottom();
                }
                if(roomFrom==126){
                    S.FFJM();
                    S.FFNB();
                    F.nicollsFirstBottom();
                }else{
                    F.hamiltonFirstFloor();
                }
            }
        }
        if(position == 0){
            if(buildFrom.equals("Johnson")){
                if(roomTo==126){
                    S.BJM();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
            }else{
                if(roomFrom==126){
                    S.BJM();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.BNB();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoNicolls1F() {
        if(position == 0){
            S.BJM();
            F.johnsonGroundMid();
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.BNB();
        }
        if(position == 1){
            F.johnsonFirstMid();
            S.FFJM();
            S.FFNB();
            if(buildFrom.equals("Johnson")){
                if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                    F.johnsonFirstTop();
                }
                if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                    F.johnsonFirstBottom();
                }
                if(roomTo >= 111 && roomTo < 116) {
                    F.nicollsFirstFloor();
                }else{
                    F.nicollsFirstBottom();
                }
            }else{
                if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                    F.johnsonFirstTop();
                }
                if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                    F.johnsonFirstBottom();
                }
                if(roomFrom >= 111 && roomFrom < 116) {
                    F.nicollsFirstFloor();
                }else{
                    F.nicollsFirstBottom();
                }
            }
        }

    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
                S.FFJT();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
                S.FFJB();
            }else{
                F.johnsonFirstMid();
                S.FFJM();
            }
        }
        if(position == 2){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.SFJT();
                F.johnsonSecondTop();
                if(roomTo>208 && roomTo<217){

                }else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                    F.johnsonSecondMid();
                    F.johnsonSecondBottom();
                }else{
                    F.johnsonSecondMid();
                }
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.SFJB();
                F.johnsonSecondBottom();
                if(roomTo>208 && roomTo<217){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                }else if((roomTo>=200&&roomTo<=203)||roomTo==232){

                }else{
                        F.johnsonSecondMid();
                }
            }else{
                S.SFJM();
                F.johnsonSecondMid();
                if(roomTo>208 && roomTo<217){
                    F.johnsonSecondTop();
                }
                if((roomTo>=200&&roomTo<=203)||roomTo==232){
                    F.johnsonSecondBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.FFHM();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.SFHM();
            F.hamiltonSecondFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.FFHM();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.SFHM();
            F.hamiltonSecondFloor();
            if(roomTo>=211&&roomTo<=216){
                F.nicollsSecondFloor();
            }else{
                F.nicollsSecondBottom();
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
                S.FFJT();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
                S.FFJB();
            }else{
                F.johnsonFirstMid();
                S.FFJM();
            }
        }
        if(position == 2){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.SFJT();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.SFJB();
            }else{
                S.SFJM();
            }
        }
        if(position == 3){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.SFJT();
                F.johnsonThirdTop();
                if(roomTo>=315 && roomTo<326){

                } else if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                    F.johnsonThirdMid();
                    F.johnsonThirdBottom();
                }else{
                    F.johnsonThirdMid();
                }
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.SFJB();
                F.johnsonThirdBottom();
                if(roomTo>=315 && roomTo<326){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                }else if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){

                }else{
                    F.johnsonThirdMid();
                }
            }else{
                S.SFJM();
                F.johnsonThirdMid();
                if(roomTo>=315 && roomTo<326){
                    F.johnsonThirdTop();
                }
                if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                    F.johnsonThirdBottom();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.FFHM();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.SFHM();
        }
        if(position == 3){
            S.TFHM();
            F.hamiltonThirdFloor();
        }
    }
    //----------------------------------------------------------------------------------------------
    public void johnson1FtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.FFHM();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.SFHM();
        }
        if(position == 3){
            S.TFHM();
            F.hamiltonThirdFloor();
            if(roomTo>=311&&roomTo<=315){
                F.nicollsThirdFloor();
            }else{
                F.nicollsThirdBottom();
            }
        }
    }
    //--------------- Pathing from Nicolls First Floor ---------------
    public void nicolls1FtoNicolls1F() {
        if(position == 1){
            F.nicollsFirstFloor();
        }
    }

    public void nicolls1FtoHamilton1F() {
        if(position == 1) {
            F.nicollsFirstBottom();
            F.hamiltonFirstFloor();

            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
            }
        }
    }

    public void nicolls1FtoJohnson2F() {
        if(position == 1) {

        }
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

    //Todo: add starting at bus stop to hamilton first floor functionality

    public void hamilton1FtoHamilton1F() {
        if (position == 1){
            F.hamiltonFirstFloor();
        }
    }

    public void hamilton1FtoJohnson2F() {
        if (buildFrom.equals("Hamilton")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }

        if(position == 2) {
            S.SFHM();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }
        }

    }

    public void hamilton1FtoHamilton2F() {
        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }
        if(position == 2) {
            F.hamiltonSecondFloor();
            S.SFHM();
        }
    }

    public void hamilton1FtoNicolls2F() {
        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }
        if(position == 2) {
            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            S.SFHM();
            F.hamiltonSecondFloor();
            F.nicollsSecondBottom();

            if(roomFrom > 210) {
                F.nicollsSecondTop();
            }
        }
    }

    public void hamilton1FtoJohnson3F() {
        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }
        if(position == 2) {
            F.hamiltonSecondFloor();
            S.SFHM();
            F.johnsonSecondMid();
            S.SFJM();
        }
        if(position == 3) {
            S.TFJM();
            F.johnsonThirdMid();

            if(buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
            }
        }
    }

    public void hamilton1FtoHamilton3F() {
        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }
        if(position == 2) {
            S.SFHM();
        }
        if(position == 3) {
            S.TFHM();
            F.hamiltonThirdFloor();
        }
    }

    public void hamilton1FtoNicolls3F() {
        if(position == 1) {
            F.hamiltonFirstFloor();
            S.FFHM();
        }
        if(position == 2) {
            S.SFHM();
        }
        if(position == 3) {
            S.TFHM();
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();

            if(buildFrom.equals("Nicolls")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if (roomTo < 315 && roomTo > 310) {
                F.nicollsThirdTop();
            }

        }
    }


    //--------------- Pathing from Johnson Second Floor ---------------

    public void johnson2FtoJohnson2F() {
        if(position == 2) {
            F.johnsonSecondFloor();
        }
    }

    public void johnson2FtoHamilton2F() {
        if (buildFrom.equals("Hamilton")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 2) {
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }
        }

    }

    public void johnson2FtoNicolls2F() {
        if(position == 2) {
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
            F.nicollsSecondBottom();

            if (buildFrom.equals("Nicolls")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }

            if(roomTo > 210) {
                F.nicollsSecondTop();
            }
        }
    }

    public void johnson2FtoJohnson3F() {
        if(floorFrom.equals("Second Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 2) {
            if(roomTo > 207 && roomTo < 218) {
                F.johnsonSecondTop();
                S.SFJT();
            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonSecondBottom();
                S.SFJB();
            } else {
                F.johnsonSecondMid();
                S.SFJM();
            }

        }

        if(position == 3) {
            if(roomTo > 207 && roomTo < 218) {
                F.johnsonThirdTop();
                S.TFJT();
                if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                } else if((roomFrom > 325) || (roomFrom < 316 && roomFrom >302)) {
                    F.johnsonThirdMid();
                }

            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonThirdBottom();
                S.TFJB();
                if (roomFrom < 326 && roomFrom > 315) {
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                } else if((roomFrom > 325 || (roomFrom < 316 && roomFrom != 309 && roomFrom != 310 && roomFrom >302))) {
                    F.johnsonThirdMid();
                }
            } else {
                F.johnsonThirdMid();
                S.TFJM();
                if (roomFrom < 326 && roomFrom > 315) {
                    F.johnsonThirdTop();
                } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                    F.johnsonThirdBottom();
                }
            }

        }
    }

    public void johnson2FtoHamilton3F() {
        if(buildFrom.equals("Hamilton")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 2) {
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
            S.SFHM();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonSecondBottom();
            }
        }
        if(position == 3) {
            S.TFHM();
            F.hamiltonThirdFloor();
        }
    }

    public void johnson2FtoNicolls3F() {
        if(buildFrom.equals("Nicolls")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 2) {
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
            F.nicollsSecondBottom();
            S.SFNB();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }
        }
        if(position == 3) {
            S.TFNB();
            F.nicollsThirdBottom();
            if (roomTo > 310 && roomTo < 315) {
                F.nicollsThirdTop();
            }

        }
    }

    //--------------- Pathing from Nicolls Second Floor ---------------

    public void nicolls2FtoNicolls2F() {
        if(position == 2) {
            F.nicollsSecondFloor();
        }
    }

    public void nicolls2FtoHamilton2F() {
        if(position == 2) {
            F.nicollsSecondBottom();
            F.hamiltonSecondFloor();
            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            if(roomFrom > 210) {
                F.nicollsSecondTop();
            }
        }

    }

    public void nicolls2FtoJohnson3F() {
        if(position == 2) {
            F.nicollsSecondFloor();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.SFJM();
        }
        if(position == 3) {
            if (buildFrom.equals("Nicolls")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            F.johnsonThirdMid();
            S.TFJM();
            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
            }

        }

    }

    public void nicolls2FtoHamilton3F() {
        if(position == 2) {
            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            F.nicollsSecondBottom();
            S.SFNB();

            if(roomFrom > 210) {
                F.nicollsSecondTop();
            }
        }
        if(position == 3) {
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();
            S.TFNB();
        }
    }

    public void nicolls2FtoNicolls3F() {
        if(floorFrom.equals("Second Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 2) {
            F.nicollsSecondFloor();
            if (roomFrom > 310 && roomFrom < 315) {
                S.SFNT();
            } else {
                S.SFNB();
            }

        }

        if(position == 3) {
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
