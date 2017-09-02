package uz.xplay.xplay;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import uz.xplay.xplay.fragment.AbstractTabFragment;
import uz.xplay.xplay.fragment.Cs16Fragment;
import uz.xplay.xplay.fragment.DotaFragment;
import uz.xplay.xplay.fragment.NewsFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs = new HashMap<>();
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs.put(0, NewsFragment.getInstance(context));
        tabs.put(1, Cs16Fragment.getInstance(context));
        tabs.put(2, DotaFragment.getInstance(context));

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
