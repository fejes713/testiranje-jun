/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z1;

/**
 *
 * @author Mladen
 */
public class Banka {
    
    
    public int klasifikuj(int uzrast, boolean zaposlen, boolean brak, boolean istorija){
        int kategorija = -1;
        
        if(uzrast >20 && uzrast <=40){
            if(zaposlen && brak){
                kategorija =0;
            }
            
            else if(!zaposlen && brak || zaposlen && !brak){
                kategorija = 1;
            }
            else if(!(zaposlen && brak)){
                kategorija = 2;
            }        
            
        }
        
        if(uzrast < 20){
            kategorija = 4;
        }
        if(istorija){
            kategorija +=1;
        }
        if(uzrast >= 40){
            kategorija +=1;
        }
        
        
        
        return kategorija;
    }
    
}
