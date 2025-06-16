
package model;

public class usuario {
// Atributos FINAIS e CORRETAMENTE NOMEADOS (Opção 1)
    private final String nome;   // <<- SEM "name", use "nome" em TODOS os lugares
    private final String email;
    private final String senha;

    // Construtor
    public usuario(String nome, String email, String senha) {
        this.nome = nome;    // <<- Note: "nome" (não "name")
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    
}