package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NEETpyq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neetpyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqneet);

        String[] Exam_year = {
                "NEET 2023",
                "NEET 2022",
                "NEET 2022 Answer Key",
                "NEET 2021",
                "NEET 2021 Answer Key",
                "NEET 2020",
                "NEET 2019",
                "NEET 2018",
                /*"NEET 2017",
                "NEET 2016",
                "NEET 2015",
                "NEET 2014",
                "NEET 2013",*/
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1SD9mR5lKB3DxNLUgrCnbO7PqRAx8n1CS/view");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1eDkU5FcES5-uwJSgNBgjyNN5jbTdzjNO/view");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1bo8HO7cIY-4FI0qu2AgJGTy3tV2o5vSC/view");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1bo8HO7cIY-4FI0qu2AgJGTy3tV2o5vSC/view");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1rDii3YHGe1LiQKylpdoin08ooASXex1J/view");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1TjjmUlmMTovY_mQg7f49Y8A1f8AlQjSk/view");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1hHZNr-Oho5yVyD6erYvjmTwrJRmOydOY/view");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1Bv9M7HBR-c-xevvh6Ze_jUXYDkByJp4n/view");
                }
                /*if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1MK57XaTcOPnV5PvZGnxsxBj1Ygmz2amh/view");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1zmQFz9PYP1KAAJk9hCwlJdXowu5b1uyj/view");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1JMtSU3htFtRVrQFSASXtGxEOZN2WnM8J/view");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1l-vYnGLj1vEF9H5zb6gJGGKj9xLQBYCi/view");
                }
                if (position == 12) {
                    viewpdf("https://drive.google.com/file/d/1oJ4dCUnZuH6ZrbyHHEGSjyfou_orr21f/view");
                }
                if (position == 13) {
                    viewpdf("https://drive.google.com/file/d/1nB0wNHh858S2OzFc-I5ibxXnVNMBC4xr/view");
                }
                if (position == 14) {
                    viewpdf("https://drive.google.com/file/d/1yl9SPNq-WeW0Oc0-SBip3-mpzgcPqgJG/view");
                }
                if (position == 15) {
                    viewpdf("https://drive.google.com/file/d/1xXI3nLU49SkUfE36MBvRu8HvEI9MJclm/view");
                }
                if (position == 16) {
                    viewpdf("https://drive.google.com/file/d/1WFnnu-VZrRXAXoNgK-PSaqDmRJgaq0_f/view");
                }
                if (position == 17) {
                    viewpdf("https://drive.google.com/file/d/1vO5YDtC4s0cTPcWaXBzDmm13-txDI2f-/view");
                }
                if (position == 18) {
                    viewpdf("https://drive.google.com/file/d/1IzWfkBmW7fE_GofT-k2eDwBHHlFOL1T6/view");
                }
                if (position == 19) {
                    viewpdf("https://drive.google.com/file/d/1GOLib79BCTiK95IRsPKg9ZUkuikc_E01/view");
                }*/

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