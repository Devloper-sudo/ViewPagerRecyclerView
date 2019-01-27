package toolbar.scroll.reign.com.viewpagerrecyclerview;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek on 1/27/2019.
 */

public class SliderPagerAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater;
    Activity activity;
    List<Item> image_arraylist;

    public SliderPagerAdapter(Activity activity, List<Item> image_arraylist) {
        this.activity = activity;
        this.image_arraylist = image_arraylist;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.layout_slider, container, false);
        ImageView im_slider = (ImageView) view.findViewById(R.id.im_slider);
//        Picasso.with(activity.getApplicationContext())
//                .load(image_arraylist.get(position))
//                .placeholder(R.mipmap.ic_launcher) // optional
//                .error(R.mipmap.ic_launcher)         // optional
//                .into(im_slider);
//


        Item item = image_arraylist.get(position);
        im_slider.setImageResource(item.getImage());
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return image_arraylist.size();
    }


    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}
