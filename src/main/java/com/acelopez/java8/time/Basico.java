package com.acelopez.java8.time;

import java.time.*;

/**
 * Clase con ejercicios nivel básico
 * Created by aalopez on 20/08/17.
 */
public class Basico {

    /**
     * Escribe el código necesario para retornar el nombre del mes de la fecha pasada por param.
     *
     * @param date Fecha.
     * @return Nombre del mes de la fecha pasada por param.
     * @see java.time.Month
     */
    public String ejercicio1(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el siguiente mes al de la fecha pasada por param.
     *
     * @param date Fecha.
     * @return Siguiente mes al de la fecha pasada por param.
     */
    public Month ejercicio2(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param con el mes de Enero.
     *
     * @param date Fecha.
     * @return El año y el día se deben mantener, pero el mes debe ser Enero.
     */
    public LocalDate ejercicio3(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Igual que el ejercicio anterior, escribe el código necesario para retornar la fecha pasada por param con el mes
     * de Enero, pero esta vez usa el método with de LocalDate.
     *
     * @param date Fecha.
     * @return El año y el día se deben mantener, pero el mes debe ser Enero.
     */
    public LocalDate ejercicio4(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una fecha que corresponda al mismo mes y día de la fecha pasada por param
     * pero en el año 2010.
     *
     * @param date Fecha
     * @return Una fecha que corresponde al mes y día de la fecha pasada por param pero en el año 2010.
     */
    public LocalDate ejercicio5(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la misma fecha pero a las 8AM.
     *
     * @param date Fecha.
     * @return Fecha recibida como param pero a las 8AM.
     */
    public LocalDateTime ejercicio6(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param pero 3 horas y 30 minutos más tarde.
     *
     * @param date Fecha y hora.
     * @return Fecha y hora que está 3 horas y 30 minutos más tarde que la recibbida por param.
     */
    public LocalDateTime ejercicio7(LocalDateTime date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una fecha correspondiente al siguiente lunes de la fecha pasada por param.
     *
     * @param date Fecha.
     * @return Fecha correspondiente al siguiente Lunes a la fecha pasada por param.
     * @see java.time.temporal.TemporalAdjusters
     */
    public LocalDate ejercicio8(LocalDate date) {
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
    public LocalDate ejercicio9(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar si el año recibido por param es bisiesto o no.
     *
     * @param year Año.
     * @return {@code true} si y solo si el año recibido por param es bisiesto, {@code false} en caso contrario.
     */
    public boolean ejercicio10(Year year) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar un periodo de 2 años y 3 meses.
     *
     * @return Periodo de 2 años y 3 meses.
     */
    public Period ejercicio11() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escriba el código necesario para retornar una fecha que corresponda a la fecha de hoy más el período recibido por param.
     *
     * @param period Periodo.
     * @return Fecha que corresponde a la fecha de hoy más el tiempo definido en el período pasado por param.
     */
    public LocalDate ejercicio12(Period period) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escriba el código necesario para retornar un período de la cantidad de días que tiene el mes de la fecha
     * pasada por param.
     *
     * @param date Fecha.
     * @return Período de la cantidad de días que tiene el mes de la fecha pasada por param.
     */
    public Period ejercicio13(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el año y mes actual.
     *
     * @return Año y mes actual
     */
    public YearMonth ejercicio14() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el mes y día que representa la navidad.
     *
     * @return Mes y día que representa la navidad.
     */
    public MonthDay ejercicio15() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param en formato dd-MM-yy.
     *
     * @param date Fecha.
     * @return Fecha pasada por param con formato dd-MM-yy.
     */
    public String ejercicio16(LocalDate date) {
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
    public String ejercicio17(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Convierte la fecha pasada por param a un LocalDate.
     *
     * @param fecha Fecha con formato dd-MM-yyyy.
     * @return LocalDate correspondiente a la fecha pasada por param.
     */
    public LocalDate ejercicio18(String fecha) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una instancia de Duration que se componga de 2 horas y 30 minutos.
     *
     * @return Un objeto de duración 2h y 30m.
     */
    public Duration ejercicio19() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Retornar la cantidad de días que componen el objeto duración enviado por param.
     *
     * @param duration Duración.
     * @return Cantidad de días que componen el objeto duración pasado por param.
     */
    public long ejercicio20(Duration duration) {
        throw new UnsupportedOperationException("No implementado aún.");
    }
}
