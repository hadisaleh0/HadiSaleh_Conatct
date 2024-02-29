package com.example.hadisaleh_conatct;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class NavBarInitializer {

    public static void initializeNavBar(ImageButton listImageButton,
                                        ImageButton mapImageButton,
                                        ImageButton settingImageButton,
                                        Context context
                                        ){
        listImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactListActivity.class);
                context.startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }
        });

        mapImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactMapActivity.class);
                context.startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }
        });

        settingImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactSettingActivity.class);
                context.startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }
        });
    }

}
