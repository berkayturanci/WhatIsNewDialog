package com.nonzeroapps.whatisnew.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by berkayturanci on 01/08/2017.
 */

abstract class ViewPagerAdapter extends PagerAdapter {

    public abstract View getItem(int position);

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        View mItemView = getItem(position);
        container.addView(mItemView);
        return mItemView;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}