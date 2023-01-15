package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }
    public void PageView(View view){
        Button btnView = (Button) findViewById(R.id.btnTra);
        Intent intent = new Intent(Main.this,Phaputta.class);
        startActivity(intent);
    }

    public void OTPView(View view){
        Button btnView = (Button) findViewById(R.id.btnOTOP);
        Intent intent = new Intent(Main.this,OTOP.class);
        startActivity(intent);
    }

    public void LoginPage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(Main.this,MainActivity.class);
        startActivity(intent);
    }
}