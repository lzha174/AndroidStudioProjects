package com.example.oddozhang.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Restaurant r = new Restaurant();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button save=(Button)findViewById(R.id.save);

    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
    }

}
