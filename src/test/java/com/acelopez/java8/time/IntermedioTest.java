package com.acelopez.java8.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        LocalDate date = LocalDate.of(2017, 10, 16);
        int dia = ejercicios.ejercicio4(date);

        assertEquals(11, dia);
    }

    @Test
    public void ejercicio5() {
        LocalDateTime dateTime = LocalDateTime.of(2017, 10, 16, 1, 30);
        int dia = ejercicios.ejercicio5(dateTime);

        assertEquals(90, dia);
    }

    @Test
    public void ejercicio7() {
        LocalDate date = LocalDate.of(2010, 4, 11);
        String fecha = ejercicios.ejercicio7(date);

        assertEquals("4/11/10", fecha);
    }

    @Test
    public void ejercicio8() {
        String mes = ejercicios.ejercicio8(LocalDate.of(2017, Month.APRIL, 11));

        assertEquals("abril", mes);
    }

    @Test
    public void ejercicio9() {
        String dia = ejercicios.ejercicio9(LocalDate.of(1981, Month.APRIL, 11));

        assertEquals("sáb", dia);
    }

    @Test
    public void ejercicio10() {
        long horas = ejercicios.ejercicio10();

        assertEquals(12, horas);
    }
}
