import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;

public class Testeos {
    public static void main(String[] args) {


        ArrayList<Integer> testeo = new ArrayList<Integer>();

        testeo.add((int)(Math.random()*5+1));
        testeo.add((int)(Math.random()*5+1));
        testeo.add((int)(Math.random()*5+1));
        testeo.add((int)(Math.random()*5+1));
        testeo.add((int)(Math.random()*5+1));

        System.out.println(testeo);

        Iterator<Integer> iterator = testeo.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        if (testeo.contains(2) && testeo.contains(3)){
            System.out.println("Contiene el numero");
        } else{
            System.out.println("No contiene el numero");
        }












    }
}
