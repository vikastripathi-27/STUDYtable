package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Name extends AppCompatActivity {

    final DbHelper myDb = new DbHelper(this);
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        SharedPreferences preferences = getSharedPreferences("PREFERENCE",MODE_PRIVATE);
        String first_time = preferences.getString("FirstTimeInstall","");

        if(first_time.equals("Yes")) {
            Intent intent = new Intent(Name.this,Subjects.class);
            startActivity(intent);
            finish();
        }
        else {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("FirstTimeInstall","Yes");
            editor.apply();
        }
        editText = findViewById(R.id.name);
    }

    public void next3(View view) {
        myDb.insert_name(editText.getText().toString());
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
        finish();
    }
}
