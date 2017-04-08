package com.example.android.newbumap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/*This Class becomes the new Activity manager for ImageActivity*/

public class CustomSwipeAdapter extends PagerAdapter{

    private int[] image_resources = {R.drawable.bubasement,R.drawable.bufloor1,R.drawable.bufloor2,R.drawable.bufloor3};
    private Context ctx;
    private LayoutInflater layoutInflater;
    private String spinner1,spinner2,spinner3,spinner4,spinner5,spinner6;
    private String johnson = "Johnson";
    private String nicolls = "Nicolls";
    private String hamilton = "Hamilton";
    private String groundFloor = "Ground Floor";
    private String firstFloor = "First Floor";
    private String secondFloor = "Second Floor";
    private String thirdFloor = "Third Floor";

    //Constructor that receives the spinner information and the context from ImageActivity
    public CustomSwipeAdapter(Context ctx, String spn1, String spn2, String spn3, String spn4, String spn5, String spn6){
        this.ctx = ctx;
        spinner1 = spn1;
        spinner2 = spn2;
        spinner3 = spn3;
        spinner4 = spn4;
        spinner5 = spn5;
        spinner6 = spn6;
    }

    //getCount tells us how many images we have in the array of images
    @Override
    public int getCount() {
        return image_resources.length;
    }

    //This function gives the Activity and view and layout
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout) object);
    }

    /*All the Functions named similarly to fromJGround all call the proper PathDraw Function
    * according to what the user has selected*/
    /*--------------------------------------------------------------------------------------------*/
    private void fromJGround(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                paths.johnsonGFtoJohnsonGF();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                paths.johnsonGFtoHamiltonGF();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                paths.johnsonGFtoNicollsGF();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                paths.johnsonGFtoJohnson1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.johnsonGFtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                paths.johnsonGFtoNicolls1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.johnsonGFtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.johnsonGFtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.johnsonGFtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.johnsonGFtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.johnsonGFtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.johnsonGFtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromHGround(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to hGF
                paths.johnsonGFtoHamiltonGF();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                paths.hamiltonGFtoHamiltonGF();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to hGF
                paths.nicollsGFtoHamiltonGF();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                paths.hamiltonGFtoJohnson1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.hamiltonGFtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                paths.hamiltonGFtoNicolls1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.hamiltonGFtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.hamiltonGFtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.hamiltonGFtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.hamiltonGFtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.hamiltonGFtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.hamiltonGFtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromNGround(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to nGF
                paths.johnsonGFtoNicollsGF();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                paths.nicollsGFtoHamiltonGF();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                paths.nicollsGFtoNicollsGF();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                paths.nicollsGFtoJohnson1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.nicollsGFtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                paths.nicollsGFtoNicolls1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.nicollsGFtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.nicollsGFtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.nicollsGFtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.nicollsGFtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.nicollsGFtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.nicollsGFtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromJFirst(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to j1F
                paths.johnsonGFtoJohnson1F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to j1F
                paths.nicollsGFtoJohnson1F();

            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to j1F
                paths.hamiltonGFtoJohnson1F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                paths.johnson1FtoJohnson1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.johnson1FtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                paths.johnson1FtoNicolls1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.johnson1FtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.johnson1FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.johnson1FtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.johnson1FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.johnson1FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.johnson1FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromHFirst(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to h1F
                paths.johnsonGFtoHamilton1F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to h1F
                paths.hamiltonGFtoHamilton1F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to h1F
                paths.nicollsGFtoHamilton1F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to h1F
                paths.johnson1FtoHamilton1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.hamilton1FtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to h1F
                paths.nicolls1FtoHamilton1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.hamilton1FtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.hamilton1FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.hamilton1FtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.hamilton1FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.hamilton1FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.hamilton1FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromNFirst(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to n1F
                paths.johnsonGFtoNicolls1F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to n1F
                paths.nicollsGFtoNicolls1F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to n1F
                paths.hamiltonGFtoNicolls1F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to n1F
                paths.johnson1FtoNicolls1F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                paths.nicolls1FtoHamilton1F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                paths.nicolls1FtoNicolls1F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.nicolls1FtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.nicolls1FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.nicolls1FtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.nicolls1FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.nicolls1FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.nicolls1FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromJSecond(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to j2F
                paths.johnsonGFtoJohnson2F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to j2F
                paths.nicollsGFtoJohnson2F();

            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to j2F
                paths.hamiltonGFtoJohnson2F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to j2F
                paths.johnson1FtoJohnson2F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to j2F
                paths.hamilton1FtoJohnson2F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to j2F
                paths.nicolls1FtoJohnson2F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                paths.johnson2FtoJohnson2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.johnson2FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.johnson2FtoNicolls2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.johnson2FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.johnson2FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.johnson2FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromHSecond(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to h2F
                paths.johnsonGFtoHamilton2F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to h2F
                paths.nicollsGFtoHamilton2F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to h2F
                paths.hamiltonGFtoHamilton2F();

            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to h2F
                paths.johnson1FtoHamilton2F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to h2F
                paths.hamilton1FtoHamilton2F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to h2F
                paths.nicolls1FtoHamilton2F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                //this is the same as going from j2F to h2F
                paths.johnson2FtoHamilton2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.hamilton2FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n2F to h2F
                paths.nicolls2FtoHamilton2F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.hamilton2FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.hamilton2FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.hamilton2FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromNSecond(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to n2F
                paths.johnsonGFtoNicolls2F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to n2F
                paths.nicollsGFtoNicolls2F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to n2F
                paths.hamiltonGFtoNicolls2F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to n2F
                paths.johnson1FtoNicolls2F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to n2F
                paths.hamilton1FtoNicolls2F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to n2F
                paths.nicolls1FtoNicolls2F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                //this is the same as going from j2F to n2F
                paths.johnson2FtoNicolls2F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                paths.nicolls2FtoHamilton2F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                paths.nicolls2FtoNicolls2F();

            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.nicolls2FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.nicolls2FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.nicolls2FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromJThird(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)) {
                //this is the same as going from jGF to j3F
                paths.johnsonGFtoJohnson3F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to j3F
                paths.hamiltonGFtoJohnson3F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to j3F
                paths.nicollsGFtoJohnson3F();

            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to j3F
                paths.johnson1FtoJohnson3F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to j3F
                paths.hamilton1FtoJohnson3F();

            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to j3F
                paths.nicolls1FtoJohnson3F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                //this is the same as going from j2F to j3F
                paths.johnson2FtoJohnson3F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h2F to j3F
                paths.hamilton2FtoJohnson3F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n2F to j3F
                paths.nicolls2FtoJohnson3F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                paths.johnson3FtoJohnson3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.johnson3FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.johnson3FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromHThird(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to h3F
                paths.johnsonGFtoHamilton3F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to h3F
                paths.hamiltonGFtoHamilton3F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to h3F
                paths.nicollsGFtoHamilton3F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to h3F
                paths.johnson1FtoHamilton3F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to h3F
                paths.hamilton1FtoHamilton3F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to h3F
                paths.nicolls1FtoHamilton3F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                //this is the same as going from j2F to h3F
                paths.johnson2FtoHamilton3F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h2F to h3F
                paths.hamilton2FtoHamilton3F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n2F to h3F
                paths.nicolls2FtoHamilton3F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                //this is the same as going from j3F to h3F
                paths.johnson3FtoHamilton3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.hamilton3FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n3F to h3F
                paths.nicolls3FtoHamilton3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    private void fromNThird(PathDraw paths){
        //going to GF
        if(spinner5.equals(groundFloor)){
            //going to jGF
            if(spinner4.equals(johnson)){
                //this is the same as going from jGF to n3F
                paths.johnsonGFtoNicolls3F();
            }
            //going to hGF
            if(spinner4.equals(hamilton)){
                //this is the same as going from hGF to n3F
                paths.hamiltonGFtoNicolls3F();
            }
            //going to nGF
            if(spinner4.equals(nicolls)){
                //this is the same as going from nGF to n3F
                paths.nicollsGFtoNicolls3F();
            }
        }
        //going to 1F
        if(spinner5.equals(firstFloor)){
            //going to j1F
            if(spinner4.equals(johnson)){
                //this is the same as going from j1F to n3F
                paths.johnson1FtoNicolls3F();
            }
            //going to h1F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h1F to n3F
                paths.hamilton1FtoNicolls3F();
            }
            //going to n1F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n1F to n3F
                paths.nicolls1FtoNicolls3F();
            }
        }
        //going to 2F
        if(spinner5.equals(secondFloor)){
            //going to j2F
            if(spinner4.equals(johnson)){
                //this is the same as going from j2F to n3F
                paths.johnson2FtoNicolls3F();
            }
            //going to h2F
            if(spinner4.equals(hamilton)){
                //this is the same as going from h2F to n3F
                paths.hamilton2FtoNicolls3F();
            }
            //going to n2F
            if(spinner4.equals(nicolls)){
                //this is the same as going from n2F to n3F
                paths.nicolls2FtoNicolls3F();
            }
        }
        //going to 3F
        if(spinner5.equals(thirdFloor)){
            //going to j3F
            if(spinner4.equals(johnson)){
                //this is the same as going from j3F to n3F
                paths.johnson3FtoNicolls3F();
            }
            //going to h3F
            if(spinner4.equals(hamilton)){
                paths.nicolls3FtoHamilton3F();
            }
            //going to n3F
            if(spinner4.equals(nicolls)){
                paths.nicolls3FtoNicolls3F();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    /*This Function is used to call the Functions above*/
    private void pathing(FloorDraw F, StairwellDraw S, int pos) {
        String fRm = spinner3.substring(2,5);
        String tRm = spinner6.substring(2,5);
        int fromRoom = Integer.valueOf(fRm);
        int toRoom = Integer.valueOf(tRm);

        PathDraw paths = new PathDraw(F, S, pos, spinner1, spinner2, fromRoom, toRoom);

        //going from GF
        if(spinner2.equals(groundFloor)){
            //going from J
            if(spinner1.equals(johnson)){
                fromJGround(paths);
            }
            //going from H
            if(spinner1.equals(hamilton)){
                fromHGround(paths);
            }
            //going from N
            if(spinner1.equals(nicolls)){
                fromNGround(paths);
            }
        }
        //going from 1F
        if(spinner2.equals(firstFloor)){
            //going from J
            if(spinner1.equals(johnson)){
                fromJFirst(paths);
            }
            //going from H
            if(spinner1.equals(hamilton)){
                fromHFirst(paths);
            }
            //going from N
            if(spinner1.equals(nicolls)){
                fromNFirst(paths);
            }
        }
        //going from 2F
        if(spinner2.equals(secondFloor)){
            //going from J
            if(spinner1.equals(johnson)){
                fromJSecond(paths);
            }
            //going from H
            if(spinner1.equals(hamilton)){
                fromHSecond(paths);
            }
            //going from N
            if(spinner1.equals(nicolls)){
                fromNSecond(paths);
            }
        }
        //going from 3F
        if(spinner2.equals(thirdFloor)){
            //going from J
            if(spinner1.equals(johnson)){
                fromJThird(paths);
            }
            //going from H
            if(spinner1.equals(hamilton)){
                fromHThird(paths);
            }
            //going from N
            if(spinner1.equals(nicolls)){
                fromNThird(paths);
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    /*This function puts the images on the screen and is used to call all the proper functions
    * to paint the users selected rooms,path, and stairs. It also is used to set up the image
    * swiper to alot switching between images.*/
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //This is where the view is set up for the images to display
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        TouchImageView imageView = (TouchImageView) item_view.findViewById(R.id.image_view);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);

        // Bitmap to draw on the canvas
        Bitmap bitmap = BitmapFactory.decodeResource(
                imageView.getResources(),
                R.drawable.bubasement
        );

        //change the bitmap depending on which position on the screen you are at
        if(position == 0){
            bitmap = BitmapFactory.decodeResource(
                    imageView.getResources(),
                    R.drawable.bubasement
            );
        }
        if(position == 1){
            bitmap = BitmapFactory.decodeResource(
                    imageView.getResources(),
                    R.drawable.bufloor1
            );
        }
        if(position == 2){
            bitmap = BitmapFactory.decodeResource(
                    imageView.getResources(),
                    R.drawable.bufloor2
            );
        }
        if(position == 3){
            bitmap = BitmapFactory.decodeResource(
                    imageView.getResources(),
                    R.drawable.bufloor3
            );
        }

        // Define an offset value between canvas and bitmap
        int offset = 0;

        // Initialize a new Bitmap to hold the source bitmap
        Bitmap dstBitmap = Bitmap.createBitmap(
                bitmap.getWidth(), // Width
                bitmap.getHeight(), // Height
                Bitmap.Config.ARGB_8888 // Config
        );

        // Initialize a new Canvas instance
        Canvas canvas = new Canvas(dstBitmap);

        // Draw a solid color on the canvas as background
        canvas.drawColor(Color.LTGRAY);

        // Initialize a new Paint instance to draw the line
        Paint paint = new Paint();
        // Line color
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        // Line width in pixels
        paint.setStrokeWidth(8);
        paint.setAntiAlias(true);

        //Finally, Draw the source bitmap on the canvas
        canvas.drawBitmap(
                bitmap, // Bitmap
                offset, // Left
                offset, // Top
                null // Paint
        );

        //convert dp to pix
        Resources r = ctx.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16, r.getDisplayMetrics());

        //Create FloorDraw, StairwellDraw, and RoomDraw
        FloorDraw pDraw = new FloorDraw(canvas, paint, px);
        StairwellDraw stairs = new StairwellDraw (paint, canvas, px);
        RoomDraw Rooms = new RoomDraw(paint,canvas,px);

        //If any special named room is selected change the information
        if(spinner3.equals("ITS")){
            spinner1 = "Johnson";
            spinner2 = "First Floor";
            spinner3 = "J-107";
        }
        if(spinner6.equals("ITS")){
            spinner4 = "Johnson";
            spinner5 = "First Floor";
            spinner6 = "J-107";
        }
        if(spinner3.equals("BWH")){
            spinner1 = "Johnson";
            spinner2 = "Second Floor";
            spinner3 = "J-200";
        }
        if(spinner6.equals("BWH")){
            spinner4 = "Johnson";
            spinner5 = "Second Floor";
            spinner6 = "J-200";
        }
        if(spinner3.equals("Bus Stop")){
            spinner1 = "Hamilton";
            spinner2 = "First Floor";
            spinner3 = "H-126";
        }
        if(spinner6.equals("Bus Stop")){
            spinner4 = "Hamilton";
            spinner5 = "First Floor";
            spinner6 = "H-126";
        }

        //Change the color for the starting room and call RoomDraw
        paint.setColor(Color.GREEN);
        Rooms.changePaint(paint);
        Rooms.roomSelected(spinner3, position);
        paint.setColor(Color.RED);
        Rooms.changePaint(paint);
        Rooms.roomSelected(spinner6, position);

        //pass pathing the path, stairs, and screen position to draw them
        pathing(pDraw, stairs, position);

        // Display the newly created bitmap on app interface
        imageView.setImageBitmap(dstBitmap);

        //Change the text
        if(position == 0) {
            textView.setText("Basement");
        }
        if(position == 1) {
            textView.setText("First Floor");
        }
        if(position == 2) {
            textView.setText("Second Floor");
        }
        if(position == 3) {
            textView.setText("Third Floor");
        }

        //add the view we have created to the container
        container.addView(item_view);

        return item_view;
    }
    /*--------------------------------------------------------------------------------------------*/
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}
