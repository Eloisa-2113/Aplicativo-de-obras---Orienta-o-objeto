package br.dev.eloisasantos.appobras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class AppObras {

    public static void main(String[] args) {
        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoTexto = new Scanner(System.in);

        //Entrada de dados
        //pedir dados e comodos da obra
        Obra minhaObra = new Obra();
        System.out.printf("-".repeat(15));
        System.out.printf("AppObra\n");
        System.out.printf("-".repeat(15));

        System.out.printf("Informe o proprietario: ");
        minhaObra.proprietario = tecladoTexto.nextLine();
        System.out.printf("Informe o local: ");
        minhaObra.local = tecladoTexto.nextLine();
        System.out.printf("Informe a cidade: ");
        minhaObra.cidade = tecladoTexto.nextLine();
        System.out.printf("Informe a Unidade Federativa: ");
        minhaObra.uf = tecladoTexto.nextLine();

        Comodo comodoAtual;

        do {
            comodoAtual = new Comodo();
            System.out.print("Nome do comodo (ou aperte Enter para sair): ");
            comodoAtual.nome = tecladoTexto.nextLine();

            // Se o nome NÃO estiver em branco, pede os dados
            if (!comodoAtual.nome.isBlank()) {
                System.out.print("Informe a largura do comodo (em metros): ");
                comodoAtual.largura = tecladoNumerico.nextDouble();

                System.out.print("Informe o comprimento do comodo (em metros): ");
                comodoAtual.comprimento = tecladoNumerico.nextDouble();

                minhaObra.listaComodo.add(comodoAtual);
            }
            
        } while (!comodoAtual.nome.isBlank());

        //processamento - calcular o total da obra
        double areaTotal = minhaObra.calcularTotalObra();

        //saída de dados
        System.out.println(minhaObra.toString());
        System.out.printf("Area construida: %f", areaTotal);

        //mostrar os dados da obra e dos comodos
        for (Comodo c : minhaObra.listaComodo) {

            System.out.println(c.toString());

        }

    }
}
