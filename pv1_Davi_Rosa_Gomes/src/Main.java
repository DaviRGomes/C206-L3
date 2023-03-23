public class Main {
    public static void main(String[] args) {

        // criando uma faculdade
        Faculdade faculdade = new Faculdade("Faceca", "14.953.075/3718-00");

        // criando Aluno 1 e as duas materias que ele tem
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Davi";
        aluno1.matricula = 2044;
        aluno1.curso = "Computacao";
        // criando objeto materias [0] para o aluno 1
        aluno1.materias[0] = new Materia();
        aluno1.materias[0].nome = "Calculo II";
        aluno1.materias[0].creditos = 4;
        aluno1.materias[0].sigla = "M004";
        // criando objeto materias [1] para o aluno 1
        aluno1.materias[1] = new Materia();
        aluno1.materias[1].nome = "Microcontroladores";
        aluno1.materias[1].creditos  = 2;
        aluno1.materias[1].sigla  = "E209";

        // criando Aluno 2 e as duas materias que ele tem
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Francisco";
        aluno2.matricula = 27;
        aluno2.curso = "Eletrica";
        // criando objeto materias [0] para o aluno 2
        aluno2.materias[0] = new Materia();
        aluno2.materias[0].nome = "Calculo III";
        aluno2.materias[0].creditos = 4;
        aluno2.materias[0].sigla = "M005";
        // criando objeto materias [1] para o aluno 2
        aluno2.materias[1] = new Materia();
        aluno2.materias[0].sigla = "M005";
        aluno2.materias[1].nome = "Programacao orientada de objetos";
        aluno2.materias[1].creditos  = 5;
        aluno2.materias[1].sigla  = "PO";

        // chamando o metodo da faculdade
        faculdade.exibirInfos();

        System.out.println("Aluno 1 ");
        // chamando o metodo total de creditos por aluno1
        aluno1.totalCreditos();
        // chamando o metodo do aluno1
        aluno1.exibirInfos();

        System.out.println("Aluno 2");
        // chamando o metodo total de creditos por aluno2
        aluno2.totalCreditos();
        // chamando o metodo do aluno2
        aluno2.exibirInfos();

    }
}