package com.example.fer.hola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(R.string.hello_world);

        Button button1 =(Button) findViewById(R.id.button);
        String mensaje1=getResources().getString(R.string.mensaje1);
        button1.setText(mensaje1);
        float dimmension1=getResources().getDimension(R.dimen.tipo_grande);
        button1.setTextSize(dimmension1);
        int color1=getResources().getColor(R.color.verde);
        button1.setTextColor(color1);

        Button button2 =(Button) findViewById(R.id.button2);
        String mensaje2=getResources().getString(R.string.mensaje2);
        button2.setText(mensaje2);
        float dimmension2=getResources().getDimension(R.dimen.tipo_reducido);
        button2.setTextSize(dimmension2);
        int color2=getResources().getColor(R.color.rojo);
        button2.setTextColor(color2);
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
