package com.example.cuixu.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        btn = (Button) findViewById(R.id.act1_btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"you click button 1",Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                Intent intent = new Intent("com.example.cuixu.activitytest.ACTION_START");
                startActivity(intent);
            }
        });
    }

    private void clickListener(View v){

    }
}
