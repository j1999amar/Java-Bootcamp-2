import java.util.Scanner;

public class MenuDriven {
    Scanner scanner=new Scanner(System.in);

    void menu(){
        System.out.println("Menu");
        System.out.println(" 1. Largest Number ");
        System.out.println(" 2. Smallest Number ");
        System.out.println(" 3. Prime or Not Prime");
        System.out.println(" 4. Even or Not");
        System.out.println(" 5. Resverse Number");
        System.out.println(" 6. Exit");
        int menu=scanner.nextInt();
        menuActoin(menu);
    }
    void menuActoin(int menu){

        switch (menu){
            case 1:
                largestNumber();
                break;
            case 2:
                smallestNumber();
                break;
            case 3:
                primeOrNot();
                break;
            case 4:
                evenOrNot();
                break;
            case 5:
                reverse();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Choice correct ");
        }
    }

    void largestNumber(){
        System.out.println("Largest Number");
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
        System.out.println("Smallest Number");
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
        System.out.println("Prime Number or Not Prime Number");
        System.out.println("Enter the number to check the number is prime or not");
        int primeOrNotNUmber=scanner.nextInt();
        int count = 0;

        for(int i=2;i<primeOrNotNUmber;i++){
            if(primeOrNotNUmber%i == 0)
            {
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(primeOrNotNUmber+" is prime number");

        }else {
            System.out.println(primeOrNotNUmber+" is not a prime number");

        }
    }
    void evenOrNot(){
        System.out.println("Even Number or Not Even Number");
        System.out.println("Enter the number to check even or not");
        int evenOrNotNumber=scanner.nextInt();
        if(evenOrNotNumber%2==0) {
            System.out.println(evenOrNotNumber + " is a even number");
        }else{
            System.out.println(evenOrNotNumber + " is not even number");
        }
    }
    void reverse() {
        System.out.println("Resverse Number");
        int swapNumber = scanner.nextInt();
        int reverse;
            reverse = 0;
            for (; swapNumber != 0; swapNumber = swapNumber / 10) {
                int remainder = swapNumber % 10;
                reverse = reverse * 10 + remainder;
            }
        System.out.println("The reverse of given number is " + reverse);

        }

    public static void main(String[] args) {
        MenuDriven menuDriven=new MenuDriven();
        Scanner scanner=new Scanner(System.in);
        while(1>0){
            menuDriven.menu();
        }


    }
}
