public class Ex5 {


    public static String classificarAlunos(double[] notas) {
        // Calcula a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;


        double limiteAprovacao = 6.0;
        double limiteRecuperacao = 4.0;

        if (media >= limiteAprovacao) {
            return "Aprovado";
        } else if (media >= limiteRecuperacao) {
            return "Em recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        // Exemplo de notas dos alunos
        double[] notasAluno1 = {7, 8, 6.5, 9};
        double[] notasAluno2 = {5, 4, 6, 5};
        double[] notasAluno3 = {3, 4, 2, 5};

 
        System.out.println("Aluno 1: " + classificarAlunos(notasAluno1));
        System.out.println("Aluno 2: " + classificarAlunos(notasAluno2));
        System.out.println("Aluno 3: " + classificarAlunos(notasAluno3));
    }
}
