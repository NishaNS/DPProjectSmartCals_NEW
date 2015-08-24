
/**
 * 
 */
package edu.scu.dp.smartcals.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.scu.dp.smartcals.exception.AdminOperationsException;
import edu.scu.dp.smartcals.model.NutritionalInfoModel;
import edu.scu.dp.smartcals.model.ProductModel;
import edu.scu.dp.smartcals.vm.Product;
import edu.scu.dp.smartcals.vm.VendingMachine;

/**
 * @author Aparna Ganesh
 * Interface to define Admin operations
 */
public interface AdminOperations {

	public void reStockProduct(long vmId,long productId,int quantity);
	
	/**
	 * code change-Aparna 08/23
	 * Add new product -By Admin
	 * @param product
	 * @throws SQLException 
	 */
	public void addNewProduct(Product product) throws SQLException;
	
	//code change-Aparna 08/23
	
	public void deleteProduct(long productId) throws AdminOperationsException;
	
	public List<Product> getBestSellingProduct(long vmId) throws AdminOperationsException;
	
	//nisha - 8/24
	public NutritionalInfoModel searchNutriInfo(long productId) throws SQLException;
	
	public boolean addNewNutriInfo(ArrayList<String> dataValues) throws SQLException;
}


