package Arrays_Questions;

import java.util.Scanner;

public class main {
    int p, r, t, si;
    int show(int p, int r, int t){
        si = (p*r*t)/100;
        return(si);
    }
    public static void main(String args[]){
        main obj = new main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount, Rate And Time: ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("Simple Interest : " +obj.show(p, r, t) );
    }
}
