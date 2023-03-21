import org.example.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}