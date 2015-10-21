package com.example.c;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import android.os.Bundle;
//import android.support.v4.app.ListFragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class nuoc extends ListFragment implements OnItemClickListener {
	// Array of strings storing country names
	String[] countries = new String[] { "India", "Pakistan", "Sri Lanka",
			"China", "Bangladesh", "Nepal", "Afghanistan", "North Korea",
			"South Korea", "Japan" };

	// Array of integers points to images stored in /res/drawable/
	int[] flags = new int[] { R.drawable.india, R.drawable.pakistan,
			R.drawable.srilanka, R.drawable.china, R.drawable.bangladesh,
			R.drawable.nepal, R.drawable.afghanistan, R.drawable.nkorea,
			R.drawable.skorea, R.drawable.japan };

	// Array of strings to store currencies
	String[] currency = new String[] { "Indian Rupee", "Pakistani Rupee",
			"Sri Lankan Rupee", "Renminbi", "Bangladeshi Taka",
			"Nepalese Rupee", "Afghani", "North Korean Won",
			"South Korean Won", "Japanese Yen" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("txt", "Country : " + countries[i]);
			hm.put("cur", "Currency : " + currency[i]);
			hm.put("flag", Integer.toString(flags[i]));
			aList.add(hm);

		}

		String[] form = { "flag", "txt", "cur" };
		int[] to = { R.id.flag, R.id.txt, R.id.cur };
		SimpleAdapter adapter = new SimpleAdapter(getActivity()
				.getBaseContext(), aList, R.layout.list_fragment, form, to);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		getListView().setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getActivity(), "item :" + position, Toast.LENGTH_SHORT)
				.show();
	}

}
