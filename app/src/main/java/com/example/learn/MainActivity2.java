package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    private TextView name,phone;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        name=findViewById(R.id.show_name);
        phone=findViewById(R.id.show_phone);
        back=findViewById(R.id.back);
        String username=getIntent().getStringExtra("keyName");
        String userphone=getIntent().getStringExtra("keyPhone");
        name.setText(username);
        phone.setText(userphone);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    private void openMainActivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}