package com.alexjlockwood.example.delight.vector_animation;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import com.alexjlockwood.example.delight.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClockActivity extends AppCompatActivity {

  @BindView(R.id.alarm) ImageView alarmView;
  @BindView(R.id.clock) ImageView clockView;
  @BindView(R.id.timer) ImageView timerView;
  @BindView(R.id.stopwatch) ImageView stopWatchView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_clock);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    ((Animatable) alarmView.getDrawable()).start();
    ((Animatable) clockView.getDrawable()).start();
    ((Animatable) timerView.getDrawable()).start();
    ((Animatable) stopWatchView.getDrawable()).start();
  }
}
