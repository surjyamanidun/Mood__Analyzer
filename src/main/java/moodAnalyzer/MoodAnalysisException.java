package moodAnalyzer;
package com.exception;

public class MoodAnalysisException extends Exception {
    public Exception_Type type;

    public MoodAnalysisException(String message, Exception_Type type) {
        super(message);
        this.type = type;
    }

    public enum Exception_Type {
        NULL, EMPTY;
    }
}
