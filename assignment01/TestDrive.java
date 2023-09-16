package assignment01;

public class TestDrive {
    public static void main(String[] args){
        DLlist<String> adaptee = new DLlist<String>();
        Deque<String> adaptar1 = new DequeImpl1<>(adaptee); //object adapter
        Deque<String> adaptar2 = new DequeImpl2<>(); //class adapter

        //object adaptar test
        System.out.println(adaptar1.peekLast()); //should be null
        System.out.println(adaptar1.peek()); //should be null
        adaptar1.pollLast(); //remove last element
        adaptar1.addLast("two");
        adaptar1.addFirst("one");
        adaptar1.addLast("three");
        System.out.println(adaptar1.peekLast()); //should be 3
        System.out.println(adaptar1.peek()); //should be 1
        adaptar1.pollLast(); //remove last element
        System.out.println(adaptar1.peekLast()); //should be 2
        adaptar1.poll(); //remove first element
        System.out.println(adaptar1.peek()); //should be 2

        System.out.println(); 

        //class adaptar test
        System.out.println(adaptar2.peekLast()); //should be null
        System.out.println(adaptar2.peek()); //should be null
        adaptar2.addLast("two");
        adaptar2.addFirst("one");
        adaptar2.addLast("three");
        System.out.println(adaptar2.peekLast()); //should be 3
        System.out.println(adaptar2.peek()); //should be 1
        adaptar2.pollLast(); //remove last element
        System.out.println(adaptar2.peekLast()); //should be 2
        adaptar2.poll(); //remove first element
        System.out.println(adaptar2.peek()); //should be 2


    }
}
