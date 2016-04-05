package com.example.marctron.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button[] btns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int id = R.id.button0;
        btns = new Button[6];
        for (int i = 0; i < btns.length; i++) {
            btns[i] = (Button) findViewById(id);
            btns[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    clicked(v);
                }
            });
            id++;
        }


    }

    public void clicked(View v) {
        if (v.equals(btns[0]))
            Toast.makeText(this, "This button will launch my spotify streamer app!", Toast.LENGTH_SHORT).show();
        else if (v.equals(btns[1]))
            Toast.makeText(this, "This button will launch my scores app!", Toast.LENGTH_SHORT).show();
        else if (v.equals(btns[2]))
            Toast.makeText(this, "This button will launch my library app!", Toast.LENGTH_SHORT).show();
        else if (v.equals(btns[3]))
            Toast.makeText(this, "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
        else if (v.equals(btns[4]))
            Toast.makeText(this, "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
        else if (v.equals(btns[5]))
            Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
