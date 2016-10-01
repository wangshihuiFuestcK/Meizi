package coder.dasu.meizi.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import coder.dasu.meizi.R;

/**
 * Created by dasu on 2016/9/26.
 * https://github.com/woshidasusu/Meizi
 */
public class VideoDataFragment extends GankDataFragment {

    private static final String TAG = VideoDataFragment.class.getSimpleName();

    public VideoDataFragment(String type) {
        mType = type;
    }

    @Override
    public String getType() {
        return mType;
    }

    @Override
    public String getTAG() {
        return TAG;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_video, container, false);
            ButterKnife.inject(this, rootView);
            bindWidgets();
        }
        return rootView;
    }

    private void bindWidgets() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
