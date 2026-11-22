package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    static void SOP(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        int scelta_interna;
          SOP("============MENU'==============");
            SOP("1 = variabili");
        do {
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    SOP("ESERCIZI VARIABILI");
                    scelta_interna=in.nextInt();
                    switch (scelta_interna){
                        case 1:
                            SOP("primo es slide 11 presentazione 18/9/2026");
                            SOP("\n"+"\n"+"programma che stampi 3 variabili");
                            int n1=1;
                            float n2= 88.6f;
                            boolean n3=true;
                            SOP("il primo numero e': "+ n1);
                            SOP("il secondo numero e': "+n2);
                    }
            }
        } while (scelta != 0);

    }
}
