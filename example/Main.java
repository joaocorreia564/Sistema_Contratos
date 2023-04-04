package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com nome do departamento:  ");
        String departamentoNome = tc.nextLine();
        System.out.println("Insira a data do Trabalho: ");
        System.out.println("Nome: ");
        String NomeTrabalhor = tc.nextLine();
        System.out.println("Seu level de experiencia : ");
        String levelTrabalho = tc.nextLine();
        System.out.println("Seu salario base : ");
        double salariobase = tc.nextDouble();
        Trabalho trabalhador = new Trabalho(NomeTrabalhor,
                LevelTrabalho.valueOf(levelTrabalho),salariobase,
                new Departamento(departamentoNome));
        //o Objeto trabalhador a cima instancia o obejeto trabalhador
        System.out.println("Quantos contratos esse trabalhador vai ter ? ");
        int n = tc.nextInt();

        for(int i=1 ; i <= n; i++){
            System.out.println("Insira a data do Contrato #" + i + " : ");
            System.out.print("(Data (DD/MM/YYYY): ");
            Date contratoData = sdf.parse(tc.next());
            System.out.print("Valor por hora: ");
            double valorporhora = tc.nextDouble();
            System.out.print("Duração(Horas): ");
            int horas = tc.nextInt();
            Contrato contrato = new Contrato(contratoData,valorporhora,horas);
            trabalhador.addContrato(contrato);
        }
        System.out.println();
        System.out.print("Entre com mês e ano para calcular o salario (MM/YYYY): ");
        String mesANo = tc.next();
        int Mes = Integer.parseInt(mesANo.substring(0,2));
        int ano = Integer.parseInt(mesANo.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda : " + mesANo + ": " +
                String.format("%.2f", trabalhador.renda(ano,Mes)));

        tc.close();

    }
}