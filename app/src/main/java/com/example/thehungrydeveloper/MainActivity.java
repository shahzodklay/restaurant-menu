package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    CardView dessertsCard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard =findViewById(R.id.card_view_desserts);






startersCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

        startActivity(startersActivityIntent);
    }
});


mainsCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent coursesActiviy = new Intent(MainActivity.this, CoursesActivity.class);

       startActivity(coursesActiviy);
    }
});

dessertsCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);

        startActivity(dessertsActivityIntent);

    }
});

        TextView emailTextView = findViewById(R.id.text_view_email_address);
emailTextView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent LaunchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
        LaunchEmailAppIntent.setData(Uri.parse("mailto:shahzodklay@gmail.com"));
        startActivity(LaunchEmailAppIntent);
    }
});
    }
}