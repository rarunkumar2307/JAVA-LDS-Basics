import java.util.ArrayList;

public class ARRAY_LIST {
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        System.out.println(array);
        array.remove(0);
        System.out.println(array);
    }
}
