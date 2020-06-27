package com.alexjlockwood.example.delight.vector_animation

import android.content.Intent
import android.os.Bundle
import android.util.SparseArray
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick
import com.alexjlockwood.example.delight.*

class VectorDrawableMainActivity : AppCompatActivity() {

    private val map = SparseArray<Class<*>>()

    init {
        map.put(R.id.animals, AnimalsActivity::class.java)
        map.put(R.id.checkable, CheckableActivity::class.java)
        map.put(R.id.clock, ClockActivity::class.java)
        map.put(R.id.countdown, CountdownActivity::class.java)
        map.put(R.id.curvedmotion, CurvedMotionActivity::class.java)
        map.put(R.id.downloading, DownloadingActivity::class.java)
        map.put(R.id.fingerprint, FingerprintActivity::class.java)
        map.put(R.id.handwriting, HandwritingActivity::class.java)
        map.put(R.id.music, MusicActivity::class.java)
        map.put(R.id.pathmorph, PathMorphActivity::class.java)
        map.put(R.id.playpausestop, PlayPauseStopActivity::class.java)
        map.put(R.id.progressbar, ProgressBarActivity::class.java)
        map.put(R.id.trimclip, TrimClipActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vector_drawable_main)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.animals, R.id.checkable, R.id.clock, R.id.countdown, R.id.curvedmotion, R.id.downloading, R.id.fingerprint, R.id.handwriting, R.id.music, R.id.pathmorph, R.id.playpausestop, R.id.progressbar, R.id.trimclip)
    fun onListItemClick(view: View) {
        startActivity(Intent(this, map[view.id]))
    }
}