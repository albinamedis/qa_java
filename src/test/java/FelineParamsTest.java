/*
import com.example.Animal;
import com.example.Feline;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFelineParams {

    public static List <String> listFood1 = List.of("Животные", "Птицы", "Рыба");
    public static List <String> listFood2 = List.of("Трава", "Различные растения");

    @Parameterized.Parameter
    public String animalKind;
    @Parameterized.Parameter(1)
    public List<String> listFood;

    @Mock
    Feline feline;

    @Parameterized.Parameters(name = "Для поля {0} вернуть {1}")
    public static Object [][] params() {
        return new Object[][] {
                {"Хищник", listFood1},
                {"Травоядное", listFood2},
        };
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void getFood () throws  Exception {
            Animal animal = new Animal ();
            Feline feline = new Feline();
            Mockito.verify(animal).getFood("Хищник");
            try {
                List<String> actualResult = feline.eatMeat();
                List<String> expectedResult = listFood;
                assertEquals(expectedResult, actualResult);
            } catch (Exception exception) {
                System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
            }

       // thrown.expectMessage(is("Name is empty!"));
    }

}
*/
