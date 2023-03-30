package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    // Проверка функциональности в интервале до 1000 рублей
    @Test
    public void shouldSuggest200() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);

    }

    // Проверка функциональности, если оплата 0 рублей
    @Test
    public void shouldSuggest1000() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }


    // Проверка функциональности, если оплата 1 рубль
    @Test
    public void shouldSuggest999() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    // Проверка функциональности, если оплата 999 рублей
    @Test
    public void shouldSuggest1() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }

    // Проверка функциональности, если оплата 1000 рублей
    @Test
    public void shouldSuggest0() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

}
