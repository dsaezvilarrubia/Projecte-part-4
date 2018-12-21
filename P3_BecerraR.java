/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_becerrar;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class P3_BecerraR {
    /**
     * @param args the command line arguments
     */
    //Variables onstants
    public static final int ID_MINIM=1;
    public static final int ID_MAXIM=2000;
    public static final int ANY_MINIM=1900;
    public static final int ANY_MAXIM=2100;
    public static final int MES_MINIM=1;
    public static final int MES_MAXIM=12;
    public static final int GEN_NOIA=1;
    public static final int GEN_NOI=2;
    public static final int CAT_MINIM=1;
    public static final int CAT_MAXIM=4;
    public static final int CLUB_MINIM=0;
    public static final int CLUB_MAXIM=5;
    public static final String NOIA="noia";
    public static final String NOI="noi";
    public static final String ALEVI="Aleví";
    public static final String INFANTIL="Infantil";
    public static final String JUNIOR="Junior";
    public static final String SENIOR="Senior";
    public static final String NO_FED="No federat";
    public static final String BCN="Barcelona";
    public static final String TGNA="Tarragona";
    public static final String HOSP="Hospitalet";
    public static final String GIR="Girona";
    public static final int MAX_INTENTS=3;
    public static void main(String[] args) {
        // Variables
        int id=0,anyNaix=0,mesNaix=0,genere=0,categoria=0,club=0;
        int i=0,participant=0,contador=0, ordenar=0;
        int [] [] participants = new int [10][6];
        int altre = 0;
        int noFed = 0;
        int bcn = 0;
        int tgna = 0;
        int hosp = 0;
        int gir = 0;
        int[] ids=new int[10];
        int[] anyNaixs=new int[10];
        int[] mesNaixs=new int[10];
        int[] generes=new int[10];
        int[] categories=new int[10];
        int[] clubs=new int [10];
        int contadorColum = 0;
        String poblacio="", sexe="", cat="", equip="";
        boolean controlError=false, correcte=false;
        Scanner lector=new Scanner(System.in);
        
        do{
            do{
            //Reiniciem contador de columnes
            contadorColum=0;
            // Demanem dades
                System.out.println("Introdueix el teu id:");
                //Control d'errors
                controlError=lector.hasNextInt();
                    if(controlError){// si tot va bé
                        id=lector.nextInt();//guardem dades
                        if(id>=ID_MINIM && id<=ID_MAXIM ){
                            //controlError=lector.hasNextInt();
                            correcte=true;
                            participants[contador][contadorColum]=id;
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                        lector.nextLine();
                    }
                    i++;
                    //System.out.println("Has introduit 3 cops la dada incorrecta");
            }while((!correcte)&&(i<MAX_INTENTS));
            if(correcte){
                i=0; //Per a inicialitzar el comptador a 0
                correcte=false;
                do{
                    System.out.println("Introdueix l'any de naixement:");
                    controlError=lector.hasNextInt();
                    if(controlError){
                        anyNaix=lector.nextInt();
                        if(anyNaix>=ANY_MINIM && anyNaix<=ANY_MAXIM){
                            contadorColum +=1;
                            correcte=true;
                            participants[contador][contadorColum]=anyNaix;
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                          lector.nextLine();
                    }
                    i++;
                }while((!correcte)&&(i<MAX_INTENTS));
            }
            if(correcte){
                i=0; //Per a inicialitzar el comptador a 0
                correcte=false;
                do{
                    System.out.println("Introdueix el mes de naixement:");
                    controlError=lector.hasNextInt();
                    if(controlError){
                        mesNaix=lector.nextInt();
                        if(mesNaix>=MES_MINIM && mesNaix<=MES_MAXIM){
                            contadorColum+=1;
                            correcte=true;
                            participants[contador][contadorColum]=mesNaix;
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                          lector.nextLine();
                    }
                    i++;
                }while((!correcte)&&(i<MAX_INTENTS));
            }
            if(correcte){
                i=0; //Per a inicialitzar el comptador a 0
                correcte=false;
                do{
                    System.out.println("Introdueix el gènere, si és noia (1) o noi (2):");
                    controlError=lector.hasNextInt();
                    if(controlError){
                        genere=lector.nextInt();
                        if(genere>=GEN_NOIA && genere<=GEN_NOI){
                            contadorColum+=1;
                            correcte=true;
                            participants[contador][contadorColum]=genere;
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                          lector.nextLine();
                    }
                    i++;
                }while((!correcte)&&(i<MAX_INTENTS));
            }
            if(correcte){
                i=0; //Per a inicialitzar el comptador a 0
                correcte=false;
                do{
                    System.out.println("Introdueix la categoria, si és alevi(1) infantil(2) junior(3) senior(4):");
                    controlError=lector.hasNextInt();
                    if(controlError){
                        categoria=lector.nextInt();
                        if(categoria>=CAT_MINIM && categoria<=CAT_MAXIM){
                            contadorColum+=1;
                            correcte=true;
                            participants[contador][contadorColum]=categoria;
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                          lector.nextLine();
                    }
                    i++;
                }while((!correcte)&&(i<MAX_INTENTS));
            }
            if(correcte){
                i=0; //Per a inicialitzar el comptador a 0
                correcte=false;
                do{
                    System.out.println("Introdueix el club, si és no federat(0) Barcelona(1) Tarragona(2) Hospitalet (3) Girona(4) Altre(5):");
                    controlError=lector.hasNextInt();
                    if(controlError){
                        club=lector.nextInt();
                        lector.nextLine();
                        if(club>=CLUB_MINIM && club<=CLUB_MAXIM){
                            contadorColum+=1;
                            correcte=true;
                            participants[contador][contadorColum]=club;
                            
                            if(club==5){
                                System.out.println("Introdueix la població?:");
                                poblacio=lector.nextLine();
                            }
                        }else{
                            System.out.println("La dada introduïda està fora dels límits");
                        }
                    }else{
                          lector.nextLine();
                    }
                    i++;
                }while((!correcte)&&(i<MAX_INTENTS));
            }
            if(correcte){
                contador=contador+1;
            }
            do{
                System.out.println("Vols introduir un altre participant?: No(0) Si(1)");
                controlError=lector.hasNextInt();
                if(controlError){// si tot va bé
                    participant=lector.nextInt();
                }else{
                    lector.nextLine();
                }
            }while(participant<0 || participant>1);
        }while(participant==1);
        System.out.println("S'han introduït "+contador+" participants.");
        
        for(int j=0; j<contador; j++){
            switch(participants[j][3]){ // Estructura per mostrar els valors de les variables constants
                case 1:
                    sexe=NOIA;
                    break;
                case 2:
                    sexe=NOI;
                    break;
            }
            switch (participants[j][4]){
                case 1:
                    cat=ALEVI;
                    break;
                case 2:
                    cat=INFANTIL;
                    break;
                case 3:
                    cat=JUNIOR;
                    break;
                case 4:
                    cat=SENIOR;
                    break;                   
            }
            switch (participants[j][5]){
                case 0:
                    equip=NO_FED;
                    noFed +=1;
                    break;
                case 1:
                    equip=BCN;
                    bcn +=1;
                    break;
                case 2:
                    equip=TGNA;
                    tgna += 1;
                    break;
                case 3:
                    equip=HOSP;
                    hosp += 1;
                    break;
                case 4:
                    gir += 1;
                    equip=GIR;
                    break;  
                case 5:
                    altre += 1;
                    equip=poblacio;
                    break;
            } // Mostrar les dades de l'usuari
            if(participants[j][2]>=1 && participants[j][2]<=9){
                System.out.println("id\tdata naixement\tgènere\tcategoria\tclub");
                System.out.println(participants[j][0]+"\t0"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
            }else{
                System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                System.out.println(participants[j][0]+"\t"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
            }
        }
        System.out.println("Vols les dades dels participants endreçats per any de naixement? No(0) Si(1)");
        correcte=lector.hasNextInt();
        if(correcte){//ok
            ordenar=lector.nextInt();
            if(ordenar>=0 && ordenar<=1){
                if(ordenar==1){
                    for (int k = 0; k < contador - 1; k++) {
                        for(int l = k + 1; l < contador; l++) {
                            if (participants[k][1] > participants[l][1]) {
                                //ids
                                int canvi = participants[k][0];
                                participants[k][0] = participants[l][0];
                                participants[l][0] = canvi;
                                //mes
                                canvi = participants[k][2];
                                participants[k][2] = participants[l][2];
                                participants[l][2] = canvi;
                                //any
                                canvi = participants[k][1];
                                participants[k][1] = participants[l][1];
                                participants[l][1] = canvi;
                                //genere
                                canvi = participants[k][3];
                                participants[k][3] = participants[l][3];
                                participants[l][3] = canvi;
                                //categoria
                                canvi = participants[k][4];
                                participants[k][4] = participants[l][4];
                                participants[l][4] = canvi;
                                //club
                                canvi = participants[k][5];
                                participants[k][5] = participants[l][5];
                                participants[l][5] = canvi;
                            }
                        }
                    }
                    for(int j=0; j<contador; j++){
                        switch(participants[j][3]){ // Estructura per mostrar els valors de les variables constants
                            case 1:
                                sexe=NOIA;
                                break;
                            case 2:
                                sexe=NOI;
                                break;
                        }
                        switch (participants[j][4]){
                            case 1:
                                cat=ALEVI;
                                break;
                            case 2:
                                cat=INFANTIL;
                                break;
                            case 3:
                                cat=JUNIOR;
                                break;
                            case 4:
                                cat=SENIOR;
                                break;                   
                        }
                        switch (participants[j][5]){
                            case 0:
                                equip=NO_FED;
                                break;
                            case 1:
                                equip=BCN;
                                break;
                            case 2:
                                equip=TGNA;
                                break;
                            case 3:
                                equip=HOSP;
                                break;
                            case 4:
                                equip=GIR;
                                break;                   
                        } // Mostrar les dades de l'usuari
                        if(participants[j][2]>=1 && participants[j][2]<=9){
                            System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                            System.out.println(participants[j][0]+"\t0"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
                        }else{
                            System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                            System.out.println(participants[j][0]+"\t"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
                        }
                    }
                }
            System.out.println("Vols un llistat ordenat dels no federants o club en particular? No(0) Si(1)");
            correcte=lector.hasNextInt();
                if(correcte){//ok
                    ordenar=lector.nextInt();
                    if(ordenar==1){  
                        System.out.println("Vols un llistat ordenat dels no federats o club? federats(0) club(1)");
                        correcte=lector.hasNextInt();
                        if(correcte){//ok
                            ordenar=lector.nextInt();
                            if(ordenar==0){ //escull no federats
                                for(int j=0; j<contador; j++){
                                    switch(participants[j][3]){ // Estructura per mostrar els valors de les variables constants
                                        case 1:
                                            sexe=NOIA;
                                            break;
                                        case 2:
                                            sexe=NOI;
                                            break;
                                    }
                                    switch (participants[j][4]){
                                        case 1:
                                            cat=ALEVI;
                                            break;
                                        case 2:
                                            cat=INFANTIL;
                                            break;
                                        case 3:
                                            cat=JUNIOR;
                                            break;
                                        case 4:
                                            cat=SENIOR;
                                            break;                   
                                    }
                                    switch (participants[j][5]){
                                        case 0:
                                            equip=NO_FED;
                                            break;
                                        case 1:
                                            equip=BCN;
                                            break;
                                        case 2:
                                            equip=TGNA;
                                            break;
                                        case 3:
                                            equip=HOSP;
                                            break;
                                        case 4:
                                            equip=GIR;
                                            break;                   
                                    } // Mostrar les dades de l'usuari
                                    if(participants[j][5]==0){
                                        if(participants[j][2]>=1 && participants[j][2]<=9){
                                            System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                                            System.out.println(participants[j][0]+"\t0"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t\t"+equip+"\t\n");
                                        }else{
                                            System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                                            System.out.println(participants[j][0]+"\t"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
                                        }
                                    }
                                }
                            }else{ //escull club
                                for (int k = 0; k < contador - 1; k++) {
                                    for(int l = k + 1; l < contador; l++) {
                                        if (participants[k][5] > participants[l][5]) {
                                            //ids
                                            int canvi = participants[k][0];
                                            participants[k][0] = participants[l][0];
                                            participants[l][0] = canvi;
                                            //mes
                                            canvi = participants[k][2];
                                            participants[k][2] = participants[l][2];
                                            participants[l][2] = canvi;
                                            //any
                                            canvi = participants[k][1];
                                            participants[k][1] = participants[l][1];
                                            participants[l][1] = canvi;
                                            //genere
                                            canvi = participants[k][3];
                                            participants[k][3] = participants[l][3];
                                            participants[l][3] = canvi;
                                            //categoria
                                            canvi = participants[k][4];
                                            participants[k][4] = participants[l][4];
                                            participants[l][4] = canvi;
                                            //club
                                            canvi = participants[k][5];
                                            participants[k][5] = participants[l][5];
                                            participants[l][5] = canvi;
                                        }
                                    }
                                }

                                for(int j=0; j<contador; j++){
                                    switch(participants[j][3]){ // Estructura per mostrar els valors de les variables constants
                                        case 1:
                                            sexe=NOIA;
                                            break;
                                        case 2:
                                            sexe=NOI;
                                            break;
                                    }
                                    switch (participants[j][4]){
                                        case 1:
                                            cat=ALEVI;
                                            break;
                                        case 2:
                                            cat=INFANTIL;
                                            break;
                                        case 3:
                                            cat=JUNIOR;
                                            break;
                                        case 4:
                                            cat=SENIOR;
                                            break;                   
                                    }
                                    switch (participants[j][5]){
                                        case 0:
                                            equip=NO_FED;
                                            break;
                                        case 1:
                                            equip=BCN;
                                            break;
                                        case 2:
                                            equip=TGNA;
                                            break;
                                        case 3:
                                            equip=HOSP;
                                            break;
                                        case 4:
                                            equip=GIR;
                                            break;                   
                                    } // Mostrar les dades de l'usuari
                                    if(participants[j][5]!=0){
                                        System.out.println("id\tdata naixement\tgènere\tcategoria\tclub\t");
                                        System.out.println(participants[j][0]+"\t"+participants[j][2]+"/"+participants[j][1]+"\t\t"+sexe+"\t"+cat+"\t"+equip+"\t\n");
                                    }
                                }
                            }
                        }else{
                              lector.nextLine();
                        }
                    }   
                }else{
                      lector.nextLine();
                }
            }else{
                lector.nextLine();
                System.out.println("La dada introduïda està fora dels límits");
            }
        }
        System.out.println("Vols mostrar un llistat del numero de participants per club? (0) No (1) Si");
        correcte = lector.hasNextInt();
        if(correcte){
            ordenar = lector.nextInt();
            if(ordenar == 1){
                System.out.println("Numero de participants no federats: " + noFed);
                System.out.println("Numero de participants del Barcelona: " + bcn);
                System.out.println("Numero de participants del Tarragona: " + tgna );
                System.out.println("Numero de participants del Hospitalet: " + hosp);
                System.out.println("Numero de participants del Girona: " + gir);
                System.out.println("Numero de participants de altres clubs: " + altre);
            }
            if(ordenar == 0){
                System.out.println("Gracies per fer servir aquest programa :)!");
            }
        }else{
            lector.nextLine();
        }
    } 
}
