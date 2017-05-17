/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansmeus;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.Calendar;

/**
 *
 * @author pdavila
 */
public class ReceptorVetador implements VetoableChangeListener {
    
    int year = Calendar.getInstance().get(Calendar.YEAR);
    
    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        
        /**
         * Avisar sí el stock actual és inferior al mínim
         * Impedir que el stock actual sigui negatiu
         */
        if(evt.getPropertyName().equals("stock_actual") && (int)evt.getOldValue() > (int)evt.getNewValue()) { 
            System.out.println("ALERTA: El stock actual és inferior al mínim!!!");
            if((int)evt.getNewValue() < 0) {
                System.out.println("Impedim el canvi a la propietat " + evt.getPropertyName());
                System.out.println("Motiu: nou valor " + evt.getNewValue() + " incorrecte.");
                throw new PropertyVetoException("error", evt);
            } else {
                System.out.println("Canvi a la propietat " + evt.getPropertyName());
                System.out.println("Valor anterior: " + evt.getOldValue());
                System.out.println("Valor actual: " + evt.getNewValue()); 
            } 
        }
        
        /**
         * Impedir que el stock mínim sigui negatiu
         */
        if(evt.getPropertyName().equals("stock_minim")) { 
            if((int)evt.getNewValue() < 0) {
                System.out.println("Impedim el canvi a la propietat " + evt.getPropertyName());
                System.out.println("Motiu: nou valor " + evt.getNewValue() + " incorrecte.");
                throw new PropertyVetoException("error", evt);
            } else {
                System.out.println("Canvi a la propietat " + evt.getPropertyName());
                System.out.println("Valor anterior: " + evt.getOldValue());
                System.out.println("Valor actual: " + evt.getNewValue()); 
            } 
        }
        
        /**
         * Impedir que el PVP sigue igual o inferior a 0
         */
        if(evt.getPropertyName().equals("pvp")) { 
            if((float)evt.getNewValue() <= 0) {
                System.out.println("Impedim el canvi a la propietat " + evt.getPropertyName());
                System.out.println("Motiu: nou valor " + evt.getNewValue() + " incorrecte.");
                throw new PropertyVetoException("error", evt);
            } else {
                System.out.println("Canvi a la propietat " + evt.getPropertyName());
                System.out.println("Valor anterior: " + evt.getOldValue());
                System.out.println("Valor actual: " + evt.getNewValue()); 
            } 
        }
        
        /**
         * Avisar si l'any de fabricació és inferior a fa 5 anys o superior a l'actual.
         */
        if (evt.getPropertyName().equals("any_fabricacio")) {
            if ((int) evt.getNewValue() <= (year - 5)) {
                System.out.println("ALERTA: El any de fabricació es inferior a fa 5 anys!!! \n");
                System.out.println("Canvi a la propietat " + evt.getPropertyName());
                System.out.println("Valor anterior: " + evt.getOldValue());
                System.out.println("Valor actual: " + evt.getNewValue()); 
            }
            
            if ((int) evt.getNewValue() > year) {
                System.out.println("ALERTA: El any de fabricació es superior a l'acual!!! \n");
                System.out.println("Canvi a la propietat " + evt.getPropertyName());
                System.out.println("Valor anterior: " + evt.getOldValue());
                System.out.println("Valor actual: " + evt.getNewValue());
            }
        }
    }
}
