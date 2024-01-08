/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5;

import Teclat.Teclat;

/**
 *
 * @author sofia
 */
public class vendesjava {
    public static void main(String[] args) {
        
//        Cal fer un programa en Python (vendesCognomNom.py) per a dur la gestió dels preus
//        dels articles d’una botiga, així com la quantitat venuda en total de cada article.
//        Per a això, caldrà tindre 3 vectors (i només eixos 3):
//            noms: guardarà els noms dels articles
//            preus: guardarà els preus dels articles (euros amb cèntims)
//            qVenudes: guardarà la quantitat venuda en total de cada article

        String noms [];
        
        float preus [];
        
        int qVenudes [];
        
        int opcio;
        String nomart;
        float preuart;
        do{
        
            opcio = Teclat.lligInt(" 1. Introduir un article nou \n 2. Fer una venda \n 3. Mostrar informació \n 4. Esborrar un article \n 5. Esborrrar tots els articles \n 6. Eixir");
            
            switch(opcio){
                case 1:
                    
                    nomart = Teclat.lligString("Dis-me el nom de l'article: ");
                    
                    preuart = Teclat.lligFloat("Dis-me preu de l'article: ");
            }
            
            
        }while(opcio!=6);
        
        System.out.println("---Has ixit del programa---");
    }
}