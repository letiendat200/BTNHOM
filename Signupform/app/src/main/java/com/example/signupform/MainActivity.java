package com.example.signupform;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends Activity {

    private Context context;
    private int duration = Toast.LENGTH_SHORT;
    //PLUMBING: Pairing GUI controls with Java objects
    private Button btnSelect;
    private Button btnReset;
    private Button btnSignUp;
    private EditText edtUserName;
    private EditText edtPassword;
    private EditText edtRetype;
    private EditText edtDate;

    private LinearLayout myScreen;
    private TextWatcher watcher;
    private String PREFNAME = "myPrefFile1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signup_button= (Button)findViewById(R.id.btnSignUp);
        Button reset_button= (Button)findViewById(R.id.btnReset);
        Button select_button= (Button)findViewById(R.id.btnSelect);
        EditText name_text =(EditText)findViewById(R.id.username_fill);
        EditText pass_text =(EditText)findViewById(R.id.password_fill);
        EditText date_text =(EditText)findViewById(R.id.birthday_fill);
        EditText retype_text =(EditText)findViewById(R.id.retype_fill);

        //RadioButton gender_text=(RadioButton) findViewById(R.id.radioGroup);
        //RadioButton hobbies_text=(RadioButton) findViewById(R.id.hoby2);

        signup_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String name = name_text.getText().toString();
                String pass = pass_text.getText().toString();
                String birthdate=date_text.getText().toString();
                //String gender=gender_text.getText().toString();
                //String hobbies=hobbies_text.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                intent.putExtra("name_key", name);
                intent.putExtra("pass_key", pass);
                intent.putExtra("birthdate_key", birthdate);
                //intent.putExtra("gender_key", gender);
                //intent.putExtra("hobbies_key", hobbies);

                startActivity(intent);
            }
        });

        reset_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        select_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(context, "onDestroy", duration).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //String chosenColor = txtSpyBox.getText().toString();
        //saveStateData(chosenColor);
        Toast.makeText(context, "onPause", duration).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(context, "onRestart", duration).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(context, "onResume", duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //updateMeUsingSavedStateData();
        Toast.makeText(context, "onStart", duration).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(context, "onStop", duration).show();
    }


}