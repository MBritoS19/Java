/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Cadastro;

/**
 *
 * @author jpescola
 */
public class CadastroController extends Controller<Cadastro> {

    @Override
    public boolean salvar(Cadastro t) {
        return super.salvar(t);
    }

    @Override
    public boolean excluir(Cadastro t) {
        return super.excluir(t);
    }

    public List<Cadastro> buscar(String campo, String valor) {
        return super.listar(Cadastro.class, campo, valor);
    }

    public Cadastro get(int id) {
        return super.get(Cadastro.class, id);
    }

    public List<Cadastro> listar() {
        return super.listar(Cadastro.class, "nome", "");
    }
}
