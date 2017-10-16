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
     * Escribe el código necesario para retornar la fecha pasada por param pero con el mes de Enero.
     * Usa alguno de los métodos withXYZ de LocalDate.
     *
     * @param date Fecha.
     * @return El año y el día se deben mantener, pero el mes debe ser Enero.
     */
    public LocalDate ejercicio3(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una fecha que corresponda al mismo mes y día de la fecha pasada por param
     * pero con el año 2010.
     *
     * @param date Fecha
     * @return Una fecha que corresponde al mes y día de la fecha pasada por param pero en el año 2010.
     */
    public LocalDate ejercicio4(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la misma fecha pero a las 8AM.
     *
     * @param date Fecha.
     * @return Fecha recibida como param pero a las 8AM.
     */
    public LocalDateTime ejercicio5(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param pero 3 horas y 30 minutos más tarde.
     *
     * @param date Fecha y hora.
     * @return Fecha y hora que está 3 horas y 30 minutos más tarde que la recibbida por param.
     */
    public LocalDateTime ejercicio6(LocalDateTime date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar si el año recibido por param es bisiesto o no.
     *
     * @param year Año.
     * @return {@code true} si y solo si el año recibido por param es bisiesto, {@code false} en caso contrario.
     */
    public boolean ejercicio7(Year year) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar un periodo de 2 años y 3 meses.
     * Ten cuidado al usar los métodos ofXYZ de Period, revisa la documentación de éstos antes de usarlos.
     *
     * @return Periodo de 2 años y 3 meses.
     */
    public Period ejercicio8() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escriba el código necesario para retornar una fecha que corresponda a la fecha de hoy más el período recibido por param.
     *
     * @param period Periodo.
     * @return Fecha que corresponde a la fecha de hoy más el tiempo definido en el período pasado por param.
     */
    public LocalDate ejercicio9(Period period) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escriba el código necesario para retornar un período de la cantidad de días que tiene el mes de la fecha
     * pasada por param.
     *
     * @param date Fecha.
     * @return Período de la cantidad de días que tiene el mes de la fecha pasada por param.
     */
    public Period ejercicio10(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el año y mes actual.
     *
     * @return Año y mes actual
     */
    public YearMonth ejercicio11() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el mes y día que representa la navidad.
     *
     * @return Mes y día que representa la navidad.
     */
    public MonthDay ejercicio12() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar la fecha pasada por param en formato dd-MM-yyyy.
     *
     * @param date Fecha.
     * @return Fecha pasada por param con formato dd-MM-yyyy.
     */
    public String ejercicio13(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Convierte la fecha pasada por param a un LocalDate.
     *
     * @param fecha Fecha con formato dd-MM-yyyy.
     * @return LocalDate correspondiente a la fecha pasada por param.
     */
    public LocalDate ejercicio14(String fecha) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar una instancia de Duration que se componga de 2 horas y 30 minutos.
     * Ten cuidado al usar los métodos ofXYZ de Duration, revisa la documentación de éstos antes de usarlos.
     *
     * @return Un objeto de duración 2h y 30m.
     */
    public Duration ejercicio15() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Retornar la cantidad de días que componen el objeto duración enviado por param.
     *
     * @param duration Duración.
     * @return Cantidad de días que componen el objeto duración pasado por param.
     */
    public long ejercicio16(Duration duration) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el día de la semana actual.
     *
     * @return El día de hoy.
     * @see java.time.LocalDate
     * @see java.time.DayOfWeek
     */
    public DayOfWeek ejercicio17() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para retornar el día de la semana correspondiente a pasado mañana.
     *
     * @return El día de la semana correspondiente a pasado mañana.
     * @see java.time.LocalDate
     * @see java.time.DayOfWeek
     */
    public DayOfWeek ejercicio18() {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para indicar si el día recibido como parámetro es un día laboral (Lunes...Viernes).
     * Pista: Convierte el día pasado por param a un objeto DayOfWeek, luego, usa los números que representan a los días
     * de la semana para validar el rango requerido.
     *
     * @param dia Cadena de texto que representa un día, ejemplo: MONDAY, TUESDAY, etc. Se garantiza que se envía uno de
     *            los valores encontrados en DayOfWeek.
     * @return {@code true} si y solo si el día pasado como parámetro está en el rango Lunes...Viernes.
     */
    public boolean ejercicio19(String dia) {
        throw new UnsupportedOperationException("No implementado aún.");
    }

    /**
     * Escribe el código necesario para obtener un objeto ZonedDateTime a partir de la fecha pasada por parámetro.
     * El objeto retornado debe cumplir con las siguientes características:
     * La zona horaria debe ser: America/Los_Angeles.
     * La hora del día debe ser: las 12 horas con 0 minutos.
     *
     * @param date Fecha.
     * @return ZonedDatedTime con las características mencionadas.
     */
    public ZonedDateTime ejercicio20(LocalDate date) {
        throw new UnsupportedOperationException("No implementado aún.");
    }
}
