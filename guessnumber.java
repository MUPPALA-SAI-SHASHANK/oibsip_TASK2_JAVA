import java.io.*;
import java.util.*;
class Guess_Number{
    void Guessnumber_meth(){
        Scanner input=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int guess,score=0,i,end;
        System.out.println("WELCOME TO GUESS THE NUMBER CHALLENGE");
    System.out.println("Computer generates a number between 1 to 100");
    int k=7;
    System.out.println("Guess the number within 7 attempts");
    for(i=0;i<k;i++){
        System.out.println("Enter the number:");
        guess=input.nextInt();
    if(guess<=0 || guess>100){
        System.out.println("Incorrect number...The number lies between 1 to 100"); 
    }
    else if(guess==number){
        System.out.println("Congratulations...You guessed with in "+(i+1)+" Attempts");
        System.out.println("Your score is: "+(100-(i*10)));
    break;
    }
    else if(guess>number && i!=k-1){
        System.out.println("Oh!The number is lesser than "+guess);
    }
    else if(guess<number && i!=k-1){
        System.out.println("Oh!The number is greater than "+guess);
    }
    }
    if(i==k){
        System.out.println("Well Tried...But number of chances finished...");
        System.out.println("The correct number is "+number);
        System.out.println("Your score: "+score);
    }
    System.out.println("Do you want to play again?");
    System.out.println("Enter\n"+"1 to play\n"+"0 to exit");
    end=input.nextInt();
    if(end==1){
        Guessnumber_meth();
    }
    else{
        System.out.println("Thank you....");
    }
    }
    }
    class guessnumber{
        public static void main(String args[]){
        Guess_Number g=new Guess_Number();
        g.Guessnumber_meth();
}
}