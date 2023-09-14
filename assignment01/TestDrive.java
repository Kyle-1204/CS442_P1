package assignment01;

public class TestDrive {
    public static void main(String[] args){
        DLlist<String> adaptee = new DLlist<String>();
        Deque<String> adapter1 = new Dequelmpl1<>(adaptee);
        Deque<String> adapter2 = new Dequelmpl2<>();

    }
}
