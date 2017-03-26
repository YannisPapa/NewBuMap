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
import android.util.TypedValue;
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

        float bitHeight = bitmap.getHeight();
        float bitWidth = bitmap.getWidth();
        float bitRatio = bitWidth/bitHeight;

        canvas.drawRect(
                300*bitRatio, //x start
                1200*bitRatio, //y start
                500*bitRatio, //x stop
                1300*bitRatio, //y stop
                paint
        );

        PathDraw pDraw = new PathDraw(canvas, paint);

        //Draw a red line on nicolls ground floor
        if((position == 0 && spinner1.equals("Nicolls") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Nicolls") && spinner5.equals("Ground Floor"))){
            pDraw.nicollsGroundFloor();
        }
        //Draw a red line on hamilton ground floor
        if((position == 0 && spinner1.equals("Hamilton") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Hamilton") && spinner5.equals("Ground Floor"))){
            pDraw.hamiltonGroundFloor();
        }
        //Draw a red line on johnson ground floor
        if((position == 0 && spinner1.equals("Johnson") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Johnson") && spinner5.equals("Ground Floor"))){
            pDraw.johnsonGroundFloor();
        }
        //Draw a red line on nicolls first floor
        if((position == 1 && spinner1.equals("Nicolls") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Nicolls") && spinner5.equals("First Floor"))){
            pDraw.nicollsFirstFloor();
        }
        //Draw a red line on hamilton first floor
        if((position == 1 && spinner1.equals("Hamilton") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Hamilton") && spinner5.equals("First Floor"))){
            pDraw.hamiltonFirstFloor();
        }
        //Draw a red line on  johnson floor
        if((position == 1 && spinner1.equals("Johnson") && spinner2.equals("First Floor")) || (position == 1 && spinner4.equals("Johnson") && spinner5.equals("First Floor"))){
            pDraw.johnsonFirstFloor();
        }
        //Draw a red line on nicolls second floor
        if((position == 2 && spinner1.equals("Nicolls") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Nicolls") && spinner5.equals("Second Floor"))){
            pDraw.nicollsSecondFloor();
        }
        //Draw a red line on hamilton second floor
        if((position == 2 && spinner1.equals("Hamilton") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Hamilton") && spinner5.equals("Second Floor"))){
            pDraw.hamiltonSecondFloor();
        }
        //Draw a red line on johnson second floor
        if((position == 2 && spinner1.equals("Johnson") && spinner2.equals("Second Floor")) || (position == 2 && spinner4.equals("Johnson") && spinner5.equals("Second Floor"))){
            pDraw.johnsonSecondFloor();
        }
        //Draw a red line on nicolls third floor
        if((position == 3 && spinner1.equals("Nicolls") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Nicolls") && spinner5.equals("Third Floor"))){
            pDraw.nicollsThirdFloor();
        }
        //Draw a red line on hamilton third floor
        if((position == 3 && spinner1.equals("Hamilton") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Hamilton") && spinner5.equals("Third Floor"))){
            pDraw.hamiltonThirdFloor();
        }
        //Draw a red line on johnson third floor
        if((position == 3 && spinner1.equals("Johnson") && spinner2.equals("Third Floor")) || (position == 3 && spinner4.equals("Johnson") && spinner5.equals("Third Floor"))){
            pDraw.johnsonThirdFloor();
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


}
