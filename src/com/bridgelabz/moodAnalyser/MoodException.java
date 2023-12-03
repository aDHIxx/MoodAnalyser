package com.bridgelabz.moodAnalyser;

/*
 * @class: MoodAnalysisException
 * @desc: Custom exception class for mood analysis
 */
class MoodException extends Exception {
    /*
     * @name: MoodAnalysisException
     * @desc: Constructor for MoodAnalysisException class
     * @param: message: String
     */
    public MoodException(String message) {
        super(message);
    }
}