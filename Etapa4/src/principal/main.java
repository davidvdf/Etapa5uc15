
package principal;
import model.*;
public class Main {
    public static void main(String[] args) {
        // 1. Cadastro de usuários
        cliente clientel = new cliente("David", "david@empresa.com", "123", "Tech Solutions");
        tecnico tecnicol = new tecnico("Maria", "maria@suporte.com", "456", "Redes");

        // 2. Abertura de chamado
        chamado chamadol = new chamado("Internet lenta");

        // 3. Atribuição do chamado ao técnico
        chamadol.setStatus("em_andamento");

        // 4. Exibição dos dados
        System.out.println("=== SISTEMA DE SUPORTE TÉCNICO ===");
        System.out.println("Cliente: " + clientel.getNome() +
                " | Empresa: " + clientel.getEmpresa());
        System.out.println("Técnico: " + tecnicol.getNome() +
                " | Especialidade: " + tecnicol.getEspecialidade());
        System.out.println("Chamado: " + chamadol.getDescricao() + // CORRIGIDO AQUI
                " | Status: " + chamadol.getStatus());
    }
}