/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pacheco
 */
public class BdPet {

    public ArrayList<Pet> listaPet = new ArrayList<Pet>();

    public void salvar(Pet p) {
        listaPet.add(p);
        JOptionPane.showMessageDialog(null, "Seu Pet foi cadastrado!!");
    }

    public String listar() {
        String resposta = "Não há animais cadastrados";
        if (!listaPet.isEmpty()) {
            resposta = "Lista geral de animais\n"
                    + "ID     NOME      RAÇA      ANO NASC.     IDADE\n";
            for (int i = 0; i < listaPet.size(); i++) {
                resposta += listaPet.get(i).toString() + "\n";
            }
        }
        return resposta;
    }

    public int encontrarPet(Pet p) {
        int aux = -1;
        for (int i = 0; i < listaPet.size(); i++) {
            if (listaPet.get(i).getNome().equals(p.getNome())) {
                aux = i;

            }
        }
        return aux;
    }

    public Pet getPet(int i) {
        return listaPet.get(i);
    }

    public void removerPet(int i) {
        if (i < listaPet.size()) {
            listaPet.remove(i);
            JOptionPane.showMessageDialog(null, "Seu pet foi excluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o pet!");
        }
    }

    public void alterarPet(int i, Pet p) {
        if (i < listaPet.size()) {
            listaPet.set(i, p);
            JOptionPane.showMessageDialog(null, "Seu pet foi modificado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel modificar o pet!");
        }
    }
}
