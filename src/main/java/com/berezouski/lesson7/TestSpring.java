package com.berezouski.lesson7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comp = musicPlayer == musicPlayer2;
        System.out.println(comp);
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);

        musicPlayer.setVolume(100);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());

        context.close();

    }
}
