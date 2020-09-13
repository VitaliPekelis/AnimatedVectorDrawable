package com.alexjlockwood.example.delight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alexjlockwood.example.delight.lottie.LottieAnimationActivity
import com.alexjlockwood.example.delight.motionlayout.MotionLayoutAnimationActivity
import com.alexjlockwood.example.delight.vector_animation.VectorDrawableMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vectorAnim.setOnClickListener (this)
        motionLayoutAnim.setOnClickListener (this)
        lottieLayoutAnim.setOnClickListener (this)
    }

    private fun openActivity(clazz: Class<*>) {
        Intent(this, clazz).also {
            startActivity(it)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.vectorAnim -> {
                openActivity(VectorDrawableMainActivity::class.java)
            }
            R.id.motionLayoutAnim -> {
                openActivity(MotionLayoutAnimationActivity::class.java)
            }
            R.id.lottieLayoutAnim -> {
                openActivity(LottieAnimationActivity::class.java)
            }
        }
    }


}