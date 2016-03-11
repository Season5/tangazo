package com.scurrae.chris.tangazo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by chris on 3/8/16.
 */
public class Intro extends AppIntro{

    // Please DO NOT override onCreate. Use init.
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(SimpleSlide.newInstance(R.layout.slide_1));
        addSlide(SimpleSlide.newInstance(R.layout.slide_2));
        addSlide(SimpleSlide.newInstance(R.layout.slide_3));
        addSlide(SimpleSlide.newInstance(R.layout.slide_4));

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
//        addSlide(AppIntroFragment.newInstance(R.string.app_name, R.string.description,
//                R.drawable.pb1, R.color.Purple));

        showStatusBar(true);

        // OPTIONAL METHODS
        // Override bar/separator color.
//        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#ffffff"));

        // Hide Skip/Done button.
        showSkipButton(true);
//        setProgressButtonEnabled(true);


        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
//        setVibrate(true);
//        setVibrateIntensity(30);
    }
    public void Skip(){
        startActivity(new Intent(getBaseContext(), Main.class));
        onStop();
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Skip();

    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Skip();
    }

    @Override
    public void onSlideChanged() {
        // Do something when the slide changes.
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}

