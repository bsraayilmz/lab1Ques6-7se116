import java.util.Scanner;

public class lab1ques6 {
    public static void main(String [] args){
        //question 7 #lab1 SE116
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int multi = 1;
        System.out.println("Please enter a value for the base of the power");
        a = s.nextInt();
        System.out.println("Please enter b value for the top of the power");
        b = s.nextInt();
        for(int i=1; i<= b; i++){
            multi = multi * a;
        }
        System.out.println("answer : " + multi);

        // question: 6 #lab1 SE116
        double multi1 = 1;
        double number = 5;
        double pow = Math.pow(5,3);
        System.out.println("three power of the five: "+pow);
        //for and Math class give the same result.

        for(int i = 0; i< 3; i++){
            multi1 = number * multi1;
        }
        System.out.println("answer: " + multi1);

    }

}
