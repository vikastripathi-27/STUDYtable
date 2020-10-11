package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub2 extends AppCompatActivity {

    EditText editText2;
    final DbHelper myDb = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        editText2 = findViewById(R.id.sub2);
    }

    public void next5(View view) {
        myDb.sub2(editText2.getText().toString());
        Intent intent = new Intent(this, Sub3.class);
        startActivity(intent);
        finish();
    }
}




