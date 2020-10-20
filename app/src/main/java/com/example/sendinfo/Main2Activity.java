package com.example.sendinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView text1;
    Button button;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initialize();
        al();
    }

    void initialize(){
        text1 = findViewById(R.id.textView3);
        button = findViewById(R.id.button2);
        name = "";
    }

    public void al(){
        Bundle intent = getIntent().getExtras();
        name = intent.getString("name");
        text1.setText("Girilen İsim : " + name);
    }

    public void geri(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
