package br.com.feltex.datahora;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Localizacao {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern ("dd MMMM yyyy", new Locale("PT","br"));
        System.out.println("Data formatada BR: " + localDateTime.format(localDateFormatter));

        DateTimeFormatter dataFormatterUS = DateTimeFormatter.ofPattern("dd EEEE MMM yyyy", Locale.US);
        System.out.println("Data formatada US: " + localDateTime.format(dataFormatterUS));

        DateTimeFormatter dataFormatterJP = DateTimeFormatter.ofPattern("dd EEEE MMM yyyy", Locale.JAPAN);
        System.out.println("Data formatada Japão: " + localDateTime.format(dataFormatterJP));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);

        ZonedDateTime zonedDateTimeSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("zonedDateTimeSP: " + zonedDateTimeSP);

        LocalDateTime dataHoraReuniao = LocalDateTime.parse("2022-04-09T10:45:10");
        System.out.println("Data Hora da Reuniao: " + dataHoraReuniao);

    }
}
