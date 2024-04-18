package recursion.string;
/*
*  TC we can calculate = no of calls * time taken by function
*/
public class RemoveCharactorOccurrance {
    public static void main(String[] args) {
        String str = "ashish";
        String removed = "";
        char ch = 'a';
        String res = removeOccurences1(str, 0, ch, removed);
        System.out.println(res);

        String res1 = removeOccurrence2(str, 0, ch);
        System.out.println(res1);

        String res2 = removeOccurrence3(str, ch);
        System.out.println(res2);
    }

   /*
   * if currentChar + removeOccurrence2(str, i, ch) when currentChar != ch
   * if removeOccurrence2(str, i, ch) when currentChar == ch
   *
   * Total function call is n and time taken by String concatenation is n so TC = n * n = O(n^2)
   */
    private static String removeOccurrence2(String str, int i, char ch) {
        if(i == str.length()) return "";
        String smallString = removeOccurrence2(str, i+1, ch);
        char currentChar = str.charAt(i);
        if(currentChar != ch){
            return currentChar + smallString;  //String concatenation take O(n)
        }else{
            return smallString;
        }
    }

    /*
     * if currentChar + removeOccurrence2(str, ch) when currentChar != ch
     * if removeOccurrence2(str, ch) when currentChar == ch
     *
     * Total function call is n and time taken by String concatenation and substring is n so TC = n * 2n = O(2n^2) = O(n^2)
     */
    private static String removeOccurrence3(String str, char ch) {
        if(str.isEmpty()) return "";
        String smallString = removeOccurrence3(str.substring(1), ch); //substring take O(n)
        char currentChar = str.charAt(0);
        if(currentChar != ch){
            return currentChar + smallString;  //String concatenation take O(n)
        }else{
            return smallString;
        }
    }

    private static String removeOccurences1(String str, int i, char ch, String removed) {
        if(i == str.length()) return removed;
        if(str.charAt(i) != ch) {
            removed +=str.charAt(i);
        }

        return removeOccurences1(str, i+1, ch, removed);
    }

}
