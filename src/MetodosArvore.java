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

public class MetodosArvore {

    // Método recursivo para percorrer e imprimir a árvore
    public static void imprimirArvore(
            DefaultMutableTreeNode node,
            int nivel) {

        // Cria a indentação visual da árvore
        for (int i = 0; i < nivel; i++) {
            System.out.print("│   ");
        }

        // Imprime o nó atual
        System.out.println("└── " + node.getUserObject());

        // Obtém os filhos do nó atual
        Enumeration<?> filhos = node.children();

        // Caso base:
        // quando um nó não possui filhos,
        // o laço não executa e a recursão termina.

        while (filhos.hasMoreElements()) {

            DefaultMutableTreeNode filho = (DefaultMutableTreeNode) filhos.nextElement();

            // O método chama a si mesmo para imprimir os filhos da árvore
            imprimirArvore(filho, nivel + 1);
        }
    }
}