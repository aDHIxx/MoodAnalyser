package com.bridgelabz.moodAnalyser;

/*
 * @class: MoodAnalyser
 * @desc: Class to analyse the mood
 */
public class MoodAnalyser {
    private String message;

    /*
     * @name : MoodAnalyser
     * @desc: Default constructor
     */
    public MoodAnalyser() {
        this.message = ""; // Default empty message
    }

    /*
     * @name : MoodAnalyser
     * @desc: Parameterized constructor
     * @param: message: String
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /*
     * @name : analyseMood
     * @desc: Method to analyse the mood using the message field
     * @return: Mood
     */
    public Mood analyseMood() {
        if (message.toLowerCase().contains("sad")) {
            return new Mood(Mood.MoodType.SAD);
        } else {
            return new Mood(Mood.MoodType.HAPPY);
        }
    }

    public static void main(String[] args) {
        // TC1.1
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        Mood mood1 = moodAnalyser1.analyseMood();
        System.out.println("Mood 1: " + mood1.getMood());

        // TC1.2
        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
        Mood mood2 = moodAnalyser2.analyseMood();
        System.out.println("Mood 2: " + mood2.getMood());
    }
}
