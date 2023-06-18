package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UPSEpyq extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upsepyq);

        ListView Exam;
        Exam = findViewById(R.id.pyqupse);

        String[] Exam_year = {
                "UPSE Mains 2022",
                "UPSE Prelims 2022",
                "UPSE Mains 2021",
                "UPSE Prelims 2021",
                "UPSE Mains 2020",
                "UPSE Prelims 2020",
                "UPSE Mains 2019",
                "UPSE Prelims 2019",
                "UPSE Mains 2018",
                "UPSE Prelims 2018",
                "UPSE Mains 2017",
                "UPSE Prelims 2017",
                "UPSE Mains 2016",
                "UPSE Prelims 2016",
                "UPSE Mains 2015",
                "UPSE Prelims 2015",
                "UPSE Mains 2014",
                "UPSE Prelims 2014",
                "UPSE Mains 2013",
                "UPSE Prelims 2013",
                "UPSE Mains 2012",
                "UPSE Prelims 2012",
                "UPSE Mains 2011",
                "UPSE Prelims 2011",
                "UPSE Mains 2010",
                "UPSE Prelims 2010",
                "UPSE Mains 2009",
                "UPSE Prelims 2009",




        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);

    }
}