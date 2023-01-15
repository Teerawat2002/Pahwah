package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pohkhun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pohkhun);
    }
    public void BackPage(View view){
        Button btnBack = (Button) findViewById(R.id.btnBACK);
        Intent intent = new Intent(Pohkhun.this,Mahathat.class);
        startActivity(intent);
    }
    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(Pohkhun.this,Main.class);
        startActivity(intent);
    }
    public void NextPage(View view){
        Button btnNEXT = (Button) findViewById(R.id.btnNEXT);
        Intent intent = new Intent(Pohkhun.this,Wattana.class);
        startActivity(intent);
    }
}