/**
 * Created by Dariya on 15.10.2015.
 * есть число int (32 бита), требуется получить массив byte[4](или 4 числа по байту)
 */
public class Main {
    public static void main(String[] args) {
        int number = 300;
        byte b[] = new byte[4];
        b[3] = (byte) (number >> 24);
        b[2] = (byte) (number >> 16);
        b[1] = (byte) (number >> 8);
        b[0] = (byte) (number >> 0);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}



