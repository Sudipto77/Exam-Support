package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HistoryPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_pyq);

        ListView Exam;
        Exam = findViewById(R.id.History);

        String[] Exam_year = {

                "History 1",
                "History 2",
                "History 3",
                "History 4",
                "History 5",
                "History 6",
                "History 7",
                "History 8",
                "History 9",
                "History 10",
                "History 11",
                "History 12",


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1mAD8tA9jyz3S6YMrkyFJARHcDnMxt8SQ/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1Hvz_K228VJWVB2fqUGB9jT1d6LEwbrGd/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/13QdGHEP-70l_p6CEupua3KDIAZ0vs9uL/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1IKlru7lxxn9dNCKPbE4IjDKizX1vhtyL/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1UtDivMt3r8AnRM5oUlTm9OIow1XGa7eW/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1oSaSl9N7SVXWaS4t0GUQxzlLn9r2bXDe/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1r1S3I2OshpyD_YrAqKDyrNYznIqxwcBL/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1KFsHzsL8G8C8pNXxYmxYVsq6qD8C16Es/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1W27OwhEChBmcIisUU4dhXEx9qbETPOwi/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1gEMBLtlC1yR8lMel6r5hVVsojplgLsiI/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/14U0idVB9AQqoNJ_ddkTgyvSr-vMU-s3N/view?usp=drive_link");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1ilrGHnYl5vc_SNMhMY-p1lH_h7R5Qo_f/view?usp=drive_link");
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