package SistemaNotas;
    import java.util.Scanner;
public class TesteNotas{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        GerenciadorTurma G;
        G = new GerenciadorTurma("3 ano A");
    
        Aluno a1 = new Aluno("Renato Garcia", "533",10, 7,9);
        Aluno a2 = new Aluno("Motomoto", "810",6, 3,4);
        Aluno a3 = new Aluno();
        a3.lancarNotas(6, 9, 5);
        G.cadastrarAluno(a1);
        G.cadastrarAluno(a2);
        G.cadastrarAluno(a3);
        
       
    
         
        
        int menu;
    do{
        
       System.out.println("\n\n===== SISTEMA DE NOTAS | 3o Ano A =====");
       System.out.println("1 | Emitir boletins de todos os alunos");
       System.out.println("2 | Exibir quantidade de alunos aprovados");
       System.out.println("3 | Exibir aluno com maior média");
       System.out.println("4 | Lançar notas para um aluno pelo índice");
       System.out.println("0 | Sair do sistema");
       System.out.printf("Escolha uma opção:");
        menu = in.nextInt();
        switch (menu) {
            case 1:
                G.emitirBoletins();
                break;
            case 2:
                System.out.printf("Quantidade de alunos aprovados = "+ G.contarAprovados());
               
                break;
            case 3:
               G.exibirMaiorMedia();
                break;
            case 4:
                
                System.out.printf("Selecione o indice do aluno | 0, 1 ou 2 |: ");
                int al = in.nextInt();
                System.out.printf("Nota1: ");
                double n1 = in.nextDouble();
                System.out.printf("Nota2: ");
                double n2 = in.nextDouble();
                System.out.printf("Nota3: ");
                double n3 = in.nextDouble();
                
                Aluno alunoIndice = G.getAluno(al);
                G.getAluno(al).lancarNotas(n1, n2, n3);
                alunoIndice.exibirBoletim();
               
                break;
            case 0:
                System.out.println("Sistema encerrado.");
                break;
            
            
            default:
                System.out.printf("Opção inválida. Tente novamente.");
        }
    }while(menu != 0);
    in.close();
    }
}
