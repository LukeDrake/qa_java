import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.assertEquals;


public class TestsFeline {
    @Test
    public void testFeline() throws Exception {
        Feline feline = new Feline();
        System.out.println(feline.eatMeat());
        System.out.println(feline.getFamily());
        System.out.println(feline.getKittens());
        System.out.println(feline.getKittens(2));

        assertEquals(feline.eatMeat(), new ArrayList<String>() {{
            add("Животные");
            add("Птицы");
            add("Рыба");
        }});
        assertEquals(feline.getFamily(), "Кошачьи");
        assertEquals(feline.getKittens(), 1);
        int kittensCount = 2;
        assertEquals(feline.getKittens(kittensCount), kittensCount);

    }
}

