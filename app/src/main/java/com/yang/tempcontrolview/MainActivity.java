package com.yang.tempcontrolview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TempControlView tempControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempControl = (TempControlView) findViewById(R.id.temp_control);
        tempControl.setTemp(15, 30, 15);

        tempControl.setOnTempChangeListener(new TempControlView.OnTempChangeListener() {
            @Override
            public void change(int temp) {
                Toast.makeText(MainActivity.this, temp + "°", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
