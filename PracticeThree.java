public class PracticeThree {
    public static void main(String[] args) {
        String [][] ay = {{"Jack","Jill","Jane","Joey"},{"Maura","Molly","Mason","Maureen"},{"Emma", "Eileen","Elizabeth","Emma"}};
        System.out.println(shortenMe(ay));
        System.out.println(countduplicates(ay));
        String [][] arr = {{"Jack","Jill","Jane","Joey"},{"Maura","Molly","Mason","Maureen"},{"Emma", "Eileen","Elizabeth","Emma"}};
        System.out.println(shiftMe(arr));
    }
    public static String[][]shortenMe(String[][]arr){
       
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col] = arr[row][col].substring(0,3);
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        
        return arr;
    }
    public static int countduplicates(String[][]arr){
        int count = 0;
        int max = 0;
        int row = 0; 
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                for(int n = 0; n<arr[i].length;n++){
                    if(arr[i][j].equals(arr[i][n])){
                        count++;
                    }
                }
            }
            if(count>max){
                max = count; 
                row = i;
            }
        }
        return row;
    }
    public static String[][]shiftMe(String[][]arr){
        arr[0][0]=arr[arr.length-1][arr[0].length-1] ;
        System.out.print(arr[0][0]+" ");
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(col==3){
                    arr[row][col] = arr[row+1][col];
                }
                else{
                arr[row][col] = arr[row][col+1];
                }
                System.out.print(arr[row][col]+" ");
            
            }
            System.out.println();
        }
        return arr;
    }
}