package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    EditText editText;
    final DbHelper myDb = new DbHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editText = findViewById(R.id.bio);
    }

    public void next10(View view) {
        myDb.profile(editText.getText().toString());
        Intent intent = new Intent(this, Sub1.class);
        startActivity(intent);
        finish();

    }
}
