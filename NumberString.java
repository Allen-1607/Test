public class NumberString extends NumberFormatException{
   static int findSum(String str){
    String temp="0";
    int i;
    int sum = 0;
    for(i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(Character.isDigit(ch)){
            temp += ch;
            System.out.println(temp);
        }
        else{
            sum = sum + Integer.parseInt(temp);
            temp = "0";
        }

    }
    System.out.println(temp);
    sum = sum + Integer.parseInt(temp);
    return sum;
   }
    public static void main(String args[]){
        String str="12abc20yz68";
        //int sum = findSum(str);
        System.out.println(findSum(str));
    }
    
}