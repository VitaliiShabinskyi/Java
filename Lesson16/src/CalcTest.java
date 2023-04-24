import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


class CalcTest {
    Calculator calculator = new Calculator("Объект для тестирования");

    @BeforeAll
    public static void start(){
        System.out.println("Начало тестирования");
    }


    @BeforeEach
    public void beforeEach(){
        System.out.println("Перед тестом");
    }

    @Test
    public void testSum(){
        System.out.println("Тест");
        Assertions.assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    public void testSub(){
        System.out.println("Тест");
        Assertions.assertEquals(3, calculator.sub(7, 4));
    }

    @Test
    public void testMul(){
        System.out.println("Тест");
        Assertions.assertEquals(12, calculator.mul(4, 3));
    }

    @Test
    public void testDiv(){
        System.out.println("Тест");
        Assertions.assertEquals(12.0, calculator.div(24, 2));
    }

    @AfterEach
    public void afterEach(){
        System.out.println("После теста");
    }

    @AfterAll
    public static void end(){
        System.out.println("Тестирование законченно");
    }


}