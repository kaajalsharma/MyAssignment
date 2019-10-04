package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });

        View headerLayout1 = findViewById(R.id.time1);
        TextView headerText1 = headerLayout1.findViewById(R.id.textView4);
        headerText1.setText(getString(R.string.city1));

        ImageView img1 = headerLayout1.findViewById(R.id.imageView2);
        img1.setImageResource(R.drawable.ic_sydney);

        TextView text1 = headerLayout1.findViewById(R.id.textView3);
        Calendar calendar1 = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm a");
        sdf1.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String myTime1 = sdf1.format(calendar1.getTime());
        text1.setText(myTime1);


        View headerLayout2 = findViewById(R.id.time2);
        TextView headerText2 = headerLayout2.findViewById(R.id.textView4);
        headerText2.setText(getString(R.string.city2));

        ImageView img2 = headerLayout2.findViewById(R.id.imageView2);
        img2.setImageResource(R.drawable.ic_new_york);

        TextView text2 = headerLayout2.findViewById(R.id.textView3);
        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm a");
        sdf2.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String myTime2 = sdf2.format(calendar2.getTime());
        text2.setText(myTime2);


        View headerLayout3 = findViewById(R.id.time3);
        TextView headerText3 = headerLayout3.findViewById(R.id.textView4);
        headerText3.setText(getString(R.string.city3));

        ImageView img3 = headerLayout3.findViewById(R.id.imageView2);
        img3.setImageResource(R.drawable.ic_paris);

        TextView text3 = headerLayout3.findViewById(R.id.textView3);
        Calendar calendar3 = Calendar.getInstance();
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm a");
        sdf3.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        String myTime3 = sdf3.format(calendar3.getTime());
        text3.setText(myTime3);


        View headerLayout4 = findViewById(R.id.time4);
        TextView headerText4 = headerLayout4.findViewById(R.id.textView4);
        headerText4.setText(getString(R.string.city4));
        ImageView img4 = headerLayout4.findViewById(R.id.imageView2);
        img4.setImageResource(R.drawable.ic_delhi);

        TextView text4 = headerLayout4.findViewById(R.id.textView3);
        Calendar calendar4 = Calendar.getInstance();
        SimpleDateFormat sdf4 = new SimpleDateFormat("hh:mm a");
        sdf4.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));

        String myTime4 = sdf4.format(calendar4.getTime());
        text4.setText(myTime4);


        View headerLayout5 = findViewById(R.id.time5);
        TextView headerText5 = headerLayout5.findViewById(R.id.textView4);
        headerText5.setText(getString(R.string.city5));
        ImageView img5 = headerLayout5.findViewById(R.id.imageView2);
        img5.setImageResource(R.drawable.ic_italy);

        TextView text5 = headerLayout5.findViewById(R.id.textView3);
        Calendar calendar5 = Calendar.getInstance();
        SimpleDateFormat sdf5 = new SimpleDateFormat("hh:mm a");
        sdf5.setTimeZone(TimeZone.getTimeZone("Europe/Rome"));

        String myTime5 = sdf5.format(calendar5.getTime());
        text5.setText(myTime5);


        ImageButton refresh = findViewById(R.id.refresh_button);
        refresh.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }});

    }
}