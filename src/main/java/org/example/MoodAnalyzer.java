package org.example;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        try {
            if (message.contains("Sad")) {
                this.message = "SAD";
            } else
                this.message = "HAPPY";
        } catch (NullPointerException e) {
            this.message = "HAPPY";
        }
    }

    public String analyzeMood() {
        return this.message;
    }
}