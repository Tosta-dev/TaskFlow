import java.util.ArrayList;
import java.time.LocalDate;

public class Gerenciador {
    private ArrayList<Tarefa> Tarefas = new ArrayList<>();
    private ArrayList<Tarefa> Tarefas_Pendentes = new ArrayList<>();
    private ArrayList<Tarefa> Tarefas_Realizadas = new ArrayList<>();
    int contador = 0;

    public Tarefa cadastro(String titulo, String descricao, String status){
        contador += 1;

        System.out.println("Vamos cadastrar a Tarefa!");
        Tarefa local_tarefa = new Tarefa(contador,titulo, descricao, status);
        Tarefas.add(local_tarefa);

        return local_tarefa;
    }
}
