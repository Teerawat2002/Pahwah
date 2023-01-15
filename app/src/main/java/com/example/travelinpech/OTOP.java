package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otop);
    }

    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(OTOP.this,Main.class);
        startActivity(intent);
    }
    public void NextPage(View view){
        Button btnNEXT = (Button) findViewById(R.id.btnNEXT);
        Intent intent = new Intent(OTOP.this,Otop2.class);
        startActivity(intent);
    }
}