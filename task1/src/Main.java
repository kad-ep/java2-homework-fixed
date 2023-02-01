public class Main {
    public static void main(String[] args) {
        String s1 = "PHP Exercises and ";
        String s2 = "Python Exercises";

        String concat = s1 + s2;
        String result = concat.replace("P", "").replace("p", "");

        System.out.println(result);
    }
}