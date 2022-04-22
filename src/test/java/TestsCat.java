import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TestsCat {
    @Test
    public void catUnitTestFood() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineMock);

        // Проверки
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void catUnitTestSound() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);

        // Проверки
        assertEquals(cat.getSound(), "Мяу");
    }
}