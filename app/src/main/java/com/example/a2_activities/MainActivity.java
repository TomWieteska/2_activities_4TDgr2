package com.example.a2_activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRun;
    String tag = "Zdarzenie: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"onCreate(main)");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            btnRun = findViewById(R.id.btnRun);
            btnRun.setOnClickListener(this);

            return insets;
        });
    }

    @Override
    public void onClick(View view) {

        Intent i = new Intent(this, MyNewActivity.class);
        startActivity(i);

    }
    @Override
    public void onStart(){

        super.onStart();
        Log.d(tag,"onStart(main)");
    }
    @Override
    public void onRestart(){

        super.onRestart();
        Log.d(tag,"onRestart(main)");
    }
    @Override
    public  void onResume(){

        super.onResume();
        Log.d(tag,"onResume(main)");

    }
    @Override
    public  void onPause(){

        super.onPause();
        Log.d(tag,"onPause(main)");
    }
    @Override
    public void onStop(){

        super.onStop();
        Log.d(tag,"onStop(main)");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy(main)");
    }
}