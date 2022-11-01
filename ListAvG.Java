import java.util.*;     
public class AverageOfList  
{  
public static void main(String args[])   
{  
int sum = 0, avg;      
ArrayList<Integer> list = new ArrayList<Integer>();     
list.add(8);  
list.add(5);  
list.add(25);  
list.add(89);  
list.add(75);   
for(int i = 0; i < list.size(); i++)     
sum = sum + list.get(i);   
avg = sum / list.size();     
System.out.println("The average of the List: " + avg);  
}  
}  
