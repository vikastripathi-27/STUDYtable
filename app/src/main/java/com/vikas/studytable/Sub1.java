package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sub1 extends AppCompatActivity {

    final DbHelper myDb = new DbHelper(this);
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
        editText1 = findViewById(R.id.sub1);

    }



    public void next4(View view) {

        myDb.sub1(editText1.getText().toString());
        Intent intent = new Intent(this, Sub2.class);
        startActivity(intent);
        finish();
    }

}
