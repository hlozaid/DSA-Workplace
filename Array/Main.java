import java.util.Scanner;
import java.util.*;

public class Main {


    //update
    public static void update(int marks[]){
        for(int i = 0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }

//get Larger and Smaller
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+ Smallest);
        return largest;
    }

    //linear Search
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String args[]) {


    //    int  marks[] = {95,97,88};
    //    update(marks);

    //    //print updated marks
    //    for(int i = 0; i<marks.length;i++){
    //     System.out.print(marks[i]+" ");
    //    }

       int numbers[] = {2,4,6,8,10,12,14,16};
       int key = 10;
//----------------------------------------------------
    //    int index = linearSearch(numbers, key);
    //    if(index == -1){
    //     System.out.println("Key not Found");
    //    }else{
    //     System.out.println("Key is at index: "+ index);
    //    }

    System.out.println("Largest value is : "+getLargest(numbers));

        // --------------------------creating Array

        // int marks[] = new int[50];
        // int number[] = {1,2,4};
        // String fruits[] = {"mango","apple","orange"};

        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] =sc.nextInt();

        // System.out.println("Math: "+marks[0]+"\nChem: "+marks[1]+"\nPhy: "+marks[2]);

    }
}