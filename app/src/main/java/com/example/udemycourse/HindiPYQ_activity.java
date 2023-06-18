package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HindiPYQ_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Hindi);

        String[] Exam_year = {
                "Hindi 1",
                "Hindi 2",
                "Hindi 3",
                "Hindi 4",
                "Hindi 5",
                "Hindi 6",
                "Hindi 7",
                "Hindi 8",
                "Hindi 9",
                "Hindi 10",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1VsTH5J1_nCzXz0nXUiByK1UV2_uwRGM4/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1Rj_KYyqOPfkeefDueQuQgZZ8EFc3Pt3q/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1fdAN646HwNuTPskulppqolsV9O4HICXQ/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1ByHFeKJvtIYyKnIppc7iy69f9zP73xe3/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1aNnQcPz_T-UObG6Eb8j-i8HpPpCn0ep9/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1lot7gEA4I89OJ05IYwYth4AV7p047QWT/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1aBRsblU8QvKpFvGqq4p25_cSNQ87BgUb/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1H0LQKBbq-PXPIOvnBfFgkr-OpTwgVXGi/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1HA8uhnS2GfyriKENrTIO5ewv3vp9BNxf/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1zA56r_zh-c33PYy070VdjMR0y5eMaETH/view?usp=drive_link");
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