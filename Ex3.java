import java.util.ArrayList;
import java.util.Scanner;

public class Ex3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<ArrayList<Double>> notasAlunos = new ArrayList<>();
        ArrayList<Double> mediasAlunos = new ArrayList<>();

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

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.size();
            mediasAlunos.add(media);
        }

        System.out.println("Lista de alunos, suas notas e médias:");
        for (int i = 0; i < nomesAlunos.size(); i++) {
            System.out.println("Aluno: " + nomesAlunos.get(i));
            System.out.println("Notas: " + notasAlunos.get(i));
            System.out.println("Média: " + mediasAlunos.get(i));
            System.out.println(); // linha em branco para separar os alunos
        }
    }
}
