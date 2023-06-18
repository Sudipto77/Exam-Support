package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Exam_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("stuff");
        TextView txt;
        TextView txt2;
        txt2 = findViewById(R.id.textView);
        txt = findViewById(R.id.textView2);
        txt.setText("Welcome " + s + " choose your Exams");
        CardView card1 = findViewById(R.id.cardview1);
        CardView card2 = findViewById(R.id.cardview2);
        CardView card3 = findViewById(R.id.cardview3);
        CardView card4 = findViewById(R.id.cardview4);
        CardView card5 = findViewById(R.id.cardview5);
        CardView card6 = findViewById(R.id.cardview6);
        CardView card7 = findViewById(R.id.cardview7);
        CardView card8 = findViewById(R.id.cardview8);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for Joint Entrance Examination", Toast.LENGTH_SHORT).show();
                Intent jee = new Intent(Exam_Activity.this,JEEMainActivity2.class );
                startActivity(jee);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exam_Activity.this, "Coming Soon!!", Toast.LENGTH_SHORT).show();
                Intent upse = new Intent(Exam_Activity.this,Upse_activity.class );
                //startActivity(upse);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for 12th boards examination", Toast.LENGTH_SHORT).show();
                Intent boards = new Intent(Exam_Activity.this,BoardsActivity.class );
                startActivity(boards);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for NEET Examination", Toast.LENGTH_SHORT).show();
                Intent neet = new Intent(Exam_Activity.this,NEET_Activity.class );
                startActivity(neet);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for ISI Examination", Toast.LENGTH_SHORT).show();
                Intent isi = new Intent(Exam_Activity.this,ISI_Activity.class );
                startActivity(isi);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for IIFT Examination", Toast.LENGTH_SHORT).show();
                Intent iift = new Intent(Exam_Activity.this,IIFT_Activity.class );
                startActivity(iift);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for BITSAT", Toast.LENGTH_SHORT).show();
                Intent bits = new Intent(Exam_Activity.this,BITSAT_Activity.class );
                startActivity(bits);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Exam_Activity.this, "Fetching Resources for KVPY", Toast.LENGTH_SHORT).show();
                Intent kvpy = new Intent(Exam_Activity.this,KVPY_Activity.class );
                startActivity(kvpy);
            }
        });


        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:itsudipto2002@gmail.com"));
                startActivity(sendmail);
            }
        });

    }
}