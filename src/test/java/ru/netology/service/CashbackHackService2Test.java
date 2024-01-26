package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackService2Test {

    @org.junit.Test
    public void remain() {
        CashbackHackService2 service = new CashbackHackService2();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual, expected);
    }
    @org.junit.Test
    public void remain2() {
        CashbackHackService2 service = new CashbackHackService2();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals  (actual, expected);
}}