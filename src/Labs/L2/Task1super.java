package Labs.L2;


import java.util.Scanner;
public class Task1super {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        String f = stream.nextLine();   String s = stream.nextLine();
        if (f.equals(s)) {  System.out.println("Имена идентичны");
        } else {
            if (f.length() == s.length()) {
                System.out.println("Длины имен равны");
            } else {
                System.out.println("Имена разные");
            }
        }
    }
}
