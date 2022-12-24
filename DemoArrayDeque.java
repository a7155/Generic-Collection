/**
 *
 * @author 4715
 */
import java.util.ArrayDeque;
public class DemoArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> nilai1= new ArrayDeque<>();
        for(int i=0; i<5; i++){
            nilai1.add(i);
            System.out.println("Index ke " + i + " = " + nilai1);
        }

        // Using poll()
        Integer element = nilai1.poll();
        System.out.println("Removed Element: " + element);
        System.out.println("New ArrayDeque: " + nilai1);

        // Using pollFirst()
        Integer firstElement = nilai1.pollFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using pollLast()
        Integer lastElement = nilai1.pollLast();
        System.out.println("Removed Last Element: " + lastElement);
    }
}

