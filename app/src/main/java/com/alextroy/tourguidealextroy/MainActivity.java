package com.alextroy.tourguidealextroy;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.alextroy.tourguidealextroy.adapter.AttractiveListPageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager();
    }

    private void viewPager() {
        ViewPager viewPager = findViewById(R.id.viewpager);

        if (viewPager != null) {
            AttractiveListPageAdapter adapter = new AttractiveListPageAdapter(getSupportFragmentManager());

            adapter.addFragment(AttractionFragment.newInstance(AttractiveType.TAB_1), getString(R.string.tab_title_1));
            adapter.addFragment(AttractionFragment.newInstance(AttractiveType.TAB_2), getString(R.string.tab_title_2));
            adapter.addFragment(AttractionFragment.newInstance(AttractiveType.TAB_3), getString(R.string.tab_title_3));
            adapter.addFragment(AttractionFragment.newInstance(AttractiveType.TAB_4), getString(R.string.tab_title_4));

            viewPager.setAdapter(adapter);

            TabLayout tabLayout = findViewById(R.id.tab_layout);
            tabLayout.setupWithViewPager(viewPager);
        }
    }
}
