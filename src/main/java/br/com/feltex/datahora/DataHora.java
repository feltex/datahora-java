package br.com.feltex.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHora {

    /*
     - Criar Data (LocalDate) - Ok
     - Criar Hora (LocalTime) - Ok
     - Data e Hora (LocalDateTime)  - Ok
     - Usar localização (Locale) - Ok
     - Formatar Data e hora (DateFormatter)  - Ok
     - Fazer soma de data (Adicionar e Subtrair dias) - Ok
     - Comparar datas - Ok
     - Não utilize mais as classes do java.util.Date or java.sql.Date
    */

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        System.out.println("Dia: " + localDateTime.getDayOfMonth());
        System.out.println("Mes: " + localDateTime.getMonthValue());
        System.out.println("Ano: " + localDateTime.getYear());
        System.out.println("Hora: " + localDateTime.getHour());
        System.out.println("Minuto: " + localDateTime.getMinute());
        System.out.println("Segundo: " + localDateTime.getSecond());

    }
}
