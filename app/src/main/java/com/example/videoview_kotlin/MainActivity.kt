package com.example.videoview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var videoView: VideoView = findViewById(R.id.videoView)

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hackatown)

        var videoController: MediaController =  MediaController(this)
        videoController.setAnchorView(videoView);
        videoView.setMediaController(videoController);
        videoView.start()
    }
}
