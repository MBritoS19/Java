/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Dao;
import java.util.List;

/**
 *
 * @author jpescola
 */
public class Controller<T> {

    private Dao dao = null;

    public Controller() {
        dao = Dao.getIntance();
    }

    public boolean salvar(T t) {
        return dao.salvar(t);
    }

    public boolean excluir(T t) {
        return dao.excluir(t);
    }

    public List<T> listar(Class c, String campo, String valor) {
        return dao.listar(c, campo, valor);
    }

    public T get(Class c, int id) {
        return (T) dao.get(c, id);
    }

}
