package com.example.hadisaleh_conatct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ContactMapActivity extends AppCompatActivity {

    ImageButton listImageButton, mapImageButton, settingsImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_map);
        initLayouts();

        NavBarInitializer.initializeNavBar(listImageButton,mapImageButton,settingsImageButton,
                ContactMapActivity.this);
    }

    private void initLayouts() {
        listImageButton = findViewById(R.id.imageButtonList);
        mapImageButton = findViewById(R.id.imageButtonMap);
        settingsImageButton = findViewById(R.id.imageButtonSetting);
    }
}