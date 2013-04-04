package com.example.videoviewsample;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewSample extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// VideoViewの取り込み
		VideoView mVideo = (VideoView) findViewById(R.id.videoView1);

		// メディアコントローラーを設定
		mVideo.setMediaController(new MediaController(this));

		// sdcardフォルダを指定
		File root = Environment.getExternalStorageDirectory();

		// sdcardから動画再生
		mVideo.setVideoPath(root.toURI() + "video.mp4");

	}
}