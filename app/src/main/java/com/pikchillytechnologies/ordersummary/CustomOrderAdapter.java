package com.pikchillytechnologies.ordersummary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomOrderAdapter extends ArrayAdapter<String> {

    LayoutInflater inflter;
    String order;

    public CustomOrderAdapter(Context context, List<String> orderList){
        super(context,0, orderList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = inflter.from(getContext()).inflate(R.layout.order_layout,parent,false);
        }

        order = getItem(position);

        TextView testNameTextView = convertView.findViewById(R.id.textview_TestName);
        TextView testPriceTextView = convertView.findViewById(R.id.textview_TestPrice);

        testNameTextView.setText(String.valueOf(order));

        notifyDataSetChanged();

        return convertView;

    }
}
