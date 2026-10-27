import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Tarefa> Tarefas = new ArrayList<>();

    int contador = 0;

    public Tarefa cadastro(String titulo, String descricao) {
        contador += 1;

        System.out.println("Vamos cadastrar a Tarefa!");
        Tarefa local_tarefa = new Tarefa(contador, titulo, descricao);
        Tarefas.add(local_tarefa);

        return local_tarefa;
    }
    public void Listar_Tarefas(){
        if (Tarefas.isEmpty()){
            System.out.println("A lista de Tarefas está vazia!");
            return;
        }
        for (int i = Tarefas.size() - 1; i >= 0; i--) {
            Tarefa local_tarefa = Tarefas.get(i);
            System.out.println("Titulo : " + local_tarefa.getTitulo());
            System.out.println("Descrição : " + local_tarefa.getDescricao());
            System.out.println("ID :" + local_tarefa.getId());
            System.out.println("Status : " + local_tarefa.getStatus());
            System.out.println("Data : " + local_tarefa.getData());
            System.out.println("- - - - - - - - - - - - - - - -");
        }
    }
    public void buscarTarefaPorID(int id) {
        for(int i = 0; i < Tarefas.size(); i++){
            Tarefa local_tarefa = Tarefas.get(i);
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
}
