package com.example.android.newbumap;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by Mareep on 3/29/17.
 */

public class PathDraw {
    private FloorDraw F;
    private StairwellDraw S;
    private int position;
    private String buildFrom;
    private String buildTo;
    private int roomFrom;
    private int roomTo;

    public PathDraw(FloorDraw f, StairwellDraw s, int p, String toB, int toRoom, String fromB, int fromRoom) {
        F = f;
        S = s;
        position = p;
        buildFrom = fromB;
        buildTo = toB;
        roomFrom = fromRoom;
        roomTo = toRoom;

    }

    //--------------- Pathing from Johnson Ground Floor ---------------

    public void johnsonGFtojohnsonGF() {

    }

    public void johnsonGFtoNicollsGF() {
        if (position == 0) {
            F.johnsonGroundMid();
            F.hamiltonGroundFloor();
            F.nicollsGroundBottom();

            if(buildFrom.equals("Nicolls") && (roomFrom == 4 || roomFrom == 5 || roomFrom == 7)) {
                    F.nicollsGroundTop();
            }

            if (buildTo.equals("Nicolls") && (roomTo == 4 || roomTo == 5 || roomTo == 7)) {
                F.nicollsGroundTop();
            }

            if (buildFrom.equals("Johnson")) {
                if(roomFrom < 24 && roomFrom >10) {
                    F.johnsonGroundTop();
                }
                if(roomFrom < 5) {
                    F.johnsonGroundBottom();
                }
            }

            if (buildTo.equals("Johnson")) {
                if(roomTo < 24 && roomTo >10) {
                    F.johnsonGroundTop();
                }
                if(roomTo < 5) {
                    F.johnsonGroundBottom();
                }
            }

        }
    }

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

    public void johnsonGFtoJohnson1F() {
        //rooms near top stairs
        if((roomFrom>=18&&roomFrom<=24)||(roomTo>=18&&roomTo<=24)){
            if(position == 0){
                F.johnsonGroundFloor();
                S.BJT();
            }
            if(position == 1){
                F.johnsonFirstFloor();
                S.FFJT();
            }
        }
        //rooms near middle stairs
        if((roomFrom>=4&&roomFrom<=10)||(roomTo>=4&&roomTo<=10)||((roomFrom==26)||(roomTo==26))){
            if(position == 0){
                F.johnsonGroundFloor();
                S.BJM();
            }
            if(position == 1){
                F.johnsonFirstFloor();
                S.FFJM();
            }
        }
        //rooms near bottom stairs
        if((roomFrom>=1&&roomFrom<=2)||(roomTo>=1&&roomTo<=2)||((roomFrom==11)||(roomFrom==11))){
            if(position == 0){
                F.johnsonGroundFloor();
                S.BJB();
            }
            if(position == 1){
                F.johnsonFirstFloor();
                S.FFJB();
            }
        }
    }

    public void johnsonGFtoHamilton1F () {

    }

    public void johnsonGFtoNicolls1F() {

    }

    public void johnsonGFtoJohnson2F() {

    }

    public void johnsonGFtoHamilton2F() {

    }

    public void johnsonGFtoNicolls2F() {

    }

    public void johnsonGFtoJohnson3F() {

    }

    public void johnsonGFtoHamilton3F() {

    }

    public void johnsonGFtoNicolls3F() {

    }

    //--------------- Pathing from Nicolls Ground Floor ---------------

    public void nicollsGFtonicollsGF() {

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

    public void hamiltonGFtohamiltonGF() {

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

    }

    public void nicolls2FtoHamilton2F() {

    }

    public void nicolls2FtoJohnson3F() {

    }

    public void nicolls2FtoHamilton3F() {

    }

    public void nicolls2FtoNicolls3F() {

    }

    //--------------- Pathing from Hamilton Second Floor ---------------

    public void hamilton2FtoHamilton2F() {

    }

    public void hamilton2FtoJohnson3F() {

    }

    public void hamilton2FtoHamilton3F() {

    }

    public void hamilton2FtoNicolls3F() {

    }

    //--------------- Pathing from Johnson Third Floor ---------------

    public void johnson3FtoJohnson3F() {

    }

    public void johnson3FtoHamilton3F() {

    }

    public void johnson3FtoNicolls3F() {

    }

    //--------------- Pathing from Nicolls Third Floor ---------------

    public void nicolls3FtoNicolls3F() {

    }

    public void nicolls3FtoHamilton3F() {

    }

    //--------------- Pathing from Hamilton Third Floor ---------------

    public void hamilton3FtoHamilton3F() {

    }

}
