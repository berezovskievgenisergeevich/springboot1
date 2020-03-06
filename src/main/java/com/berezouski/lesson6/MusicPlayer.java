package com.berezouski.lesson6;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach(it -> System.out.println("Playing: " + it.getSong()));
      //  System.out.println("Playing: " + music.getSong());
    }
}
