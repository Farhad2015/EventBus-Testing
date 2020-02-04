package com.code_example.eventbustesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.code_example.eventbustesting.utils.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonTow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        buttonTow = findViewById(R.id.button2);
        buttonTow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                EventBus.getDefault().postSticky(new MessageEvent("Data from third Activity"));
                finish();
                break;
        }
    }
}
