import java.util.*;
class PalindromeDemo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number: ");
                String str = sc.nextLine();
                boolean ans = false;
                String rev = "";
                for(int i = str.length()-1; i>=0; i--){
                        rev = rev + str.charAt(i);
                                }
                if(rev.equals(str))
                        ans = true;
                else
                        ans = false;

                System.out.println(ans);
        }

