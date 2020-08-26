package com.zun;

interface MediaPlayer {

    void play(String audioType, String fileName);

}

interface AdvancedMediaPlayer {
    void loadFileName(String fileName);

    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {

    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myFile);
    }
}

class Mp4Player implements AdvancedMediaPlayer {

    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + myFile);
    }
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType != null && audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media type " + audioType + " not supported");
        }
    }
}
