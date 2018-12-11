package com.example.ekin.simpleviewpager;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<View> viewList;
    private List<String> slist;
    private SimplePagerAdapter adapter;
    private PagerTabStrip pagerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewpager);

        //获取pagerTitle
        pagerTitle = (PagerTabStrip) findViewById(R.id.pager_title);

        //为标题设置属性，比如背景，颜色线等
        //pagerTitle.setBackgroundColor(Color.RED);//设置背景颜色
        pagerTitle.setTextColor(Color.RED);//设置标题文字的颜色
        pagerTitle.setDrawFullUnderline(false);//将标题下的长分割线去掉
        pagerTitle.setTabIndicatorColor(Color.BLUE);//设置标题下粗一点的短分割线的颜色

        viewList = new ArrayList<View>();
        LayoutInflater layout = getLayoutInflater();
        viewList.add(layout.inflate(R.layout.view_one, null, false));
        viewList.add(layout.inflate(R.layout.view_two, null, false));
        viewList.add(layout.inflate(R.layout.view_three, null, false));
        slist = new ArrayList<String>();
        slist.add("Red");
        slist.add("Green");
        slist.add("Blue");
        adapter = new SimplePagerAdapter(viewList, slist);
        viewPager.setAdapter(adapter);
    }

    public static class SimplePagerAdapter extends PagerAdapter {
        private List<View> viewList;
        private List<String> titleList;

        public SimplePagerAdapter(List<View> viewList, List<String> title) {
            super();
            this.viewList = viewList;
            this.titleList = title;
        }

        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int pos) {
            container.addView(viewList.get(pos));
            return viewList.get(pos);
        }

        @Override
        public void destroyItem(ViewGroup container, int pos, Object object) {
            container.removeView(viewList.get(pos));
        }

        //page title
        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }
    }
}
