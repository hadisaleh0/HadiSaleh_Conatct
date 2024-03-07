package com.example.hadisaleh_conatct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import com.example.hadisaleh_conatct.DateDialogPicker;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ToggleButton;
import android.text.format.DateFormat;
import java.text.BreakIterator;
import java.util.Calendar;

public  class MainActivity extends AppCompatActivity  {

    ImageButton listImageButton, mapImageButton, settingsImageButton,imageButtonSave;
    EditText editName,editAddress,editCity,editZipCode,editState,editPhone,editCell,editEmail;
    Button buttonChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayouts();
        NavBarInitializer.initializeNavBar(listImageButton,mapImageButton,settingsImageButton,this);
        initToggleButton();
        //setForEditing(false);


        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DateDialogPicker dialog = new DateDialogPicker();
                dialog.show(fm,"DatePicker");

            }
        });

    }

    void didFinishDatePickerDialog(Calendar selectedTime){
      

    }
//    public void OnCreate

    private void initLayouts() {
        listImageButton = findViewById(R.id.imageButtonList);
        mapImageButton = findViewById(R.id.imageButtonMap);
        settingsImageButton = findViewById(R.id.imageButtonSetting);
        buttonChange = findViewById(R.id.btnBirthday);
    }

    private void initToggleButton(){
        final ToggleButton editToggle = (ToggleButton)findViewById(R.id.toggleButtonEdit);
        editToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setForEditing(editToggle.isChecked());
            }
        });
    }

    private void setForEditing(boolean enabled){
        editName.setEnabled(enabled);
        editAddress.setEnabled(enabled);
        editCity.setEnabled(enabled);
        editZipCode.setEnabled(enabled);
        editState.setEnabled(enabled);
        editPhone.setEnabled(enabled);
        editCell.setEnabled(enabled);
        editEmail.setEnabled(enabled);
        imageButtonSave.setEnabled(enabled);
        buttonChange.setEnabled(enabled);
        if (enabled){
            editName.requestFocus();
        }

    }
}