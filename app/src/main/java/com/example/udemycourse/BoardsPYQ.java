package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BoardsPYQ extends AppCompatActivity implements RecyclerViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boards_pyq);

        RecyclerView Exam;
        Exam = findViewById(R.id.pyqboards);

        Resources[] Subjects = {


                new Resources("Accounting", "",R.drawable._6426060_vector_test_flat_design_icon_isolated_education_exam),
                new Resources("Biology", "",R.drawable.biology_logo),
                new Resources("Business Studies", "",R.drawable._6426060_vector_test_flat_design_icon_isolated_education_exam),
                new Resources("Chemistry", "",R.drawable.chemistry_logo_new),
                new Resources("Economics", "",R.drawable.economics_logo),
                new Resources("English", "",R.drawable.english_logo),
                new Resources("Geography", "",R.drawable.geography_logo),
                new Resources("Hindi", "",R.drawable.hindi_logo),
                new Resources("History", "",R.drawable.history_logo),
                new Resources("Information Practices", "",R.drawable.ip_logo),
                new Resources("Mathematics", "",R.drawable.maths_logo),
                new Resources("Physics","",R.drawable.physics_logo),
                new Resources("Political Science", "",R.drawable.politics_logo),


        };

        Projectadaptor adaptor = new Projectadaptor(Subjects,this);
        Exam.setAdapter(adaptor);


    }

    @Override
    public void OnItemClick(int position) {

        if (position==0){
            Intent intent1;
            intent1 = new Intent(BoardsPYQ.this,AccountingPYQ_Activity.class);
            startActivity(intent1);
        }
        if (position==1){
            Intent intent2 = new Intent(BoardsPYQ.this,BiologyPYQ_Activity.class);
            startActivity(intent2);
        }
        if (position==2){
            Intent intent3 = new Intent(BoardsPYQ.this,BSTPYQ_Activity.class);
            startActivity(intent3);
        }
        if (position==3){
            Intent intent4 = new Intent(BoardsPYQ.this,ChemistryPYQ_Activity.class);
            startActivity(intent4);
        }
        if (position==4) {
            Intent intent5 = new Intent(BoardsPYQ.this, EconomicsPYQ_Activity.class);
            startActivity(intent5);
        }
        if (position==5){
            Intent intent6 = new Intent(BoardsPYQ.this,EnglishPYQ_Activity.class);
            startActivity(intent6);
        }
        if (position==6){
            Intent intent7 = new Intent(BoardsPYQ.this,GeoPYQ_Activity.class);
            startActivity(intent7);
        }
        if (position==7){
            Intent intent8 = new Intent(BoardsPYQ.this,HindiPYQ_activity.class);
            startActivity(intent8);
        }
        if (position==8){
            Intent intent9 = new Intent(BoardsPYQ.this,HistoryPYQ_Activity.class);
            startActivity(intent9);
        }
        if (position==9){
            Intent intent10 = new Intent(BoardsPYQ.this,IPPYQ_Activity.class);
            startActivity(intent10);
        }
        if (position==10){
            Intent intent11 = new Intent(BoardsPYQ.this,MathasPYQ_Activity.class);
            startActivity(intent11);
        }
        if (position==11){
            Intent intent12 = new Intent(BoardsPYQ.this,PhysicsPYQ_Activity.class);
            startActivity(intent12);
        }
        if (position==12){
            Intent intent13 = new Intent(BoardsPYQ.this,PoliticalPYQ_Activity.class);
            startActivity(intent13);
        }

    }

}
