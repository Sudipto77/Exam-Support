package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhysicsPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Physics);

        String[] Exam_year = {
                "Physics 1",
                "Physics 2",
                "Physics 3",
                "Physics 4",
                "Physics 5",
                "Physics 6",
                "Physics 7",
                "Physics 8",
                "Physics 9",
                "Physics 10",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1ElvmI-0qfJJBlVxZs4gZ6FAd-ulfCBc4/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/147XBXEdqLH-zfELCLDtIlWiFEbldn7h0/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1CSbGviFt6f5dptrUnCozv1N1zf4MvBVa/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1F99qdYmF1wTCRNrk8QkJykZrfGEgjrsy/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1AFomdKz5PQd4l-u6xrgMmqY5ByAbWwdl/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1Ov0-WpklhHM2iRXwFAzEkpD1YocL3tu_/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1hFA3nwuev3b3snQhw4odxOco1Jqy16Ru/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1m0JTehpy1UfcnmoYUttyjIV6lRv23CJK/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1_9ER4QG-TIC7nyhasBKSkdppjcQva0am/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1cOSiFCaqm3o3RBZuBbjCo9nB0ygjpDSP/view?usp=drive_link");
                }

            }

            private void viewpdf(String value) {
                // add the link of pdf
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));
                // start activity
                startActivity(intent);
            }

        });

    }
}