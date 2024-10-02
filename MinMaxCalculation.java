import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxCalculation {
    static int MinCalc(List<Integer> list) {
      if (list == null || list.size() == 0) { 
            return 0; 
        } 

        List<Integer> sortedlist = new ArrayList<>(list); 

        Collections.sort(sortedlist); 

        return sortedlist.get(0);
    }

  public static Integer MaxCalc(List<Integer> list) 
    { 
        if (list == null || list.size() == 0) { 
            return 0; 
        } 

        List<Integer> sortedlist = new ArrayList<>(list); 

        Collections.sort(sortedlist); 

        return sortedlist.get(sortedlist.size() - 1); 
    } 

    public static void main(String[] args) 
    { 
        List<Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        System.out.println("Minimum: " + MinCalc(list)); 
        System.out.println("Maximum: " + MaxCalc(list)); 
    } 
} 