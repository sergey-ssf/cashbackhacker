package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    void shouldSuggest200() {
        // 3 steps to create a test:
        // prepare data, target action done, comparison actual & expected

        CashbackHackService service = new CashbackHackService();
        int amount =800;

        int actual = service.remain(amount);
        int expected = 200;

        Assertions.assertEquals(expected, actual);



    }



}