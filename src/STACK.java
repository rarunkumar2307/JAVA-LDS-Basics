import java.util.Stack;

public class STACK {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.add(55);
        st.push(60);
        System.out.println(st);
    }
}
