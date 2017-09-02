package uz.xplay.xplay.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.xplay.xplay.R;

public class Cs16Fragment extends AbstractTabFragment {

    public static Cs16Fragment getInstance(Context context){
        Bundle bundle = new Bundle();
        Cs16Fragment csFragment = new Cs16Fragment();
        csFragment.setArguments(bundle);
        csFragment.setContext(context);
        csFragment.setTitle(context.getString(R.string.cs_item));
        return csFragment;
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
