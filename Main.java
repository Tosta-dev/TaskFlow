import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- - - - - - - - TaskFlow - - - - - - - -");
        System.out.println("Olá, Seja Bem vindo!");
        System.out.println("Somos uma aplicação para o gerenciamento de tarefas!");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        Ferramenta.pause(scanner);
        int contador = 0;

        Gerenciador gerenciador = new Gerenciador();

        while(true) {
            System.out.println("- - - - - - - - - Menu - - - - - - - - -");
            System.out.println("1 - Cadastrar nova Tarefa");
            System.out.println("2 - Alterar uma Tarefa");
            System.out.println("3 - Excluir uma Tarefa");
            System.out.println("4 - Listar de Tarefa");
            System.out.println("5 - Buscar uma Tarefa pelo identificador");
            System.out.println("6 - Listar apenas as Tarefas pendentes");
            System.out.println("7 - Exibir um resumo com a quantidade de tarefas por status");
            System.out.println("8 - Sair ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Digite a sua resposta de acordo com as opções acima ?");

            int resposta = 0;
            try {
                resposta = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
                System.out.println(" Valor inválido, por favor tente novamente...");
                Ferramenta.pause(scanner);
                continue;
            }

            switch(resposta) {
                case 1:
                    System.out.println("Vamos cadastrar uma nova Tarefa");
                    System.out.println("Titulo : ");
                    String titulo = scanner.nextLine();

                    System.out.println("Descrição : ");
                    String descricao = scanner.nextLine();

                    System.out.println("Status : ");
                    String status = scanner.nextLine();

                    gerenciador.cadastro(titulo, descricao, status);
                    Ferramenta.pause(scanner);
                    break;
                case 2 :
                    System.out.println("2");
                    Ferramenta.pause(scanner);
                    break;
                case 3 :
                    System.out.println("3");
                    Ferramenta.pause(scanner);
                    break;

                case 4 :
                    System.out.println("4");
                    Ferramenta.pause(scanner);
                    break;
                case 5 :
                    System.out.println("5");
                    Ferramenta.pause(scanner);
                    break;
                case 6 :
                    System.out.println("6");
                    Ferramenta.pause(scanner);
                    break;
                case 7 :
                    System.out.println("7");
                    Ferramenta.pause(scanner);
                    break;
                case 8 :
                    System.out.println("Muito obrigado por utilizar o TaskFlow !");
                    return;
                default :
                    System.out.println("Opção inválida por favor tente novamente");
                    Ferramenta.pause(scanner);
            }
        }
    }
}
