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
    public Mood analyseMood() throws MoodException, Mood {
        try {
            if (message == null || message.trim().isEmpty()) {
                throw new MoodException("Invalid mood.");
            }

            if (message.toLowerCase().contains("sad")) {
                return new Mood(Mood.MoodType.SAD);
            } else {
                return new Mood(Mood.MoodType.HAPPY);
            }
        } catch (NullPointerException e) {
            throw new Mood(Mood.MoodType.HAPPY);
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            Mood mood = moodAnalyser.analyseMood();
            System.out.println("Mood : " + mood.getMood());
        } catch (MoodException | Mood e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
