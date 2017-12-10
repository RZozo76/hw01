package hu.helixlab;

public class Main {

    public static void main(String[] args) {
	// write your code here
               /*Deklaráltam két int típusú változót.
         Majd ezzel az értékkel inicializáltam a terület és kerület eredményét adó area és perimeter változót és az eredmény kiírattam a konzolra.*/
        int aSide = 4;
        int bSide = 3;

        int area = aSide * bSide;
        int perimeter = 2 * (aSide + bSide);

        System.out.println("A téglalap területe: " + area + " cm^2");
        System.out.println("A téglalap kerülete: " + perimeter + " cm");
    }
}

