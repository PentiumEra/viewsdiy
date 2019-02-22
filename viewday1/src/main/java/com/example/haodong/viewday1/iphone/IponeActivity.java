package com.example.haodong.viewday1.iphone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.haodong.viewday1.R;

/**
 * describe:
 * created at 2019/2/21
 * Author linghailong
 */
public class IponeActivity extends AppCompatActivity {
    private HorizontalSlipView view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_layout);
        view=findViewById(R.id.preview_layout_slide);
        view.setCanWork(true);
        view.setOnChildViewMovedListener(new HorizontalSlipView.OnChildViewMovedListener() {
            @Override
            public void onChildViewMove() {
                Log.e("tag", "onChildViewMove: " );
            }
        });
    }
}
