package com.k57ca.masterchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import com.k57ca.masterchef.ImageAdapter;

public class DishesView extends Activity {
	GridView gridView;
	static final String[] DISHES = {"Salad susu","Canh trứng cà chua","Chân giò hầm ngũ vị hương", "Sườn hầm cocacola", "Sườn xào chua ngọt", "Lươn kho xả ớt"};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_dishes);
 
		gridView = (GridView) findViewById(R.id.dishes_view);

		gridView.setAdapter(new ImageAdapter(this, DISHES));
		 
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
				//Intent i = new Intent(this, DishGuidance.class);
 
			}
		});
	}

	// View guidance
	public void viewDishGuidance(View v) {
		Intent i = new Intent(DishesView.this, DishGuidance.class);
		startActivity(i);
	}

}