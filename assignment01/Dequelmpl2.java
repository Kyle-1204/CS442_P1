package CS442.CS442_P1.assignment01;

public class Dequelmpl2<E> extends DLlist<E> implements Deque<E>{ //Class Adapter

    //No need to instantiate a list here
    public Dequelmpl2(){
        /* */
    }

    public void addLast(E e){
        insertList(e, length());
    } 

	public void addFirst(E e){
        insertList(e, 0);
    }

	public E peek(){
        if(length() == 0){return null;}

        return get(0);
    }
	
	public E poll(){
        if(length() == 0){return null;}

        E temp = get(0);
        delete(0);

        return temp;
    }
	
	public E peekLast(){
        if(length() == 0){return null;}

        return get(length()-1);
    }
	
	public E pollLast(){
        if(length() == 0){return null;}

        E temp = get(length()-1);
        delete(length()-1);

        return temp; 
    }
	
	public int size(){
        
        return length();
    }



}
