package ADVANCE_JAVA;

//Here we are gonna implement a Lambda expression 
//which has a return type

@FunctionalInterface
interface C{
    int  drive(int x, int y);
}

public class P14 {
    public static void main(String[] args) {
        
        C audi=(i, j) -> i+j;

        int Sum=audi.drive(10,12);
        System.out.println(Sum);
    }
    
}
