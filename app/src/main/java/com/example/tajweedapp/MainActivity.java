package com.example.tajweedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button startLearning;
    Button gitHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startLearning = findViewById(R.id.start_learning);
        gitHub = findViewById(R.id.github);

        startLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearnTajweedActivity();
            }
        });

        gitHub.setOnClickListener(v -> {
            //goToUrl("https://github.com/FaheemAhmeNoor/GitHub-Doc/tree/master/VCS%20logos");
            openGithubActivity();
        });
    }
    public void openLearnTajweedActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openGithubActivity(){
        Intent intent = new Intent(this, gitHub.class);
        startActivity(intent);
    }
//
//    public void  goToUrl(String s){
//        Uri uri = Uri.parse(s);
//        startActivity(new Intent(Intent.ACTION_VIEW, uri));
//    }

}