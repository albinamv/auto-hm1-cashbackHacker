package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTestVintage {
    CashbackHackService service;

    @org.junit.Before
    public void setUp() {
        service = new CashbackHackService();
    }

    @org.junit.Test
    public void shouldOfferToBuyMore() {
        int expected = 800;
        int actual = service.remain(3200);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldOfferToBuyIfBelowBorder() {
        int expected = 1;
        int actual = service.remain(1999);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldOfferToBuyIfAboveBorder() {
        int expected = 999;
        int actual = service.remain(2001);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldNotOfferToBuyMore() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}