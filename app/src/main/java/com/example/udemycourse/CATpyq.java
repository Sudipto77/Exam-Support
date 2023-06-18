package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CATpyq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catpyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqCAT);

        String[] Exam_year = {
                "CAT 2022 Slot 1",
                "CAT 2022 Slot 2",
                "CAT 2022 Slot 3",
                "CAT 2021 Slot 1",
                "CAT 2021 Slot 2",
                "CAT 2021 Slot 3",
                "CAT 2020 Slot 1",
                "CAT 2020 Slot 2",
                "CAT 2020 Slot 3",
                "CAT 2019 Slot 1",
                "CAT 2019 Slot 2",
                "CAT 2018 Slot 1",
                "CAT 2018 Slot 2",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/1_gn6LiCWEs54kbWobVfxaHa05D8ZTcta/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1BlGallPSGV_bXUUiMxolJqV-oDqGJRUv/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1b_NR585UXuvBh7K7I2BtuCmYqxKnfpvC/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1IoaeXSBxLu0ZChMJ5NTfxl0Qm_5cU_5Z/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1xaIu0lVDkHLPEYA-yEeq70bkbc2TqDDh/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/19oIzc3WiZWcdPqdHNP9OGpiQc43Ld0mb/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1LhDwTW1lVynnTYrWu0VHjmxL5xLlITHF/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1GULTxr72w4voI4qauWE_ckvr9c0OFMX5/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1WUwwP-61w6XhWPMGoEw6VVqWUYU9Nc-X/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1UvdA4BxZye4ONRnmDsMwZRXlKGB1_L1w/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1JLJVkvUJRIfnx3IoqLu0zhOIj5T7QXTv/view?usp=drive_link");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1zcR7WqsRkFQQimbusFTVVWNlKB1kAhgu/view?usp=drive_link");
                }
                if (position == 12) {
                    viewpdf("https://drive.google.com/file/d/1HK3YxIv2hExvF02q1OYpOoihLdS8CSK1/view?usp=drive_link");
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