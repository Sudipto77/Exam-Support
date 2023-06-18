package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MathasPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathas_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Maths);

        String[] Exam_year = {
                "Maths 1",
                "Maths 2",
                "Maths 3",
                "Maths 4",
                "Maths 5",
                "Maths 6",
                "Maths 7",
                "Maths 8",
                "Maths 9",
                "Maths 10",
                "Maths 11",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1MENuMMmwMLyQ9iGk_zAfUnOd4UhGhl7B/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1X5V9SN37sF2ug-PXoTO9MBoWPLX-8S0r/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1KSCSLc_6fimEfKVcsBMQj2Rm-PMS5u-N/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/19SUUwapLKO0yNWxl8rof2Tj7fQhpxPN9/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1XmsBP1DoK7unHzxMXrIidR9idy5-Qo_T/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1Kz4YBOTuLh_f7AifI3-HOezwMRyGf6cv/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1dsMaYgvSGobI8cfoXf9m-6RQtIs4i6i6/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1XmDmve5lsMBVsofIqrPfGnmiOkYIx9jL/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/16uMrmI7wZuh8SQb88MCwpyqS4IKiBmnx/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/12PUQVD4xKel_1SHFEyCrzpBl9NzX1oGE/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1nUuqYHr4MSRLt16PeDsMcnVgyuv3ednw/view?usp=drive_link");
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