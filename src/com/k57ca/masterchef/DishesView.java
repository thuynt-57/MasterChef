package com.k57ca.masterchef;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import com.k57ca.masterchef.ImageAdapter;

public class DishesView extends Activity {
	GridView gridView;
	 
	static final String[] DISHES = new String[] { 
		"Canh trứng cà chua", "Chân giò hầm ngũ vị hương","Nộm tép tươi", "Lươn kho xả ớt", "Salad susu", "Sườn hầm cocacola"};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_dishes);
 
		gridView = (GridView) findViewById(R.id.dishes_view);
 
		gridView.setAdapter(new ImageAdapter(this, DISHES));
 
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				//Toast.makeText(
			//	   getApplicationContext(),
				//   ((TextView) v.findViewById(R.id.grid_item_label))
				//   .getText(), Toast.LENGTH_SHORT).show();
 
			}
		});
 
	}
 
}