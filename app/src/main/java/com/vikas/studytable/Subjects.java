package com.vikas.studytable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Subjects extends AppCompatActivity {

    final DbHelper myDb = new DbHelper(this);
    String name,sub1,sub2,sub3,sub4,sub5,sub6,sub7,information;
    TextView n,s1,s2,s3,s4,s5,s6,s7,info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        n = findViewById(R.id.name_op);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);
        s7 = findViewById(R.id.s7);
        info = findViewById(R.id.info);

        Cursor res = myDb.get_data();
        if(res.getCount() == 0) {
            Toast.makeText(Subjects.this,"No data",Toast.LENGTH_SHORT).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            name = res.getString(1);
            sub1 = res.getString(2);
            sub2 = res.getString(3);
            sub3 = res.getString(4);
            sub4 = res.getString(5);
            sub5 = res.getString(6);
            sub6 = res.getString(7);
            sub7 = res.getString(8);
            information = res.getString(9);
            n.setText(name);
            s1.setText(sub1);
            s2.setText(sub2);
            s3.setText(sub3);
            s4.setText(sub4);
            s5.setText(sub5);
            s6.setText(sub6);
            s7.setText(sub7);
            info.setText(information);
        }
    }

    public void deadline(View view) {
        Intent intent = new Intent(this, Deadline.class);
        startActivity(intent);
        finish();
    }


}
