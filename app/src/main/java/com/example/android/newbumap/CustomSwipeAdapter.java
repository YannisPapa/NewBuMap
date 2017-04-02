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

    public CustomSwipeAdapter(Context ctx, String spn1, String spn2, String spn3, String spn4, String spn5, String spn6){
        this.ctx = ctx;
        spinner1 = spn1;
        spinner2 = spn2;
        spinner3 = spn3;
        spinner4 = spn4;
        spinner5 = spn5;
        spinner6 = spn6;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout) object);
    }

    private void fromJGround(PathDraw paths){
        //going to nGF
        if(spinner4.equals(nicolls)&&spinner5.equals(groundFloor)){
            paths.johnsonGroundtoNicollsGround();
        }
        //going from/to hGF
        if((spinner1.equals(hamilton)||spinner4.equals(hamilton))&&(spinner2.equals(groundFloor)||spinner5.equals(groundFloor))){
            paths.johnsonGroundtoHamGround();
        }
        //going from/to j1F
        if((spinner1.equals(johnson)||spinner4.equals(johnson))&&(spinner2.equals(firstFloor)||spinner5.equals(firstFloor))){
            paths.johnsonGroundtoJohnsonFF();
        }
        //going from/to h1F
        if((spinner1.equals(hamilton)||spinner4.equals(hamilton))&&(spinner2.equals(firstFloor)||spinner5.equals(firstFloor))){

        }
        //going from/to n1F
        if((spinner1.equals(nicolls)||spinner4.equals(nicolls))&&(spinner2.equals(firstFloor)||spinner5.equals(firstFloor))){

        }
        //going from/to j2F
        if((spinner1.equals(johnson)||spinner4.equals(johnson))&&(spinner2.equals(secondFloor)||spinner5.equals(secondFloor))){

        }
        //going from/to h2F
        if((spinner1.equals(hamilton)||spinner4.equals(hamilton))&&(spinner2.equals(secondFloor)||spinner5.equals(secondFloor))){

        }
        //going from/to n2F
        if((spinner1.equals(nicolls)||spinner4.equals(nicolls))&&(spinner2.equals(secondFloor)||spinner5.equals(secondFloor))){

        }
        //going from/to j3F
        if((spinner1.equals(johnson)||spinner4.equals(johnson))&&(spinner2.equals(thirdFloor)||spinner5.equals(thirdFloor))){

        }
        //going from/to h3F
        if((spinner1.equals(hamilton)||spinner4.equals(hamilton))&&(spinner2.equals(thirdFloor)||spinner5.equals(thirdFloor))){

        }
        //going from/to n3F
        if((spinner1.equals(nicolls)||spinner4.equals(nicolls))&&(spinner2.equals(thirdFloor)||spinner5.equals(thirdFloor))){

        }
    }

    private void fromHGround(PathDraw paths){

    }

    private void fromNGround(PathDraw paths){

    }

    private void fromJFirst(PathDraw paths){

    }

    private void fromHFirst(PathDraw paths){

    }

    private void fromNFirst(PathDraw paths){

    }

    private void fromJSecond(PathDraw paths){

    }

    private void fromHSecond(PathDraw paths){

    }

    private void fromNSecond(PathDraw paths){

    }

    private void fromJThird(PathDraw paths){

    }

    private void fromHThird(PathDraw paths){

    }

    private void fromNThird(PathDraw paths){

    }

    private void pathing(FloorDraw F, StairwellDraw S, int pos) {
        String fRm = spinner3.substring(2,5);
        String tRm = spinner6.substring(2,5);
        int fromRoom = Integer.valueOf(fRm);
        int toRoom = Integer.valueOf(tRm);

        PathDraw paths = new PathDraw(F, S, pos, spinner4, toRoom, spinner1, fromRoom);

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

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
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

        Resources r = ctx.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16, r.getDisplayMetrics());

        FloorDraw pDraw = new FloorDraw(canvas, paint, px);
        StairwellDraw stairs = new StairwellDraw (paint, canvas, px);

        pathing(pDraw, stairs, position);

        // Display the newly created bitmap on app interface
        imageView.setImageBitmap(dstBitmap);

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

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}
