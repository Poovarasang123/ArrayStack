
public class ArrayStack<T>{
    static final int MAX_VALUE = 30;
    T arr[] = (T[]) new Object[MAX_VALUE];
    int top;
    ArrayStack(){
         top = -1;
    }
    void push(T val){
        if(top == MAX_VALUE-1) throw new IndexOutOfBoundsException("Stack overflow");
        arr[++top] = val;
    }
    T pop(){
        if(top==-1) throw new IndexOutOfBoundsException("Stack is underflow");
        return arr[top--];
    }
    T peek(){
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}