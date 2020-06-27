package com.alexjlockwood.example.delight;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class ProgressBarActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_progressbar);
    startProgressBar(R.id.circular_indeterminate_progress_medium);
    startProgressBar(R.id.horizontal_indeterminate_progress);

    startHeartBeat(R.id.heart_beat_iv);

  }

  @Override
  protected void onStop() {
    super.onStop();
  }

  private void startHeartBeat(@IdRes int heart_beat_iv) {
    ImageView imageView =  findViewById(heart_beat_iv);

    Drawable drawable = imageView.getDrawable();

    if(drawable instanceof AnimatedVectorDrawableCompat)
    {
      AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat)drawable;
      avd.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
        @Override
        public void onAnimationEnd(Drawable drawable) {
          imageView.post(avd::start);
        }
      });

      avd.start();
    }

    if(drawable instanceof AnimatedVectorDrawable && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
    {
      AnimatedVectorDrawable avd = (AnimatedVectorDrawable)drawable;
      avd.registerAnimationCallback(new Animatable2.AnimationCallback() {
        @Override
        public void onAnimationEnd(Drawable drawable) {
          imageView.post(avd::start);
        }
      });

      avd.start();
    }
  }

  private void startProgressBar(@IdRes int progressBarId) {
    //((Animatable) ((ImageView) findViewById(progressBarId)).getDrawable()).start();

    ImageView imageView =  findViewById(progressBarId);
    Animatable animatable = ((Animatable)imageView.getDrawable());
    imageView.post(animatable::start);
  }
}
