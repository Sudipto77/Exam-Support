package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_pyq);

        ListView Exam;
        Exam = findViewById(R.id.English);

        String[] Exam_year = {
                "English 1",
                "English 2",
                "English 3",
                "English 4",
                "English 5",
                "English 6",
                "English 7",
                "English 8",
                "English 9",
                "English 10",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1OSXjqOi_3kOx6xYQYqaCfXiucvD4aNpT/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1-5oLBSnYK9TcNTwHQpVW29LM0CIJcM5M/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1GC98ckwlR1_wHo2jVkqSfzWcxoQNzeN3/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1icgfokWoMonTWH8tw60bkTaLTomExO6O/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1AirCyqAmyCEdghdXdrnYb9v-RFNcQOV9/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1j0W9oX2KWbbn0Wk0uSVaU8Zvm-va9zKD/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1c--AzGgG7Pv9Uf7Yhz2JRdvZojE08DLZ/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1VaDu3JHj0RTBzdbMbHq2PxPGphlSQYVw/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1EggV3Ho4bahebaDCTyNizFe2PJIBW0Qg/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1bAdbylfH8U0MP79j_aOHpoOTZNLRZpL-/view?usp=drive_link");
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