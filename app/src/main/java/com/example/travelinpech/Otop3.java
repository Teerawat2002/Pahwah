package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Otop3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otop3);
    }
    public void BackPage(View view){
        Button btnBack = (Button) findViewById(R.id.btnBACK);
        Intent intent = new Intent(Otop3.this,Otop2.class);
        startActivity(intent);
    }
    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(Otop3.this,Main.class);
        startActivity(intent);
    }
}