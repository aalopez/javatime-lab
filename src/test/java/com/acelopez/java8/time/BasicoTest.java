package com.acelopez.java8.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

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
}