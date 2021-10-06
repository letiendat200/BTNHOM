package com.example.signupform;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView receiver_username;
    TextView receiver_password;
    TextView receiver_birthday;
    TextView receiver_gender;
    TextView receiver_hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        receiver_username = (TextView)findViewById(R.id.Username);
        receiver_password = (TextView)findViewById(R.id.Password);
        receiver_birthday = (TextView)findViewById(R.id.Birthday);
        //receiver_gender = (TextView)findViewById(R.id.Gender);
        //receiver_hobbies = (TextView)findViewById(R.id.Hobbies);


        Intent intent = getIntent();

        String name_text = intent.getStringExtra("name_key");
        String pass_text = intent.getStringExtra("pass_key");
        String birthday_text = intent.getStringExtra("birthdate_key");
        //String gender_text=intent.getStringExtra("gender_key");
        //String hobbies_text=intent.getStringExtra("hobbies_key");

        // display the string into textView
        receiver_username.setText(name_text);
        receiver_password.setText(pass_text);
        receiver_birthday.setText(birthday_text);
        //receiver_gender.setText(gender_text);
        //receiver_hobbies.setText(hobbies_text);
    }
}