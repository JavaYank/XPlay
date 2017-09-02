package uz.xplay.xplay.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.xplay.xplay.R;

public class NewsFragment extends AbstractTabFragment {

    public static NewsFragment getInstance(Context context){
        Bundle bundle = new Bundle();
        NewsFragment newsFragment = new NewsFragment();
        newsFragment.setArguments(bundle);
        newsFragment.setContext(context);
        newsFragment.setTitle(context.getString(R.string.news_item));
        return newsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_news, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
