package com.challenge.toprakegin.calculuschallenge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class InformationGoogle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_google);
        Context context = getApplicationContext();

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        Uri picture = Uri.parse(intent.getStringExtra("picture"));

        TextView nameText = (TextView) findViewById(R.id.name_google);
        TextView emailText = (TextView) findViewById(R.id.email_google);
        TextView idText = (TextView) findViewById(R.id.id_google);
        ImageView photo = (ImageView) findViewById(R.id.profilePicture_google);

        nameText.setText(name);
        emailText.setText(email);
        idText.setText(id);
        Picasso.with(context).load(picture).into(photo);
    }
}
