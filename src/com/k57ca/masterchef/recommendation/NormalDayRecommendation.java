package com.k57ca.masterchef.recommendation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

import com.k57ca.masterchef.DishGuidance;
import com.k57ca.masterchef.DishesView;
import com.k57ca.masterchef.ImageAdapter;
import com.k57ca.masterchef.R;

public class NormalDayRecommendation extends Activity {
	GridView gridView;
	static final String[] LABELS = {"Món chính","Món phụ","Đồ uống", "Món tráng miệng"};
	@Override
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_day_recommendation);
 
//		gridView = (GridView) findViewById(R.id.n_day_recommendation_view);
//
//		gridView.setAdapter(new ImageAdapter(this, LABELS));
//		 
//		gridView.setOnItemClickListener(new OnItemClickListener() {
//			public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
//				//Intent i = new Intent(this, DishGuidance.class);
// 
//			}
//		});
	}

//	// View guidance
//	public void viewDishGuidance(View v) {
//		Intent i = new Intent(null, DishGuidance.class);
//		startActivity(i);
//	}

}