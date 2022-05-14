package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service;

    @org.testng.annotations.BeforeTest
    public void setUp() {
        service = new CashbackHackService();
    }

    @org.testng.annotations.Test
    public void shouldOfferToBuyMore() {
        int expected = 800;
        int actual = service.remain(3200);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldOfferToBuyIfBelowBorder() {
        int expected = 1;
        int actual = service.remain(1999);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldOfferToBuyIfAboveBorder() {
        int expected = 999;
        int actual = service.remain(2001);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotOfferToBuyMore() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}