package uz.xplay.xplay.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.xplay.xplay.R;

public class DotaFragment extends AbstractTabFragment {

    public static DotaFragment getInstance(Context context){
        Bundle bundle = new Bundle();
        DotaFragment dotaFragment = new DotaFragment();
        dotaFragment.setArguments(bundle);
        dotaFragment.setContext(context);
        dotaFragment.setTitle(context.getString(R.string.dota_item));
        return dotaFragment;
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
