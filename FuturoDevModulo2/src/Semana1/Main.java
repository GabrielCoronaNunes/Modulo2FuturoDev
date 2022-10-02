package Semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> filmesSeries = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Informe uma opção:");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Remover");
            System.out.println("");
            System.out.println("0 - Sair");

            String opcao = entrada.nextLine();
            if (opcao.equals("0")) {
                break;
            }
            switch (opcao) {
                case "1":
                    listarItens(filmesSeries);
                    break;
                case "2":
                    System.out.print("Digite o nome: ");
                    String item = entrada.nextLine();
                    adcionarItem(item, filmesSeries);
                    break;
                case "3":
                    removerItemLista(filmesSeries, entrada);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }


    public static void adcionarItem(String item, List<String> filmesSeries) {
        filmesSeries.add(item);
        System.out.println("Item adcionado: ");
    }


    public static void listarItens(List<String> filmesSeries) {
        System.out.println("Filmes/Séries: ");

        for (int i = 0; i < filmesSeries.size(); i++) {
            System.out.println((i + 1) + " - " + filmesSeries.get(i));
        }
    }


    public static int listarPedirIndice(List<String> filmesSeries, Scanner entrada) {
        listarItens(filmesSeries);
        System.out.print("Escolha um item: ");
        String opcaoEscolhida = entrada.nextLine();
        try {
            return Integer.parseInt(opcaoEscolhida) - 1;
        } catch (Exception e) {
            return -1;
//
        }
    }


    public static void removerItemLista(List<String> filmesSeries, Scanner entrada) {
        int indice = listarPedirIndice(filmesSeries, entrada);
        if (indice < 0) {
            System.out.println("Opção inválida! Operação cancelada!");
        } else {
            removerItem(indice, filmesSeries);
        }
    }


    public static void removerItem(int indice, List<String> filmesSeries) {
        filmesSeries.remove(indice);
        System.out.println("Item removido!");
    }

    }

