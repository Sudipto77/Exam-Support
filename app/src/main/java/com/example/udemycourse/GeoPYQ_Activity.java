package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GeoPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Geography);

        String[] Exam_year = {


                "Geography 1",
                "Geography 2",
                "Geography 3",
                "Geography 4",
                "Geography 5",
                "Geography 6",
                "Geography 7",
                "Geography 8",
                "Geography 9"


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1vtXAiwRVS-XNZqIYlWZDYsNBbuN9nt0F/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1q6LShTzYR7BQtdqsjkN6p-lflTR4BrvL/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/13SM1lTiYtt6XBkGOtzV7Oj792o-0Lk-0/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1bd8xm3jpKM2kKoRklMPczvjxmhpyQDfX/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1ohBK5qo19lQ7PiztXfvJdgBb539G_Rvp/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1BOl3E-wHr7lOvPf0yu8KfN_PtVSfQDvK/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1gAj97ATV0g1uSkrBONHfXCjuy9gFjsU6/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1QBNv8H4_oKUWyraz9VAuULcrQqyFtTlf/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/12WNJCKsYo0AY_UWseIvJ-VnomZENTaFc/view?usp=drive_link");
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