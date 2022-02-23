import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Sample {
    public static void main(String[] args){
ArrayList <Integer>  input = new ArrayList<Integer>();
input.add(3);
input.add(8);
input.add(92);
input.add(4);
input.add(2);
input.add(17);
input.add(9);
System.out.println(input.toString());
minToFront(input);
//System.out.println(input.toString());
    }
    public static void minToFront(ArrayList<Integer> input){
        //System.out.println("size "+input.size());
        //Collections.sort(input);
        int b = input.size();
        int c = input.get(0);
            for(int i = 0; i < b; i++){
                //System.out.println("i " + i);
                System.out.println("size "+input.size());
                if(input.get(i) < c){
                    c = input.get(i);
                    System.out.println(c);

                   //input.set(i,c);
                   //input.set(i+1,b);
                }
                //System.out.println(input.toString());
               //input.set(i+1, input.get(i));
                //System.out.println(input.toString());
            }
            int d = input.get(0);
            for(int a = 0; a < b; a++){
                int f = input.get(a+1);
                input.set(a+1,d);
                   d = f;
                   input.set(0, c);
                   //System.out.println(input.toString());
            }
            //input.set(0, c);
            System.out.println(input.toString());
        }
}
