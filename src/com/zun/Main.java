package com.zun;

public class Main {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "zunsMusic.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer adapter = new AdvancedMediaPlayerAdapter(mp4Player);
        adapter.play("mp4", "alone.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        adapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        adapter.play("vlc", "far far away.vlc");


        audioPlayer.play("vlc", "far far away.vlc");
    }
}
