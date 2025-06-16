package model;

public class tecnico extends usuario {
    private final String especialidade;

    public tecnico(String nome, String email, String senha, String especialidade) {
        super(nome, email, senha);  // Note: "senha" (não "semha")
        this.especialidade = especialidade;
    }

    public String getEspecialidade() { 
        return especialidade; 
    }
}