import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Objects;

public class TestsCat {
    @Test
    public void catUnitTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);

        // Выводим в консоль результат
        System.out.println(cat.getFood());
        System.out.println(cat.getSound());

        // Проверки
        assert Objects.equals(cat.getFood(), new ArrayList<String>());
        assert cat.getSound().equals("Мяу");
    }
}