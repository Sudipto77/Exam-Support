package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EconomicsPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Eco);

        String[] Exam_year = {
                "Economics 1",
                "Economics 2",
                "Economics 3",
                "Economics 4",
                "Economics 5",
                "Economics 6",
                "Economics 7",
                "Economics 8",
                "Economics 9",
                "Economics 10",
                "Economics 11",
                "Economics 12",


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1kSJsBbxY49NYFxkvkgbPj1-6axDtsOz3/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1jd5YZjlP8orv4goxNol9aHpbL7SWMs_6/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1Dh4-xQ0oeakUzgsuxn0B8NJvrRicmBvd/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1lOTy9nraKqNWnfMmKlE3uVUdzpewylkj/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1Dhmt8oilCnSqkf2F7sN3Wr9ciiw7o9eA/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1eQOsE0cXQ5FpNvUzENpG0IFkpTMTQWm2/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1OfgI82ZLvM8jqfjgdK8NIF6aNb36t5vd/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1Pr6as6Pm2q_bJZesKOtHns9KF3ynhdwL/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1gpprenw6kNQfc_UJgcHM5lDA3e8f91qD/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1gP1ftm_JwJ7lznoVOZUSpF2DET9XuZdA/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/13zKJz0x4kVUbyzfJEImup_d2snXFtqNK/view?usp=drive_link");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1660_g-R7ihYpySZ5Qvz5zm7hQ6ydaq2v/view?usp=drive_link");
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