package com.example.gamefly;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ResourceBundle;

public class Background {
    int x = 0, y = 0;
    Bitmap background;
    Background (int screenX, int screeY, Resources res){
        background = BitmapFactory.decodeResource(res, R.drawable.ic_launcher_background);
        background = Bitmap.createScaledBitmap(background, screenX, screeY, false);
    }
}
