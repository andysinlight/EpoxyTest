package com.example.andy.epoxytest.model;

import android.support.annotation.ColorInt;
import android.view.View;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.SimpleEpoxyModel;
import com.example.andy.epoxytest.R;

/**
 * Created by andy on 2016/12/21.
 */
public class TestModel extends SimpleEpoxyModel {
    @EpoxyAttribute
    @ColorInt
    int color;

    public TestModel(@ColorInt int color) {
        super(R.layout.color_view);
        this.color = color;
    }


    @Override
    public void bind(View view) {
        super.bind(view);
        view.setBackgroundColor(color);
    }
}
