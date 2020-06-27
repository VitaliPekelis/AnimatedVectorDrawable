package com.alexjlockwood.example.delight.vector_animation;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import com.alexjlockwood.example.delight.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CurvedMotionActivity extends AppCompatActivity {

  @BindView(R.id.curvedmotion) ImageView curvedMotionView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_curvedmotion);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    ((Animatable) curvedMotionView.getDrawable()).start();
  }
}
