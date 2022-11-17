import java.util.ArrayList;
import java.util.Random;

public class ArrayListEX {
    ArrayList<Integer> list = new ArrayList<>();
    void Enter() {
        Random rd = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomNum = rd.nextInt(1, 10);
            list.add(randomNum);
        }
    }

    void PrintList() {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }


    public static void main(String[] args) {
        ArrayListEX arrL = new ArrayListEX();
        arrL.Enter();
        arrL.PrintList();
    }
}
