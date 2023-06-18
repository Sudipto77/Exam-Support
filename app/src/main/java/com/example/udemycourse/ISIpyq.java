package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ISIpyq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isipyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqISI);

        String[] Exam_year = {
                "ISI 2020 UGA",
                "ISI 2020 UGB",
                "ISI 2019 UGA",
                "ISI 2019 UGB",
                "ISI 2018 UGA",
                "ISI 2018 UGB",
                "ISI 2017 UGA",
                "ISI 2017 UGB",
                "ISI 2016 UGA",
                "ISI 2016 UGB",
                "ISI 2015 UGA",
                "ISI 2015 UGB",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1l65xAbXkQdYvLsvVQ2NWWoBFzzbjOxT9/view");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1ltw0K33PKbW2t2Bdgi3Z1sttARVMm4nv/view");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1LTcbtieYDIXWacx9oyD-SBHvobloUmaT/view");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1HKteZ4ZoxHPITJ9oCan6tDe3UXr5fm8q/view");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/19oCNA7GAp449GdfoE9TZ8tV_5kjKkE4p/view");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1gnWlDzYuebQvCvxapLPQUbsUwiDg39WU/view");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1E0tT1jCwYEr5_RpiDMET--6Pzhg_rt33/view");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1F4PbcZo-zOuO6JXMQ-riTWAebxnRnkEy/view");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1BfCH9bg2u8LXPkhxfGYiONNlefI7VGxF/view");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/18TBVXw8aujr-F9SC6mykau_QmteKwkhM/view");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1PthBWR7wpqA6N62EbgJca2RDie-HapZU/view");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1JL69p9t7f-nLi-D1U4Zwh1d-GZ8HaF5y/view");
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