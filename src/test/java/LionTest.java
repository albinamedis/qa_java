import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

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
    public void sexLion () {
        try {
            Lion lion = new Lion("Самец");
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самей или самка");
        }
    }
}
