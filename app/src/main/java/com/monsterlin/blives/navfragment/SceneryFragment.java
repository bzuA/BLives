package com.monsterlin.blives.navfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.monsterlin.blives.R;

/**
 * 校园风光
 * Created by monsterLin on 2016/2/16.
 */
public class SceneryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scenery,container,false);
        return view;
    }
}