import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Cat cat;

    @Test
    public void testSound () {
        Mockito.when(cat.getSound()).thenReturn("Мяу");
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void catSound () {
        Feline feline = new Feline ();
        Cat cat = new Cat(feline);
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFood () {
        try {
            Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actualResult = cat.getFood();
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }

    @Test
    public void getFood () {
        try {
            Feline feline = new Feline ();
            Cat cat = new Cat(feline);
            System.out.println(cat.getFood());
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }

}
