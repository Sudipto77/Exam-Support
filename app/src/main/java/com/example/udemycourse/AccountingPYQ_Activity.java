package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AccountingPYQ_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting_pyq);

        ListView Exam;
        Exam = findViewById(R.id.Accounting);

        String[] Exam_year = {
                "Accounts 1",
                "Accounts 2",
                "Accounts 3",
                "Accounts 4",
                "Accounts 5",
                "Accounts 6",
                "Accounts 7",
                "Accounts 8",
                "Accounts 9",
                "Accounts 10",
                "Accounts 11",
                "Accounts 12",
                "Accounts 13",
                "Accounts 14",
                "Accounts 15",

        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    viewpdf("https://drive.google.com/file/d/11sMoJAkksEWdUQabHYqYnWI9MWh5LL9L/view?usp=drive_link");
                }
                if (position == 1) {
                    viewpdf("https://drive.google.com/file/d/1NBKY8H-i2QD45HMgM-wOnS-1h578wvQ0/view?usp=drive_link");
                }
                if (position == 2) {
                    viewpdf("https://drive.google.com/file/d/1DzsWhc7leRWMYN3VES5vIo-8iwr6o41g/view?usp=drive_link");
                }
                if (position == 3) {
                    viewpdf("https://drive.google.com/file/d/1sTI9spIYU05s8dOOk5DC-4JlW4jx0hQy/view?usp=drive_link");
                }
                if (position == 4) {
                    viewpdf("https://drive.google.com/file/d/1U-c1d3e8gfw3BNB3BY8RW9q_SrKQ7eHH/view?usp=drive_link");
                }
                if (position == 5) {
                    viewpdf("https://drive.google.com/file/d/1af-IMuxcIYYCYdYl0NSbL5OaVJsSNr12/view?usp=drive_link");
                }
                if (position == 6) {
                    viewpdf("https://drive.google.com/file/d/14QqyWYn9DY0SBYbY6EuLVfUSfU5NhVs_/view?usp=drive_link");
                }
                if (position == 7) {
                    viewpdf("https://drive.google.com/file/d/1QVBQAetEm1EzNnb3UvKwmybSnZP9Za0q/view?usp=drive_link");
                }
                if (position == 8) {
                    viewpdf("https://drive.google.com/file/d/1mZg5_rfeD0APkTbl3KW2JilCaYj7LVPJ/view?usp=drive_link");
                }
                if (position == 9) {
                    viewpdf("https://drive.google.com/file/d/1yPwhyVQcu0DZct-O4CvCZV1fbkzqxHGw/view?usp=drive_link");
                }
                if (position == 10) {
                    viewpdf("https://drive.google.com/file/d/1-_GeT1H6u7wNuCXCt5rXiEnWsBlqEYYU/view?usp=drive_link");
                }
                if (position == 11) {
                    viewpdf("https://drive.google.com/file/d/1qluFeMi7rAS0xmad5a5pfCczBXeE3uHP/view?usp=drive_link");
                }
                if (position == 12) {
                    viewpdf("https://drive.google.com/file/d/1nNKVNKXTJaC3IsonHbidIIWhXK6MbIk_/view?usp=drive_link");
                }
                if (position == 13) {
                    viewpdf("https://drive.google.com/file/d/1Ic51hWnQFj1n03D2TK0pQmeoE97XuNsc/view?usp=drive_link");
                }
                if (position == 14) {
                    viewpdf("https://drive.google.com/file/d/1QpO5oDZTdP4LGLr-JhCJuAShLym9kdN_/view?usp=drive_link");
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