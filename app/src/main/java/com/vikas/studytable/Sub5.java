package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub5 extends AppCompatActivity {

    EditText editText5;
    final DbHelper myDb = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);
        editText5 = findViewById(R.id.sub5);
    }

    public void next7(View view) {
        myDb.sub5(editText5.getText().toString());
        Intent intent = new Intent(this, Sub6.class);
        startActivity(intent);
        finish();
    }
}
