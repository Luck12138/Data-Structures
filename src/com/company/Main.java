package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr=new int[10];
//        for(int i=0;i<arr.length;i++){
//           arr[i]=i;
//        }
//
//        int scores[] =new int[]{110,22,34};
//        for(int i=0;i<scores.length;i++){
//            System.out.println(scores[i]);
//        }
//
//        for(int score:scores){
//            System.out.println(score);
//        }
//        scores[0]=10;
//
//        for(int score:scores){
//            System.out.println(score);
//        }

        Array<Integer> array=new Array<Integer>();
        for(int i=0;i<10;i++){
            array.addLast(i);
        }

        System.out.println(array.toString());

        array.add(100,0);

        array.addFirst(1);

        System.out.println(array.toString());

        array.remove(2);

        array.remove(1);
        array.remove(3);



        System.out.println(array.toString());
    }
}
