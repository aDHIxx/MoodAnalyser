package com.bridgelabz.moodAnalyser;
/*
 * @class: MoodAnalyser
 * @desc: Class to analyse the mood
 */
public class MoodAnalyser {
    /*
     * @name : analyseMood
     * @desc: Method to analyse the mood
     * @param: message: String
     * @return: Mood
     */
    public Mood analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return new Mood(Mood.MoodType.SAD);
        } else {
            return new Mood(Mood.MoodType.HAPPY);
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        //TC1.1
        Mood mood1 = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println("Mood 1: " + mood1.getMood());
        //TC1.2
        Mood mood2 = moodAnalyser.analyseMood("I am in Any Mood");
        System.out.println("Mood 2: " + mood2.getMood());
    }
}
