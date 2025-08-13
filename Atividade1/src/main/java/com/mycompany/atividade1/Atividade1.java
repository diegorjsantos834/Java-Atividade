/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

/**
 *
 * @author Koragem
 */
import javax.swing.*;
public class Atividade1 {
    public static void main(String[] args) {
        
    //Algoritmo 1,usando ==, igualdade
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Em que ano o Brasil foi pentacampeão?, Digite: "));//declaração da primeira variável desse algoritmo
    
    if (num1 == 2002) { //verifica se o valor da variável é igual a 2002
        JOptionPane.showMessageDialog(null, "Parabéns, você acertou!, deve ter visto o cabelo do fenomeno");//se for igual, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "Você errou!, como você não sabe?");//se não for igual, exibe a mensagem de erro
    }

    //algoritmo 2, usando >, usando maior que
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que os inscritos do Mrbeast:  "));//declaração da primeira variável desse algoritmo

    if (num2 > 419000000) { //verifica se o valor da variável é maior que 20
        JOptionPane.showMessageDialog(null, "Como voce sabe?");//se for maior que que o valor, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "Errou ele possui mais");//se não for maior que o valor, exibe a mensagem de erro
    }
    //algoritmo 3, usando <, usando menor que
    int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um salário para saber se ele é menor que o salário mínimo: "));//declaração da primeira variável desse algoritmo

    if (num3 < 1804) { //verifica se o valor da variável é menor que 1804
        JOptionPane.showMessageDialog(null, "Esse salário é menor que o salário mínimo, vc está pobre");//se for menor que 1804, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "Esse salário é maior do que o salário mínimo,");//se não for menor que 1804, exibe a mensagem de erro
        
    }
    //algoritmo 4, usando <> ou !=, diferente 
    int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente de 13 "));//declaração da primeira variável dedsse algoritmo

    if (num4 != 13) { //verifica se o valor da variável é diferente de 13
        JOptionPane.showMessageDialog(null, "Esse número é diferente de 13,");//se for diferente de 13, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "Esse número é igual a 13, ");//se não for diferente de 13, exibe a mensagem de erro
        
    }
    //algoritmo 5, usando >=, maior ou igual a
    int num5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior ou igual que a nota (Red Dead Redemption 2) no metacritc"));//declaração da primeira variável desse algoritmo

    if (num5 >= 97) { //verifica se o valor da variável é maior ou igual a 97
        JOptionPane.showMessageDialog(null, "Vc comseguiu, ainda bem que vc sabe que esse jogo não poderia ter menos");//se for maior ou igual a 97, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "vc não conseguiu, É Red Dead Redemption 2 pq vc chutou tão baixo  ");//se não for maior ou igual a 97, exibe a mensagem de erro
    }

    //alogoritmo 6, usando <=, menor ou igual a
    int num6 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número menor ou igual a quantidade de algoritmo dessa atividade"));//declaração da primeira variável desse algoritmo

    if ((num6 <= 6)) { //verifica se o valor da variável é menor ou igual a 6
        JOptionPane.showMessageDialog(null, "Parabéns, você conseguiu");//se for menor ou igual a 6, exibe a mensagem de acerto
    } else {
        JOptionPane.showMessageDialog(null, "Você errou, tem menos ");//se não for menor ou igual a 6, exibe a mensagem de erro
        
    }
    }
}
