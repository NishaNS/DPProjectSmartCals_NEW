package edu.scu.dp.smartcals.ui;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.scu.dp.smartcals.exception.OutOfStockException;
import edu.scu.dp.smartcals.model.InventoryModel;
import edu.scu.dp.smartcals.model.SmartCardModelInterface;
import edu.scu.dp.smartcals.payment.ConcretePaymentCreator;
import edu.scu.dp.smartcals.payment.PaymentCreator;
import edu.scu.dp.smartcals.payment.PaymentProduct;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sharadha Ramaswamy
 */
public class ProductPaymentPanel extends javax.swing.JPanel {

	private VendingMachineView parentView;
    /**
     * Creates new form NewJPanel
     */
    public ProductPaymentPanel(VendingMachineView parentView) {
    	this.parentView = parentView;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblAmtPayable = new javax.swing.JLabel();
        txtAmtPayable = new javax.swing.JTextField();
        pnlCashProd = new javax.swing.JPanel();
        lblOneDollarCash = new javax.swing.JLabel();
        lblFiveDollar = new javax.swing.JLabel();
        lblTenDollar = new javax.swing.JLabel();
        txtOneDollarCash = new javax.swing.JTextField();
        txtFiveDollar = new javax.swing.JTextField();
        txtTenDollar = new javax.swing.JTextField();
        btnCash = new javax.swing.JButton();
        pnlCoinProd = new javax.swing.JPanel();
        lblQuarters = new javax.swing.JLabel();
        lblHalfDollar = new javax.swing.JLabel();
        lblOneDollar = new javax.swing.JLabel();
        txtQuarters = new javax.swing.JTextField();
        txtHalfDollar = new javax.swing.JTextField();
        txtOneDollar = new javax.swing.JTextField();
        btnCoin = new javax.swing.JButton();
        pnlSmartCardProd = new javax.swing.JPanel();
        lblSmartCard = new javax.swing.JLabel();
        txtSmartCard = new javax.swing.JTextField();
        btnSmartCard = new javax.swing.JButton();
        lblPayUnsuccess = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        lblAmtPayable.setText("Amount Payable:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        add(lblAmtPayable, gridBagConstraints);

        txtAmtPayable.setColumns(10);
      
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        //gridBagConstraints.gridwidth = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        add(txtAmtPayable, gridBagConstraints);

        pnlCashProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCashProd.setLayout(new java.awt.GridBagLayout());

        lblOneDollarCash.setText("one dollar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(lblOneDollarCash, gridBagConstraints);

        lblFiveDollar.setText("five dollar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(lblFiveDollar, gridBagConstraints);

        lblTenDollar.setText("ten dollar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(lblTenDollar, gridBagConstraints);

        txtOneDollarCash.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(txtOneDollarCash, gridBagConstraints);

        txtFiveDollar.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(txtFiveDollar, gridBagConstraints);

        txtTenDollar.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(txtTenDollar, gridBagConstraints);

        btnCash.setText("cash");
        btnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCashProd.add(btnCash, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        add(pnlCashProd, gridBagConstraints);

        pnlCoinProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCoinProd.setLayout(new java.awt.GridBagLayout());

        lblQuarters.setText("quarters:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(lblQuarters, gridBagConstraints);

        lblHalfDollar.setText("half dollar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(lblHalfDollar, gridBagConstraints);

        lblOneDollar.setText("one dollar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(lblOneDollar, gridBagConstraints);

        txtQuarters.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(txtQuarters, gridBagConstraints);

        txtHalfDollar.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(txtHalfDollar, gridBagConstraints);

        txtOneDollar.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(txtOneDollar, gridBagConstraints);

        btnCoin.setText("coin");
        btnCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlCoinProd.add(btnCoin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        add(pnlCoinProd, gridBagConstraints);

        pnlSmartCardProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSmartCardProd.setPreferredSize(new java.awt.Dimension(609, 600));
        pnlSmartCardProd.setLayout(new java.awt.GridBagLayout());

        lblSmartCard.setText("Smart Card Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlSmartCardProd.add(lblSmartCard, gridBagConstraints);

        txtSmartCard.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlSmartCardProd.add(txtSmartCard, gridBagConstraints);

        btnSmartCard.setText("Smart Card");
        btnSmartCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmartCardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlSmartCardProd.add(btnSmartCard, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        add(pnlSmartCardProd, gridBagConstraints);

        lblPayUnsuccess.setText("You can pay by cash or coin or smart card");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        add(lblPayUnsuccess, gridBagConstraints);
        
        //lblPayUnsuccess.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoinActionPerformed
    	double quarters;
    	double halfDollar;
    	double oneDollar;
    	double amtPayable;
    	double amtPaying;
    	
    	parentView.getVMDetails_View().getLblDisplay().setText("SmartCals Vending Machine");
    	parentView.getVMDetails_View().getLblCoinDispense().setText("Dispense Coin:");
    	PaymentCreator pc = new ConcretePaymentCreator();
    	PaymentProduct p = null;
    	if((txtQuarters.getText().isEmpty()) || (txtHalfDollar.getText().isEmpty()) || (txtOneDollar.getText().isEmpty()))
    	{
    		p = pc.makePayment("NullCoin",0);
    	}
    	else{
    		amtPayable = Double.parseDouble(txtAmtPayable.getText());
    		quarters = Double.parseDouble(txtQuarters.getText());
			halfDollar = Double.parseDouble(txtHalfDollar.getText());
			oneDollar = Double.parseDouble(txtOneDollar.getText());
			amtPaying = quarters * 25 + halfDollar * 50 + oneDollar * 100;
			amtPaying = amtPaying/100;
    		p = pc.makePayment("Coin",0);
			p.setValues(amtPayable,amtPaying);
    	}
    	if(p.getPaymentStatus()){
    		try {
				parentView.getVMController().updateInvQty();
			} catch (OutOfStockException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		parentView.getVMController().updateOrder("Coin",0);
    		this.setVisible(false);
    		parentView.getVMDetails_View().getLblDisplay().setText("Payment Successful");
    	    parentView.getVMDetails_View().getLblCoinDispense().setText("Dispense Coin:" + Double.toString(p.getAmtToReturn()));
    	    parentView.getVMDetails_View().setItemDispenserLabel();
    	}
    	else{
    		lblPayUnsuccess.setText("Not Enough Cash");
    	}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCoinActionPerformed

    private void btnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashActionPerformed
    	double amtPayable;
    	double tenDollar;
    	double fiveDollar;
    	double oneDollar;
    	double amtPaying;
    	
    	parentView.getVMDetails_View().getLblDisplay().setText("SmartCals Vending Machine");
    	parentView.getVMDetails_View().getLblCashDispense().setText("Dispense Cash:");
    	PaymentCreator pc = new ConcretePaymentCreator();
    	PaymentProduct p = null;
    	
    	if((txtAmtPayable.getText().isEmpty()) || (txtOneDollarCash.getText().isEmpty()) || (txtFiveDollar.getText().isEmpty()) || (txtTenDollar.getText().isEmpty()))
    	{
    		p = pc.makePayment("NullCash",0);
    	}
    	else{
    		amtPayable = Double.parseDouble(txtAmtPayable.getText());
    		oneDollar = Double.parseDouble(txtOneDollarCash.getText());
			fiveDollar = Double.parseDouble(txtFiveDollar.getText());
			tenDollar = Double.parseDouble(txtTenDollar.getText());
			amtPaying= oneDollar * 1 + fiveDollar * 5 + tenDollar * 10;	
			p = pc.makePayment("Cash",0);
			p.setValues(amtPayable,amtPaying);
    	}
    	if(p.getPaymentStatus()){
    		try {
				parentView.getVMController().updateInvQty();
			} catch (OutOfStockException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		parentView.getVMController().updateOrder("Cash",0);
    		this.setVisible(false);
    		parentView.getVMDetails_View().getLblDisplay().setText("Payment Successful");
    		parentView.getVMDetails_View().getLblCashDispense().setText("Dispense Cash:" + Double.toString(p.getAmtToReturn()));
    	    parentView.getVMDetails_View().setItemDispenserLabel();
    	}
    	else{
    		lblPayUnsuccess.setText("Not Enough Cash");
    	}
    }//GEN-LAST:event_btnCashActionPerformed

    private void btnSmartCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmartCardActionPerformed
        PaymentCreator pc = new ConcretePaymentCreator();
    	PaymentProduct p = null;
    	SmartCardModelInterface smct = null;
    	double amtPayable;
    	
    	parentView.getVMDetails_View().getLblDisplay().setText("SmartCals Vending Machine");
    	parentView.getVMDetails_View().getLblCardDispense().setText("Card:");
    	
    	amtPayable = Double.parseDouble(txtAmtPayable.getText());
    	if(txtSmartCard.getText().isEmpty())
    		p = pc.makePayment("NullSmartCard",0);
    	else{
    		try {
				smct = parentView.getVMController().checkCardValidation(txtSmartCard.getText());
				p = pc.makePayment("SmartCard",smct.getSmartCard());
				p.setValues(amtPayable,smct.getBalance());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	if(p.getPaymentStatus())
    	{
    		smct = parentView.getVMController().updateSmartCardBalance(smct.getSmartCard(),smct.getBalance() - amtPayable);
    		try {
				parentView.getVMController().updateInvQty();
			} catch (OutOfStockException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		parentView.getVMController().updateOrder("SmartCard",smct.getSmartCard());
    		this.setVisible(false);
    		parentView.getVMDetails_View().getLblDisplay().setText("Payment Successful");
    		parentView.getVMDetails_View().getLblCardDispense().setText("Card Balance:" + smct.getBalance());
    	    parentView.getVMDetails_View().setItemDispenserLabel();
    	}
    	else{
    		lblPayUnsuccess.setText("Not Enough Cash");
    	}
    	
    }//GEN-LAST:event_btnSmartCardActionPerformed

 
    public void setAmtPayable(InventoryModel invProduct){
    	txtAmtPayable.setText(Double.toString(invProduct.getProductPrice()));
    	txtAmtPayable.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnCoin;
    private javax.swing.JButton btnSmartCard;
    private javax.swing.JLabel lblAmtPayable;
    private javax.swing.JLabel lblFiveDollar;
    private javax.swing.JLabel lblHalfDollar;
    private javax.swing.JLabel lblOneDollar;
    private javax.swing.JLabel lblOneDollarCash;
    private javax.swing.JLabel lblPayUnsuccess;
    private javax.swing.JLabel lblQuarters;
    private javax.swing.JLabel lblSmartCard;
    private javax.swing.JLabel lblTenDollar;
    private javax.swing.JPanel pnlCashProd;
    private javax.swing.JPanel pnlCoinProd;
    private javax.swing.JPanel pnlSmartCardProd;
    private javax.swing.JTextField txtAmtPayable;
    private javax.swing.JTextField txtFiveDollar;
    private javax.swing.JTextField txtHalfDollar;
    private javax.swing.JTextField txtOneDollar;
    private javax.swing.JTextField txtOneDollarCash;
    private javax.swing.JTextField txtQuarters;
    private javax.swing.JTextField txtSmartCard;
    private javax.swing.JTextField txtTenDollar;
    // End of variables declaration//GEN-END:variables
}
