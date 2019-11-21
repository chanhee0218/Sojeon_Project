package com.chanhee.sojeeeon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class FireBase extends AppCompatActivity {
    private FirebaseAnalytics firebaseAnalytics;
    String RecieveDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_base);
        firebaseAnalytics=FirebaseAnalytics.getInstance(this);
        Intent intent=getIntent();
        RecieveDo=intent.getStringExtra("ToDo");
        if(RecieveDo==null){
            Toast.makeText(this, "입력된 값이 없습니다", Toast.LENGTH_SHORT).show();
        }else{
            HashMap hashMap=new HashMap<>();
            hashMap.put("Doing",RecieveDo);
            firebaseAnalytics.sojeeoon("Doing").push().setValue(hashMap);
        }
    }
}
