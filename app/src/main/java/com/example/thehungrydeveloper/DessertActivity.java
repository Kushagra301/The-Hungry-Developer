maipackage com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView desserts = findViewById(R.id.list_dessert);

        desert[] desert = {
                new desert("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new desert("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new desert("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new desert("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new desert("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new desert("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new desert("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new desert("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<desert> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desert);
        desserts.setAdapter(dishAdapter);
    }
}