package model;

    public class chamado {
    private final String descricao;
    private String status; // "aberto", "em_andamento", "resolvido"

    public chamado(String descricao) {
        this.descricao = descricao;
        this.status = "aberto";
    }

    // Getters e Setters
    public String getDescricao() { return descricao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}


