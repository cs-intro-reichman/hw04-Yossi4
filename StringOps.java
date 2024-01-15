public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    
















    public static void main(String[] args) {
        String s = args[0];
        
        System.out.println(camelCase(s));
        
    }

    



    public static String capVowelsLowRest (String string) {///////////// done
        String mutated = "";
        for (int i = 0; i < string.length() ;i++ ) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                mutated += (char) (string.charAt(i) - 32);
            }
            else{
                if ((string.charAt(i) >= 'A') && (string.charAt(i)<= 'Z')) {
                    if ( ((string.charAt(i) != 'A' )&& (string.charAt(i) != 'E') && (string.charAt(i) != 'I') && (string.charAt(i) != 'O') && (string.charAt(i) != 'U'))) {
                       mutated += (char) (string.charAt(i) + 32); 
                    }
                    else{
                        mutated += string.charAt(i);
                    }
                    
                }
                else{
                    mutated += string.charAt(i);
                }
            }
            
        }
        return mutated;
    }


    



    public static String camelCase (String string) {
        
        String mutated = "";
        int i = 0;
        while(string.charAt(i) == ' '){ //till first letter
            i++;
        }
        int j = i;
        while(string.charAt(j) != ' '){//till the end of the first word
            j++;
        }
        mutated += lowLetters(string.substring(i,j));//first word works


        int sequence = 0;
        for (int k = j;k < string.length() ;k++ ) {
            if (string.charAt(k) != ' ') {
                if (sequence == 0) {//sequence started
                    mutated += capChar(string.charAt(k));
                }
                else{
                    mutated += lowChar(string.charAt(k));
                }
                sequence++ ;
                }
            else{
                sequence = 0;
            }        
            }

        return mutated;

            
        }
        
    

    public static char lowChar (char chr){
        if (chr >= 'a' && chr <= 'z') {
            return chr;
        }
        else{
            return (char)(chr+32);
        }
    }
        public static char capChar (char chr){
        if (chr >= 'A' && chr <= 'Z') {
            return chr;
        }
        else{
            return (char)(chr-32);
        }
    }











    

    public static int nTimesInString (String string, char chr) {
        int appearences = 0;
        for (int i = 0;i < string.length() ;i++ ) {
            if (string.charAt(i) == chr) {
                appearences++;
            }

            
        }
        return appearences;
    }
    public static void println (int [] array){
        for (int i = 0;i < array.length ;i++ ) {
            System.out.print(array[i] + " -> ");
            
        }




    }
   
    public static String firstCapRestLow (String string){ // gets a valid string and returns th sme string with ONLY the first char as a cap letter
        String mutated = "";
        if (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z'){
            mutated += string.charAt(0);
        }
        else{
            mutated += (char) (string.charAt(0) - 32);
        }

        for (int i = 1;i < string.length() ;i++ ) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                mutated += string.charAt(i);
                
            }
            else{
                mutated += (char)(string.charAt(i) + 32);
            }
            
        }
        return mutated;
    }
    
    public static String lowLetters (String string){
        String mutated = "";
        for (int i = 0; i < string.length() ;i++ ) {
            if (string.charAt(i) >='a' && string.charAt(i) <= 'z') {
                mutated += string.charAt(i);
                
            }
            else{
                mutated += (char) (string.charAt(i) + 32);
            }
            
        }
        return mutated;



    }



    




    public static int[] allIndexOf (String string, char chr) {
       int [] arrayOfIndexes = new int[nTimesInString(string,chr)];
       int arrayIndex = 0;
       for (int i = 0;i < string.length() ;i++ ) {
            if (string.charAt(i) == chr) {
                arrayOfIndexes[arrayIndex] = i;
                arrayIndex++;

                
            }
           
       }
         
        return arrayOfIndexes;
    }
}





















