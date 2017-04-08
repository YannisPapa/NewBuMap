package com.example.android.newbumap;

/*This class and its functions are used to call FloorDraw and StairwellDraw to draw the proper
* paths and circle the proper stair's on the image depending on the users selection*/

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

    //------------------------------Pathing from Johnson Ground Floor-------------------------------
    //--------------------------------From Johnson GF to Johnson GF---------------------------------
    public void johnsonGFtoJohnsonGF() {
        F.johnsonGroundFloor();
    }
    //--------------------------------From Johnson GF to Nicolls GF---------------------------------
    public void johnsonGFtoNicollsGF() {
        if (position == 0) {
            F.hamiltonGroundFloor();
            if(buildFrom.equals("Nicolls")) {
                if (roomFrom == 4 || roomFrom == 5 || roomFrom == 7){
                    F.nicollsGroundTop();
                    F.nicollsGroundBottom();
                } else {
                    F.nicollsGroundBottom();
                }
            } else {
                if (roomTo == 4 || roomTo == 5 || roomTo == 7){
                    F.nicollsGroundTop();
                    F.nicollsGroundBottom();
                } else {
                    F.nicollsGroundBottom();
                }
            }

            if (buildFrom.equals("Johnson")) {
                if(roomFrom >= 18 && roomFrom < 26) {
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                } else if(roomFrom < 5 || roomFrom == 11) {
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                } else {
                    F.johnsonGroundMid();
                }
            } else {
                if(roomTo >= 18 && roomTo < 26) {
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                } else if(roomTo < 5 || roomTo == 11) {
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                } else {
                    F.johnsonGroundMid();
                }
            }

        }
    }
    //--------------------------------From Johnson GF to Hamilton GF--------------------------------
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
    //--------------------------------From Johnson GF to Johnson 1F---------------------------------
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
                    S.jGroundTop();
                }
                if(position == 1){
                    F.johnsonFirstTop();
                    S.jFirstTop();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundTop();
                    S.jGroundTop();
                }
                if(position == 1){
                    F.johnsonFirstTop();
                    F.johnsonFirstMid();
                    S.jFirstTop();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundTop();
                    S.jGroundTop();
                }
                if(position == 1){
                    F.johnsonFirstFloor();
                    S.jFirstTop();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstTop();
                    S.jFirstMiddle();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    S.jFirstMiddle();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                    S.jFirstMiddle();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.jGroundBottom();
                }
                if(position == 1){
                    F.johnsonFirstFloor();
                    S.jFirstBottom();
                }
            }
            if((roomTo >= 124 && roomTo <= 128)||(roomTo >= 107 && roomTo <= 115)||(roomTo >= 117 && roomTo <= 118)){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.jGroundBottom();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.johnsonFirstBottom();
                    S.jFirstBottom();
                }
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.jGroundBottom();
                }
                if(position == 1){
                    F.johnsonFirstBottom();
                    S.jFirstBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Hamilton 1F--------------------------------
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
                    S.nGroundBottom();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
                }
            }
            else{
                if (position == 0) {
                    F.johnsonGroundTop();
                    S.jGroundTop();
                }
                if (position == 1) {
                    F.johnsonFirstTop();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.jFirstTop();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(roomTo == 126) {
                if (position == 0) {
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
                }
            }
            else{
                if(position == 0){
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.jFirstMiddle();
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
                    S.nGroundBottom();
                }
                if (position == 1) {
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
                }
            }
            else{
                if(position == 0){
                    F.johnsonGroundBottom();
                    S.jGroundBottom();
                }
                if(position == 1){
                    F.johnsonFirstBottom();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                    S.jFirstBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Nicolls 1F---------------------------------
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
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.nFirstBottom();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundTop();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(roomTo >= 111 && roomTo < 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.nFirstBottom();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
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
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstFloor();
                    S.nFirstBottom();
                }
            }
            if((roomTo >= 101 && roomTo <= 110)||roomTo == 116){
                if(position == 0){
                    F.johnsonGroundBottom();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    F.nicollsFirstBottom();
                    S.nFirstBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Johnson 2F---------------------------------
    public void johnsonGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.jGroundTop();
            }
            if(position == 1){
                S.jFirstTop();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondTop();
                    S.jSecondTop();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondFloor();
                    S.jSecondTop();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    S.jSecondTop();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    S.jSecondMiddle();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    S.jSecondMiddle();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondMid();
                    S.jSecondMiddle();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.jGroundBottom();
            }
            if(position == 1){
                S.jFirstBottom();
            }
            if(roomTo>208 && roomTo<217){
                if(position == 2){
                    F.johnsonSecondFloor();
                    S.jSecondBottom();
                }
            } else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                if(position == 2){
                    F.johnsonSecondBottom();
                    S.jSecondBottom();
                }
            } else{
                if(position == 2){
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    S.jSecondBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Hamilton 2F--------------------------------
    public void johnsonGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.jGroundTop();
            }
            if(position == 1){
                S.jFirstTop();
            }
            if(position == 2){
                S.jSecondTop();
                F.johnsonSecondTop();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
            }
            if(position == 2){
                S.jSecondMiddle();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.jGroundBottom();
            }
            if(position == 1){
                S.jFirstBottom();
            }
            if(position == 2){
                S.jSecondBottom();
                F.johnsonSecondBottom();
                F.johnsonSecondMid();
                F.hamiltonSecondFloor();
            }
        }
    }
    //--------------------------------From Johnson GF to Nicolls 2F---------------------------------
    public void johnsonGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.jGroundTop();
            }
            if(position == 1){
                S.jFirstTop();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.jSecondTop();
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.jSecondTop();
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
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.jSecondMiddle();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.jSecondMiddle();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondBottom();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.jGroundBottom();
            }
            if(position == 1){
                S.jFirstBottom();
            }
            if(roomTo>=211&&roomTo<=216){
                if(position == 2){
                    S.jSecondBottom();
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondFloor();
                }
            }
            else{
                if(position == 2){
                    S.jSecondBottom();
                    F.johnsonSecondBottom();
                    F.johnsonSecondMid();
                    F.hamiltonSecondFloor();
                    F.nicollsSecondBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Johnson 3F---------------------------------
    public void johnsonGFtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(roomFrom >= 18 && roomFrom < 26){
            if(position == 0){
                F.johnsonGroundTop();
                S.jGroundTop();
            }
            if(position == 1){
                S.jFirstTop();
            }
            if(position == 2){
                S.jSecondTop();
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdTop();
                    S.jThirdTop();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdFloor();
                    S.jThirdTop();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                    S.jThirdTop();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
            }
            if(position == 2){
                S.jSecondMiddle();
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                    S.jThirdMiddle();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                    S.jThirdMiddle();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdMid();
                    S.jThirdMiddle();
                }
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                S.jGroundBottom();
            }
            if(position == 1){
                S.jFirstBottom();
            }
            if(position == 2){
                S.jSecondBottom();
            }
            if(roomTo>=315 && roomTo<326){
                if(position == 3){
                    F.johnsonThirdFloor();
                    S.jThirdBottom();
                }
            } else if(roomTo==301||roomTo==302||roomTo==309||roomTo==310){
                if(position == 3){
                    F.johnsonThirdBottom();
                    S.jThirdBottom();
                }
            } else{
                if(position == 3){
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                    S.jThirdBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson GF to Hamilton 3F--------------------------------
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
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.hFirst();
            }
            if(position == 2){
                S.hSecond();
            }
            if(position == 3){
                S.hThird();
                F.hamiltonThirdFloor();
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.hFirst();
            }
            if(position == 2){
                S.hSecond();
            }
            if(position == 3){
                S.hThird();
                F.hamiltonThirdFloor();
            }
        }
        if(roomFrom < 5 || roomFrom == 11){
            if(position == 0){
                F.johnsonGroundBottom();
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
            if(position == 1){
                S.jFirstMiddle();
                F.johnsonFirstMid();
                F.hamiltonFirstFloor();
                S.hFirst();
            }
            if(position == 2){
                S.hSecond();
            }
            if(position == 3){
                S.hThird();
                F.hamiltonThirdFloor();
            }
        }
    }
    //--------------------------------From Johnson GF to Nicolls 3F---------------------------------
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
                S.nGroundBottom();
            }
            if(position == 1){
                S.nFirstBottom();
            }
            if(position == 2){
                S.nSecondBottom();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.nThirdBottom();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.nThirdBottom();
                    F.nicollsThirdBottom();
                }
            }
        }
        if(roomFrom == 26 || (roomFrom <= 10 && roomFrom >= 5)){
            if(position == 0){
                F.johnsonGroundMid();
                F.hamiltonGroundFloor();
                F.nicollsGroundBottom();
                S.nGroundBottom();
            }
            if(position == 1){
                S.nFirstBottom();
            }
            if(position == 2){
                S.nSecondBottom();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.nThirdBottom();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.nThirdBottom();
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
                S.nGroundBottom();
            }
            if(position == 1){
                S.nFirstBottom();
            }
            if(position == 2){
                S.nSecondBottom();
            }
            if(roomTo>=311&&roomTo<=315){
                if(position == 3){
                    S.nThirdBottom();
                    F.nicollsThirdFloor();
                }
            }
            else{
                if(position == 3){
                    S.nThirdBottom();
                    F.nicollsThirdBottom();
                }
            }
        }
    }

    //------------------------------Pathing from Nicolls Ground Floor-------------------------------
    //--------------------------------From Nicolls GF to Nicolls GF---------------------------------
    public void nicollsGFtoNicollsGF() {
        if(position == 0){
            F.nicollsGroundFloor();
        }
    }
    //--------------------------------From Nicolls GF to Hamilton GF--------------------------------
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
    //--------------------------------From Nicolls GF to Johnson 1F---------------------------------
    public void nicollsGFtoJohnson1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
        }
        if(roomFrom>=3&&roomFrom<=7){
            if(position == 0){
                F.nicollsGroundFloor();
            }
            if(position == 1){
                S.jFirstMiddle();
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
                S.jFirstMiddle();
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
    //--------------------------------From Nicolls GF to Hamilton 1F--------------------------------
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
                    S.nGroundBottom();
                }
                if(position == 1){
                    S.nFirstBottom();
                    F.nicollsFirstBottom();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundFloor();
                    F.hamiltonGroundFloor();
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    S.jFirstMiddle();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                }
            }
        }
        else {
            if(roomTo==126) {
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    S.nFirstBottom();
                    F.nicollsFirstBottom();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundBottom();
                    F.hamiltonGroundFloor();
                    F.johnsonGroundMid();
                    S.jGroundMiddle();
                }
                if(position == 1){
                    S.jFirstMiddle();
                    F.johnsonFirstMid();
                    F.hamiltonFirstFloor();
                }
            }
        }
    }
    //--------------------------------From Nicolls GF to Nicolls 1F---------------------------------
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
                    S.nGroundTop();
                }
                if(position == 1){
                    S.nFirstTop();
                    F.nicollsFirstTop();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundTop();
                    S.nGroundTop();
                }
                if(position == 1){
                    S.nFirstTop();
                    F.nicollsFirstFloor();
                }
            }
        }
        else {
            if(roomTo >= 111 && roomTo < 116) {
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    S.nFirstBottom();
                    F.nicollsFirstFloor();
                }
            }else{
                if(position == 0){
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
                if(position == 1){
                    S.nFirstBottom();
                    F.nicollsFirstBottom();
                }
            }
        }
    }
    //--------------------------------From Nicolls GF to Johnson 2F---------------------------------
    public void nicollsGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.jFirstMiddle();
        }
        if(position == 2){
            S.jSecondMiddle();
            F.johnsonSecondMid();
            if(roomTo>208 && roomTo<217){
                F.johnsonSecondTop();
            }
            if((roomTo>=200&&roomTo<=203)||roomTo==232){
                F.johnsonSecondBottom();
            }
        }
    }
    //--------------------------------From Nicolls GF to Hamilton 2F--------------------------------
    public void nicollsGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            S.nGroundBottom();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.nFirstBottom();
        }
        if(position == 2){
            S.nSecondBottom();
            F.nicollsSecondBottom();
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Nicolls GF to Nicolls 2F---------------------------------
    public void nicollsGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if (roomFrom >= 3 && roomFrom <= 7) {
            if(position == 0) {
                F.nicollsGroundTop();
                S.nGroundTop();
            }
            if(position == 1){
                S.nFirstTop();
            }
            if(position == 2){
                S.nSecondTop();
                if(roomTo>=211&&roomTo<=216){
                    F.nicollsSecondTop();
                }else{
                    F.nicollsSecondFloor();
                }
            }
        } else {
            if(position == 0) {
                F.nicollsGroundBottom();
                S.nGroundBottom();
            }
            if(position == 1){
                S.nFirstBottom();
            }
            if(position == 2){
                S.nSecondBottom();
                if(roomTo>=211&&roomTo<=216){
                    F.nicollsSecondFloor();
                }else{
                    F.nicollsSecondBottom();
                }
            }
        }
    }
    //--------------------------------From Nicolls GF to Johnson 3F---------------------------------
    public void nicollsGFtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.jFirstMiddle();
        }
        if(position == 2){
            S.jSecondMiddle();
        }
        if(position == 3){
            S.jThirdMiddle();
            F.johnsonThirdMid();
            if(roomTo>=315 && roomTo<326){
                F.johnsonThirdTop();
            }
            if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                F.johnsonThirdBottom();
            }
        }
    }
    //--------------------------------From Nicolls GF to Hamilton 3F--------------------------------
    public void nicollsGFtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            S.nGroundBottom();
            if (roomFrom >= 3 && roomFrom <= 7) {
                F.nicollsGroundFloor();
            } else {
                F.nicollsGroundBottom();
            }
        }
        if(position == 1){
            S.nFirstBottom();
        }
        if(position == 2){
            S.nSecondBottom();
        }
        if(position == 3){
            S.nThirdBottom();
            F.nicollsThirdBottom();
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Nicolls GF to Nicolls 3F---------------------------------
    public void nicollsGFtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if (roomFrom >= 3 && roomFrom <= 7) {
            if(position == 0) {
                F.nicollsGroundTop();
                S.nGroundTop();
            }
            if(position == 1){
                S.nFirstTop();
            }
            if(position == 2){
                S.nSecondTop();
            }
            if(position == 3){
                S.nThirdTop();
                if(roomTo>=311&&roomTo<=315){
                    F.nicollsThirdTop();
                }else{
                    F.nicollsThirdFloor();
                }
            }
        } else {
            if(position == 0) {
                F.nicollsGroundBottom();
                S.nGroundBottom();
            }
            if(position == 1){
                S.nFirstBottom();
            }
            if(position == 2){
                S.nSecondBottom();
            }
            if(position == 3){
                S.nThirdBottom();
                if(roomTo>=311&&roomTo<=315){
                    F.nicollsThirdFloor();
                }else{
                    F.nicollsThirdBottom();
                }
            }
        }
    }

    //------------------------------Pathing from Hamilton Ground Floor------------------------------
    //--------------------------------From Hamilton GF to Hamilton GF-------------------------------
    public void hamiltonGFtoHamiltonGF() {
        if(position == 0){
            F.hamiltonGroundFloor();
        }
    }
    //--------------------------------From Hamilton GF to Johnson 1F--------------------------------
    public void hamiltonGFtoJohnson1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
        }
        if(position == 1){
            F.johnsonFirstMid();
            S.jFirstMiddle();
            if((roomTo >= 119 && roomTo <= 123)||(roomTo >= 150 && roomTo <= 154)){
                F.johnsonFirstTop();
            }
            if((roomTo >= 101 && roomTo <= 105)||roomTo == 116){
                F.johnsonFirstBottom();
            }
        }
    }
    //--------------------------------From Hamilton GF to Hamilton 1F-------------------------------
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
                S.nGroundBottom();
            }else{
                F.johnsonGroundMid();
                S.jGroundMiddle();
            }
        }
        if(position == 1){
            if(roomTo==126){
                F.nicollsFirstBottom();
                S.nFirstBottom();
            }else{
                F.johnsonFirstMid();
                S.jFirstMiddle();
                F.hamiltonFirstFloor();
            }
        }
    }
    //--------------------------------From Hamilton GF to Nicolls 1F--------------------------------
    public void hamiltonGFtoNicolls1F() {
        if(floorFrom.equals("First Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0){
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.nGroundBottom();
        }
        if(position == 1){
            S.nFirstBottom();
            if(roomTo >= 111 && roomTo < 116) {
                F.nicollsFirstFloor();
            }else{
                F.nicollsFirstBottom();
            }
        }
    }
    //--------------------------------From Hamilton GF to Johnson 2F--------------------------------
    public void hamiltonGFtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
        }
        if(position == 1){
            S.jFirstMiddle();
        }
        if(position == 2){
            S.jSecondMiddle();
            F.johnsonSecondMid();
            if(roomTo>208 && roomTo<217){
                F.johnsonSecondTop();
            }
            if((roomTo>=200&&roomTo<=203)||roomTo==232){
                F.johnsonSecondBottom();
            }
        }
    }
    //--------------------------------From Hamilton GF to Hamilton 2F-------------------------------
    public void hamiltonGFtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
        }
        if(position == 1){
            S.jFirstMiddle();
        }
        if(position == 2){
            S.jSecondMiddle();
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Hamilton GF to Nicolls 2F--------------------------------
    public void hamiltonGFtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.nGroundBottom();
        }
        if(position == 1){
            S.nFirstBottom();
        }
        if(position == 2){
            S.nSecondBottom();
            if(roomTo>=211&&roomTo<=216){
                F.nicollsSecondFloor();
            }else{
                F.nicollsSecondBottom();
            }
        }
    }
    //--------------------------------From Hamilton GF to Johnson 3F--------------------------------
    public void hamiltonGFtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.johnsonGroundMid();
            S.jGroundMiddle();
        }
        if(position == 1){
            S.jFirstMiddle();
        }
        if(position == 2){
            S.jSecondMiddle();
        }
        if(position == 3){
            S.jThirdMiddle();
            F.johnsonThirdMid();
            if(roomTo>=315 && roomTo<326){
                F.johnsonThirdTop();
            }
            if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                F.johnsonThirdBottom();
            }
        }
    }
    //--------------------------------From Hamilton GF to Hamilton 3F-------------------------------
    public void hamiltonGFtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.nGroundBottom();
        }
        if(position == 1){
            S.nFirstBottom();
        }
        if(position == 2){
            S.nSecondBottom();
        }
        if(position == 3){
            S.nThirdBottom();
            F.nicollsThirdBottom();
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Hamilton GF to Nicolls 3F--------------------------------
    public void hamiltonGFtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.nGroundBottom();
        }
        if(position == 1){
            S.nFirstBottom();
        }
        if(position == 2){
            S.nSecondBottom();
        }
        if(position == 3){
            S.nThirdBottom();
            if(roomTo>=311&&roomTo<=315){
                F.nicollsThirdFloor();
            }else{
                F.nicollsThirdBottom();
            }
        }
    }

    //------------------------------Pathing from Johnson First Floor--------------------------------
    //--------------------------------From Johnson 1F to Johnson 1F---------------------------------
    public void johnson1FtoJohnson1F() {
        if(position == 1){
            F.johnsonFirstFloor();
        }
    }
    //--------------------------------From Johnson 1F to Hamilton 1F--------------------------------
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
                    S.jFirstMiddle();
                    S.nFirstBottom();
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
                    S.jFirstMiddle();
                    S.nFirstBottom();
                    F.nicollsFirstBottom();
                }else{
                    F.hamiltonFirstFloor();
                }
            }
        }
        if(position == 0){
            if(buildFrom.equals("Johnson")){
                if(roomTo==126){
                    S.jGroundMiddle();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
            }else{
                if(roomFrom==126){
                    S.jGroundMiddle();
                    F.johnsonGroundMid();
                    F.hamiltonGroundFloor();
                    F.nicollsGroundBottom();
                    S.nGroundBottom();
                }
            }
        }
    }
    //--------------------------------From Johnson 1F to Nicolls 1F---------------------------------
    public void johnson1FtoNicolls1F() {
        if(position == 0){
            S.jGroundMiddle();
            F.johnsonGroundMid();
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();
            S.nGroundBottom();
        }
        if(position == 1){
            F.johnsonFirstMid();
            S.jFirstMiddle();
            S.nFirstBottom();
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
    //--------------------------------From Johnson 1F to Johnson 2F---------------------------------
    public void johnson1FtoJohnson2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
                S.jFirstTop();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
                S.jFirstBottom();
            }else{
                F.johnsonFirstMid();
                S.jFirstMiddle();
            }
        }
        if(position == 2){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.jSecondTop();
                F.johnsonSecondTop();
                if(roomTo>208 && roomTo<217){

                }else if((roomTo>=200&&roomTo<=203)||roomTo==232){
                    F.johnsonSecondMid();
                    F.johnsonSecondBottom();
                }else{
                    F.johnsonSecondMid();
                }
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.jSecondBottom();
                F.johnsonSecondBottom();
                if(roomTo>208 && roomTo<217){
                    F.johnsonSecondTop();
                    F.johnsonSecondMid();
                }else if((roomTo>=200&&roomTo<=203)||roomTo==232){

                }else{
                        F.johnsonSecondMid();
                }
            }else{
                S.jSecondMiddle();
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
    //--------------------------------From Johnson 1F to Hamilton 2F--------------------------------
    public void johnson1FtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.hFirst();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.hSecond();
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Johnson 1F to Nicolls 2F---------------------------------
    public void johnson1FtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.hFirst();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.hSecond();
            F.hamiltonSecondFloor();
            if(roomTo>=211&&roomTo<=216){
                F.nicollsSecondFloor();
            }else{
                F.nicollsSecondBottom();
            }
        }
    }
    //--------------------------------From Johnson 1F to Johnson 3F---------------------------------
    public void johnson1FtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
                S.jFirstTop();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
                S.jFirstBottom();
            }else{
                F.johnsonFirstMid();
                S.jFirstMiddle();
            }
        }
        if(position == 2){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.jSecondTop();
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.jSecondBottom();
            }else{
                S.jSecondMiddle();
            }
        }
        if(position == 3){
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                S.jSecondTop();
                F.johnsonThirdTop();
                if(roomTo>=315 && roomTo<326){

                } else if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){
                    F.johnsonThirdMid();
                    F.johnsonThirdBottom();
                }else{
                    F.johnsonThirdMid();
                }
            }else if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                S.jSecondBottom();
                F.johnsonThirdBottom();
                if(roomTo>=315 && roomTo<326){
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                }else if((roomTo==301||roomTo==302||roomTo==309||roomTo==310)){

                }else{
                    F.johnsonThirdMid();
                }
            }else{
                S.jSecondMiddle();
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
    //--------------------------------From Johnson 1F to Hamilton 3F--------------------------------
    public void johnson1FtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.hFirst();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.hSecond();
        }
        if(position == 3){
            S.hThird();
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Johnson 1F to Nicolls 3F---------------------------------
    public void johnson1FtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1){
            F.johnsonFirstMid();
            F.hamiltonFirstFloor();
            S.hFirst();
            if((roomFrom >= 119 && roomFrom <= 123)||(roomFrom >= 150 && roomFrom <= 154)){
                F.johnsonFirstTop();
            }
            if((roomFrom >= 101 && roomFrom <= 105)||roomFrom == 116){
                F.johnsonFirstBottom();
            }
        }
        if(position == 2){
            S.hSecond();
        }
        if(position == 3){
            S.hThird();
            F.hamiltonThirdFloor();
            if(roomTo>=311&&roomTo<=315){
                F.nicollsThirdFloor();
            }else{
                F.nicollsThirdBottom();
            }
        }
    }

    //------------------------------Pathing from Nicolls First Floor--------------------------------
    //--------------------------------From Nicolls 1F to Nicolls 1F---------------------------------
    public void nicolls1FtoNicolls1F() {
        if(position == 1){
            F.nicollsFirstFloor();
        }
    }
    //--------------------------------From Nicolls 1F to Hamilton 1F--------------------------------
    public void nicolls1FtoHamilton1F() {
        if (buildFrom.equals("Hamilton")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 1) {
            F.nicollsFirstBottom();
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
            }
            if(roomTo==126){
            }else{
                S.FFNB();
                F.hamiltonFirstFloor();
                S.FFJM();
                F.johnsonFirstMid();
            }
        }
        if(position == 0){
            if(roomTo==126){
            }else{
                S.BNB();
                F.nicollsGroundBottom();
                F.hamiltonGroundFloor();
                F.johnsonGroundMid();
                S.BJM();
            }
        }
    }
    //--------------------------------From Nicolls 1F to Johnson 2F---------------------------------
    public void nicolls1FtoJohnson2F() {
        if (buildFrom.equals("Nicolls")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 1) {
            F.nicollsFirstBottom();
            S.nFirstBottom();

            if(roomTo > 110 && roomTo < 116) {
                F.nicollsFirstTop();
            }
        }
        if(position == 2) {
            S.nSecondBottom();
            F.nicollsSecondBottom();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }

        }
    }
    //--------------------------------From Nicolls 1F to Hamilton 2F--------------------------------
    public void nicolls1FtoHamilton2F() {
        if(position == 1) {
            F.nicollsFirstBottom();
            S.nFirstBottom();

            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
            }
        }
        if(position == 2) {
            S.nSecondBottom();
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Nicolls 1F to Nicolls 2F---------------------------------
    public void nicolls1FtoNicolls2F() {
        if (floorFrom.equals("Second Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 1) {
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
                S.nFirstTop();
            } else {
                F.nicollsFirstBottom();
                S.nFirstBottom();
            }
        }
        if(position == 2) {
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsSecondTop();
                S.nSecondTop();
                if(roomTo < 211) {
                    F.nicollsSecondBottom();
                }
            } else {
                F.nicollsSecondBottom();
                S.nSecondBottom();
                if(roomTo > 210) {
                    F.nicollsSecondTop();
                }
            }

        }
    }
    //--------------------------------From Nicolls 1F to Johnson 3F---------------------------------
    public void nicolls1FtoJohnson3F() {
        if (buildFrom.equals("Johnson")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 1) {
            F.nicollsFirstBottom();
            S.nFirstBottom();
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
            }
        }
        if(position == 2) {
            F.nicollsSecondBottom();
            S.nSecondBottom();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            if (roomTo < 326 && roomTo > 315) {
                F.johnsonSecondTop();
                S.jSecondTop();
            } else if (roomTo == 309 || roomTo == 310 || roomTo < 303) {
                F.johnsonSecondBottom();
                S.jSecondBottom();
            } else {
                S.jSecondMiddle();
            }
        }
        if(position == 3) {
            if (roomTo < 326 && roomTo > 315) {
                F.johnsonThirdTop();
                S.jThirdTop();
            } else if (roomTo == 309 || roomTo == 310 || roomTo < 303) {
                F.johnsonThirdBottom();
                S.jThirdBottom();
            } else {
                F.johnsonThirdMid();
                S.jThirdMiddle();
            }
        }

    }
    //--------------------------------From Nicolls 1F to Hamilton 3F--------------------------------
    public void nicolls1FtoHamilton3F() {
        if(position == 1) {
            F.nicollsFirstBottom();
            S.nFirstBottom();

            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }

            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
            }
        }
        if(position == 2) {
            S.nSecondBottom();
        }
        if(position == 3) {
            S.nThirdBottom();
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Nicolls 1F to Nicolls 3F---------------------------------
    public void nicolls1FtoNicolls3F() {
        if (floorFrom.equals("Third Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 1) {
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsFirstTop();
                S.nFirstTop();
            } else {
                F.nicollsFirstBottom();
                S.nFirstBottom();
            }
        }
        if(position == 2) {
            if(roomFrom > 110 && roomFrom < 116) {
                S.nSecondTop();
            } else {
                S.nSecondBottom();
            }
        }
        if(position == 3) {
            if(roomFrom > 110 && roomFrom < 116) {
                F.nicollsThirdTop();
                S.nThirdTop();
                if (roomTo > 314 || roomTo < 311) {
                    F.nicollsThirdBottom();
                }
            } else {
                F.nicollsThirdBottom();
                S.nThirdBottom();
                if (roomTo < 315 && roomTo > 310) {
                    F.nicollsThirdTop();
                }
            }
        }
    }

    //------------------------------Pathing from Hamilton First Floor-------------------------------
    //--------------------------------From Hamilton 1F to Hamilton 1F-------------------------------
    public void hamilton1FtoHamilton1F() {
        if(position == 0){
            if(roomFrom == 126 || roomTo == 126){
                S.BJM();
                F.johnsonGroundMid();
                F.hamiltonGroundFloor();
                F.nicollsGroundBottom();
                S.BNB();
            }
        }
        if(position == 1){
            F.hamiltonFirstFloor();
            if(roomFrom == 126 || roomTo == 126){
                F.johnsonFirstMid();
                S.FFJM();
                F.nicollsFirstBottom();
                S.FFNB();
            }
        }
    }
    //--------------------------------From Hamilton 1F to Johnson 2F--------------------------------
    public void hamilton1FtoJohnson2F() {
        if (buildFrom.equals("Johnson")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 1) {
            if(roomFrom==126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom==126){
                S.SFNB();
                F.nicollsSecondBottom();
            }else{
                S.SFHM();
            }
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            if(roomTo > 207 && roomTo < 218) {
                F.johnsonSecondTop();
            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonSecondBottom();
            }
        }
    }
    //--------------------------------From Hamilton 1F to Hamilton 2F-------------------------------
    public void hamilton1FtoHamilton2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1) {
            if(roomFrom == 126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom == 126){
                F.nicollsSecondBottom();
                S.SFNB();
            }else{
                S.SFHM();
            }
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Hamilton 1F to Nicolls 2F--------------------------------
    public void hamilton1FtoNicolls2F() {
        if(floorFrom.equals("Second Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1) {
            if(roomFrom == 126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom == 126){
                S.SFNB();
            }else{
                S.SFHM();
                F.hamiltonSecondFloor();
            }
            F.nicollsSecondBottom();
            if(roomFrom > 210) {
                F.nicollsSecondTop();
            }
        }
    }
    //--------------------------------From Hamilton 1F to Johnson 3F--------------------------------
    public void hamilton1FtoJohnson3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1) {
            if(roomFrom == 126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom == 126){
                F.nicollsSecondBottom();
                S.SFNB();
            }else{
                S.SFHM();
            }
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.SFJM();
        }
        if(position == 3) {
            S.TFJM();
            F.johnsonThirdMid();
            if (roomTo < 326 && roomTo > 315) {
                F.johnsonThirdTop();
            } else if (roomTo == 309 || roomTo == 310 || roomTo < 303) {
                F.johnsonThirdBottom();
            }
        }
    }
    //--------------------------------From Hamilton 1F to Hamilton 3F-------------------------------
    public void hamilton1FtoHamilton3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1) {
            if(roomFrom == 126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom == 126){
                S.SFNB();
            }else{
                S.SFHM();
            }
        }
        if(position == 3) {
            if(roomFrom == 126){
                S.TFNB();
                F.nicollsThirdBottom();
            }else{
                S.TFHM();
            }
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Hamilton 1F to Nicolls 3F--------------------------------
    public void hamilton1FtoNicolls3F() {
        if(floorFrom.equals("Third Floor")){
            int tempRoom = roomFrom;
            roomFrom = roomTo;
            roomTo = tempRoom;
        }
        if(position == 1) {
            if(roomFrom == 126){
                F.nicollsFirstBottom();
                S.FFNB();
            }else{
                F.hamiltonFirstFloor();
                S.FFHM();
            }
        }
        if(position == 2) {
            if(roomFrom == 126){
                S.SFNB();
            }else{
                S.SFHM();
            }
        }
        if(position == 3) {
            if(roomFrom == 126){
                S.TFNB();
            }else{
                S.TFHM();
                F.hamiltonThirdFloor();
            }
            F.nicollsThirdBottom();
            if (roomTo < 315 && roomTo > 310) {
                F.nicollsThirdTop();
            }
        }
    }

    //------------------------------Pathing from Johnson Second Floor-------------------------------
    //--------------------------------From Johnson 2F to Johnson 2F---------------------------------
    public void johnson2FtoJohnson2F() {
        if(position == 2) {
            F.johnsonSecondFloor();
        }
    }
    //--------------------------------From Johnson 2F to Hamilton 2F--------------------------------
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
    //--------------------------------From Johnson 2F to Nicolls 2F---------------------------------
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
    //--------------------------------From Johnson 2F to Johnson 3F---------------------------------
    public void johnson2FtoJohnson3F() {
        if(floorFrom.equals("Second Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 2) {
            if(roomTo > 207 && roomTo < 218) {
                F.johnsonSecondTop();
                S.jSecondTop();
            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonSecondBottom();
                S.jSecondBottom();
            } else {
                F.johnsonSecondMid();
                S.jSecondMiddle();
            }

        }

        if(position == 3) {
            if(roomTo > 207 && roomTo < 218) {
                F.johnsonThirdTop();
                S.jThirdTop();
                if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                    F.johnsonThirdBottom();
                    F.johnsonThirdMid();
                } else if((roomFrom > 325) || (roomFrom < 316 && roomFrom >302)) {
                    F.johnsonThirdMid();
                }

            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonThirdBottom();
                S.jThirdBottom();
                if (roomFrom < 326 && roomFrom > 315) {
                    F.johnsonThirdTop();
                    F.johnsonThirdMid();
                } else if((roomFrom > 325 || (roomFrom < 316 && roomFrom != 309 && roomFrom != 310 && roomFrom >302))) {
                    F.johnsonThirdMid();
                }
            } else {
                F.johnsonThirdMid();
                S.jThirdMiddle();
                if (roomFrom < 326 && roomFrom > 315) {
                    F.johnsonThirdTop();
                } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                    F.johnsonThirdBottom();
                }
            }

        }
    }
    //--------------------------------From Johnson 2F to Hamilton 3F--------------------------------
    public void johnson2FtoHamilton3F() {
        if(buildFrom.equals("Hamilton")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }
        if(position == 2) {
            F.johnsonSecondMid();
            F.hamiltonSecondFloor();
            S.hSecond();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomTo > 230 || roomTo < 204) {
                F.johnsonSecondBottom();
            }
        }
        if(position == 3) {
            S.hThird();
            F.hamiltonThirdFloor();
        }
    }
    //--------------------------------From Johnson 2F to Nicolls 3F---------------------------------
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
            S.nSecondBottom();
            if(roomFrom > 207 && roomFrom < 218) {
                F.johnsonSecondTop();
            } else if (roomFrom > 230 || roomFrom < 204) {
                F.johnsonSecondBottom();
            }
        }
        if(position == 3) {
            S.nThirdBottom();
            F.nicollsThirdBottom();
            if (roomTo > 310 && roomTo < 315) {
                F.nicollsThirdTop();
            }

        }
    }

    //------------------------------Pathing from Nicolls Second Floor-------------------------------
    //--------------------------------From Nicolls 2F to Nicolls 2F---------------------------------
    public void nicolls2FtoNicolls2F() {
        if(position == 2) {
            F.nicollsSecondFloor();
        }
    }
    //--------------------------------From Nicolls 2F to Hamilton 2F--------------------------------
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
    //--------------------------------From Nicolls 2F to Johnson 3F---------------------------------
    public void nicolls2FtoJohnson3F() {
        if(position == 2) {
            F.nicollsSecondFloor();
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.jSecondMiddle();
        }
        if(position == 3) {
            if (buildFrom.equals("Nicolls")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            F.johnsonThirdMid();
            S.jThirdMiddle();
            if (roomFrom < 326 && roomFrom > 315) {
                F.johnsonThirdTop();
            } else if (roomFrom == 309 || roomFrom == 310 || roomFrom < 303) {
                F.johnsonThirdBottom();
            }

        }

    }
    //--------------------------------From Nicolls 2F to Hamilton 3F--------------------------------
    public void nicolls2FtoHamilton3F() {
        if(position == 2) {
            if (buildFrom.equals("Hamilton")) {
                int temp = roomTo;
                roomTo = roomFrom;
                roomFrom = temp;
            }
            F.nicollsSecondBottom();
            S.nSecondBottom();

            if(roomFrom > 210) {
                F.nicollsSecondTop();
            }
        }
        if(position == 3) {
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();
            S.nThirdBottom();
        }
    }
    //--------------------------------From Nicolls 2F to Nicolls 3F---------------------------------
    public void nicolls2FtoNicolls3F() {
        if(floorFrom.equals("Second Floor")) {
            int temp = roomTo;
            roomTo = roomFrom;
            roomFrom = temp;
        }

        if(position == 2) {
            F.nicollsSecondFloor();
            if (roomFrom > 310 && roomFrom < 315) {
                S.nSecondTop();
            } else {
                S.nSecondBottom();
            }

        }

        if(position == 3) {
            if (roomFrom > 310 && roomFrom < 315) {
                S.nThirdTop();
                F.nicollsThirdTop();
            } else {
                S.nThirdBottom();
                F.nicollsThirdBottom();
            }
        }
    }

    //------------------------------Pathing from Hamilton Second Floor------------------------------
    //--------------------------------From Hamilton 2F to Hamilton 2F-------------------------------
    public void hamilton2FtoHamilton2F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
        }
    }
    //--------------------------------From Hamilton 2F to Johnson 3F--------------------------------
    public void hamilton2FtoJohnson3F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
            F.johnsonSecondMid();
            S.jSecondMiddle();
        }
        if(position == 3) {
            S.jThirdMiddle();

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
    //--------------------------------From Hamilton 2F to Hamilton 3F-------------------------------
    public void hamilton2FtoHamilton3F() {
        if(position == 2) {
            F.hamiltonSecondFloor();
            S.hSecond();
        }
        if(position == 3) {
            F.hamiltonThirdFloor();
            S.hThird();
        }
    }
    //--------------------------------From Hamilton 2F to Nicolls 3F--------------------------------
    public void hamilton2FtoNicolls3F() {
        if(position == 2) {
            S.hSecond();
            F.hamiltonSecondFloor();
        }
        if(position == 3) {
            S.hThird();
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

    //------------------------------Pathing from Johnson Third Floor--------------------------------
    //--------------------------------From Johnson 3F to Johnson 3F---------------------------------
    public void johnson3FtoJohnson3F() {
        if(position == 3) {
            F.johnsonThirdFloor();
        }
    }
    //--------------------------------From Johnson 3F to Hamilton 3F--------------------------------
    public void johnson3FtoHamilton3F() {
        if(position == 3) {
            F.hamiltonThirdFloor();
            F.nicollsThirdBottom();
            S.nThirdBottom();
            S.jThirdMiddle();

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
            S.jSecondMiddle();
            S.nSecondBottom();
        }
    }
    //--------------------------------From Johnson 3F to Nicolls 3F---------------------------------
    public void johnson3FtoNicolls3F() {
        if(position == 3) {
            F.nicollsThirdBottom();
            F.johnsonThirdMid();
            S.nSecondBottom();
            S.jSecondMiddle();

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
            S.nSecondBottom();
            S.jSecondMiddle();
        }
    }

    //------------------------------Pathing from Nicolls Third Floor--------------------------------
    //--------------------------------From Nicolls 3F to Nicolls 3F---------------------------------
    public void nicolls3FtoNicolls3F() {
        if(position == 3) {
            F.nicollsThirdFloor();
        }
    }
    //--------------------------------From Nicolls 3F to Hamilton 3F--------------------------------
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

    //------------------------------Pathing from Hamilton Third Floor-------------------------------
    //--------------------------------From Hamilton 3F to Hamilton 3F-------------------------------
    public void hamilton3FtoHamilton3F() {
        if(position == 3) {
            F.hamiltonThirdFloor();
        }
    }

}
