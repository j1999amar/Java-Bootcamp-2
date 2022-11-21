import java.util.Scanner;

public class MenuDriven {
    Scanner scanner=new Scanner(System.in);

    void menu(){
        System.out.println("Menu");
        System.out.println(" 1. Largest Number ");
        int menu=scanner.nextInt();
        switch (menu){
            case 1:
                largestNumber();
        }

    }

    void largestNumber(){
        System.out.println("Enter the first number");
        double number1=scanner.nextDouble();
        System.out.println("Enter the second number");
        double number2=scanner.nextDouble();
        System.out.println("Enter the third number");
        double number3=scanner.nextDouble();
        if(number1>number2&&number1>number3){
            System.out.println("Largest Number is "+number1);
        }else if(number2>number1&&number2>number3){
            System.out.println("Largest Number is "+number2);
        }else if(number3>number2&&number3>number1){
            System.out.println("Largest Number is "+number3);
        }



    }
    public static void main(String[] args) {
        MenuDriven menuDriven=new MenuDriven();
        Scanner scanner=new Scanner(System.in);
        menuDriven.menu();

    }
}
