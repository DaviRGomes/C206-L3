public class Main {
    public static void main(String[] args) {


        // criando o objeto Empressa
        Empressa emp = new Empressa("14. 953. 075/3718-00","Rua Henrique Del Castilho");

        // criando objeto contato [0]
        emp.contato[0] = new Contato();
        emp.contato[0].telefone = "(35) 99891-2412";
        emp.contato[0].nome = "Davi Rosa Gomes";
        emp.contato[0].email = "davi.rosa@gec.inatel.br";
        emp.contato[0].dataNascimento = "17/12/2002";

        // criando objeto contato [1]
        emp.contato[1] = new Contato();
        emp.contato[1].telefone = "(35) 99743-2734";
        emp.contato[1].nome = "Henrique Pereira";
        emp.contato[1].email = "henrique.pereira@ges.inatel.br";
        emp.contato[1].dataNascimento = "21/10/2002";

        // saida
        emp.mostraInfo();

    }
}