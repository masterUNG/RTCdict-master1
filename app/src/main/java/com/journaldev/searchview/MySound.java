package com.journaldev.searchview;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by masterUNG on 1/2/2017 AD.
 */

public class MySound {

    //Explicit
    private Context context;
    private int anInt;

    public MySound(Context context, int anInt) {
        this.context = context;
        this.anInt = anInt;
    }

    public void playSound() {

        MediaPlayer mediaPlayer = MediaPlayer.create(context, anInt);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });


    }

}   // Main Class
