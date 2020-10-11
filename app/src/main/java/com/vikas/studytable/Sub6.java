package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sub6 extends AppCompatActivity {

    EditText editText6;
    final DbHelper myDb = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub6);
        editText6 = findViewById(R.id.sub6);
    }

    public void next8(View view) {
        myDb.sub6(editText6.getText().toString());
        Intent intent = new Intent(this, Sub7.class);
        startActivity(intent);
        finish();

    }
}
