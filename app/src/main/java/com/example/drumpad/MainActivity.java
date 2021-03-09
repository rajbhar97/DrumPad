package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1, sound3, sound2,sound4,sound5,sound6,sound7,sound8,sound9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2,AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.sound1,1);
        sound2 = sp.load(getApplicationContext(),R.raw.sound2,1);
        sound3 = sp.load(getApplicationContext(),R.raw.sound3,1);
        sound4 = sp.load(getApplicationContext(),R.raw.sound4,1);
        sound5 = sp.load(getApplicationContext(),R.raw.sound5,1);
        sound6 = sp.load(getApplicationContext(),R.raw.sound6,1);
        sound7 = sp.load(getApplicationContext(),R.raw.sound7,1);
        sound8 = sp.load(getApplicationContext(),R.raw.sound8,1);
        sound9 = sp.load(getApplicationContext(),R.raw.sound9,1);
    }

    public void playsound1 (View view) {
        sp.play(sound1,1.0f,1.0f,1,1,10f);
    }

    public void playsound2(View view) {
        sp.play(sound2,1.0f,1.0f,1,1,10f);
    }

    public void playsound3(View view) {
        sp.play(sound3,1.0f,1.0f,1,1,10f);
    }

    public void playsound4(View view) {
        sp.play(sound4,1.0f,1.0f,1,1,10f);
    }

    public void playsound5(View view) {
        sp.play(sound5,1.0f,1.0f,1,1,10f);
    }

    public void playsound6(View view) {
        sp.play(sound6,1.0f,1.0f,1,1,10f);
    }

    public void playsound7(View view) {
        sp.play(sound7,1.0f,1.0f,1,1,10f);
    }

    public void playsound8(View view) {
        sp.play(sound8,1.0f,1.0f,1,1,10f);
    }

    public void playsound9(View view) {
        sp.play(sound9,1.0f,1.0f,1,1,10f);
    }
}