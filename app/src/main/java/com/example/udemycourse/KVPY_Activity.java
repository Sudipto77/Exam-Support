package com.example.udemycourse;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class KVPY_Activity extends AppCompatActivity implements RecyclerViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kvpy);

        RecyclerView kvpyresourcelist = findViewById(R.id.kvpy);

        Resources[] resource = {
                new Resources("Notes", "Detailed Notes that will help you understand the toughest concepts",R.drawable._542833_bloc_notes_livre_moderne_simple_ligne_logo_vecteur_icone_symbole_conception_graphique_illustration_vectoriel),
                new Resources("Previous Year's Questions", "Collection of PYQ's to give you an idea about the difficulty levels",R.drawable.pyqpapers_logo),
                new Resources("Chapter wise Weightage", "Plan out your studies according to importance of certain topics",R.drawable.strategy_linear_icon_modern_outline_logo_concept_wh_white_background_startup_success_collection_suitable_use_web_133525360),
                new Resources("Books to refer", "Best Selling books from popular authors",R.drawable.dall_e_2023_04_21_00_23_41___stack_of_science_and_maths_books_digital_art),
                new Resources("Sample Papers/Mock Tests", "Attempt These tests to check your preparation",R.drawable._6426060_vector_test_flat_design_icon_isolated_education_exam),
                new Resources("Scholarship Details", "Checkout the eligibility criteria for scholarships",R.drawable._6426060_vector_test_flat_design_icon_isolated_education_exam)
        };
        Projectadaptor adaptor = new Projectadaptor(resource ,this);
        kvpyresourcelist.setAdapter(adaptor);

    }

    @Override
    public void OnItemClick(int position) {

        if(position==0){
            Toast.makeText(KVPY_Activity.this, "Coming Soon!!", Toast.LENGTH_SHORT).show();
        }
        if (position==1){
            Intent intent1 = new Intent(KVPY_Activity.this,KVPYpyq.class);
            startActivity(intent1);
        }
        if(position==2){
            Toast.makeText(KVPY_Activity.this, "Coming Soon!!", Toast.LENGTH_SHORT).show();
        }

    }
}