/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Cidade;

/**
 *
 * @author jpescola
 */
public class CidadeController extends Controller<Cidade> {

    @Override
    public boolean salvar(Cidade t) {
        return super.salvar(t);
    }

    @Override
    public boolean excluir(Cidade t) {
        return super.excluir(t);
    }

    public List<Cidade> buscar(String campo, String valor) {
        return super.listar(Cidade.class, campo, valor);
    }

    public Cidade get(int id) {
        return super.get(Cidade.class, id);
    }

    public List<Cidade> listar() {
        return super.listar(Cidade.class, "nome", "");
    }
}
