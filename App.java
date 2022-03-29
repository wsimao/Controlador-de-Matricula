import java.util.ArrayList;
import java.util.Scanner;

public class App{
    
 public static void main(String [] args) {

    Discente aluno = new Discente();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Discente> discentes = new ArrayList<Discente>();

    boolean executando = true;
    while(executando) {
    System.out.println("*[1] Realizar Matrícula*");
    System.out.println("*[2] Listar alunos matriculados*");
    System.out.println("*[3] Sair*");
    System.out.println("Digite uma opção: ");
    String opcao = scanner.nextLine();


    switch (opcao){
        case "1": {
            System.out.print("=====INSCRIÇÃO DE DISCENTES=====");
            System.out.println("");

            System.out.println("Digite o nome completo: ");
            aluno.setNomeCompleto(scanner.nextLine());

            System.out.println("Digite o melhor e-mail: ");
            aluno.setEmail(scanner.nextLine());

            System.out.println("Qual curso deseja ser matriculado: ");
            System.out.println("*[4] TSI - Tecnologia em Sistemas para Internet*");
            System.out.println("*[5] BCC - Bacharel em Ciência da Computação*");
            System.out.println("*[6] Sair*");
            String discenteCurso = scanner.nextLine();

            switch (discenteCurso){
                case "4": {
                    aluno.setCurso("TSI - Tecnologia em Sistemas para Internet");
                    System.out.println("Você escolheu o curso de " +aluno.getCurso());
                    break;
                }
                case "5": {
                    aluno.setCurso("BCC - Bacharel em Ciência da Computação");
                    System.out.println("Você escolheu o curso de " +aluno.getCurso());
                    break;
                }
                case "6":{
                    executando = false;
                    System.out.println("=====(VOCÊ ESCOLHEU SAIR. MATRÍCULA NÃO REALIZADA)=====");
                    break;
                }
                
            }
            Discente alunos = new Discente(aluno.getNomeCompleto(), aluno.getEmail(), aluno.getInstituicao(), aluno.getCurso(), aluno.getPeriodoLetivo());
            discentes.add(alunos);
            break;
        }
        case "2": {
            System.out.print("=====DISCENTES MATRICULADOS=====");
            System.out.println("");
            System.out.println("");

            for(int i = 0; i < discentes.size(); i++){

                Discente alunooo = discentes.get(i);
                System.out.println("Matricula " +i);
                System.out.println("\tNome: " +discentes.get(i).getNomeCompleto());
                System.out.println("\tE-mail: " +discentes.get(i).getEmail());
                System.out.println("\tCurso: " +discentes.get(i).getCurso());
                System.out.println("\tInstituição: " +discentes.get(i).getInstituicao());
                System.out.println("\tPeríodo Letivo: " +discentes.get(i).getPeriodoLetivo());
                System.out.println("");
                System.out.println("============================================================");
                System.out.println("");
        }
        break;
    }
        case "3": {
            executando = false;
            System.out.println("=====(VOCÊ ESCOLHEU SAIR. SISTEMA ENCERRADO)=====");
            break;
        }
    }
}
}
}



