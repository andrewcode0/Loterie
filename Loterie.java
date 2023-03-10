import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.*;


public class Loterie{
    public static void main(String[] args){
        int Punctaj = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] sirJucator = new int[6];
        int[] sirCastigator = new int[6];
        int[] sirRezultat = new int[6];
        System.out.println("LOTO!:Introduceti numerele(intre 0-50): ");
        for(int i = 0; i < sirJucator.length; i++){
            sirJucator[i] = sc.nextInt();
        }
        for(int i = 0; i < sirCastigator.length; i++){
            sirCastigator[i] = rand.nextInt(51);
        }
        for(int i = 0; i <sirRezultat.length; i++){
            sirRezultat[i] = Math.abs(sirJucator[i] - sirCastigator[i]);
            if(sirRezultat[i] == 0) {
                Punctaj+= 100;
            } else if(sirRezultat[i] == 1) {
                Punctaj+= 50;
            } else if(sirRezultat[i] == 2 || sirRezultat[i] == 3 || sirRezultat[i] == 4){
                Punctaj+= 25;
            }
        }
        System.out.println("Numerele dumneavoastra sunt: " + Arrays.toString(sirJucator));  // Sirul introdus
        System.out.println("Numerele extrase sunt: " + Arrays.toString(sirCastigator)); // Sirul calculat
        System.out.println("Ati obtinut : " + Punctaj + " puncte."); // Punctajul obtinut

        // System.out.println(Arrays.toString(sirRezultat)); Sirul care este analizat

    }
}