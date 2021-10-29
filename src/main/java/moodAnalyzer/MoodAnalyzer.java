package moodAnalyzer;


public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {

            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message == null)
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.NULL);
            else
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.EMPTY);
        }
    }
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
}
