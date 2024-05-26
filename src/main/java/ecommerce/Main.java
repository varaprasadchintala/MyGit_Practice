package ecommerce;

public class Main {
    public static void main(String[] args) {
        String name="vara123@!@#$%^&*()_+prasad456";

        //regular experession -- REGEX
        String alph= name.replaceAll("[^a-zA-Z]","");
        String num= name.replaceAll("[^0-9]","");
        String SplCh = name.replaceAll("[a-zA-Z,0-9]","");
        System.out.println("Alphabets: " +  alph);
        System.out.println("Numbers: " +  num);
        System.out.println("Special Charactors: " +  SplCh);

        System.out.println("abcdef");





    }
}