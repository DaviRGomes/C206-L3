public class Aluno {
    String nome;
    String curso;
    int matricula;
    Materia materias[] = new Materia[10];

    // metodo para somar o total de creditos que o aluno tem
    public int totalCreditos() {
        int cont = 0; // contador para somar os creditos
        // lendo o vetor materia para cada aluno
        for (int i = 0; i < materias.length; i++) {
            //entra no if somente se a posicação estiver preenchida
            if (materias[i] != null) {
                // fazendo a soma dos creditos
                cont += materias[i].creditos;
            }
        }
        System.out.println("Total de creditos do aluno eh : " + cont );

        return 0;
    }

    // metodo para mostrar todas informaões do aluno - materias que ele tem
    public void exibirInfos() {
        System.out.println("Informacoes do aluno");
        System.out.println("Nome do aluno : " + nome);
        System.out.println("Curso do aluno : " + curso);
        System.out.println("Matricula do aluno : " + matricula);
        System.out.println("Materias que o aluno tem :");
        // lendo o vetor materia para cada aluno
        for (int i = 0; i < materias.length; i++) {
            //entra no if somente se a posicação estiver preenchida
            if (materias[i] != null) {
                System.out.println("Materia : " + (i + 1));
                System.out.println("Nome da materia : " + materias[i].nome);
                System.out.println("Sigla da materia : " + materias[i].sigla);
                System.out.println("Creditos da materia : " + materias[i].creditos);
            }
        }
        System.out.println();
    }
}
