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
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class T27Activity extends Activity {
	 int sumaresultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_t27);
		Button boton = (Button) findViewById(R.id.button1);
        Button boton1 = (Button) findViewById(R.id.button2);
        Button boton2 = (Button) findViewById(R.id.button3);
        Button boton3 = (Button) findViewById(R.id.button4);
	    sumaresultado=this.getIntent().getIntExtra("variable_integer", 1);

        boton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==findViewById(R.id.button1).getId())
		     	{Intent i = new Intent(T27Activity.this, T28Activity.class);
		         //Inicia la actividad
		     	i.putExtra("variable_integer", sumaresultado);
		         startActivity(i);
		         T27Activity.this.finish();}
			}
		});
        
        boton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==findViewById(R.id.button2).getId())
		     	{Intent i = new Intent(T27Activity.this, T28Activity.class);
		         //Inicia la actividad
		     	 sumaresultado +=1;
		     	i.putExtra("variable_integer", sumaresultado);
		         startActivity(i);
		         T27Activity.this.finish();}
			}
		});
        
        boton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==findViewById(R.id.button3).getId())
		     	{Intent i = new Intent(T27Activity.this, T28Activity.class);
		         //Inicia la actividad
		     	i.putExtra("variable_integer", sumaresultado);
		         startActivity(i);
		         T27Activity.this.finish();}
			}
		});
        
        boton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==findViewById(R.id.button4).getId())
		     	{Intent i = new Intent(T27Activity.this, T28Activity.class);
		         //Inicia la actividad
		     	i.putExtra("variable_integer", sumaresultado);
		         startActivity(i);
		         T27Activity.this.finish();}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.t27, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
