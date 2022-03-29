package Dad;

import java.util.ArrayList;
import java.util.Iterator;

public class Ital {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        for (int i=0;i<=10;i++){
            arr.add(i);
        }
        Iterator it= arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }

    }
}
