package com.k57ca.masterchef.recommendation;

import com.k57ca.masterchef.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuRecommendation extends Activity {
	private Button normalDayBtn;
	private Button weekenBtn;
	private Button valentineBtn;
	private Button birthDayBtn;
	private Button menGuestBtn;
	private Button womenGuestBtn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_recommendation);
		
		normalDayBtn =  (Button)findViewById(R.id.btnRecommendNday);
		//register listeners
		normalDayBtn .setOnClickListener((OnClickListener) this);
		
		weekenBtn =  (Button)findViewById(R.id.btnRecommendWeeken);
		//register listeners
		weekenBtn .setOnClickListener((OnClickListener) this);
		
		valentineBtn =  (Button)findViewById(R.id.btnRecommendVDay);
		//register listeners
		valentineBtn .setOnClickListener((OnClickListener) this);
		
		birthDayBtn =  (Button)findViewById(R.id.btnRecommendBDay);
		//register listeners
		birthDayBtn .setOnClickListener((OnClickListener) this);
		
		menGuestBtn =  (Button)findViewById(R.id.btnRecommendWGuest);
		//register listeners
		menGuestBtn .setOnClickListener((OnClickListener) this);
		
		womenGuestBtn =  (Button)findViewById(R.id.btnRecommendMGuest);
		//register listeners
		womenGuestBtn .setOnClickListener((OnClickListener) this);
	}
	
	public void onClick(View v) {
		// determine which button was pressed:
		if(v.getId()== R.id.btnRecommendNday){
			Intent i = new Intent(this, NormalDayRecommendation.class);
			startActivity(i);
		}
		
		if(v.getId()== R.id.btnRecommendWeeken){
			Intent i = new Intent(this, WeekenRecommendation.class);
			startActivity(i);
		}
		
		if(v.getId()== R.id.btnRecommendVDay){
			Intent i = new Intent(this, ValentineDayRecommendation.class);
			startActivity(i);
		}
		
		if(v.getId()== R.id.btnRecommendBDay){
			Intent i = new Intent(this, BirthDayRecommendation.class);
			startActivity(i);
		}
		
		if(v.getId()== R.id.btnRecommendWGuest){
			Intent i = new Intent(this, MenGuestRecommendation.class);
			startActivity(i);
		}
		
		if(v.getId()== R.id.btnRecommendMGuest){
			Intent i = new Intent(this, WomenGuestRecommendation.class);
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
