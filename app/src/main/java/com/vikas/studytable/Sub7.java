package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub7 extends AppCompatActivity {

    EditText editText7;
    final DbHelper myDb = new DbHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub7);
        editText7 = findViewById(R.id.sub7);
    }

    public void next9(View view) {
        myDb.sub7(editText7.getText().toString());
        Intent intent = new Intent(this, Subjects.class);
        startActivity(intent);
        finish();

    }
}
