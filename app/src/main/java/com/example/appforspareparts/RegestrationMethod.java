package com.example.appforspareparts;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class RegestrationMethod extends AppCompatActivity {


    Button registerSignInBtn,registerSignUnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration_method);

        registerSignInBtn = findViewById(R.id.RegisterSignInBtn);

        registerSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegestrationMethod.this,SignInPage.class));
                finish();
            }
        });


        registerSignUnBtn = findViewById(R.id.RegisterSignUpbtn);

        registerSignUnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegestrationMethod.this,SignUpPage.class));
                finish();
            }
        });
    }

    protected void onStart()
    {   super.onStart();

//        FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
//        if(user != null)
//        {
//            startActivity(new Intent(RegisterMethod.this,MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
//        }

    }
}
