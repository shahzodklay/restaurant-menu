package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);


     dish [] dishes = {
             new dish("Sultana and rice loaf","Crunchy bread made with sultana and jasmine rice",999),
             new dish("Cauliflower and cardamom madras", "Medium-hot madras made with fresh cauliflower and black cardamom",1111),
             new dish("Banana and sultana muffins" ,"Rich muffins made with fresh banana and sultana",2222),
             new dish("Sweetcorn and chicken madras","Medium-hot madras made with creamed sweetcorn and corn-fed chicken",3333),
             new dish("Stilton and scallop dumplings","Thin pastry cases stuffed with stilton and scallop",4444),
             new dish("Cod and peppercorn crumble","Pacific cod and pink peppercorn topped with butter crumble",5555),
             new dish(" Mustard seed and pork korma","Creamy korma made with yellow mustard seeds and pork",6666),
             new dish("Salmon and kiwi fruit salad","A crunchy salad featuring smoked salmon and fresh kiwi fruit",7777),
             new dish("Cheese and melon cheesecake","A luxurious cheesecake layered with fresh cheese and honeydew melon",8888),
             new dish("Cashew and boysenberry salad",  "Cashew and fresh boysenberry served on a bed of lettuce",9999),
             new dish("Blueberry and buckwheat pancake", "Crispy pancake filled with fresh blueberry and buckwheat",9876),
             new dish(" Lamb and broccoli spaghetti", "Spagetti topped with a blend of succulent lamb and fresh broccoli",8765),

        };


        ArrayAdapter<dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);

        startersList.setAdapter(dishesAdapter);

    }
}