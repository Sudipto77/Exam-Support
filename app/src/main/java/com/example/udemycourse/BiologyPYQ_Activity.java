package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BiologyPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Biology);

        String[] Exam_year = {
                "Biology 1",
                "Biology 2",
                "Biology 3",
                "Biology 4",
                "Biology 5",
                "Biology 6",
                "Biology 7",
                "Biology 8",
                "Biology 9",


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1LW-35BVj-J9CKN26wGbaVS9gkwTKYIBd/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1K0YPw9tU7F6ISHB4YHdQb10FR1O9ECnQ/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/12wVuS3FJiA1JaqLKw53aT5nVwsmCgu5t/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1QDJF1DFAryObpMbX4cUYdj1hhxROYPFC/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1V_k9SW2mgn97AKIdGEf6iLFBnRP8EHPu/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1oP2nx_1cUq88E2gngS5ZzpHE0pjZcFz-/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1S6dvJvn17a1lJVhA3vL-SZF7sgTiDSzj/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1M3aGhIt8MktHbqECz8naZZkAkmMlmZ3d/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/18sImQZ8FiY4wIGR-NZuh_6thp9nUf-2n/view?usp=drive_link");
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