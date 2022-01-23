import java.lang.*;
public class SumFromString{
    public static void main(String args[]){
        String str="String978Is";
        char ch[] = str.toCharArray();
        int i = str.length();
        int j=0;
        int iterationCount = 0;
        int number =0;
        for(i=i-1;i>=0;i--){
            j=i;
            int value = Character.getNumericValue(ch[i]);
            while(value>=0 && value<=9)
            {
                int k =j;
                //System.out.println(value);
                int n;
                n=10;
                Double placeValue;
                placeValue = Math.pow(n,iterationCount);
                number=number + value*(placeValue.intValue());
                iterationCount++;
                value = -1;   
            }
            //int a = j;
            //System
            //iterationCount = 0;
            
           /* while(j>=0 && value>=0 && value<=9 ){
                
                int iterationCount = 0;
                int number, n;
                n=10;
                Double placeValue;
                placeValue = Math.pow(n,iterationCount);
                number=value*(placeValue.intValue());
                System.out.println(number); 
                 
            }
            */
         
        }
        System.out.println(number);
    
    }
}