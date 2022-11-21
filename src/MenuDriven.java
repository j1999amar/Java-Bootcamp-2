import java.util.Scanner;

public class MenuDriven {
    Scanner scanner=new Scanner(System.in);

    void menu(){
        System.out.println("Menu");
        System.out.println(" 1. Largest Number ");
        System.out.println(" 2. Smallest Number ");
        System.out.println(" 3. Prime or Not Prime");
        int menu=scanner.nextInt();
        switch (menu){
            case 1:
                largestNumber();
            case 2:
                smallestNumber();
            case 3:
                primeOrNot();
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
    void smallestNumber(){
        System.out.println("Enter the first number");
        double number1=scanner.nextDouble();
        System.out.println("Enter the second number");
        double number2=scanner.nextDouble();
        System.out.println("Enter the third number");
        double number3=scanner.nextDouble();
        if(number1<number2&&number1<number3){
            System.out.println("Smallest Number is "+number1);
        }else if(number2<number1&&number2<number3){
            System.out.println("Smallest Number is "+number2);
        }else if(number3<number2&&number3<number1){
            System.out.println("Smallest Number is "+number3);
        }
    }
    void primeOrNot(){
        System.out.println("Enter the number to check the number is prime or not");
        int primeOrNotNUmber=scanner.nextInt();
        int count = 0;

        for(int i=2;i<primeOrNotNUmber;i++){
            if(primeOrNotNUmber/i==0){
                count=1;
            }else{
                count=0;
            }
        }
        if(count==1){
            System.out.println(primeOrNotNUmber+" is not a prime number");
        }else {
            System.out.println(primeOrNotNUmber+" is prime number");

        }
    }

    public static void main(String[] args) {
        MenuDriven menuDriven=new MenuDriven();
        Scanner scanner=new Scanner(System.in);
        menuDriven.menu();

    }
}
