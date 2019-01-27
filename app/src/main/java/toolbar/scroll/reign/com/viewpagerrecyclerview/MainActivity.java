package toolbar.scroll.reign.com.viewpagerrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.images_1 ,"Heeloo"));
        itemList.add(new Item(R.drawable.images_2, "Heedfdloo"));
        itemList.add(new Item(R.drawable.images_3, "Hee"));
        itemList.add(new Item(R.drawable.images_4, "Hee"));
        itemList.add(new Item(R.drawable.images_5, "Hee"));
        itemList.add(new Item(R.drawable.imags_6, "Hee"));
        recycler_view.setAdapter(new ItemAdpater(this,itemList));



    }


}
