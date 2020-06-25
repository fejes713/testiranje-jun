/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z2;

/**
 *
 * @author Mladen
 */
public class Delivery {
    
    public static enum TipDostave{Obicna, Brza, Hitna};
    
    public float deliverPackage(int masa, int udaljenost, boolean inostranstvo, TipDostave tip, int brojPredmeta){
       float cena = 500;
        
       if(tip == TipDostave.Obicna){
           cena +=100;
       }
       else if(tip == TipDostave.Brza){
           cena +=200;
       }
       else if(tip == TipDostave.Hitna){
           cena +=300;
       }
           
           if(masa > 50){
               cena *=2;
           }
           
           if(cena < 2000){
               if(!inostranstvo){
                   cena +=50;
                   cena += udaljenost * 10;
               }
               else{
                   cena +=200;
                   cena += udaljenost *20;
               }
           }
           else{
               if(!inostranstvo){
                   cena +=60;
                   cena += udaljenost * 15;
               }
               else{
                   cena +=210;
                   cena += udaljenost * 22;
               }
           }
           
       
        cena += brojPredmeta * 15;
        
        
        
        return cena;
    }
    
}
