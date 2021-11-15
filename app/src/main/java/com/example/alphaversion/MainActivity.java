package com.example.alphaversion;

import static com.example.alphaversion.FBref.refUser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    String email,password;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
    }

    public void logIn(View view) {
        email=ed1.getText().toString();
        password=ed2.getText().toString();
        user = new User(email, password);
        refUser.child(email).setValue(user);

    }
}