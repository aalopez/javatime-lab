package com.acelopez.java8.time;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

/**
 * Clase con ejercicios nivel intermedio
 * Created by aalopez on 20/08/17.
 */
public class Intermedio {

    /**
     * Igual que el ejercicio anterior, escribe el código necesario para retornar la fecha pasada por param con el mes
     * de Enero, pero esta vez usa el método with(TemporalField) de LocalDate.
     *
     * @param date Fecha.
     * @return El año y el día se deben mantener, pero el mes debe ser Enero.
     */
    public LocalDate ejercicio1(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una fecha correspondiente al siguiente lunes de la fecha pasada por param.
     *
     * @param date Fecha.
     * @return Fecha correspondiente al siguiente Lunes a la fecha pasada por param.
     * @see java.time.temporal.TemporalAdjusters
     */
    public LocalDate ejercicio2(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una fecha correspondiente al primer día del siguiente mes
     * de la fecha pasada por param.
     *
     * @param date Fecha.
     * @return Fecha correspondiente al primer día del siguiente mes de la fecha pasada por param.
     * @see java.time.temporal.TemporalAdjusters
     */
    public LocalDate ejercicio3(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el número del día, en el mes, del miércoles anterior a la fecha
     * pasada por param.
     *
     * @param date Fecha.
     * @return Número de día, en el mes, del miércoles anterior al día que representa la fecha pasada por param.
     * @see java.time.temporal.TemporalAdjusters
     */
    public int ejercicio4(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el valor del minuto en el día del objeto LocalDateTime
     * pasado por param, esta vez debes usar el método LocalDateTime::get
     *
     * @param dateTime Fecha y hora.
     * @return Valor del minuto en el día del objeto LocalDateTime pasado por param.
     * @see java.time.temporal.ChronoField
     */
    public int ejercicio5(LocalDateTime dateTime) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param en formato inglés americano.
     * Usa un formato de fecha corto.
     *
     * @param date Fecha.
     * @return Fecha pasada por param en formato inglés americano.
     * @see java.time.format.FormatStyle
     */
    public String ejercicio7(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el nombre completo, en español, del mes de la fecha pasada por parámetro.
     * Usa el estilo de texto completo si quieres obtener el nombre completo del mes.
     *
     * @param date Fecha.
     * @return Nombre, en español, del mes de la fecha pasada por parámetro.
     * @see java.time.format.TextStyle
     */
    public String ejercicio8(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el nombre corto, en español, del día de la semana que representa
     * la fecha pasada por parámetro.
     * Usa el estilo de texto corto si quieres obtener el nombre corto del día.
     *
     * @param date Fecha.
     * @return Nombre corto, en español, del día de la semana que representa la fecha pasada por parámetro.
     * @see java.time.format.TextStyle
     */
    public String ejercicio9(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la cantidad de horas que toma un vuelo que parte de Bogotá a las
     * 5 horas del 1-OCT-2017 y llega a Los Angeles el mismo día, pero a las 15 horas (hora local en Los Angeles).
     *
     * @return Cantidad de horas que toma el vuelo en llegar a Los Angeles desde Bogotá.
     * @see java.time.Duration
     */
    public long ejercicio10() {
        throw new UnsupportedOperationException("No implementado aún.");
    }
}
