public class SumNoInString{
    public static void  main(String args[]){
        char a= '9';
        int b = Integer.parseInt(String.valueOf(a));// Using String.valueOf() to get numeric value
        int c = Character.getNumericValue(a); // Using Character.getNumericValue() to get numeric value 
        System.out.println(b);
        System.out.println(c);

        String str = "This12is34theString5";
        int i = str.length();
        for(i=i-1;i>=0;i--){
            System.out.println(Character.getNumericValue(str.charAt(i))); // Method 1 to create char array from string
        }
        //System.out.println(str.length());

        // Method 2 to create array from String - Use toCharArray()
        char ch[] = str.toCharArray();
        for(char d :ch){
            //System.out.println(d);
            System.out.println(Character.getNumericValue(d));
        }



    }
}