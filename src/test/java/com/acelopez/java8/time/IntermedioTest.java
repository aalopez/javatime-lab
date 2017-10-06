package com.acelopez.java8.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas para los ejercicios de nivel intermedio
 * Created by aalopez on 20/08/17.
 */
public class IntermedioTest {
    private Intermedio ejercicios = new Intermedio();

    @Test
    public void ejercicio1() {
        LocalDate date = LocalDate.of(2017, 8, 15);

        LocalDate enero = ejercicios.ejercicio1(date);

        assertEquals(date.withMonth(Month.JANUARY.getValue()), enero);
    }

    @Test
    public void ejercicio2() {
        LocalDate date = LocalDate.now();

        LocalDate sigLunes = ejercicios.ejercicio2(date);

        assertEquals(date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)), sigLunes);
    }

    @Test
    public void ejercicio3() {
        LocalDate date = LocalDate.now();

        LocalDate primero = ejercicios.ejercicio3(date);

        assertEquals(date.with(TemporalAdjusters.firstDayOfNextMonth()), primero);
    }

    @Test
    public void ejercicio4() {
        LocalDate date = LocalDate.of(2010, 4, 11);
        String fecha = ejercicios.ejercicio4(date);

        assertEquals("4/11/10", fecha);
    }
}
