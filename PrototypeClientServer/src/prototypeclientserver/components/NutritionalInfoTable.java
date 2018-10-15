/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeclientserver.components;

import javax.swing.table.TableModel;
import prototypeclientserver.MenuItem;

/**
 *
 * @author stephenfleming
 */
public class NutritionalInfoTable extends javax.swing.JPanel {
    private TableModel tableDataModel;

    /**
     * Creates new form NutritionalInfoTable
     */
    public NutritionalInfoTable(MenuItem food, MenuItem beverage, MenuItem combined) {
        initComponents();
        
        tableDataModel = outputTable.getModel();
        
        updateOutputTable(food, beverage, combined);
    }

    
    /**
     * Updates the Output Table panels table
     * Sets the food, beverage and combined rows
     * @param food MenuItem to add to food row
     * @param beverage MenuItem to add to beverage row
     * @param combined MenuItem to add to combined row
     */
    public void updateOutputTable(MenuItem food, MenuItem beverage, MenuItem combined)
    {
        //Update First Row - Food
        tableDataModel.setValueAt(food.getItemName(), 0, 0);
        tableDataModel.setValueAt(food.getEnergy(), 0, 1);
        tableDataModel.setValueAt(food.getProtein(), 0, 2);
        tableDataModel.setValueAt(food.getCarbs(), 0, 3);
        tableDataModel.setValueAt(food.getFat(), 0, 4);
        tableDataModel.setValueAt(food.getFibre(), 0, 5);
        tableDataModel.setValueAt(food.getPrice(), 0, 6);
        
        //Update Second Row - Beverage
        outputTable.setValueAt(beverage.getItemName(), 1, 0);
        outputTable.setValueAt(beverage.getEnergy(), 1, 1);
        outputTable.setValueAt(beverage.getProtein(), 1, 2);
        outputTable.setValueAt(beverage.getCarbs(), 1, 3);
        outputTable.setValueAt(beverage.getFat(), 1, 4);
        outputTable.setValueAt(beverage.getFibre(), 1, 5);
        outputTable.setValueAt(beverage.getPrice(), 1, 6);
        
        //Update Fourth Row - Total
        outputTable.setValueAt("Total Nutritional Value", 3, 0);
        outputTable.setValueAt(combined.getEnergy(), 3, 1);
        outputTable.setValueAt(combined.getProtein(), 3, 2);
        outputTable.setValueAt(combined.getCarbs(), 3, 3);
        outputTable.setValueAt(combined.getFat(), 3, 4);
        outputTable.setValueAt(combined.getFibre(), 3, 5);
        outputTable.setValueAt(combined.getPrice(), 3, 6);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        outputTable = new javax.swing.JTable();

        outputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Energy", "Protein", "Carbohydrate", "Total Fat", "Fibre", "Price"
            }
        ));
        outputTable.setEnabled(false);
        outputTable.setFocusable(false);
        jScrollPane2.setViewportView(outputTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable outputTable;
    // End of variables declaration//GEN-END:variables
}
