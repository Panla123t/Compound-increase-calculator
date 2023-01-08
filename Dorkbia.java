import java.util.Scanner;
import java.lang.Math;

public class Dorkbia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int choose = sc.nextInt();
        if (choose == 1) {
            increase();
            menu();
        } else if (choose == 2) {
            future();
            menu();
        } else if (choose == 3) {
            post();
            menu();
        }
    }

    public static void menu() {
        System.out.println("---------------");
        System.out.println("เลือกฟังก์ชั่น");
        System.out.println("1.) หาดอกเบี้ย ");
        System.out.println("2.) หาเงินรวม ");
        System.out.println("3.) หาเงินต้น ");
        System.out.println("4.) ออก ");
    }

    public static void increase() {
        Scanner sc = new Scanner(System.in);
        Float dork3;
        System.out.print("เงินต้น: ");
        Float ton = sc.nextFloat();
        System.out.print("เงินรวม: ");
        Float sum = sc.nextFloat();
        System.out.print("จำนวนปี: ");
        Float year3 = sc.nextFloat();
        System.out.print("ทบต้นทุกกี่เดือน: ");
        Float tobton = sc.nextFloat();
        tobton = 12 / tobton;
        Float fp = (sum) / (ton);
        Float kn3 = (year3) * (tobton);
        dork3 = (float) (tobton * (1 - (Math.pow(fp, -kn3))));
        System.out.println("ดอกเบี้ย : " + dork3);
    }

    public static void future() {
        Scanner sc = new Scanner(System.in);
        System.out.print("เงินต้น: ");
        float kn;
        float ngernf;
        float ngern = sc.nextInt();
        float wong = 1;
        System.out.print("ดอกเบี้ย: ");
        float dork = sc.nextFloat();
        if (dork < 0.05) {
        } else if (dork >= 0.05) {
            dork /= 100;
        }
        System.out.print("ทบต้นกี่ครั้งต่อปี: ");
        int n = sc.nextInt();
        if (n == 1) {
            wong += dork;
            System.out.print("จำนวนปี: ");
            Float year = sc.nextFloat();
            if (n != 1) {
                n = 12 / n;
            } else if (n == 1) {
            }
            kn = (n) * (year);
            ngernf = (float) ((ngern) * (Math.pow(wong, kn)));
            System.out.print("เงินรวม: " + ngernf);
        } else if (n != 1) {
            System.out.print("จำนวนปี: ");
            Float year = sc.nextFloat();
            if (n != 1) {
                n = 12 / n;
            }
            wong += (dork / n);
            kn = (n) * (year);
            ngernf = (float) ((ngern) * (Math.pow((wong), kn)));
            System.out.print("เงินรวม: " + ngernf);
        }
    }

    public static void post() {
        Scanner sc = new Scanner(System.in);
        System.out.print("เงินรวม: ");
        Float kn2;
        float ngernf2;
        float ngern2 = sc.nextInt();
        float wong2 = 1;
        System.out.print("ดอกเบี้ย: ");
        float dork2 = sc.nextFloat();
        if (dork2 < 0.05) {
        } else if (dork2 >= 0.05) {
            dork2 /= 100;
        }
        System.out.print("ทบต้นกี่ครั้งต่อปี: ");
        int n2 = sc.nextInt();
        if (n2 == 1) {
            wong2 += dork2;
            System.out.print("จำนวนปี: ");
            Float year = sc.nextFloat();
            if (n2 != 1) {
                n2 = 12 / n2;
            } else if (n2 == 1) {
            }
            kn2 = (n2) * (year);
            ngernf2 = (float) ((ngern2) * (Math.pow((wong2), -1 * (kn2))));
            System.out.print("เงินต้น: " + ngernf2);
        } else if (n2 != 1) {
            System.out.print("จำนวนปี: ");
            Float year = sc.nextFloat();
            if (n2 != 1) {
                n2 = 12 / n2;
            } else if (n2 == 1) {
            }
            wong2 += (dork2 / n2);
            kn2 = (n2) * (year);
            ngernf2 = (float) ((ngern2) * (Math.pow((wong2), -1 * (kn2))));
            System.out.print("เงินต้น: " + ngernf2);
        }
    }
}
