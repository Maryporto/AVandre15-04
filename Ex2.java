import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<ArrayList<Double>> notasAlunos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do aluno (ou digite 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }


            nomesAlunos.add(nome);

            ArrayList<Double> notas = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite a nota " + i + " para " + nome + ": ");
                double nota = scanner.nextDouble();
                notas.add(nota);
            }
            scanner.nextLine(); // Limpar o buffer do scanner

            notasAlunos.add(notas);
        }

        System.out.println("Lista de alunos e suas notas:");
        for (int i = 0; i < nomesAlunos.size(); i++) {
            System.out.println("Aluno: " + nomesAlunos.get(i));
            System.out.println("Notas: " + notasAlunos.get(i));
        }
    }
}
