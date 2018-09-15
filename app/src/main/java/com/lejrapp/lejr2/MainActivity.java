package com.lejrapp.lejr2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText usernameText;
    private EditText passwordText;
    private Button loginButton;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        usernameText = findViewById(R.id.username);
        passwordText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        progressBar = findViewById(R.id.loginProgress);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginButton.setEnabled(false);
                progressBar.setVisibility(View.VISIBLE);

                Intent intent = new Intent(MainActivity.this, UploadPhotoActivity.class);
                startActivity(intent);
                //TODO: Send request, change activity
            }
        });
    }
}