package com.moovap.jdportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String[] APPS = {
            "Popular Movies", "Stock Hawk", "Built it Bigger",
            "Make your App Material", "Go Ubiquitous", "Capstone: My own app"
    };

    LinearLayout mButtonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonList = (LinearLayout) findViewById(R.id.button_list);

        for(int i = 0; i < APPS.length; i++) {
            Button button = new Button(this);

            final String name = APPS[i];
            button.setText(name);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String text = "This button will launch my " + name + " app.";
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                }
            });

            mButtonList.addView(button);
        }
    }

}
