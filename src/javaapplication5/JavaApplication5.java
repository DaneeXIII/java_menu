/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class JavaApplication5 {

    /**
    1. Hozz létre egy tömböt: szamok néven!
    2. A tömb elemszáma 20 legyen.
    3. Az elemek a -50 és +50 értéktartományba essenek.
    4. Írasd ki a tömb elemeit egy sorban.
    5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
     1 - összeget számoltatni: tömbök összegét kiíratni
     2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
     3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
     4 - 5-tel osztható páros számok db-száma: mennyi?
     5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        
        int szamok[] = new int [20];
        for(int i =0;i<20;i++){
            szamok[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<20;i++){
            System.out.print(szamok[i]+" ");
        }
        System.out.println("Válassza ki a műveletet: ");
        System.out.println("1 - Összeget számoltatni: Tömbök összegét kiíratni");
        System.out.println("2 - Szélsőértékeket kiíratni: Legkisebb és legnagyobb értéket kiíratni");
        System.out.println("3 - Van-e benne 40-50: Megtudni, tartalmaz-e számot 40 és 50 között");
        System.out.println("4 - 5-tel osztható páros számok darabszáma: Mennyi?");
        System.out.println("5 - Adott számot tartalmazza-e");
        
        int var = sc.nextInt();
        switch (var)
            {
                case 1:
                    int sum=0;
                    for(int i =0;i<20;i++){
                        sum += szamok[i];
                    }
                    System.out.println(sum);
                    break;
                    
                case 2:
                    int max =0;
                    int min = 51;
                    for(int i =0;i<20;i++){
                        if (min>szamok[i]){
                            min = szamok[i];
                        }
                        else{
                            max = szamok[i];
                        }
                                     
                    }
                    System.out.println("a maximum: "+max+" a minimum: "+min);
                    break;
                    
                case 3:
                    int vane = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]>=40){
                            vane = 1;
                            break;
                        }
                    }
                    if(vane==1){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    }
                    break;
                    
                case 4:
                    int db = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]%5==0){
                            db++;
                        }
                    }
                    if(db!=0){
                        System.out.println("Tartalmaz 5 tel oszthatót, ennyi db-ot: "+db);
                    }
                    else{
                        System.out.println("Nem tartalmaz 5 tel osztható számot");
                    }
                    break;
                    
                case 5:
                    System.out.println("Add meg a számot amire kiváncsi vagy: ");
                    int szam = sc.nextInt();
                    int tart = 0;
                    for(int i =0;i<20;i++){
                        if(szam==szamok[i]){
                            tart++;
                            break;
                        }
                    }
                    if(tart!=0){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    }
                    break;
      }
   } 
} 