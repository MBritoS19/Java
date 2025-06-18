/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Estado;

/**
 *
 * @author jpescola
 */
public class EstadoController extends Controller<Estado> {

    @Override
    public boolean salvar(Estado t) {
        return super.salvar(t);
    }

    @Override
    public boolean excluir(Estado t) {
        return super.excluir(t);
    }

    public List<Estado> buscar(String campo, String valor) {
        return super.listar(Estado.class, campo, valor);
    }

    public Estado get(int id) {
        return super.get(Estado.class, id);
    }

    public List<Estado> listar() {
        return super.listar(Estado.class, "nome", "");
    }
}
