package com.alexjlockwood.example.delight.vector_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.alexjlockwood.example.delight.R
import kotlinx.android.synthetic.main.activity_shimmer.*

class ShimmerActivity : AppCompatActivity() {


    private var animDrawable: AnimatedVectorDrawableCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer)
        animDrawable = AnimatedVectorDrawableCompat.create(this, R.drawable.shimmer_anim_vector)
        ivShimmer?.setImageDrawable(animDrawable)
    }


    override fun onStart() {
        super.onStart()
        animDrawable?.start()
    }

    override fun onStop() {
        animDrawable?.stop()
        super.onStop()
    }
}