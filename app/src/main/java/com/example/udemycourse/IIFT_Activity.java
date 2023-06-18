package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class IIFT_Activity extends AppCompatActivity implements RecyclerViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iift);

        RecyclerView iiftlist = findViewById(R.id.iift);

        Resources[] resource = {
                new Resources("Notes", "Detailed Notes that will help you understand even the toughest concepts",R.drawable._542833_bloc_notes_livre_moderne_simple_ligne_logo_vecteur_icone_symbole_conception_graphique_illustration_vectoriel),
                new Resources("Previous Year's Questions", "Collection of asked questions to give you an idea about the difficulty levels",R.drawable.pyqpapers_logo),
                new Resources("Chapter wise Weightage", "For you to plan out your studies according to importance of certain topics",R.drawable.strategy_linear_icon_modern_outline_logo_concept_wh_white_background_startup_success_collection_suitable_use_web_133525360),
                new Resources("Books to refer", "Best Selling books from popular authors",R.drawable.dall_e_2023_04_21_00_23_41___stack_of_science_and_maths_books_digital_art),
                new Resources("Sample Papers/Mock Tests", "Attempt These tests to check your preparation",R.drawable._6426060_vector_test_flat_design_icon_isolated_education_exam)
        };

        Projectadaptor adaptor = new Projectadaptor(resource,this);
        iiftlist.setAdapter(adaptor);


    }

    @Override
    public void OnItemClick(int position) {
        if(position==0){
            Toast.makeText(IIFT_Activity.this, "Coming Soon!!", Toast.LENGTH_SHORT).show();
        }
        if (position==1){
            Intent intent1 = new Intent(IIFT_Activity.this,CATpyq.class);
            startActivity(intent1);
        }
        if(position==2){
            Toast.makeText(IIFT_Activity.this, "Coming Soon!!", Toast.LENGTH_SHORT).show();
        }
    }
}