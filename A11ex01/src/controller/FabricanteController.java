/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Fabricante;

/**
 *
 * @author jpescola
 */
public class FabricanteController extends Controller<Fabricante> {

    @Override
    public boolean salvar(Fabricante t) {
        return super.salvar(t);
    }

    @Override
    public boolean excluir(Fabricante t) {
        return super.excluir(t);
    }

    public List<Fabricante> buscar(String campo, String valor) {
        return super.listar(Fabricante.class, campo, valor);
    }

    public Fabricante get(int id) {
        return super.get(Fabricante.class, id);
    }

    public List<Fabricante> listar() {
        return super.listar(Fabricante.class, "nome", "");
    }
}
