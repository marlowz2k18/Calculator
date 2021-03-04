package ie.marlowe;


public class calculator {
    // This method will add two numbers.
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public  int divide(int num1, int num2){
       if(num1 > 0 && num2 > 0){
           int total = num1 / num2;
           return total;
       }else {
           throw new IllegalArgumentException("Invalid number");
       }

    }
}
