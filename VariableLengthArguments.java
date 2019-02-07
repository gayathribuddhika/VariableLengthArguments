
package variablelengtharguments;


public class VariableLengthArguments {

    
    public static void main(String[] args) {
        
        System.out.println(Average(20,40,60,80,100));
    }
    public static int Average(int...numbers){
        int total=0;
        for(int x:numbers){
            total+=x;
            
            
        }
         return total/numbers.length;   
    }
}
