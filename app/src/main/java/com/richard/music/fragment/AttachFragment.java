package com.richard.music.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.richard.music.activity.BaseActivity;
import com.richard.music.activity.MusicStateListener;

/**
 * Created by Richard on 2016/3/17.
 */
public class AttachFragment extends Fragment {

    public Activity mContext;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.mContext = activity;
    }


}
