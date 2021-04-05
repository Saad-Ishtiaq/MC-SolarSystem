package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mercury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercury);
    }


    public void Animation(View view) {

        ImageView imageView = findViewById(R.id.imageView);
        imageView.animate().rotation(360).setDuration(5000).translationYBy(-500).setDuration(4000).scaleX(0.7f).scaleY(0.7f).setDuration(4000);
        TextView textView = findViewById(R.id.textView);
        textView.animate().translationYBy(-600).setDuration(4000);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("     Mercury ki baatei");

        textView2.animate().translationYBy(-630).setDuration(4000);
    }

    public void NewIntent(View view) {
        Intent intent= new Intent( Mercury.this,Venus.class);
        startActivity(intent);

    }
}