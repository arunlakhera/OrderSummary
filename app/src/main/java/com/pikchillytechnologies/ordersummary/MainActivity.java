package com.pikchillytechnologies.ordersummary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView orderListView;

    CustomOrderAdapter customAdapter;
    List<String> orderList;
    String orderTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListView to show list of channels available
        orderListView = findViewById(R.id.listview_Order_Item);
        orderList = new ArrayList<>();

        orderList.add(new String("Haemogram"));

        orderList.add(new String("Blood Sugar"));

        orderList.add(new String("Blood Sugar"));

        orderList.add(new String("Lipid Profile"));

        orderList.add(new String("Blood Urea"));

        orderList.add(new String("Serum Creatinine"));


        customAdapter = new CustomOrderAdapter(getApplicationContext(), orderList);
        orderListView.setAdapter(customAdapter);
        Helper.getListViewSize(orderListView);

    }
}
