package epam.collections;

public class Main
	{
	    public static void main(String[] args) 
	    {
	        Datalist<Integer> list = new Datalist<Integer>();
	 
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);
	        list.add(10);
	        System.out.println("|--------Custom List implementation of all opeartions---------|");

	        System.out.println(list);
	         
	        //Removing elements
	        list.remove(9);
	        System.out.println(list);
	         
	        //fetching elements from index
	        System.out.println( list.get(2) );
	        System.out.println( list.get(1) );
	 
	        //List Size
	        System.out.println(list.size());
	    }
	}