package com.example.android.newbumap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.building_spinner);
        spinner2 = (Spinner) findViewById(R.id.floor_spinner);
        spinner3 = (Spinner) findViewById(R.id.room_spinner);
        spinner4 = (Spinner) findViewById(R.id.building_spinner2);
        spinner5 = (Spinner) findViewById(R.id.floor_spinner2);
        spinner6 = (Spinner) findViewById(R.id.room_spinner2);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.building_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.floor_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(this, R.array.building_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(this, R.array.floor_array, android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner4.setAdapter(adapter4);
        spinner5.setAdapter(adapter5);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);

    }

    public String getSpinnerString(int i){
        if(i == 1){
            return spinner1.getSelectedItem().toString();
        }
        if(i == 2){
            return spinner2.getSelectedItem().toString();
        }
        if(i == 4){
            return spinner4.getSelectedItem().toString();
        }
        if(i == 5){
            return spinner5.getSelectedItem().toString();
        }

        return "error";
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //These are the settings for the "from" spinners
        if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.h_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterG);
        }
        if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.h_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterF);
        }
        if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.h_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterS);
        }
        if (spinner1.getSelectedItem().equals("Hamilton") && spinner2.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.h_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterT);
        }
        if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.j_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterG);
        }
        if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.j_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterF);
        }
        if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.j_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterS);
        }
        if (spinner1.getSelectedItem().equals("Johnson") && spinner2.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.j_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterT);
        }
        if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.n_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterG);
        }
        if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.n_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterF);
        }
        if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.n_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterS);
        }
        if (spinner1.getSelectedItem().equals("Nicolls") && spinner2.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.n_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterT);
        }
        if (spinner1.getSelectedItem().equals("Other")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.other_array, android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapterT);
        }

        //These are the settings for the "to" spinners
        if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.h_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterG);
        }
        if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.h_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterF);
        }
        if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.h_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterS);
        }
        if (spinner4.getSelectedItem().equals("Hamilton") && spinner5.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.h_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterT);
        }
        if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.j_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterG);
        }
        if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.j_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterF);
        }
        if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.j_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterS);
        }
        if (spinner4.getSelectedItem().equals("Johnson") && spinner5.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.j_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterT);
        }
        if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Ground Floor")){
            ArrayAdapter adapterG = ArrayAdapter.createFromResource(this,
                    R.array.n_ground_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterG);
        }
        if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("First Floor")){
            ArrayAdapter adapterF = ArrayAdapter.createFromResource(this,
                    R.array.n_first_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterF);
        }
        if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Second Floor")){
            ArrayAdapter adapterS = ArrayAdapter.createFromResource(this,
                    R.array.n_second_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterS);
        }
        if (spinner4.getSelectedItem().equals("Nicolls") && spinner5.getSelectedItem().equals("Third Floor")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.n_third_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterT);
        }
        if (spinner4.getSelectedItem().equals("Other")){
            ArrayAdapter adapterT = ArrayAdapter.createFromResource(this,
                    R.array.other_array, android.R.layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(adapterT);

        }

    }

    public void nextPage(View view){

        Button btn = (Button)findViewById(R.id.next_page_button);

        startActivity(new Intent(MainActivity.this, ImageActivity.class));
            }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}
