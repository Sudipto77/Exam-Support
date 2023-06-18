package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BSTPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bstpyq);


        ListView Exam;
        Exam = findViewById(R.id.BST);

        String[] Exam_year = {
                "Business Studies 1",
                "Business Studies 2",
                "Business Studies 3",
                "Business Studies 4",
                "Business Studies 5",
                "Business Studies 6",
                "Business Studies 7",
                "Business Studies 8",
                "Business Studies 9",
                "Business Studies 10",
                "Business Studies 11",


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1sQ_Jq7LLq5uZGnC2aCkiNzu84xgBPxD2/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1qUID9g8Kb_ckO9qgJMrTz6DPoLBuQWAW/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1UW6QVt7_tL_iQUlu_XU0tbecYkUO3FIS/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1GG_sTq7zkFiI2oSXtQRYUrdC8OMruvWl/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1McaMHcBVuc6Sz6g-FcrkOyrka7HSEWj6/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1JQeVBoakYjNboEpalVALe1sdGEAFKKG0/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1Bv5XuHlBCGl3sLPNl7L5mxOOLd4KzlmH/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1QKos3Qf7iCjwQQUDoP2CQu7DcKrZwxdS/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1tJE58U_1Lvz1O0zc608f7Ew-EtmlvrD-/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1baMLK574d3GfA5e40BOZ7u_z0H6QbhLj/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1iKwgzHmFOWU1zLIFCsNqTB1VqRN9EKEQ/view?usp=drive_link");
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