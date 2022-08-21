public class Main {
    private int length;
    private int topOfStack;
    private int[] myStack = new int[length];

    public Main () {
        this.length = length;
        this.topOfStack = topOfStack;
    }
    public void push(int y) {
        myStack[topOfStack++] = y;
    }
}