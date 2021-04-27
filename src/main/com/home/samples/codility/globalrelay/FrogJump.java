package com.home.samples.codility.globalrelay;

/**
 * Created by nagendra on 16/01/2018.
 */
public class FrogJump {
    /*
        Refer codility-frogJump-1.png, codility-frogJump-2.png, codility-frogJump-3.png
     */
    // J < K => K - J + 1
    public static void main(String[] args) {
        System.out.println("-----START-----");
        int max = 0;
//        int[] blocks = {2, 6, 8, 5}; //2, 8 => 3
//        int[] blocks = {1,5,5,2,6}; //4
          int[] blocks = {1,1}; //2

        for (int position = 0; position < blocks.length; position++) {
            System.out.println("Frogs Position:" + position);
            int frogAPosition = position;
            int frogBPosition = position;

            for(int j = position; j > 1; j--) {
                if (blocks[frogAPosition] <= blocks[frogAPosition - 1]) {
                    frogAPosition--;
                } else {
                    break;
                }
            }
            for (int i = position; i < blocks.length - 1; i++) {
                if (blocks[frogBPosition] <= blocks[frogBPosition + 1]) {
                    frogBPosition++;
                } else {
                    break;
                }
            }

            System.out.println("Frog 1: " + frogAPosition);
            System.out.println("Frog 2: " + frogBPosition);

            if(frogBPosition <= frogAPosition) {
                int ans = frogAPosition - frogBPosition + 1;
                if(max < ans) {
                    max = ans;
                }
                System.out.println("Ans:------------" + ans);
            } else {
                int ans = frogBPosition -  frogAPosition + 1;
                if(max < ans) {
                    max = ans;
                }
                System.out.println("Ans:------------" + ans);
            }

        }
        System.out.println("-----END-----" + max);
    }


}
