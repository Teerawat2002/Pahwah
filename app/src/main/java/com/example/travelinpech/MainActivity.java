package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MainPage(View view){
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Intent intent = new Intent(MainActivity.this,Main.class);
        startActivity(intent);
    }
    public void CallPage(View view){
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Intent intent = new Intent(MainActivity.this,CallMe.class);
        startActivity(intent);
    }
}