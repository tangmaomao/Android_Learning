package com.maomao.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

//        EditText myTextField = (EditText)findViewById(R.id.myTextField);
//
//        Log.i("Info", myTextField.getText().toString());

        EditText myUsername = (EditText)findViewById(R.id.myUsername);
        EditText myPassword = (EditText)findViewById(R.id.myPassword);
        Log.i("Username", myUsername.getText().toString());
        Log.i("Password", myPassword.getText().toString());

        Toast.makeText(MainActivity.this, "Hi, " + myUsername.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void newPicture(View view) {
        Log.i("Test", "Button clicked!");

        ImageView image = (ImageView) findViewById(R.id.puppy);
        image.setImageResource(R.drawable.xiaoma);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
