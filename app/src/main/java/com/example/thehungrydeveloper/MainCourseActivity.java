package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        ListView Maincourselist = findViewById(R.id.list_maincourse);

        Maincourse[] maincourse = {
                new Maincourse("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Maincourse("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Maincourse("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Maincourse("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Maincourse("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Maincourse("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Maincourse("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Maincourse("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)

        };

        ArrayAdapter<Maincourse> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,maincourse);
        Maincourselist.setAdapter(dishAdapter);


    }


}