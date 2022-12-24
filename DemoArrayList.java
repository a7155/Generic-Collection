
/**
 *
 * @author 4715
 */

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String args[]){
   
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        

        System.out.println("Nilai 1");
        //memasukkan data kedalam array nilai1
        for(int i=0; i<5; i++){
            nilai1.add(i);
            System.out.println("Index ke " + i + " = " + nilai1.get(i));
        }
        /*
            Nilai 1
            Index ke 0 = 0
            Index ke 1 = 1
            Index ke 2 = 2
            Index ke 3 = 3
            Index ke 4 = 4
         */
        
        System.out.println("Nilai 2");
        //memasukkan data kedalam array nilai2
        for(int i=0; i<5; i++){
            nilai2.add(i);
            System.out.println("Index ke " + i + " = " + nilai2.get(i));
        }
        
        /*
            Nilai 2
            Index ke 0 = 0
            Index ke 1 = 1
            Index ke 2 = 2
            Index ke 3 = 3
            Index ke 4 = 4*/

        
        //memasukkan hasil jumlah nilai1 + nilai2
        for(int i=0; i<5; i++){
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        }

        System.out.println("Hasil Jumlah nilai1 + nilai2");
        //menampilkan hasil jumlah 
        for(int i=0; i<5; i++){
            System.out.println("Jumlah index ke " + i + " = " +jumlah.get(i));
        }
       
     /*
        Hasil Jumlah nilai1 + nilai2
        Jumlah index ke 0 = 0
        Jumlah index ke 1 = 2
        Jumlah index ke 2 = 4
        Jumlah index ke 3 = 6
        Jumlah index ke 4 = 8
    */
    }
}