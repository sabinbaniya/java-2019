class StackImplementation{

    int top;
    int arr[];

    
    StackImplementation(){
        top = -1;
        arr = new int[5];

    }

    boolean isFull(){
        if(top == 5){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    void push(int val){
        top++;
        arr[top] = val;
        System.out.println("Value " + val + "sucessfully inserted at " + top + "position");
    }

    int pop(){
        int val = arr[top];
        top--;
        return val;
    }
}