/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansmeus;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pdavila
 */
public class PrimerBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private String num_serie;
    private String denominacio;
    private String fabricant;
    private int stock_actual;
    private int stock_minim;
    private float preu_cost;
    private float pvp;
    private int any_fabricacio;
    private String[] caracteristiques_tecniques;
    private String Categoria;
    private String ubicacio;
    private Date data_alta;
    
    private PropertyChangeSupport propertySupport;
    
    public PrimerBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getDenominacio() {
        return denominacio;
    }

    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }

    public int getStock_minim() {
        return stock_minim;
    }

    public void setStock_minim(int stock_minim) {
        this.stock_minim = stock_minim;
    }

    public float getPreu_cost() {
        return preu_cost;
    }

    public void setPreu_cost(float preu_cost) {
        this.preu_cost = preu_cost;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public int getAny_fabricacio() {
        return any_fabricacio;
    }

    public void setAny_fabricacio(int any_fabricacio) {
        this.any_fabricacio = any_fabricacio;
    }

    public String[] getCaracteristiques_tecniques() {
        return caracteristiques_tecniques;
    }

    public void setCaracteristiques_tecniques(String[] caracteristiques_tecniques) {
        this.caracteristiques_tecniques = caracteristiques_tecniques;
    }
    
    public String getCaracteristiques_tecniques(int index) {
        return caracteristiques_tecniques[index];
    }
    
    public void setCaracteristiques_tecniques(int index, String valor) {
        this.caracteristiques_tecniques[index] = valor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public Date getData_alta() {
        return data_alta;
    }

    public void setData_alta(Date data_alta) {
        this.data_alta = data_alta;
    }
    
     public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
