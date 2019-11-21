package com.chanhee.sojeeeon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class TodoActivity extends AppCompatActivity {
    EditText editTodo;
    Button BtnCheck;
    String DO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        editTodo=findViewById(R.id.todoEdit);
        BtnCheck=findViewById(R.id.checkTodo);
        DO=editTodo.getText().toString();
        BtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DO=editTodo.getText().toString();
                Intent intent=new Intent(TodoActivity.this,FireBase.class);
                intent.putExtra("ToDo",DO);
                startActivity(intent);

            }
        });
    }
}
