package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChemistryPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Chemistry);

        String[] Exam_year = {
                "Chemistry 1",
                "Chemistry 2",
                "Chemistry 3",
                "Chemistry 4",
                "Chemistry 5",
                "Chemistry 6",
                "Chemistry 7",
                "Chemistry 8",
                "Chemistry 9",
                "Chemistry 10",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1qEjS6iv-6mvp0Jm6gqX7GEXpg71WPhsX/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1VOK7zn7RUf3Zclcvnu6VgegCbXvZuudP/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1vFQFvT1lFXD19ayxu7ICVoUVrPOJ2kAm/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1S0TTkxEVoF_Fa9vML_Wb0PvEL9HjgEHu/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1HrttFwMDR81EysCNZAw-2fsuh_69-0T9/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1GMqQk70zqI1xpRCA6tVh7XetqiIltbdK/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1YGZZe9EZYGli85-TXWRcE3Mg7pbN6r2y/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/14xN5wBt08rOcNaFFr8Mm2FYHWz8YyzL0/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/15e_3FxPHakX0qX3c0GVyinFwDuE9QzCI/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1CyG9NMYoOOrgaaOKshBQ3ZGGGHvsND9q/view?usp=drive_link");
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