import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in); 

        StackImplementation stack = new StackImplementation();

        int option = 5, val;
        while(option != 0){
            
            System.out.println("0. To exit the program. ");
            System.out.println("1. To check if stack is empty. ");
            System.out.println("2. To check if stack is full. ");
            System.out.println("3. To insert an element in the stack");
            System.out.println("4. To remove an element from the stack");
            option = reader.nextInt();

            switch(option){
                case 0: 
                    break;
                case 1:
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty");
                    }else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 2:
                    if(stack.isFull()){
                        System.out.println("Stack is full");
                    }else{
                        System.out.println("Stack is not full");
                    }
                    break;
                case 3: 
                    System.out.println("Enter the integer you want to push in the array");
                    val = reader.nextInt();
                    stack.push(val);
                    break;
                case 4: 
                    System.out.println("Item " + stack.pop() + " removed from the stack");
                    break;
                default:
                    System.out.println("Choose the operations you want to perform: ");
            }
        }
    }
}