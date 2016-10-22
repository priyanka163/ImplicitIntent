package com.example.bridgelabz.bridgeimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button visit;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visit= (Button) findViewById(R.id.button);
        editText= (EditText) findViewById(R.id.editText);


        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url =editText.getText().toString();


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www."+url+".com"));

              //  i.setData(Uri.parse("http:/"));
                startActivity(i);
            }
        });


    }
}
