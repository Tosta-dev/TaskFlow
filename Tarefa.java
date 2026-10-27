import java.time.LocalDate;

public class Tarefa{
    private int id;
    private String titulo;
    private String descricao;
    private String status;
    private LocalDate data = LocalDate.now();

    public Tarefa(int id, String titulo, String descricao, String status){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getStatus(){
        return status;
    }
    public LocalDate getData(){
        return data;
    }
}