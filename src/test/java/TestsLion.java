import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class TestsLion {
    @Parameterized.Parameters(name = "{index}: {0} hasMane {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Самец", true }, { "Самка", false }
        });
    }
    private final String sex;
    private final boolean Mane;
    private Lion lionMock;

    public TestsLion(String sex, boolean mane) {
        this.sex = sex;
        this.Mane = mane;
    }

    @Before
    public void setup() throws Exception {
        this.lionMock = Mockito.spy(new Lion(sex));
        when(lionMock.getKittens()).thenReturn(2);
        when(lionMock.getFood()).thenReturn(List.of("Трава", "Различные растения"));
    }

    @Test
    public void testPositive() throws Exception {
        assertEquals (lionMock.getKittens(),2);
        assertEquals (lionMock.getFood(), List.of("Трава", "Различные растения"));
        assertEquals (lionMock.doesHaveMane(), Mane);

        }
    }
