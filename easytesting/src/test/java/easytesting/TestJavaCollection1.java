package easytesting;
import java.util.*;  
public class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
int k=10;
for(int i=0;i<10000;i=i+10) {
	
	list.add(i);
	
}





//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.print(itr.next()+" ");  
}  
}  
} 