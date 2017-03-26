package com.example.android.newbumap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class CustomSwipeAdapter extends PagerAdapter{

    private int[] image_resources = {R.drawable.bubasement,R.drawable.bufloor1,R.drawable.bufloor2,R.drawable.bufloor3};
    private Context ctx;
    private LayoutInflater layoutInflater;
    private String spinner1, spinner2, spinner4, spinner5;

    public CustomSwipeAdapter(Context ctx, String spn1, String spn2, String spn4, String spn5){
        this.ctx = ctx;
        spinner1 = spn1;
        spinner2 = spn2;
        spinner4 = spn4;
        spinner5 = spn5;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout) object);
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
                bitmap.getWidth() + offset * 2, // Width
                bitmap.getHeight() + offset * 2, // Height
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

        //Draw a red line on nicolls ground floor
        if((position == 0 && spinner1.equals("Nicolls") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Nicolls") && spinner5.equals("Ground Floor"))){
            nicollsGroundFloor(canvas,paint);
        }
        //Draw a red line on hamilton ground floor
        if((position == 0 && spinner1.equals("Hamilton") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Hamilton") && spinner5.equals("Ground Floor"))){
            hamiltonGroundFloor(canvas,paint);
        }
        //Draw a red line on johnson ground floor
        if((position == 0 && spinner1.equals("Johnson") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Johnson") && spinner5.equals("Ground Floor"))){
            johnsonGroundFloor(canvas,paint);
        }
        //Draw a red line on nicolls first floor
        if((position == 1 && spinner1.equals("Nicolls") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Nicolls") && spinner5.equals("First Floor"))){
            nicollsFirstFloor(canvas,paint);
        }
        //Draw a red line on hamilton first floor
        if((position == 1 && spinner1.equals("Hamilton") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Hamilton") && spinner5.equals("First Floor"))){
            hamiltonFirstFloor(canvas,paint);
        }
        //Draw a red line on  johnson floor
        if((position == 1 && spinner1.equals("Johnson") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Johnson") && spinner5.equals("First Floor"))){
            johnsonFirstFloor(canvas,paint);
        }
        //Draw a red line on nicolls second floor
        if((position == 2 && spinner1.equals("Nicolls") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Nicolls") && spinner5.equals("Second Floor"))){
            nicollsSecondFloor(canvas,paint);
        }
        //Draw a red line on hamilton second floor
        if((position == 2 && spinner1.equals("Hamilton") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Hamilton") && spinner5.equals("Second Floor"))){
            hamiltonSecondFloor(canvas,paint);
        }
        //Draw a red line on johnson second floor
        if((position == 2 && spinner1.equals("Johnson") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Johnson") && spinner5.equals("Second Floor"))){
            johnsonSecondFloor(canvas,paint);
        }
        //Draw a red line on nicolls third floor
        if((position == 3 && spinner1.equals("Nicolls") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Nicolls") && spinner5.equals("Third Floor"))){
            nicollsThirdFloor(canvas,paint);
        }
        //Draw a red line on hamilton third floor
        if((position == 3 && spinner1.equals("Hamilton") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Hamilton") && spinner5.equals("Third Floor"))){
            hamiltonThirdFloor(canvas,paint);
        }
        //Draw a red line on johnson third floor
        if((position == 3 && spinner1.equals("Johnson") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Johnson") && spinner5.equals("Third Floor"))){
            johnsonThirdFloor(canvas,paint);
        }

        StairwellDraw stairs = new StairwellDraw (paint, canvas);

        if(position == 0) {
            stairs.BJM();
        }
        if(position == 1) {
            stairs.FFHM();
        }
        if(position == 2) {
            stairs.SFNB();
        }
        if(position == 3) {
            stairs.TFJT();
        }

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

    public void nicollsGroundFloor(Canvas c, Paint p){
        //big line going across nicolls ground floor
        c.drawLine(
                530, // startX
                860, // startY
                530, // stopX
                2100, // stopY
                p // Paint
        );
        //small angle'd line
        c.drawLine(
                530, // startX
                2100, // startY
                740, // stopX
                2175, // stopY
                p // Paint
        );
    }
    public void hamiltonGroundFloor(Canvas c, Paint p){
        //line going across hamilton ground floor
        c.drawLine(
                740, // startX
                2175, // startY
                2675, // stopX
                2175, // stopY
                p // Paint
        );
    }
    public void johnsonGroundFloor(Canvas c, Paint p){
        //line going across johnson ground floor
        c.drawLine(
                2675, // startX
                520, // startY
                2675, // stopX
                3250, // stopY
                p // Paint
        );
    }
    public void nicollsFirstFloor(Canvas c, Paint p){
        //line going across nicolls first floor
        c.drawLine(
                400, // startX
                860, // startY
                400, // stopX
                2120, // stopY
                p // Paint
        );
        //line connecting to hamilton and going to busstop
        c.drawLine(
                400, // startX
                2120, // startY
                880, // stopX
                2120, // stopY
                p // Paint
        );
    }
    public void hamiltonFirstFloor(Canvas c, Paint p){
        //most bottom line of hamilton first floor
        c.drawLine(
                1665, // startX
                2210, // startY
                1950, // stopX
                2210, // stopY
                p // Paint
        );
        //line connecting hamilton to johnson
        c.drawLine(
                1950, // startX
                2180, // startY
                2565, // stopX
                2180, // stopY
                p // Paint
        );
        //small line connecting the two lines above
        c.drawLine(
                1950, // startX
                2210, // startY
                1950, // stopX
                2180, // stopY
                p // Paint
        );
        //line going in front of the hamilton lab on first floor
        c.drawLine(
                1665, // startX
                2065, // startY
                1665, // stopX
                2210, // stopY
                p // Paint
        );
        //line going in front of nelly's old office
        c.drawLine(
                1450, // startX
                2065, // startY
                1665, // stopX
                2065, // stopY
                p // Paint
        );
    }
    public void johnsonFirstFloor(Canvas c, Paint p){
        //big line going across johnson first floor
        c.drawLine(
                2565, // startX
                430, // startY
                2565, // stopX
                3210, // stopY
                p // Paint
        );
        //little line connected to the big line
        c.drawLine(
                2480, // startX
                3210, // startY
                2565, // stopX
                3210, // stopY
                p // Paint
        );
        //little vertical line
        c.drawLine(
                2480, // startX
                3210, // startY
                2480, // stopX
                3270, // stopY
                p // Paint
        );
        //medium line at the bottom of johnson first floor
        c.drawLine(
                2480, // startX
                3270, // startY
                1920, // stopX
                3270, // stopY
                p // Paint
        );
    }
    public void nicollsSecondFloor(Canvas c, Paint p){
        //big line from top to bottom
        c.drawLine(
                325, // startX
                840, // startY
                325, // stopX
                2080, // stopY
                p // Paint
        );
        //smaller line under the big line
        c.drawLine(
                200, // startX
                2080, // startY
                490, // stopX
                2080, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton
        c.drawLine(
                490, // startX
                2080, // startY
                490, // stopX
                2250, // stopY
                p // Paint
        );
        //most bottom line in norton second floor
        c.drawLine(
                200, // startX
                2250, // startY
                490, // stopX
                2250, // stopY
                p // Paint
        );
        //line heading to hamilton second floor
        c.drawLine(
                490, // startX
                2095, // startY
                625, // stopX
                2095, // stopY
                p // Paint
        );
    }
    public void hamiltonSecondFloor(Canvas c, Paint p){
        //big line going across main section
        c.drawLine(
                625, // startX
                2095, // startY
                2090, // stopX
                2095, // stopY
                p // Paint
        );
        //angled line
        c.drawLine(
                2090, // startX
                2095, // startY
                2150, // stopX
                2180, // stopY
                p // Paint
        );
        //small line connecting to johnson
        c.drawLine(
                2150, // startX
                2180, // startY
                2580, // stopX
                2180, // stopY
                p // Paint
        );
    }
    public void johnsonSecondFloor(Canvas c, Paint p){
        //line going across johnson second floor
        c.drawLine(
                2580, // startX
                480, // startY
                2580, // stopX
                3200, // stopY
                p // Paint
        );
    }
    public void nicollsThirdFloor(Canvas c, Paint p){
        //big line from top to bottom
        c.drawLine(
                335, // startX
                820, // startY
                335, // stopX
                2070, // stopY
                p // Paint
        );
        //smaller line under the big line
        c.drawLine(
                210, // startX
                2070, // startY
                500, // stopX
                2070, // stopY
                p // Paint
        );
        //vertical line all the way on the left
        c.drawLine(
                210, // startX
                2070, // startY
                210, // stopX
                2230, // stopY
                p // Paint
        );
        //vertical line on the right near hamilton third floor
        c.drawLine(
                500, // startX
                2070, // startY
                500, // stopX
                2230, // stopY
                p // Paint
        );
        //most bottom line in norton third floor
        c.drawLine(
                210, // startX
                2230, // startY
                500, // stopX
                2230, // stopY
                p // Paint
        );
        //line heading to hamilton third floor
        c.drawLine(
                500, // startX
                2075, // startY
                625, // stopX
                2075, // stopY
                p // Paint
        );
    }
    public void hamiltonThirdFloor(Canvas c, Paint p){
        //line connecting to nicolls third floor
        c.drawLine(
                625, // startX
                2075, // startY
                980, // stopX
                2075, // stopY
                p // Paint
        );
        //angled line near nicolls third floor
        c.drawLine(
                980, // startX
                2075, // startY
                1030, // stopX
                1910, // stopY
                p // Paint
        );
        //big line going across most of hamilton third floor
        c.drawLine(
                1030, // startX
                1910, // startY
                2000, // stopX
                1910, // stopY
                p // Paint
        );
        //little angled line at the end of hamilton third floor
        c.drawLine(
                2000, // startX
                1910, // startY
                2020, // stopX
                1960, // stopY
                p // Paint
        );

    }
    public void johnsonThirdFloor(Canvas c, Paint p){
        //top big line going across johnson third floor
        c.drawLine(
                2580, // startX
                480, // startY
                2580, // stopX
                1920, // stopY
                p // Paint
        );
        //bottom big line going across johnson third floor
        c.drawLine(
                2600, // startX
                1920, // startY
                2600, // stopX
                3200, // stopY
                p // Paint
        );
        //little line connecting the two big lines
        c.drawLine(
                2580, // startX
                1920, // startY
                2600, // stopX
                1920, // stopY
                p // Paint
        );
    }
}
