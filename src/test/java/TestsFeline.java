import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;


public class TestsFeline {
    @Test
    public void testFelineFood() throws Exception {
        Feline feline = new Feline();
             assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));

    }

    @Test
    public void testFelineFamily() throws Exception {
        Feline feline = new Feline();

        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void testFelineKitten() throws Exception {
        Feline feline = new Feline();

        assertEquals(feline.getKittens(), 1);
        int kittensCount = 2;
        assertEquals(feline.getKittens(kittensCount), kittensCount);

    }

    @Test
    public void testFelineKittensMoreThenOne() throws Exception {
        Feline feline = new Feline();
        int kittensCount = 2;
        assertEquals(feline.getKittens(kittensCount), kittensCount);

    }
}

