import java.util.*;
public class AccessPairs {
    public static ArrayList<Integer> accessPairs(ArrayList<Integer>arr){
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            if(i<arr.size()&&i+1<arr.size()){
                list.clear();
                list.add(arr.get(i));
                list.add(arr.get(i+1));
                System.out.println(list);
            }
            else if(i+1>arr.size()){
                list.clear();
                list.add(i);
                System.out.println(list);
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>pairs = new ArrayList<Integer>();
        pairs.add(2);
        pairs.add(4);
        pairs.add(4);
        pairs.add(2);
        pairs.add(9);
        pairs.add(5);
        pairs.add(2);
        pairs.add(4);
        pairs.add(5);
        System.out.println(accessPairs(pairs));
    }
}
