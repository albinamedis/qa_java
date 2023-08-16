import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Lion lion;

    @Test
    public void doesHaveMane() {
        Mockito.when(lion.doesHaveMane()).thenReturn(false);
        boolean actualResult = lion.doesHaveMane();
        boolean exceptedResult = false;
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void doesHaveManeResult() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        boolean actualResult = lion.doesHaveMane();
        boolean exceptedResult = false;
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void getKittens() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        int exceptedResult = 1;
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void getKittensResult() {
        Feline feline = new Feline();
        Lion lion = new Lion (feline);
        int actualResult = lion.getKittens();
        int exceptedResult = 1;
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void getFood () {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion (feline);
            List<String> actualResult = lion.getFood();;
            List<String> listFood = List.of("Животные", "Птицы", "Рыба");
            assertEquals(listFood, actualResult);
        } catch (Exception exception) {
            fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        Lion lion = new Lion("Неизвестно");
    }

}
