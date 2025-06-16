
package model;

public class cliente extends usuario {
    private final String empresa;

    public cliente(String nome, String email, String senha, String empresa) {
        super(nome, email, senha);  // Corrigido: "senha" em vez de "semha"
        this.empresa = empresa;
    }

    public String getEmpresa() { 
        return empresa; 
    }
}