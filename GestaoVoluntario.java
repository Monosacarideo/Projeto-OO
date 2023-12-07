import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestaoVoluntario {

  public ArrayList<Voluntario> listaDeVoluntarios = new ArrayList<Voluntario>();

  public void adicionarVoluntario(Voluntario Voluntario) {
    this.listaDeVoluntarios.add(Voluntario);
  }

  // Mostrar voluntários cadastrados
  public String mostrarVoluntariosCadastrados() {
    String mensagem = "";
    for (Voluntario v : this.listaDeVoluntarios) {
      mensagem += "\nAs informações dos voluntários cadastrados são: \n ";
      mensagem += "\n Nome: " +
          v.nomeVoluntario +
          "\n Idade: " +
          v.idadeVoluntario +
          "\n CPF: " +
          v.cpfVoluntario +
          "\n Endereço: " +
          v.enderecoVoluntario +
          "\n Telefone: " +
          v.telefone;
    }
    return mensagem;
  }

  // Editar nome voluntário
  public String alterarNomeVoluntario(int idVoluntario) {
    boolean encontrado = false;

    for (Voluntario v : this.listaDeVoluntarios) {
      int id = 0;
      encontrado = true;
      if (v.idVoluntario == id) {
        v.nomeVoluntario = JOptionPane.showInputDialog("Informe o novo nome do voluntário: ");
      }
    }
    if (encontrado == true) {
      return ("Nome alterado com sucesso! ");
    } else {
      return ("Cadastro não encontrado! ");
    }

  }

  // Editar idade voluntário
   public String alterarIdadeVoluntario(int idVoluntario) {
    boolean encontrado = false;

    for (Voluntario v : this.listaDeVoluntarios) {
      int id = 0;
      encontrado = true;
      if (v.idVoluntario == id) {
        v.idadeVoluntario = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do voluntário: "));
      }
    }
    if (encontrado == true) {
      return ("Idade alterada com sucesso! ");
    } else {
      return ("Cadastro não encontrado! ");
    }

  }

  // Editar endereço voluntário
  public String alterarEnderecoVoluntario(int idVoluntario) {
    boolean encontrado = false;

    for (Voluntario v : this.listaDeVoluntarios) {
      int id = 0;
      encontrado = true;
      if (v.idVoluntario == id) {
        v.enderecoVoluntario = JOptionPane.showInputDialog("Informe o endereço atualizado: ");
      }
    }
    if (encontrado == true) {
      return ("Endereço alterado com sucesso! ");
    } else {
      return ("Cadastro não encontrado! ");
    }

  }

  // Editar telefone voluntário
  public String alterarTelefoneVoluntario(int idVoluntario) {
    boolean encontrado = false;

    for (Voluntario v : this.listaDeVoluntarios) {
      int id = 0;
      encontrado = true;
      if (v.idVoluntario == id) {
        v.telefone = JOptionPane.showInputDialog("Informe o contato atualizado: ");
      }
    }
    if (encontrado == true) {
      return ("Contato alterado com sucesso! ");
    } else {
      return ("Cadastro não encontrado! ");
    }

  }
  
}
