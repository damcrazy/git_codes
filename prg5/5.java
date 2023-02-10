package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
  int starttime = 0;
  int stoptime = 0;
  int forwardtime = 5000;
  int backwardtime = 5000;
  MediaPlayer mediaPlayer, mediaPlayernew;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mediaPlayer = MediaPlayer.create(this, R.raw.song);
    mediaPlayernew = MediaPlayer.create(this, R.raw.song);
    TextView songtitle = findViewById(R.id.textView2);
    songtitle.setText("song");
    Button play = findViewById(R.id.play);
    play.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Playing song",
          Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
      }
    });
    Button stop = findViewById(R.id.stop);
    stop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "song stopped",
          Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();

        mediaPlayer = mediaPlayernew;
      }
    });
    Button pause = findViewById(R.id.pause);
    stop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), " pausing song",
          Toast.LENGTH_SHORT).show();

        mediaPlayer.pause();
      }
    });
    Button forward = findViewById(R.id.forward);
    stop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int curtops = mediaPlayer.getCurrentPosition();
        if ((curtops + forwardtime) <= (stoptime - mediaPlayer.getDuration())) {
          mediaPlayer.seekTo(curtops + forwardtime);
        }
      }
    });
    Button rewind = findViewById(R.id.rewind);
    stop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int curtops = mediaPlayer.getCurrentPosition();
        if ((curtops - backwardtime) >= 0) {
          mediaPlayer.seekTo(curtops - backwardtime);
        }
      }
    });
    Button restart = findViewById(R.id.reset);
    stop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "song restarting",
          Toast.LENGTH_SHORT).show();
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
      }
    });
  }
}
