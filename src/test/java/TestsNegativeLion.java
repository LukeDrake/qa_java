import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;

public class TestsNegativeLion {
    @Test(expected = Exception.class)
    public void testsNegativeLion() throws Exception {
        new Lion("notbad", Mockito.mock(Feline.class));
    }
}
