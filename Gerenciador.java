import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    int contador = 0;

    public Tarefa cadastro(Scanner scanner) {
        contador += 1;

        System.out.println("Vamos cadastrar uma nova Tarefa");
        System.out.println("Titulo : ");
        String titulo = scanner.nextLine();

        System.out.println("Descrição : ");
        String descricao = scanner.nextLine();

        System.out.println("Vamos cadastrar a Tarefa!");
        Tarefa local_tarefa = new Tarefa(contador, titulo, descricao);
        tarefas.add(local_tarefa);

        return local_tarefa;
    }
    public void alterarTarefa(Scanner scanner){
        System.out.println("Digite o id da Tarefa que deseja atualizar : ");
        int resposta = scanner.nextInt();
        System.out.println("Você digitou : " + resposta + ", Digite o valor novamente para confirmar : ");
        int confirmar = scanner.nextInt();
        if (confirmar != resposta) {
            System.out.println("Valores diferentes, tente novamente ...");
            return;
        }
        for(int i = 0; i < tarefas.size(); i++) {
            Tarefa local_tarefa = tarefas.get(i);
            if (local_tarefa.getId() == resposta) {
                while (true){
                    System.out.println("Titulo : " + local_tarefa.getTitulo());
                    System.out.println("Descrição : " + local_tarefa.getDescricao());
                    System.out.println("Status : " + local_tarefa.getStatus());
                    System.out.println("- - - - - - - - - - - - - - - -");
                    System.out.println("Gostaria de atualizar as informações ?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Sair");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        System.out.println("Qual das opções abaixo gostaria de modificar ?");
                        System.out.println("1 - Titulo");
                        System.out.println("2 - Descricao");
                        System.out.println("3 - Status");
                        switch (scanner.nextInt()) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("Digite o nome do novo titulo :");
                                local_tarefa.setTitulo(scanner.nextLine());
                                System.out.println("Atualizado!");
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.println("Digite o nome da nova descrição :");
                                local_tarefa.setDescricao(scanner.nextLine());
                                System.out.println("Atualizado!");
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.println("Vamos alterar o Status");
                                System.out.println("1 - Pendente");
                                System.out.println("2 - Em andamento");
                                System.out.println("3 - Concluida");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        local_tarefa.setStatus(StatusTarefa.PENDENTE);
                                        System.out.println("Atualizado!");
                                        break;
                                    case 2 :
                                        local_tarefa.setStatus(StatusTarefa.EM_ANDAMENTO);
                                        System.out.println("Atualizado!");
                                        break;
                                    case 3:
                                        local_tarefa.setStatus(StatusTarefa.CONCLUIDA);
                                        System.out.println("Atualizado!");
                                        break;
                                    default:
                                        System.out.println("Valor invalido tente novamente ...");
                                }
                                break;
                            default:
                                System.out.println("Opção inexistente, tente novamente ...");
                        }
                    } else if  (opcao == 2) {
                        System.out.println("Voltando ao menu");
                        return;
                    } else {
                        System.out.println("Valor invalido tente novamente ...");
                    }
                }
            }
        } System.out.println("id não encontrado, tente novamente ...");
    }
    public void listar_Tarefas(){
        if (tarefas.isEmpty()){
            System.out.println("A lista de Tarefas está vazia!");
            return;
        }
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            Tarefa local_tarefa = tarefas.get(i);
            System.out.println("Titulo : " + local_tarefa.getTitulo());
            System.out.println("Descrição : " + local_tarefa.getDescricao());
            System.out.println("ID :" + local_tarefa.getId());
            System.out.println("Status : " + local_tarefa.getStatus());
            System.out.println("Data : " + local_tarefa.getData());
            System.out.println("- - - - - - - - - - - - - - - -");
        }
    }
    public void buscarTarefaPorID(Scanner scanner) {
        System.out.println("Vamos procurar a tarefa pelo identificador");
        System.out.println("Digite o ID :");
        int id = scanner.nextInt();
        for(int i = 0; i < tarefas.size(); i++){
            Tarefa local_tarefa = tarefas.get(i);
            if(local_tarefa.getId() == id){
                System.out.println("Titulo : " + local_tarefa.getTitulo());
                System.out.println("Descrição : " + local_tarefa.getDescricao());
                System.out.println("ID :" + local_tarefa.getId());
                System.out.println("Status : " + local_tarefa.getStatus());
                System.out.println("Data : " + local_tarefa.getData());
                System.out.println("- - - - - - - - - - - - - - - -");
                return;
            }
        }
        System.out.println("ID não encontrado!");
    }
    public void excluirTarefa(Scanner scanner) {
        System.out.println("Digite o id da Tarefa que deseja excluir : ");
        int resposta = scanner.nextInt();
        System.out.println("Você digitou : " + resposta + ", Digite o valor novamente para confirmar : ");
        int confirmar = scanner.nextInt();
        if (confirmar != resposta) {
            System.out.println("Valores diferentes, tente novamente ...");
            return;
        }
        for(int i = 0; i < tarefas.size(); i++){
            Tarefa local_tarefa = tarefas.get(i);
            if(local_tarefa.getId() == resposta){
                System.out.println("Titulo : " + local_tarefa.getTitulo());
                System.out.println("Descrição : " + local_tarefa.getDescricao());
                System.out.println("ID :" + local_tarefa.getId());
                System.out.println("Status : " + local_tarefa.getStatus());
                System.out.println("Data : " + local_tarefa.getData());
                System.out.println("- - - - - - - - - - - - - - - -");
                tarefas.remove(i);
                return;
            }
        } System.out.println("Valor do Id não encontrado, tente novamente ...");
    }
}
