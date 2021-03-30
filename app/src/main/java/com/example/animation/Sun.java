package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Sun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
    }

    public void Animation(View view) {

        ImageView imageView = findViewById(R.id.imageView);
        imageView.animate().rotation(360).setDuration(5000).translationYBy(-500).setDuration(4000).scaleX(0.7f).scaleY(0.7f).setDuration(4000);
        TextView textView = findViewById(R.id.textView);
        textView.animate().translationYBy(-600).setDuration(4000);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("     The Sun is the star at the center of the Solar System.It is a nearly perfect sphere of hot plasma, heated to incandescence by nuclear fusion reactions in its core, radiating the energy mainly as visible light and infrared radiation.It is by far the most important source of energy for life on Earth.");

        textView2.animate().translationYBy(-630).setDuration(4000);
    }

}
