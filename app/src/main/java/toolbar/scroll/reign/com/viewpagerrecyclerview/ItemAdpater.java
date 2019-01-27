package toolbar.scroll.reign.com.viewpagerrecyclerview;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Abhishek on 1/27/2019.
 */

public class ItemAdpater extends RecyclerView.Adapter<ViewHolder> {


    private List<Item> itemList;
    private Context context;

    public ItemAdpater(Context context, List<Item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_layout, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (holder instanceof ItemHolder) {
            final ItemHolder itemHolder = (ItemHolder) holder;
            itemHolder.textViewone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, "Hekllooo", Toast.LENGTH_SHORT).show();
                    itemHolder.textViewone.setBackgroundResource(R.drawable.two_wid_border);

                }
            });


            final SliderPagerAdapter sliderPagerAdapter = new SliderPagerAdapter((Activity) context, itemList);
            itemHolder.viewPager.setAdapter(sliderPagerAdapter);

            itemHolder.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {


                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });


        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ItemHolder extends RecyclerView.ViewHolder {


        public TextView textView;
        public ViewPager viewPager;
        public TextView textViewone;

        public ItemHolder(View itemView) {
            super(itemView);
            viewPager = itemView.findViewById(R.id.vp_slider);
            textViewone = itemView.findViewById(R.id.textviewone);
        }
    }
}
