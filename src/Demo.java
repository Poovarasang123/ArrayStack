public class Demo {
    public static void main(String[] args) {
        ArrayStack <Integer> stack = new ArrayStack<Integer>();
        stack.push(9);
        stack.push(5);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
