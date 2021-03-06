package com.example.android.newbumap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/*The first activity that is created. This is the main page where you select where you want to go
* to and from*/

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set spinner1-6 to the corresponding spinner on the view
        spinner1 = (Spinner) findViewById(R.id.building_spinner);
        spinner2 = (Spinner) findViewById(R.id.floor_spinner);
        spinner3 = (Spinner) findViewById(R.id.room_spinner);
        spinner4 = (Spinner) findViewById(R.id.building_spinner2);
        spinner5 = (Spinner) findViewById(R.id.floor_spinner2);
        spinner6 = (Spinner) findViewById(R.id.room_spinner2);

        //set the proper adapter for each spinner
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.building_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.floor_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(this, R.array.building_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(this, R.array.floor_array, android.R.layout.simple_spinner_dropdown_item);

        //give spinner1,2,4,5 their adapter and activate the listener
        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner4.setAdapter(adapter4);
        spinner5.setAdapter(adapter5);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);

    }

    //This function will be used once a spinner is touched
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //These if's are to ensure we change spinner3 to the appropriate array
        if (parent.equals(spinner1) || parent.equals(spinner2)) {
            //These are the settings for the "from" spinners
            if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.h_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterG);
            }
            if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.h_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterF);
            }
            if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.h_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterS);
            }
            if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.h_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterT);
            }
            if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.j_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterG);
            }
            if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.j_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterF);
            }
            if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.j_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterS);
            }
            if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.j_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterT);
            }
            if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.n_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterG);
            }
            if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.n_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterF);
            }
            if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.n_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterS);
            }
            if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.n_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterT);
            }
            if (spinner1.getSelectedItem().equals("Other")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.other_array, android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapterT);
            }
        }

        //These if's are to ensure we change spinner6 to the appropriate array
        if (parent.equals(spinner4) || parent.equals(spinner5)) {
            //These are the settings for the "to" spinners
            if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.h_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterG);
            }
            if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.h_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterF);
            }
            if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.h_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterS);
            }
            if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.h_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterT);
            }
            if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.j_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterG);
            }
            if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.j_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterF);
            }
            if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.j_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterS);
            }
            if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.j_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterT);
            }
            if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Ground Floor")) {
                ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                        R.array.n_ground_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterG);
            }
            if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("First Floor")) {
                ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                        R.array.n_first_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterF);
            }
            if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Second Floor")) {
                ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                        R.array.n_second_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterS);
            }
            if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Third Floor")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.n_third_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterT);
            }
            if (spinner4.getSelectedItem().equals("Other")) {
                ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                        R.array.other_array, android.R.layout.simple_spinner_dropdown_item);
                spinner6.setAdapter(adapterT);
            }
        }

    }

    //onClick for the button on the main page will call this
    public void nextPage(View view){

        //Make sure you cannot select the same rooms
        if(spinner3.getSelectedItem().equals(spinner6.getSelectedItem())){
            Toast.makeText(this, "Change one of your room choices",
                    Toast.LENGTH_SHORT).show();
        }
        //This is to create and call ImageActivity and pass it the information from the spinners
        else{
            Intent intent = new Intent(MainActivity.this, ImageActivity.class);
            intent.putExtra("spinner1", spinner1.getSelectedItem().toString());
            intent.putExtra("spinner2", spinner2.getSelectedItem().toString());
            intent.putExtra("spinner3", spinner3.getSelectedItem().toString());
            intent.putExtra("spinner4", spinner4.getSelectedItem().toString());
            intent.putExtra("spinner5", spinner5.getSelectedItem().toString());
            intent.putExtra("spinner6", spinner6.getSelectedItem().toString());
            MainActivity.this.startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}
