package com.example.yaya.tp4_exo7;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t=(TextView)findViewById(R.id.txtcouleur);
        Button ba=findViewById(R.id.btn1);

        final Spinner sp=(Spinner)findViewById(R.id.spinner);
        List list=new ArrayList();
        list.add("Blue");
        list.add("Jaune");
        list.add("Vert");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spgrp=sp.getSelectedItem().toString();
                if (spgrp=="Blue"){
                    t.setText("");
                    t.setBackgroundColor(Color.BLUE);
                }
                else{
                    if (spgrp=="Jaune"){
                        t.setText("");
                        t.setBackgroundColor(Color.YELLOW);
                    }
                    else{

                        t.setText("");
                        t.setBackgroundColor(Color.GREEN);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }

    public void buonclick(View view) {
        Intent myintent=new Intent(this,Main2Activity.class);
        startActivity(myintent);
    }
}
