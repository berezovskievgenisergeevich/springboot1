package com.berezouski.lesson8;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing My initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Classical Song";
    }
}
