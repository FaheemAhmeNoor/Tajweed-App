package com.example.tajweedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gitHub extends AppCompatActivity {
    Button linkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub);
        linkBtn = findViewById(R.id.link_btn);

        linkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://github.com/FaheemAhmeNoor/GitHub-Doc/tree/master/VCS%20logos");

            }
        });
    }
    public void  goToUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}

