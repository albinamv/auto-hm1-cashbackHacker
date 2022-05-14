package ru.netology.service;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service;

    @BeforeTest
    public void setUp() {
        service = new CashbackHackService();
    }

    @Test
    public void shouldOfferToBuyMore() {
        int expected = 800;
        int actual = service.remain(3200);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldOfferToBuyIfBelowBorder() {
        int expected = 1;
        int actual = service.remain(1999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldOfferToBuyIfAboveBorder() {
        int expected = 999;
        int actual = service.remain(2001);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotOfferToBuyMore() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}