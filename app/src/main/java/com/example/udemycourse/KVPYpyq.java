package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KVPYpyq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kvpypyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqkvpy);

        String[] Exam_year = {
                "KVPY SA 2021",
                "KVPY SB/SX 2021",
                "KVPY SA 2020",
                "KVPY SB/SX 2020",
                "KVPY SA 2019",
                "KVPY SB/SX 2019",
                "KVPY SA 2018",
                "KVPY SB/SX 2018",
                "KVPY SA 2017",
                "KVPY SB/SX 2017",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1hXw1ZWSs11W7jSyRxOHrwVGhNLbr21j5/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/13T-BdDZaULAeP7MhLmRhaXePnGSD9B51/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1gBE7YrIyvhsmrk627uFTOcdXucaaFdjd/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1uRAGPtVDMH_uz-VwKvWK8QuTYacPTmk0/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1kycVO_BmphODHMrKDKbS9Fx-zbnOHiQZ/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/19arSNX6bbvs431B-6dnVg1etqEmzWVlR/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1P_BIqV2Ndu-E5MNoiWHmH1P1CZH-y6TI/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/19LbCNEWZT-3ZrxXw9GaD4zvyDOzwa3o8/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1M24w8lBHetlnUH2fW5M0cVO3f9cdgdhs/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/19LCxjRuWt9igBm2qETirySkUiXU6s8vR/view?usp=drive_link");
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