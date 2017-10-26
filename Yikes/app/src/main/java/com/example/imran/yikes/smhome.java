package com.example.imran.yikes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class smhome extends AppCompatActivity {
 EditText pid,phn;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smhome);
        Button REQ,ATTEMPT,LOGOUT;
        pid=(EditText)findViewById(R.id.editText6);
        REQ= (Button)findViewById(R.id.button2);
phn=(EditText)findViewById(R.id.editText4);
        LOGOUT =(Button)findViewById(R.id.button4);
ATTEMPT=(Button)findViewById(R.id.button3);
        REQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Background(smhome.this).execute("reqcall","hi");

            }
        });
        ATTEMPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = pid.getText().toString();
                String ph=phn.getText().toString();
                new Background(smhome.this).execute("attempt",id,ph);
            }
        });

        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(smhome.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
