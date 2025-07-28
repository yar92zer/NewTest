package org.example.newtest.Studies;

public class Mass {
    public static void main(String[] args) {
        /*int[] ages = new int [5];
        ages[0] =18;
        ages[2] = 25;
        System.out.println(ages[2]);*/
      //  String[] names ={"A", "B", "C", "D"};
        // System.out.println(names[2]);
       // System.out.println(names.length);
        /*int [] ages= {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x=0; x<ages.length; x++) {
            sum += ages[x];
        }
        System.out.println(sum);*/
        /* int[]nums = {2,3,5, 7};
        for(int x: nums){
            System.out.println(x);*/
        int[] [] sample = {
                {1,2,3},
                {4,5,6},
        };
        for (int x=0; x<sample.length;x++)  {
        for (int y=0; y<sample[x].length; y++)  {
            System.out.println(sample[x][y]);
        }
        }
    }
}