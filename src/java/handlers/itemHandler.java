/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

/**
 *
 * @author burn6
 */
public class itemHandler {
    
    private float quantcafe, quantsugar , quantwater;
    public itemHandler(){
        quantcafe=0;
        quantsugar=0;
        quantwater=0;
    }

    /**
     * @return prices
     */
    public float getCafe() {
        return quantcafe;
    }
    public float getSugar() {
        return quantsugar;
    }
    public float getWater(){
        return quantwater;
    }

    /**
     * @param quancafe quansugar quanwater 
     */
    public void setCafe(float quancafe) {
        
        quantcafe = quancafe;
    }
    public void setSugar(float quansugar) {
      
        quantsugar=quansugar;
      
    }
    public void setWater(float quanwater) {
       
        quantwater = quanwater;
       
    }

    
}
