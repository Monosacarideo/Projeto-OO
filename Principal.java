import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        GestaoEstoque ge = new GestaoEstoque();
        GestaoVoluntario gv = new GestaoVoluntario();
        int opcao = 0;
        int opcaoCategorias = 0;
        int opcaoVoluntario = 0;
        int id = 0;

        do {

            // Fazer a validação do login
            EntradaSaida.escolherOpcaoMenuPrincipal();
            opcao = scan.nextInt();
        
            switch (opcao) {
                case 1:
                    // Solicitar dados e cadastrar doação no menu de categorias
                    Doacao d = new Doacao();
                    EntradaSaida.escolherOpcaoMenuCategorias();
                    opcaoCategorias = scan.nextInt();


                    switch (opcaoCategorias) {
                        case 1:
                            // Solicitar Dados Pessoais
                            System.out.println("Insira o ID do cadastro: ");
                            d.id = scan.nextInt();
                            System.out.println("Insira a descrição da doação: ");
                            d.descricao = scan.next();
                            System.out.println("Insira a quantidade: ");
                            d.quantidade = scan.next();
                            d.categoria = "Vestuário";
                            ge.cadastrarDoacao(d);
                            EntradaSaida.escolherOpcaoMenuPrincipal();
                            break;

                        case 2:
                            // Solicitar Dados Pessoais
                            System.out.println("Insira o ID do cadastro: ");
                            d.id = scan.nextInt();
                            System.out.println("Insira a descrição da doação: ");
                            d.descricao = scan.next();
                            System.out.println("Insira a quantidade: ");
                            d.quantidade = scan.next();
                            d.categoria = "Alimento";
                            ge.cadastrarDoacao(d);
                            EntradaSaida.escolherOpcaoMenuPrincipal();

                            break;

                        case 3:
                            // Solicitar Dados Pessoais
                            System.out.println("Insira o ID do cadastro: ");
                            d.id = scan.nextInt();
                            System.out.println("Insira a descrição da doação: ");
                            d.descricao = scan.next();
                            System.out.println("Insira a quantidade: ");
                            d.quantidade = scan.next();
                            d.categoria = "Móveis";
                            ge.cadastrarDoacao(d);
                            EntradaSaida.escolherOpcaoMenuPrincipal();

                            break;

                        case 4:
                            // Solicitar Dados Pessoais
                            System.out.println("Insira o ID do cadastro: ");
                            d.id = scan.nextInt();
                            System.out.println("Insira a descrição da doação: ");
                            d.descricao = scan.next();
                            System.out.println("Insira o valor: ");
                            d.quantidade = scan.next();
                            d.categoria = "Dinheiro";
                            ge.cadastrarDoacao(d);
                            EntradaSaida.escolherOpcaoMenuPrincipal();
                            break;

                        case 5:
                            EntradaSaida.escolherOpcaoMenuPrincipal();
                            break;

                        default:
                            System.exit(0);
                            break;
                    }

                case 2:
                    // Visualizar doações cadastradas
                    System.out.println(ge.mostrarDoacoesCadastradas());
                    break;

                case 3:
                    // Alterar descrição de alguma doação
                    EntradaSaida.solicitarId("alterar");
                    id = scan.nextInt();
                    System.out.println(ge.alterarDescricaoDoacao(id));
                    break;

                case 4:
                    // Excluir cadastro
                    EntradaSaida.solicitarId("excluir");
                    id = scan.nextInt();
                    System.out.println(ge.deletarDoacao(id - 1));
                    break;

                case 8:
                    // Realizar cadastro para voluntariado:
                    Voluntario v = new Voluntario();
                    System.out.println("Insira o ID do voluntário: ");
                    v.idVoluntario = scan.nextInt();
                    System.out.println("Informe o nome do voluntário: ");
                    v.nomeVoluntario = scan.next();
                    System.out.println("Informe a idade: ");
                    v.idadeVoluntario = scan.nextInt();
                    System.out.println("Informe o endereço: ");
                    v.enderecoVoluntario = scan.next();
                    System.out.println("Informe o telefone: ");
                    v.telefone = scan.next();
                    gv.adicionarVoluntario(v);
                    System.out.print("Cadastro realizado com sucesso!");
                    break;

                case 9:
                    // Motrar voluntários cadastrados:
                    System.out.println(gv.mostrarVoluntariosCadastrados());
                    break;

                default:
                    break;
            }

        } while (opcao != 0);
    }
}
