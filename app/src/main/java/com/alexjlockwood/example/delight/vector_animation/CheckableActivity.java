package com.alexjlockwood.example.delight.vector_animation;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import com.alexjlockwood.example.delight.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckableActivity extends AppCompatActivity {

  @BindView(R.id.radiobutton) ImageView radioButtonView;
  @BindView(R.id.checkbox) ImageView checkBoxView;
  @BindView(R.id.expandcollapse) ImageView expandCollapseView;
  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_checkable);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    isChecked = !isChecked;
    final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
    radioButtonView.setImageState(stateSet, true);
    checkBoxView.setImageState(stateSet, true);
    expandCollapseView.setImageState(stateSet, true);
  }
}
