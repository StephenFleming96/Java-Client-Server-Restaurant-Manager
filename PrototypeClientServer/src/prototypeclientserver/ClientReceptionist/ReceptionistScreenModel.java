/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeclientserver.ClientReceptionist;

import prototypeclientserver.Order;

/**
 * The model for the Receptionist screen contains a list of orders that have been served.
 */
public class ReceptionistScreenModel {
    public ReceptionistScreenModel() {
        
    }
    
    public void billOrder(Order o) {
        o.setBilled(true);
        //sql here
    }
}
