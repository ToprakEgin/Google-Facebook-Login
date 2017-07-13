package com.challenge.toprakegin.calculuschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URI;

public class InformationFacebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_facebook);

        Bundle bundle = getIntent().getExtras();

        String id = bundle.getString("idFacebook");
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        String birthday = bundle.getString("age");
        String locale = bundle.getString("locale");
        String gender = bundle.getString("gender");

        if(email == null){
            email = "E-Mail bilgisi çekilemedi!";
        }

        TextView idt = (TextView) findViewById(R.id.id_facebook);
        TextView namet = (TextView) findViewById(R.id.name_facebook);
        TextView emailt = (TextView) findViewById(R.id.email_facebook);
        TextView bdayt = (TextView) findViewById(R.id.bday_facebook);
        TextView gendert = (TextView) findViewById(R.id.gender_facebook);
        TextView localet = (TextView) findViewById(R.id.locale_facebook);

        idt.setText(id);
        namet.setText(name);
        emailt.setText(email);
        bdayt.setText(birthday);
        gendert.setText(gender);
        localet.setText(locale);

    }
}
