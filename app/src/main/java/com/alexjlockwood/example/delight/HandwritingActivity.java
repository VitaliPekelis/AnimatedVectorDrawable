package com.alexjlockwood.example.delight;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HandwritingActivity extends AppCompatActivity {

  private Animatable cursiveAvd;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_handwriting);
    ButterKnife.bind(this);
    ((Animatable) ((ImageView) findViewById(R.id.io16Icon)).getDrawable()).start();
    cursiveAvd = ((Animatable) ((ImageView) findViewById(R.id.cursiveIcon)).getDrawable());
    restartCursiveAnimation();
  }

  @OnClick(R.id.rootview)
  void onClick() {
    restartCursiveAnimation();
  }

  private void restartCursiveAnimation() {
    cursiveAvd.stop();
    cursiveAvd.start();
  }
}
