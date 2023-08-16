import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(Parameterized.class)
public class FelineParamsTest {

    @Parameterized.Parameter
    public String animalKind;
    @Parameterized.Parameter(1)
    public List<String> listFood;

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters(name = "Для поля {0} вернуть {1}")
    public static Object [][] params() {
        return new Object[][] {
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    @Test
    public void getFood () {
        try {
            Animal animal = new Animal();
            Lion lion = new Lion(feline);
            Mockito.when(feline.getFood(anyString())).thenReturn(animal.getFood(animalKind));
            List<String> actualResult = feline.getFood(animalKind);
            List<String> listFood = animal.getFood(animalKind);
            assertEquals(listFood, actualResult);
            } catch (Exception exception) {
                fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
            }
    }

}
