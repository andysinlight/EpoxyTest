package com.example.andy.epoxytest.adapter;

import android.graphics.Color;
import android.view.View;

import com.airbnb.epoxy.EpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.example.andy.epoxytest.model.TestModel_;

import java.util.Random;

/**
 * Created by andy on 2016/12/21.
 */
public class TestAdapter extends EpoxyAdapter {
    private static final Random RANDOM = new Random();
    private final View.OnClickListener mColorListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mTestModel_.color(randomColor());
            notifyModelsChanged();
        }
    };
    private final TestModel_ mTestModel_;


    public TestAdapter() {

        enableDiffing();
        mTestModel_ = new TestModel_(randomColor());
        mTestModel_.onClick(mColorListener);
        addModel(mTestModel_);

    }

    @Override
    protected void addModel(EpoxyModel<?> modelToAdd) {
        super.addModel(modelToAdd);
    }


    private int randomColor() {
        int r = RANDOM.nextInt(256);
        int g = RANDOM.nextInt(256);
        int b = RANDOM.nextInt(256);

        return Color.rgb(r, g, b);
    }
}
