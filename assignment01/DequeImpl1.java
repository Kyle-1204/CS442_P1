package assignment01;

//import assignment01.DLlist;

public class DequeImpl1<E> implements Deque<E> { //Object Adapter
    
    //private E e; //Use our generic type!
    private DLlist<E> list; //Avoid raw typing by chaining our generic
    //If I were to not use "new" here then we have not allocated this object to memory

    public DequeImpl1() {
        list = new DLlist<>();
        //new DLlist<>(); and new DLlist<E>(); are equivlent
    }

    public DequeImpl1(DLlist<E> newList) {
        //this.e = generic;
        list = newList;
    }

    public void addLast(E e) {
        int listLength = list.length();
        list.insertList(e, listLength);
    }

    public void addFirst(E e) {
        list.insertList(e, 0);
    }

    public E peek() {
        if(list.length() == 0){return null;}
        
        return list.get(0);
    }
   
    public E poll() {
        if(list.length() == 0){return null;}

        //Retreives and Removes first ele
        E temp = list.get(0);
        list.delete(0);

        return temp; 
    }
    
    public E peekLast() {
        if(list.length() == 0){return null;}

        return list.get(list.length()-1);// Change this line to return the actual result
    }
    
    public E pollLast() {
        if(list.length() == 0){return null;}

        E temp = list.get(list.length()-1);
        list.delete(list.length()-1);

        return temp; 
    }
    
    public int size() {
        
        return list.length();
    }

}
