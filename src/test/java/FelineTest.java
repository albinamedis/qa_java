import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;

    @Test
    public void getFamily (){
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyResult (){
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String exceptedResult = "Кошачьи";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void getKittens () {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = feline.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensResult (){
        Feline feline = new Feline();
        int actualResult = feline.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eatMeat () {
        try {
            Feline feline = new Feline();
            List<String> actualResult = feline.eatMeat();
            List<String> exceptedResult = List.of("Животные", "Птицы", "Рыба");
            assertEquals(exceptedResult, actualResult);
        } catch (Exception exception) {
           fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}
