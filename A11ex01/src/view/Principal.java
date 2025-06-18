package view;

import controller.FabricanteController;
import controller.ProdutoController;
import java.util.List;
import model.Fabricante;
import model.Produto;

/**
 *
 * @author jpescola
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new index().setVisible(true);

        try {

            // definindo os controllers
            FabricanteController fc = new FabricanteController();
            ProdutoController pc = new ProdutoController();

            // cadastrando fabricantes
            fc.salvar(new Fabricante(0, "Samsung"));
            fc.salvar(new Fabricante(0, "Dell"));
            fc.salvar(new Fabricante(0, "Benq"));

            // buscando
            List<Fabricante> fabricantes = fc.listar();
            Fabricante samsung = fabricantes.get(0);
            Fabricante dell = fabricantes.get(1);
            Fabricante benq = fabricantes.get(2);

            // deletando fabricantes
            fc.excluir(benq);

            // cadastrando produtos
            pc.salvar(new Produto(0, "Teclado", dell));
            pc.salvar(new Produto(0, "Monitor", samsung));
            pc.salvar(new Produto(0, "Memória", samsung));
            pc.salvar(new Produto(0, "HD", samsung));

            // listando fabricantes
            System.out.println(samsung.getNome());

            // listando produtos
            for (Produto p : pc.listar()) {
                System.out.println(p.getNome());
            }
            
            // outra forma de listar produtos
            for (Produto p : samsung.getProdutos()) {
                System.out.println(p.getNome());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
