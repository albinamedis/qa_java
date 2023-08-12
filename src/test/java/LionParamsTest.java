 import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class TestLionParams {

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedResult;

   /* @Mock
    Lion lion;*/

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "Для поля {0} вернуть {1}")
    public static Object [][] params() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false},
            };
    }

    @Test
    public void lionSex () {
        try {
            Lion lion = new Lion(sex);
            Mockito.when(Lion(sex)).thenReturn(boolean.valueOf(expectedResult));
            boolean actualResult = lion;
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }
}
