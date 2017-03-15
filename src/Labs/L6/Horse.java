package Labs.L6;

import java.util.Scanner;
public class Horse {
    String nickname;
    public Horse(String tmp) {
        this.nickname = tmp;
    }
    public Horse() {
        Scanner tmp = new Scanner(System.in);
        this.nickname = tmp.nextLine();
    }
}
