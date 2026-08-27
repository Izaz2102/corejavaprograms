package only.java;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String str = "wwiipro";
        System.out.println("Start small. Ship something."+str.length());
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("reverse: "+sb);
    }
}
