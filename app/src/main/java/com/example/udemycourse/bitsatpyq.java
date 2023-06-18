package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bitsatpyq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitsatpyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqbitsat);

        String[] Exam_year = {
                "BITSAT 2018",
                "BITSAT 2017",
                "BITSAT 2016",
                "BITSAT 2014",
                "BITSAT 2013",
                "BITSAT 2012",
                "BITSAT 2011",
                "BITSAT 2009",
                "BITSAT 2008",
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/10zE92510LizAMvhlmTmlUMqNfLHrG1FC/view");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1_1RnllerEv18BdqaI1DB6h9rBFCs5sE6/view");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1Wrq1gUj-lNEwUACCJeVfPT-xqJOCB6i1/view");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1UNFiaehjssnVwOuR7GLUQt89fOrbB1ig/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1mQx3hDslbNysjYN67GOEzv1VEbrjbQ7n/view");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1A6y59GJmNTbZsVL_iiMRNI1SpQLO26yJ/view");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1xlTlJE19G8j13jt9jbiDofbyG8Lwc8XU/view");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1S8GArWHzupb-_AXA1stSeDM0UbKNQVMV/view");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1OZCQkKYGioz8SE-jarHj-ueOVuvro0xA/view");
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