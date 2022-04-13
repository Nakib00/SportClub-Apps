/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Subrata Kumar Dey
 */
public interface Taxable {
    float maxTaxRateForPersonalIncomeTax = 30.0f;
    //public abstract float calculateAndGetTaxPayable();
    public float calculateAndGetTaxPayable();
    
}
