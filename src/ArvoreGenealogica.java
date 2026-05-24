
/*
 * Atividade Prática — Árvore Genealógica
 * Pessoa escolhida: Dom Pedro II
 * Estrutura: 5 níveis com DefaultMutableTreeNode
 * 
 * Trabalho em equipe – Integrantes:
 * - Erivelton Oliveira Afonso
 * - Felipe Oliveira Mendes
 * - Marcos Silva Souza
 * - Silvio Aparecido Rêgo Silva
 */

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArvoreGenealogica {

        public static void main(String[] args) {

                // Criação da raiz da árvore (pessoa principal)
                DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Dom Pedro II");

                // Criando os pais (nível 2)
                DefaultMutableTreeNode pai = new DefaultMutableTreeNode("Dom Pedro I");

                DefaultMutableTreeNode mae = new DefaultMutableTreeNode("Maria Leopoldina");

                // Ligando os pais à raiz
                raiz.add(pai);
                raiz.add(mae);

                // Avós paternos
                DefaultMutableTreeNode avoP1 = new DefaultMutableTreeNode("Dom João VI");

                DefaultMutableTreeNode avoP2 = new DefaultMutableTreeNode("Carlota Joaquina");

                // Avós maternos
                DefaultMutableTreeNode avoM1 = new DefaultMutableTreeNode("Francisco I da Áustria");

                DefaultMutableTreeNode avoM2 = new DefaultMutableTreeNode("Maria Teresa das Duas Sicílias");

                // Ligando avós aos pais corretos
                pai.add(avoP1);
                pai.add(avoP2);

                mae.add(avoM1);
                mae.add(avoM2);

                // Bisavós (nível 4)
                DefaultMutableTreeNode bis1 = new DefaultMutableTreeNode("Pedro III de Portugal");

                DefaultMutableTreeNode bis2 = new DefaultMutableTreeNode("Maria I de Portugal");

                avoP1.add(bis1);
                avoP1.add(bis2);

                DefaultMutableTreeNode bis3 = new DefaultMutableTreeNode("Carlos IV da Espanha");

                DefaultMutableTreeNode bis4 = new DefaultMutableTreeNode("Maria Luísa de Parma");

                avoP2.add(bis3);
                avoP2.add(bis4);

                DefaultMutableTreeNode bis5 = new DefaultMutableTreeNode("Leopoldo II");

                DefaultMutableTreeNode bis6 = new DefaultMutableTreeNode("Maria Luísa da Espanha");

                avoM1.add(bis5);
                avoM1.add(bis6);

                DefaultMutableTreeNode bis7 = new DefaultMutableTreeNode("Fernando I das Duas Sicílias");

                DefaultMutableTreeNode bis8 = new DefaultMutableTreeNode("Maria Carolina da Áustria");

                avoM2.add(bis7);
                avoM2.add(bis8);

                // Trisavós (nível 5)
                // Aqui optei por já adicionar direto sem criar variável separada

                bis1.add(new DefaultMutableTreeNode("João V de Portugal"));
                bis1.add(new DefaultMutableTreeNode("Maria Ana da Áustria"));

                bis2.add(new DefaultMutableTreeNode("José I de Portugal"));
                bis2.add(new DefaultMutableTreeNode("Mariana Vitória da Espanha"));

                bis3.add(new DefaultMutableTreeNode("Carlos III da Espanha"));
                bis3.add(new DefaultMutableTreeNode("Maria Amália da Saxônia"));

                bis4.add(new DefaultMutableTreeNode("Filipe de Parma"));
                bis4.add(new DefaultMutableTreeNode("Luísa Isabel da França"));

                bis5.add(new DefaultMutableTreeNode("Francisco I do Sacro Império"));
                bis5.add(new DefaultMutableTreeNode("Maria Teresa da Áustria"));

                // Carlos III e Maria Amália aparecem 3 vezes pois são
                // antepassados comuns de vários ramos desta família real

                bis6.add(new DefaultMutableTreeNode("Carlos III da Espanha")); // mesmo ancestral de bis3
                bis6.add(new DefaultMutableTreeNode("Maria Amália da Saxônia"));

                bis7.add(new DefaultMutableTreeNode("Carlos III da Espanha"));
                bis7.add(new DefaultMutableTreeNode("Maria Amália da Saxônia"));

                bis8.add(new DefaultMutableTreeNode("Francisco I do Sacro Império"));
                bis8.add(new DefaultMutableTreeNode("Maria Teresa da Áustria"));

                System.out.println("=================================");
                System.out.println("      ÁRVORE GENEALÓGICA");
                System.out.println("          Dom Pedro II");
                System.out.println("=================================\n");

                // Chamada do método que imprime a árvore
                imprimirArvore(raiz, 0);
        }

        // Método recursivo para percorrer e imprimir a árvore
        // CASO BASE: se o nó não tiver filhos, o while não executa
        // e a recursão termina naturalmente para esse ramo.
        // CASO RECURSIVO: para cada filho, chama o próprio método
        // com nivel + 1, aprofundando a impressão hierárquica.
        public static void imprimirArvore(
                        DefaultMutableTreeNode node,
                        int nivel) {

                // Cria a indentação de acordo com o nível
                for (int i = 0; i < nivel; i++) {
                        System.out.print("│   ");
                }

                // Mostra o nome da pessoa (nó atual)
                System.out.println("└── " + node.getUserObject());

                // Pega os filhos do nó atual
                Enumeration<?> filhos = node.children();

                // Percorre todos os filhos
                while (filhos.hasMoreElements()) {

                        DefaultMutableTreeNode filho = (DefaultMutableTreeNode) filhos.nextElement();

                        // Chamada recursiva para imprimir os filhos
                        imprimirArvore(filho, nivel + 1);
                }
        }
}