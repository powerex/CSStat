package ua.azbest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ua.azbest.fragments.PageFragment1;
import ua.azbest.fragments.PageFragment2;
import ua.azbest.fragments.PageFragment3;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 pager;
    private RecyclerView.Adapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        pager = findViewById(R.id.pager);
        pagerAdapter = (RecyclerView.Adapter)new SliderPagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);
    }
}