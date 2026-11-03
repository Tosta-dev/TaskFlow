import java.time.LocalDate;

public class Tarefa{
    private int id;
    private String titulo;
    private String descricao;
    private StatusTarefa status = StatusTarefa.PENDENTE;
    private LocalDate data = LocalDate.now();

    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
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
    public StatusTarefa getStatus(){
        return status;
    }
    public LocalDate getData(){
        return data;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setStatus(StatusTarefa status){
        this.status = status;
    }
}