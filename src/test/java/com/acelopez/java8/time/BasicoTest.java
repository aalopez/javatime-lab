package com.acelopez.java8.time;

import org.junit.Test;

import java.time.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Pruebas para los ejercicios de nivel básico
 * Created by aalopez on 20/08/17.
 */
public class BasicoTest {
    private Basico ejercicios = new Basico();

    @Test
    public void ejercicio1() {
        LocalDate date = LocalDate.of(2017, 8, 15);

        String nombre = ejercicios.ejercicio1(date);

        assertEquals(date.getMonth().name(), nombre);
    }

    @Test
    public void ejercicio2() {
        LocalDate date = LocalDate.of(2017, 8, 15);

        Month siguiente = ejercicios.ejercicio2(date);

        assertEquals(date.getMonth().plus(1), siguiente);
    }

    @Test
    public void ejercicio3() {
        LocalDate date = LocalDate.of(2017, 8, 15);

        LocalDate enero = ejercicios.ejercicio3(date);

        assertEquals(date.withMonth(Month.JANUARY.getValue()), enero);
    }

    @Test
    public void ejercicio4() {
        LocalDate date = LocalDate.now();

        LocalDate en2010 = ejercicios.ejercicio4(date);

        assertEquals(date.withYear(2010), en2010);
    }

    @Test
    public void ejercicio5() {
        LocalTime time = LocalTime.of(8, 0);

        LocalDateTime at8am = ejercicios.ejercicio5(LocalDate.now());

        assertEquals(time, at8am.toLocalTime());
    }

    @Test
    public void ejercicio6() {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDateTime mas330 = ejercicios.ejercicio6(dateTime);

        assertEquals(dateTime.plusHours(3).plusMinutes(30), mas330);
    }

    @Test
    public void ejercicio7() {
        Year year = Year.of(2012);

        boolean leap = ejercicios.ejercicio7(year);

        assertTrue(leap);
    }

    @Test
    public void ejercicio8() {
        Period period = ejercicios.ejercicio8();

        assertTrue(period.getYears() == 2 && period.getMonths() == 3);
    }

    @Test
    public void ejercicio9() {
        Period period = Period.of(0, 0, 1);
        LocalDate date = ejercicios.ejercicio9(period);

        assertEquals(LocalDate.now().plus(period), date);
    }

    @Test
    public void ejercicio10() {
        LocalDate date = LocalDate.of(2012, 2, 16);
        Period period = ejercicios.ejercicio10(date);

        assertEquals(29, period.getDays());
    }

    @Test
    public void ejercicio11() {
        YearMonth hoy = ejercicios.ejercicio11();

        assertEquals(YearMonth.now(), hoy);
    }

    @Test
    public void ejercicio12() {
        MonthDay navidad = ejercicios.ejercicio12();

        assertEquals(MonthDay.of(Month.DECEMBER, 25), navidad);
    }

    @Test
    public void ejercicio13() {
        LocalDate date = LocalDate.of(2017, 8, 16);
        String fecha = ejercicios.ejercicio13(date);

        assertEquals("16-08-2017", fecha);
    }

    @Test
    public void ejercicio14() {
        LocalDate date = LocalDate.of(2018, 9, 21);
        LocalDate resultado = ejercicios.ejercicio14("21-09-2018");

        assertEquals(date, resultado);
    }

    @Test
    public void ejercicio15() {
        Duration duration = Duration.ofHours(2).plusMinutes(30);
        Duration resultado = ejercicios.ejercicio15();

        assertEquals(duration, resultado);
    }

    @Test
    public void ejercicio16() {
        Duration duration = Duration.ofHours(2048);
        long resultado = ejercicios.ejercicio16(duration);

        assertEquals(duration.toDays(), resultado);
    }
}
