import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> nomesAlunos = new ArrayList<>();

        System.out.println("Digite os nomes dos alunos (digite 'fim' para encerrar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            nomesAlunos.add(nome);
        }

        System.out.println("Lista de nomes dos alunos:");
        for (String nome : nomesAlunos) {
            System.out.println(nome);
        }
        scanner.close();
    }
}
