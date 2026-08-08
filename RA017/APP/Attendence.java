import java.util.Scanner;

public class Attendence{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        
        int present = 0;

        for(int i=0; i<7; i++){
           arr[i] = sc.nextInt();
           if (arr[i] == 1){
                 present++;
    }
}
    if((present/7.0)*100 >= 75) {
        System.out.println("Eligible for Exam");
    }else{
        System.out.println("Not Eligible");
    }
}
}