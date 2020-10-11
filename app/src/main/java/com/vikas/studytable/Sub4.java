package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub4 extends AppCompatActivity {

    EditText editText4;
    final DbHelper myDb = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);
        editText4 = findViewById(R.id.sub4);
    }

    public void next6(View view) {
        myDb.sub4(editText4.getText().toString());
        Intent intent = new Intent(this, Sub5.class);
        startActivity(intent);
        finish();
    }
}
