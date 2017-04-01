package h5demo.hwp.com.laoshide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import h5demo.hwp.com.laoshide.R;


/**
 * Created by xiaoyuan on 17/3/8.
 */

public class MineFragment extends BaseFragment {

    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.frg_mine,null);
    }
}
