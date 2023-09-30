package com.amg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bmiImageView, chatImageView;
    TextView bmiTextView, chatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Initialize BMI views
        bmiImageView = findViewById(R.id.bmiImageView);
        bmiTextView = findViewById(R.id.bmiTextView);

        // Initialize chat views
        chatTextView = findViewById(R.id.chatTextView);
        chatImageView = findViewById(R.id.chatImageView);

        // Set click listeners for BMI views
        bmiImageView.setOnClickListener(this);
        bmiTextView.setOnClickListener(this);

        // Set click listeners for chat views
        chatImageView.setOnClickListener(this);
        chatTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Handle click events here based on the view's ID
        if (view.getId() == R.id.bmiTextView || view.getId() ==  R.id.bmiImageView) {
            // Perform an action related to BMI when BMI view is clicked
            Intent x = new Intent(MainMenuActivity.this, BMIActivity.class);
            Toast.makeText(MainMenuActivity.this, "BMICalculator", Toast.LENGTH_SHORT).show();
            startActivity(x);
        } else if (view.getId() == R.id.chatTextView) {
            // Perform an action related to chat when chat view is clicked
            Toast.makeText(this, "Chat Clicked", Toast.LENGTH_SHORT).show();
        } else {
            // Handle other views if needed
        }
    }

}
