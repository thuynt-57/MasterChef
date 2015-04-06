package com.k57ca.masterchef;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

 
public class MainActivity extends Activity implements OnClickListener{
	private Button loginBtn;
	private Button registerBtn;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginBtn =  (Button)findViewById(R.id.btnSingIn);
		registerBtn = (Button) findViewById(R.id.btnSignUp);
		
		//register listeners
		loginBtn.setOnClickListener(this);
		registerBtn.setOnClickListener(this);
	}

	
	public void onClick(View v) {
		// determine which button was pressed:
		if(v.getId()== R.id.btnSingIn){
			Intent i = new Intent(this, Login.class);
			startActivity(i);
		}
		if(v.getId()== R.id.btnSignUp){
			Intent i = new Intent(this, Register.class);
			startActivity(i);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_search) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}

