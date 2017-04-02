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

    public void johnsonGroundtoNicollsGround() {
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

    public void johnsonGroundtoHamGround() {
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

    public void johnsonGroundtoJohnsonFF() {
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

    public void nicollsGroundtoHamGround() {
        if(position == 0) {
            F.hamiltonGroundFloor();
            F.nicollsGroundFloor();
        }
    }


}
