package com.example.travelinpech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DataBase db;
    private EditText editTextNewCategory;
    private Button buttonCategory;
    private Spinner spinnerCategories;
    private List<String> listCategories = new ArrayList<>();
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect database
        db = new DataBase(this);
        if(db == null)
            db = new DataBase(this);
        editTextNewCategory = (EditText) findViewById(R.id.edtName);
        spinnerCategories = (Spinner) findViewById(R.id.spinner_category);
        buttonCategory = (Button) findViewById(R.id.btnOK);
        buttonCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newCategory = editTextNewCategory.getText().toString();
                if(newCategory.equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter your nickname", Toast.LENGTH_SHORT).show();
                }else {
                    db.addCategory(new Category(newCategory ));
                    prepareData();
                    editTextNewCategory.setText("");
                    Toast.makeText(MainActivity.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Main.class);
                    startActivity(intent);
                }
            }
        });
        prepareData();

    }

    public void prepareData(){
        listCategories = db.getAllCategories();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, android.R.id.text1, listCategories);
        spinnerCategories.setAdapter(adapter);
    }


    public void CallPage(View view){
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Intent intent = new Intent(MainActivity.this,CallMe.class);
        startActivity(intent);
    }
}