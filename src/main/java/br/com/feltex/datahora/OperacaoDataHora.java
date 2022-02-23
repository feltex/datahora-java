package br.com.feltex.datahora;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OperacaoDataHora {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.parse("2022-04-08");
        System.out.println("Hoje: " + hoje);

        LocalDate amanha = hoje.plus(1, ChronoUnit.DAYS);
        System.out.println("Amanha: " + amanha);

        LocalDate ontem = hoje.minus(1, ChronoUnit.DAYS);
        System.out.println("Ontem: " + ontem);

        System.out.println("Amanha é depois de hoje? " + amanha.isAfter(hoje));
        System.out.println("Ontem é antes de hoje? " + ontem.isBefore(hoje));

        System.out.println("Hoje é depois da ontem? "+ hoje.isAfter(ontem));
        System.out.println("Amanha é antes de ontem? " + amanha.isBefore(ontem));
    }
}
