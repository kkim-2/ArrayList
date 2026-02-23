import java.util.*;
public class removeDuplicates {

    public static void main(String[]args){
        ArrayList<Integer>arr = new ArrayList<Integer>();
        for(int i=0; i<20;i++){
            arr.add((int)(Math.random()*10)+1);
        }
        System.out.println(removeDuplicates(arr));
    }
    public static ArrayList<Integer>removeDuplicates(ArrayList<Integer>list){
        
        for(int i = 0;i<list.size();i++){
            for(int j = list.size()-1;j>i;j--){
                if(list.get(i).equals(list.get(j))){
                    System.out.println("Removed: "+list.get(j));
                    list.remove(j);
                    
                }
            }
        }
        return list;
    }
}
