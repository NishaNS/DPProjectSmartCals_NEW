package edu.scu.dp.smartcals.admin;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JPanel;

import edu.scu.dp.smartcals.exception.DatabaseInitializationException;
import edu.scu.dp.smartcals.ui.RevenueTableView;
import edu.scu.dp.smartcals.vm.VMController;

/**
 * @author Nisha
 *
 */
public class RevenueTableController {

	private RevenueTableView revenueTableView;
	private RevenueTableModel revenueTableModel;
	private VMController vmController;

	public RevenueTableController(VMController vmController) {

		this.vmController = vmController;
		revenueTableModel = new RevenueTableModel();

	}

	public RevenueTableView getView() {
		return revenueTableView;
	}

	/**
	 * Get revenue table display option from view Model data to be populated is
	 * decided accordingly
	 * 
	 * @throws SQLException
	 */
	public void selectUserDisplayOption(String option) {
		if (option == "ALL")
			try {
				revenueTableModel.getAllSalesStats("admin");
				revenueTableModel.getColumnNames();
				revenueTableView = new RevenueTableView(
						revenueTableModel.createAndFetchModelData());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		else
			try {
				
				revenueTableModel.getVMSalesStats(Long.parseLong(option));
				revenueTableModel.getColumnNames();
				revenueTableView = new RevenueTableView(
						revenueTableModel.createAndFetchModelData());
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
