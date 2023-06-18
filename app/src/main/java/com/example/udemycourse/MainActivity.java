package com.example.udemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText Name;
    private Button Login;
    private EditText pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.textInputEditText);
        Name = findViewById(R.id.editTextTextPersonName);
        Login = findViewById(R.id.button2);
        pswd = findViewById(R.id.editTextTextPassword);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s = Name.getText().toString();
                if (s.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
                }
                else{
                //Toast.makeText(MainActivity.this, "Welcome "+ s, Toast.LENGTH_SHORT).show();
                pswd.onEditorAction(EditorInfo.IME_ACTION_DONE);
                username.onEditorAction(EditorInfo.IME_ACTION_DONE);
                Name.onEditorAction(EditorInfo.IME_ACTION_DONE);
                Intent startexamintent = new Intent(MainActivity.this,Exam_Activity.class);
                Bundle b = new Bundle();
                b.putString("stuff",s);
                startexamintent.putExtras(b);
                startActivity(startexamintent);
                }
            }
        });
    }
}