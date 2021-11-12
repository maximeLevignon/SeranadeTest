import java.util.Scanner;
class TestArray {
    int MAX(int[] Arry) {
        int maxValue = Arry[0];

        for (int i = 1; i < Arry.lengths; i++) {
            if (Arry[i] > maxValue) {
                maxValue = Arry[i];
            }
        }
        return maxValue;
    }

    int MIN(int[]Arry){
        int minValue=Arry[0];

        for(int i=1;i<Arry.length;i++){
            if(Arry[i]<minValue){
               minValue=Arry[i];
            }
        }
        return minValue;
    }
}

public class DifferenceArry{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements:");
        n = sc.nextIn();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter [" + (i + 1) +"] element :");
            arr[i] = ac.nextInt();
        }

        TestArray obj = new TestArray();
        System.out.println("Maximum value in the array is: " + obj.MAX(arr));
        System.out.println("minimum value in the array is : " + obj.MIN(arr));
        int diff = obj.MAX(arr) - obj.MIN(arr);
        System.out.print("Difference between next and mean elements is :" + diff);
    }

}

/*
insert import java dot util dot capital scanner semicolon
insert class TestArray braces
insert int caps max parens int brackets braces
    type capital a r r y
insert int maxValue equals Arry brackets zero semicolon
insert for parens
    insert int i equals 1 semicolon
    insert i smaller than capital Arry dot length semicolon
    insert i++
    insert braces
insert if parens Arry brackets i greater than maxValue braces
insert maxValue equals Arry brackets i semicolon
insert return maxValue

tout pareil pour méthode MIN

insert public class DifferenceArry braces
insert public static void main parens capital string brackets args braces
insert int n semicolon
insert scanner sc equals new scanner parens system dot in semicolon
insert system dot out dot print parens quotes enter the array elements colon
insert n equals sc dot nextInt
insert int arr brackets equals new int brackets n semicolon
insert for int i equals 0 semicolon i less than arr.length i++ braces
insert system dot out dot print parens quotes
    insert Enter brackets quotes + parens i+1 +
    insert element colon
insert arr bracket i equals sc dot nextInt parens semicolon
insert TestArray obj equals new TestArray parens semicolon
insert system dot out dot println parens quotes
    insert maximum value in the array is colon
    insert + obj dot caps max parens arr semicolon
insert system dot out dot println parens quotes
    insert minimum value in the array is colon
    insert + obj dot caps min parens arr semicolon
insert int diff equals obj dot caps max parens arr minus obj dot caps min parens arr semicolon
insert system dot out dot print parens quotes
    insert difference between max and min elements is colon space + diff
Commentaire :
  - "Arry" épeler capital A r r y
  - indent (tabulations)
  - < = "less" / > = "more"
  - dictate mode : permet de ne pas dire "insert" à chaque début de ligne
        --> mais pas possible de naviguer (dictate mode off)
  - temps de construction du code à la voix -->  +/- 40 mins
*/
