public class StackGenericExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyStack<String> stringMyStack = new MyStack<>(5);
        stringMyStack.push("hello");
        stringMyStack.push("world");
        System.out.println(stringMyStack.pop()+" "+stringMyStack.pop());

        MyStack<Integer> integerMyStack = new MyStack<>(5);
        integerMyStack.push(1);
        integerMyStack.push(2);
        integerMyStack.push(3);
        System.out.println(integerMyStack.pop());
        System.out.println(integerMyStack.pop());
        System.out.println(integerMyStack.pop());



    }

    static class MyStack<T>{
        private int top ;
        private  T[] stackArray;
        private int maxSize;
        public MyStack(int maxSize){
            this.maxSize = maxSize;
            this.top = -1;
            stackArray = (T[]) new Object[this.maxSize];
        }
        public void push(T value){
            if (isFull()){
                System.out.println("stack is full");
            }
            stackArray[++top]= value;

        }
        public T pop(){
            if (isEmpty()){
                System.out.println("stack is full");
                return null;
            }
            return stackArray[top--];
        }
        public T peek(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return null;
            }
            return stackArray[top];
        }

        public boolean isEmpty(){
            return top==-1;
        }
        public boolean isFull(){
            return top == maxSize-1;
        }
    }
}
