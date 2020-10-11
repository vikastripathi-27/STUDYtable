package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub3 extends AppCompatActivity {

    EditText editText3;
    final DbHelper myDb = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
        editText3 = findViewById(R.id.sub3);
    }

    public void next2(View view) {
        myDb.sub3(editText3.getText().toString());
        Intent intent = new Intent(this, Sub4.class);
        startActivity(intent);
        finish();
    }
}
