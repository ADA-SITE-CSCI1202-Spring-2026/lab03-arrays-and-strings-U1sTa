package week05;
public class stringutil {
    public String reverse( String s) {
        
        for(int i=s.length()-1; i>=0; i-- ) {
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}
    public static void main(String s[] args) {
        String s1= 'Hello';
        System.out.println(reverse(s1));

    }
}