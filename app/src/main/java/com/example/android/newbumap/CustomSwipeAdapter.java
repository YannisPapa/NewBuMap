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

        //Draw a red line on Nicolls ground floor
        if((position == 0 && spinner1.equals("Nicolls") && spinner2.equals("Ground Floor")) || (position == 0 && spinner4.equals("Nicolls") && spinner5.equals("Ground Floor"))) {
            canvas.drawLine(
                    530, // startX
                    860, // startY
                    530, // stopX
                    2100, // stopY
                    paint // Paint
            );
        }

        // Display the newly created bitmap on app interface
        imageView.setImageBitmap(dstBitmap);

        if(position == 0) {
            textView.setText("Basement");
        } else {
            textView.setText("Floor "+position);
        }

        container.addView(item_view);

        return item_view;
    }

    //Stairwell at Basement, Nicolls, Top
    public void stairwellBNT(Canvas c, Paint p) {
        c.drawCircle( //N Top
                890, //x val
                1225, //y val
                100,
                p
        );
    }

    //Stairwell at Basement, Nicolls, Bottom
    public void stairwellBNB(Canvas c, Paint p) {
        c.drawCircle( //N Bottom
                885, //x val
                2720, //y val
                100,
                p
        );
    }

    //Stairwell at Basement, Johnson, Top
    public void stairwellBJT(Canvas c, Paint p) {
        c.drawCircle( //J Top
                3738, //x val
                1040, //y val
                100,
                p
        );
    }

    //Stairwell at Basement, Johnson, Middle
    public void stairwellBJM(Canvas c, Paint p) {
        c.drawCircle( //J Mid
                3730, //x val
                2500, //y val
                100,
                p
        );
    }

    //Stairwell at Basement, Johnson, Bottom
    public void stairwellBJB(Canvas c, Paint p) {
        c.drawCircle( //J Bottom
                3595, //x val
                4450, //y val
                100,
                p
        );
    }

    //Stairwell at First Floor, Nicolls, Top
    public void stairwellFFNT(Canvas c, Paint p) {
        c.drawCircle( //N Top
                700,  //x val
                1175, //y val
                100,
                p
        );
    }

    //Stairwell at First Floor, Nicolls, Bottom
    public void stairwellFFNB(Canvas c, Paint p) {
        c.drawCircle( //N Bottom
                693, //x val
                2690, //y val
                100,
                p
        );
    }

    //Stairwell at First Floor, Hamilton
    public void stairwellFFHM(Canvas c, Paint p) {
        c.drawCircle( //H Mid
                2903, //x val
                2715, //y val
                115,
                p
        );
    }

    //Stairwell at First Floor, Johnson, Top
    public void stairwellFFJT(Canvas c, Paint p) {
        c.drawCircle( //J Top
                3580, //x val
                1005, //y val
                100,
                p
        );
    }

    //Stairwell at First Floor, Johnson, Middle
    public void stairwellFFJM(Canvas c, Paint p) {
        c.drawCircle( //J Mid
                3580, //x val
                2450, //y val
                115,
                p
        );
    }

    //Stairwell at First Floor, Johnson, Bottom
    public void stairwellFFJB(Canvas c, Paint p) {
        c.drawCircle( //J Bottom
                3420, //x val
                4450, //y val
                100,
                p
            );
    }

    //Stairwell at Second Floor, Nicolls, Top
    public void stairwellSFNT(Canvas c, Paint p) {
        c.drawCircle( //N Top
                675,  //x val
                1155, //y val
                100,
                p
        );
    }

    //Stairwell at Second Floor, Nicolls, Bottom
    public void stairwellSFNB(Canvas c, Paint p) {
        c.drawCircle( //N Bottom
                693, //x val
                2675, //y val
                100,
                p
        );
    }

    //Stairwell at Second Floor, Hamilton
    public void stairwellSFHM(Canvas c, Paint p) {
        c.drawCircle( //H Mid
                2930, //x val
                2707, //y val
                115,
                p
        );
    }

    //Stairwell at Second Floor, Johnson, Top
    public void stairwellSFJT(Canvas c, Paint p) {
        c.drawCircle( //J Top
                3610, //x val
                975, //y val
                100,
                p
        );
    }

    //Stairwell at Second Floor, Johnson, Middle
    public void stairwellSFJM(Canvas c, Paint p) {
        c.drawCircle( //J Mid
                3605, //x val
                2450, //y val
                115,
                p
        );
    }

    //Stairwell at Second Floor, Johnson, Bottom
    public void stairwellSFJB(Canvas c, Paint p) {
        c.drawCircle( //J Bottom
                3460, //x val
                4450, //y val
                100,
                p
        );
    }

    //Stairwell at Third Floor, Nicolls, Top
    public void stairwellTFNT(Canvas c, Paint p) {
        c.drawCircle( //N Top
                675,  //x val
                1150, //y val
                100,
                p
        );
    }

    //Stairwell at Third Floor, Nicolls, Bottom
    public void stairwellTFNB(Canvas c, Paint p) {
        c.drawCircle( //N Bottom
                693, //x val
                2665, //y val
                100,
                p
        );
    }

    //Stairwell at Third Floor, Hamilton
    public void stairwellTFHM(Canvas c, Paint p) {
        c.drawCircle( //H Mid
                2875, //x val
                2595, //y val
                75,
                p
        );
    }

    //Stairwell at Third Floor, Johnson, Top
    public void stairwellTFJT(Canvas c, Paint p) {
        c.drawCircle( //J Top
                3610, //x val
                970, //y val
                100,
                p
        );
    }

    //Stairwell at Third Floor, Johnson, Middle
    public void stairwellTFJM(Canvas c, Paint p) {
        c.drawCircle( //J Mid
                3615, //x val
                2438, //y val
                115,
                p
        );
    }

    //Stairwell at Third Floor, Johnson, Bottom
    public void stairwellTFJB(Canvas c, Paint p) {
        c.drawCircle( //J Bottom
                3460, //x val
                4435, //y val
                100,
                p
        );
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
