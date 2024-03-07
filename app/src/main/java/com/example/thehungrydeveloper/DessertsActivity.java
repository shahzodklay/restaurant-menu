package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertList = findViewById(R.id.list_view_desserts);
        dish [] dessert = {
                new dish("Sultana and rice loaf","Crunchy bread made with sultana and jasmine rice",999),
                new dish("Cauliflower and cardamom madras", "Medium-hot madras made with fresh cauliflower and black cardamom",1111),
                new dish("Banana and sultana muffins" ,"Rich muffins made with fresh banana and sultana",2222),
                new dish("Sweetcorn and chicken madras","Medium-hot madras made with creamed sweetcorn and corn-fed chicken",3333),
                new dish("Stilton and scallop dumplings","Thin pastry cases stuffed with stilton and scallop",4444),
                new dish("Cod and peppercorn crumble","Pacific cod and pink peppercorn topped with butter crumble",5555),

        };


        ArrayAdapter<dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dessert);

        dessertList.setAdapter(dishesAdapter);





    }
}