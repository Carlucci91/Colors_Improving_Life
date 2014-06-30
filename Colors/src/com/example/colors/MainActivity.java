package com.example.colors;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button1);
        boton.setOnClickListener(this);
        Button boton1 = (Button) findViewById(R.id.button2);
        boton1.setOnClickListener(this);
        Button boton2 = (Button) findViewById(R.id.button3);
        boton2.setOnClickListener(this);
        Button boton3 = (Button) findViewById(R.id.button4);
        boton3.setOnClickListener(this);
      
    }

    public void onClick(View v) {
        //Define la actividad
    	 if(v.getId()==findViewById(R.id.button1).getId())
     	{Intent i = new Intent(this, ColorBlobDetectionActivity.class);
  
         //Inicia la actividad
         startActivity(i);}
    	 if(v.getId()==findViewById(R.id.button2).getId())
      	{Intent i = new Intent(this, PaletaActivity.class);
   
          //Inicia la actividad
          startActivity(i);}
    	 if(v.getId()==findViewById(R.id.button3).getId())
      	{Intent i = new Intent(this, TestActivity.class);
   
          //Inicia la actividad
          startActivity(i);}
    	 if(v.getId()==findViewById(R.id.button4).getId())
      	{Intent i = new Intent(this, InfoActivity.class);
   
          //Inicia la actividad
          startActivity(i);}
 
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}