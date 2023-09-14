package assignment01;

public class Dequelmpl2<E> extends DLlist<E> implements Deque<E>{ //Class Adapter

    //No need to instantiate a list here
    public Dequelmpl2(){
        //DLlist<String> list;
    }

    public void addLast(E e){
        super.insertList(e, length());
    } 

	public void addFirst(E e){
        super.insertList(e, 0);
    }

	public E peek(){
        if(super.length() == 0){return null;}

        return super.get(0);
    }
	
	public E poll(){
        if(super.length() == 0){return null;}

        E temp = super.get(0);
        super.delete(0);

        return temp;
    }
	
	public E peekLast(){
        if(super.length() == 0){return null;}

        return super.get(super.length()-1);
    }
	
	public E pollLast(){
        if(super.length() == 0){return null;}

        E temp = super.get(length()-1);
        super.delete(length()-1);

        return temp; 
    }
	
	public int size(){
        
        return super.length();
    }



}
