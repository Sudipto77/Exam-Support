package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Jeepyq_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeepyq);

        ListView Exam;
        Exam = (ListView) findViewById(R.id.pyqjee);

        String[] Exam_year = {
                "Jee Mains 2022 (24 June, Morning)",
                "Jee Mains 2022 (24 June, Evening)",
                "Jee Mains 2022 (25 June, Morning)",
                "Jee Mains 2022 (25 June, Evening)",
                "Jee Mains 2022 (26 June, Morning)",
                "Jee Mains 2022 (26 June, Evening)",
                "Jee Mains 2022 (27 June, Morning)",
                "Jee Mains 2022 (27 June, Evening)",
                "Jee Mains 2022 (28 June, Morning)",
                "Jee Mains 2022 (28 June, Evening)",
                "Jee Mains 2022 (28 July, Morning)",
                "Jee Mains 2022 (28 July, Evening)",
                "Jee Mains 2022 (29 July, Morning)",
                "Jee Mains 2022 (29 July, Evening)",
                "Jee Mains 2021 (24 February, Morning)",
                "Jee Mains 2021 (24 February, Evening)",
                "Jee Mains 2021 (25 February, Morning)",
                "Jee Mains 2021 (25 February, Evening)",
                "Jee Mains 2021 (26 February, Morning)",
                "Jee Mains 2021 (26 February, Evening)",
                "Jee Mains 2020",
                "Jee Mains 2019",
                "Jee Mains 2018",
                "Jee Mains 2017",
                "Jee Mains 2016",
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Exam_year);
        Exam.setAdapter(arrayAdapter);
        Exam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Jeepyq_Activity.this, Exam_year[position], Toast.LENGTH_SHORT).show();
                if (position==0){
                    viewpdf("https://drive.google.com/file/d/1_bsI_EzonyryCqhgOP-b0VDjNKlYtf5Q/view");
                }
                if (position==1){
                    viewpdf("https://drive.google.com/file/d/18FKlMNML259ORQKirVJ9vjdK9pICd3_W/view");
                }
                if (position==2){
                    viewpdf("https://drive.google.com/file/d/18OHcaUw7N0xcolzlS4A7-BdjYKLYYU5x/view");
                }
                if (position==3){
                    viewpdf("https://drive.google.com/file/d/1DLWZbKuzpWB7k5fgpheYPJUcJn4owU81/view");
                }
                if (position==4){
                    viewpdf("https://drive.google.com/file/d/1VZwChwauXb0AwW8uT6oyY3Dl-Yvs8S-u/view");
                }
                if (position==5){
                    viewpdf("https://drive.google.com/file/d/1kB7Nv_ZptFqJlFB7RCNwa6Q01V1Du7iV/view");
                }
                if (position==6){
                    viewpdf("https://drive.google.com/file/d/122nHuAi1srgnOZaJ6vclIpq4PUPVNsk9/view");
                }
                if (position==7){
                    viewpdf("https://drive.google.com/file/d/1Bv9M7HBR-c-xevvh6Ze_jUXYDkByJp4n/view");
                }
                if (position==8){
                    viewpdf("https://drive.google.com/file/d/1MK57XaTcOPnV5PvZGnxsxBj1Ygmz2amh/view");
                }
                if (position==9){
                    viewpdf("https://drive.google.com/file/d/1zmQFz9PYP1KAAJk9hCwlJdXowu5b1uyj/view");
                }
                if (position==10){
                    viewpdf("https://drive.google.com/file/d/1JMtSU3htFtRVrQFSASXtGxEOZN2WnM8J/view");
                }
                if (position==11){
                    viewpdf("https://drive.google.com/file/d/1l-vYnGLj1vEF9H5zb6gJGGKj9xLQBYCi/view");
                }
                if (position==12){
                    viewpdf("https://drive.google.com/file/d/1oJ4dCUnZuH6ZrbyHHEGSjyfou_orr21f/view");
                }
                if (position==13){
                    viewpdf("https://drive.google.com/file/d/1nB0wNHh858S2OzFc-I5ibxXnVNMBC4xr/view");
                }
                if (position==14){
                    viewpdf("https://drive.google.com/file/d/1yl9SPNq-WeW0Oc0-SBip3-mpzgcPqgJG/view");
                }
                if (position==15){
                    viewpdf("https://drive.google.com/file/d/1xXI3nLU49SkUfE36MBvRu8HvEI9MJclm/view");
                }
                if (position==16){
                    viewpdf("https://drive.google.com/file/d/1WFnnu-VZrRXAXoNgK-PSaqDmRJgaq0_f/view");
                }
                if (position==17){
                    viewpdf("https://drive.google.com/file/d/1vO5YDtC4s0cTPcWaXBzDmm13-txDI2f-/view");
                }
                if (position==18){
                    viewpdf("https://drive.google.com/file/d/1IzWfkBmW7fE_GofT-k2eDwBHHlFOL1T6/view");
                }
                if (position==19){
                    viewpdf("https://drive.google.com/file/d/1GOLib79BCTiK95IRsPKg9ZUkuikc_E01/view");
                }

            }

            private void viewpdf(String value) {
                // add the link of pdf


                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

                // start activity
                startActivity(intent);
            }
        });
    }
}