package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = new int[]{3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
    }
    
    private static StringBuilder maxNumberFromDigits(int[] digits){
        Arrays.sort(digits);
        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= digits.length; i++){//С инкрементом
//            stringBuilder.append(digits[digits.length - i]);
//        }
        for (int i = digits.length -1; i >= 0; i--){//С декрементом
            stringBuilder.append(digits[i]);
        }
        return stringBuilder;//Integer.parseInt(String.valueOf(stringBuilder)) можно сразу перевести в число
        /*return String.join("",Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));*///Stream способ
    }
}
