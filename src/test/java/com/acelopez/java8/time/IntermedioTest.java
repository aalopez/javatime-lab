package com.acelopez.java8.time;

import org.junit.Test;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

import static org.junit.Assert.*;

/**
 * Pruebas para los ejercicios de nivel intermedio
 * Created by aalopez on 20/08/17.
 */
public class IntermedioTest {
    private Intermedio ejercicios = new Intermedio();
    
    @Test
    public void ejercicio4() {
        LocalDate date = LocalDate.of(2017, 8, 15);

        LocalDate enero = ejercicios.ejercicio4(date);

        assertEquals(date.withMonth(Month.JANUARY.getValue()), enero);
    }
    
    @Test
    public void ejercicio8() {
        LocalDate date = LocalDate.now();

        LocalDate sigLunes = ejercicios.ejercicio8(date);

        assertEquals(date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)), sigLunes);
    }
    
    @Test
    public void ejercicio9() {
        LocalDate date = LocalDate.now();

        LocalDate primero = ejercicios.ejercicio9(date);

        assertEquals(date.with(TemporalAdjusters.firstDayOfNextMonth()), primero);
    }
    
    @Test
    public void ejercicio17() {
        LocalDate date = LocalDate.of(2010, 4, 11);
        String fecha = ejercicios.ejercicio17(date);

        assertEquals("4/11/10", fecha);
    }
}
