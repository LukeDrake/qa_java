import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class TestsLion {
    @Parameterized.Parameters(name = "{index}: {0} hasMane {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Самец", true }, { "Самка", false }
        });
    }
    private final String Sex;
    private final boolean Mane;
    private Lion lion;

    public TestsLion(String sex, boolean mane) {
        this.Sex = sex;
        this.Mane = mane;
    }

    @Before
    public void setup() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        when(felineMock.getKittens()).thenReturn(2);
        when(felineMock.getFamily()).thenReturn("Кошачьи");
        when(felineMock.getKittens(anyInt())).thenReturn(2);

        lion= new Lion(Sex, felineMock);
    }

    @Test
    public void testPositiveLionKittens() {
        assertEquals (lion.getKittens(),2);

        }
    @Test
    public void testPositiveLionFood() throws Exception {
      assertEquals (lion.getFood(), List.of("Животные", "Птицы", "Рыба"));


    }
    @Test
    public void testPositiveLionMane()  {
               assertEquals (lion.doesHaveMane(), Mane);

    }
    }
