package com.acelopez.java8.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

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
        LocalDate date = LocalDate.of(2017, 8, 15);

        LocalDate enero = ejercicios.ejercicio4(date);

        assertEquals(date.withMonth(Month.JANUARY.getValue()), enero);
    }

    @Test
    public void ejercicio5() {
        LocalDate date = LocalDate.now();

        LocalDate en2010 = ejercicios.ejercicio5(date);

        assertEquals(2010, en2010.getYear());
    }

    @Test
    public void ejercicio6() {
        LocalTime time = LocalTime.of(8, 0);

        LocalDateTime at8am = ejercicios.ejercicio6(LocalDate.now());

        assertEquals(time, at8am.toLocalTime());
    }
}