package br.inatel.dm110.hello.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.hello.dao.ProductDAO;
import br.inatel.dm110.hello.entities.Product;
import br.inatel.dm110.hello.interfaces.InventoryLocal;
import br.inatel.dm110.hello.interfaces.InventoryRemote;

@Stateless
@Remote(InventoryRemote.class)
@Local(InventoryLocal.class)
public class InventoryBean implements InventoryRemote, InventoryLocal {

	@EJB
	private ProductDAO productDAO;

	@Override
	public List<String> listProductNames() {
		return productDAO.listAll().stream().map(Product::getName).collect(Collectors.toList());
	}

}
