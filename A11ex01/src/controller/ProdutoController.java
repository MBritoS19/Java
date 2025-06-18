/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Produto;

/**
 *
 * @author jpescola
 */
public class ProdutoController extends Controller<Produto> {

    @Override
    public boolean salvar(Produto t) {
        return super.salvar(t);
    }

    @Override
    public boolean excluir(Produto t) {
        return super.excluir(t);
    }

    public List<Produto> buscar(String campo, String valor) {
        return super.listar(Produto.class, campo, valor);
    }

    public Produto get(int id) {
        return super.get(Produto.class, id);
    }

    public List<Produto> listar() {
        return super.listar(Produto.class, "nome", "");
    }
}
