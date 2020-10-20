package com.example.sendinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String name;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        name = "";
    }

    public void gec(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        name = editText.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
