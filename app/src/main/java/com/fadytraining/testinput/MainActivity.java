package com.fadytraining.testinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void Visible (View view) {


      EditText edLogo =(EditText) findViewById(R.id.logo_field);
      edLogo.setVisibility(View.VISIBLE);

      EditText edGodfather = (EditText) findViewById(R.id.godfather_field);
      edGodfather.setVisibility(View.VISIBLE);
      }

    public void inVisible (View view) {


        EditText edLogo =(EditText) findViewById(R.id.logo_field);
        edLogo.setVisibility(View.GONE);

        EditText edGodfather = (EditText) findViewById(R.id.godfather_field);
        edGodfather.setVisibility(View.GONE);
    }
  }


