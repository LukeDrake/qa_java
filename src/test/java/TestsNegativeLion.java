import com.example.Lion;
import org.junit.Test;

public class TestsNegativeLion {
    @Test(expected = Exception.class)
    public void testExeption() throws Exception {
        new Lion("notbad");
    }
}
