package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PoliticalPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Politics);

        String[] Exam_year = {
                "Political Science 1",
                "Political Science 2",
                "Political Science 3",
                "Political Science 4",
                "Political Science 5",
                "Political Science 6",
                "Political Science 7",
                "Political Science 8",
                "Political Science 9",
                "Political Science 10",
                "Political Science 11",
                "Political Science 12",


        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/19gHmovnuc_tk5VH-oAwN1i3HInmemjGK/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1x_OXgdGD_gBd0XAAS2wUiXDP2V1ju7v6/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/11RX9bvkcIng_7VrxoIGZhICq5YFkpgvW/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1u-_Pb1N7V_vIAo_g_o8r_d1VqnDLB2bI/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1F77fS0Db83JLPJCXW3XmNpTOA2QO70Z8/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1vs8GmSleuq_d1h1CeDj7b7EdVqOMF0vt/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/1hL4qgMHjjFTIBwMMTpCYxTYgiV836HPA/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1yd_M8X8Pue_xZWPnPtwc8ksTHE-0joh7/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1VVNol1lJPvSyxwbYDT5sdIqBxYm_lCkU/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1qv00GUR1ClSjfj7fCZ1YFMZHmrUi1OGX/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/10k_VoQTWrV3LSslUQRWURZMeo1-ON3cm/view?usp=drive_link");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1Q4PMy0M2b3UdTT2EO0PzyldYQQ_83Boe/view?usp=drive_link");
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