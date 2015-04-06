package com.k57ca.masterchef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
	private Context context;
	private String[] dishes;
	
	public ImageAdapter (Context _context, String[] _dishes) {
		this.context = _context;
		this.dishes = _dishes;
	}
 
 
	public View getView(int position, View convertView, ViewGroup parent) {
 
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View gridView;
 
		if (convertView == null) {
 
			gridView = new View(context);
 
			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.dish, null);
 
			// set value into textview
			TextView textView = (TextView) gridView
					.findViewById(R.id.grid_item_label);
			textView.setText(dishes[position]);
 
			// set image based on selected text
			ImageView imageView = (ImageView) gridView
					.findViewById(R.id.grid_item_image);
 
			String dish = dishes[position];
 
			if (dish.equals("Nộm tép tươi")) {
				imageView.setImageResource(R.drawable.nom_tep_tuoi);
			} else if (dish.equals("Canh trứng cà chua")) {
				imageView.setImageResource(R.drawable.canh_trung_ca_chua);
			} else if (dish.equals("Chân giò hầm ngũ vị hương")) {
				imageView.setImageResource(R.drawable.chan_gio_ham_ngu_vi_huong);
			} else if (dish.equals("Sườn hầm cocacola")) {
				imageView.setImageResource(R.drawable.suon_ham_cocacola);
			}  else if (dish.equals("Sườn xào chua ngọt")) {
				imageView.setImageResource(R.drawable.suon_xao_chua_ngot);
			}  else if (dish.equals("Lươn kho xả ớt")) {
				imageView.setImageResource(R.drawable.luon_kho_xa_ot);
			} else {
				imageView.setImageResource(R.drawable.salad_susu);
			}
 
		} else {
			gridView = (View) convertView;
		}
 
		return gridView;
	}
 
	@Override
	public int getCount() {
		return dishes.length;
	}
 
	@Override
	public Object getItem(int position) {
		return null;
	}
 
	@Override
	public long getItemId(int position) {
		return 0;
	}
 
}