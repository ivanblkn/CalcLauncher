package com.example.calclauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_Launch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent calcIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("calculator://launch"));

                startActivity(Intent.createChooser(calcIntent, null));
            }
        });
    }
}