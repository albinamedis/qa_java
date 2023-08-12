import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedResult;

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
            boolean actualResult = "Самец".equals(sex);
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }
}

