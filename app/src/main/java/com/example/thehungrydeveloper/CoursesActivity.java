package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ListView coursesList = findViewById(R.id.list_view_courses);
        String [] dishes = {


                "Coconut milk and cialledda salad",
                "Onion and fish ciabatta",
                " Orange and cardamom biscuits",
                ". Cardamom and nectarine parcels",
                "Napolitana and chorizo fusilli",
                "Fish and asafoetida korma",
                "Hazelnut and prune biscuits",
                " Cheese and falafel toastie",
                "Spinach and chilli fusilli",
                "Blackberry and raspberry jam",
                "Chilli and egg toastie",
                "Coriander and cabbage dumplings",
                "Navratan and quorn madras",
                "Cucumber and apple toastie",
                "Amchoor and lamb vindaloo",
                "Pineapple and anise vindaloo",
                " Chilli oil and donair salad",
                "Parmesan and emu salad",
                " Custard and chilli cake",
                "Coriander and plantain korma"
        };


        ArrayAdapter<String>dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        coursesList.setAdapter(dishesAdapter);


    }
}