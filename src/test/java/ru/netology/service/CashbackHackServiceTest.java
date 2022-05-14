package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldOfferToBuyMore() {
        CashbackHackService service = new CashbackHackService();

        int expected = 800;
        int actual = service.remain(3200);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldOfferToBuyIfBelowBorder() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldOfferToBuyIfAboveBorder() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(2001);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotOfferToBuyMore() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}