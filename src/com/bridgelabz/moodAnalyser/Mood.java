package com.bridgelabz.moodAnalyser;
/*
 * @class: Mood
 * @desc: Class to store the mood
 */
public class Mood {
    /*
     * @name : MoodType
     * @desc: Enum to store the mood types
     */
    public enum MoodType {
        HAPPY, SAD
    }

    private MoodType mood;

    /*
     * @name : Mood
     * @desc: Constructor for the Mood class
     * @param: mood: MoodType
     */
    public Mood(MoodType mood) {
        this.mood = mood;
    }

    /*
     * @name : getMood
     * @desc: Getter method for the mood
     * @return: MoodType
     */
    public MoodType getMood() {
        return mood;
    }

    /*
     * @name : setMood
     * @desc: Setter method for the mood
     * @param: mood: MoodType
     */
    public void setMood(MoodType mood) {
        this.mood = mood;
    }
}
