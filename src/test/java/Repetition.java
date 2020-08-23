import com.sun.codemodel.internal.JForEach;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Repetition {

    @Test
    public void repetition() {
        int[] arr = {-1,4,-3,8,9,5,5};
        example(arr);
    }

    //TODO email: name@domain.extension.optionalField

    //TODO /^([a-z\d\.-]+)@([a-z\d-]+)\.([a-z]{2,12})(\.[a-z]{2,12})?$/


    public void example(int[] arr) {
        try {
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println("Out of boundary");
        }
    }


    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a: arr
             ) {
            System.out.println(a);
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = min; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int a: arr
        ) {
            System.out.println(a);
        }
        return arr;
    }

    public int mostRepeated(int[] arr) {
        HashMap <Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(bucket.containsKey(arr[i])) {
                int currentKey = bucket.get(arr[i]);
                bucket.put(arr[i], 1 + currentKey);
            }
            else {
                bucket.put(arr[i], 1);
            }
        }
        int max = 0;
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int current = bucket.get(arr[i]);
            if(current > max) {
                max = current;
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
        return maxElement;
    }

        public boolean primeOrNot(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {   //i * i
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // moveZeroes
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public char mostRepeated(String a) {
        HashMap<Character, Integer> bucket = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(bucket.containsKey(a.charAt(i))) {
                int currentKey = bucket.get(a.charAt(i));
                bucket.put(a.charAt(i), currentKey + 1);
            } else {
                bucket.put(a.charAt(i), 1);
            }
        }

        Iterator it = bucket.entrySet().iterator();
        int maxValue = 0;
        Character winner = a.charAt(0);
        while (it.hasNext()) {
             Map.Entry pair = (Map.Entry) it.next();
             if ((Integer)pair.getValue() > maxValue) {
                 maxValue = (Integer)pair.getValue();
                 winner = (Character)pair.getKey();
             }
         }
        return winner;
    }


    public boolean integersPalindrome(int x) {
        int Xold = x;
        int reversedX = 0;
        while (x > 0) {
            reversedX = reversedX * 10 + x % 10;
            x /= 10;
        }
        return Xold == reversedX;
    }

    public boolean lettersPalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        while(i < j) {
            if(a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int maxDifference(int[] arr) {
        if (arr.length < 1) {
            return -1;
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max - min);
        return max - min;
    }


    public int sum(int[] arr) {
        int sum = 0;
        for (int result : arr) {
            sum += result;
        }
        System.out.println(sum);
        return sum;
    }



    public int revInt(int x) {
       int result = 0;
       while (x!=0) {
           int pop = x%10;
           x/=10;
           if(result>Integer.MAX_VALUE/10  || (result == Integer.MAX_VALUE/10 && pop >7)){
               return 0;
           }
           if(result<Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && pop <-8)) {
               return 0;
           }

           result = result*10 + pop;

       }
       return result;
    }

    public int[] sort(int [] arr) {
        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public boolean duplicate(String firstWord) {
        HashMap<Character, Integer> bucket = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++) {
            if (bucket.containsKey(firstWord.charAt(i))) {
                int addKey = bucket.get(firstWord.charAt(i));
                bucket.put(firstWord.charAt(i), addKey + 1);
            } else {
                bucket.put(firstWord.charAt(i), 1);
            }
        }
        for (int i = 0; i < firstWord.length(); i++) {
            int finalKey = bucket.get(firstWord.charAt(i));
            if (finalKey > 1) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target) {
        int a = 0;
        int b = arr.length - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            if (target < arr[c]) {
                b = c - 1;
            } else if (target > arr[c]) {
                a = c + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public int[] reverseArray(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        return arr;
    }


    private void reverseString(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            a += str.charAt(i);
        }
        System.out.println(a);
    }


    private void reversedArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

    //phone photo //if 4 don't print anything
    public void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizz ");
            } else if (i % 3 == 0) {
                System.out.println("Buzz ");
            } else if (i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 4 == 0) {

            } else {
                System.out.println(i + " ");
            }
        }
    }

    public void comonChar(String word, String targetWord) {
        HashSet<Character> bucket = new HashSet<>();
        for(int i = 0; i < word.length(); i++) {
            if(!bucket.contains(word.charAt(i))) {
                bucket.add(word.charAt(i));
            }
        }
        for(int i = 0; i < targetWord.length(); i++) {
            if(bucket.contains(targetWord.charAt(i))) {
                System.out.println(targetWord.charAt(i));
            }
        }
    }

    public int secondMax(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int n : arr) {
            if(n > firstMax) {
                secondMax = firstMax;
                firstMax = n;
            }
            else if(n > secondMax) {
                secondMax = n;
            }
        }
        return secondMax;
    }

    public Boolean exampleOne(String word) {
        int i = 0;
        for(int j = word.length() - 1; j > i; j--) {
            if(word.charAt(i)!=word.charAt(j)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public Boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Write a function, accepts integer argument, should print all the numbers up to the argument, but:
    //if number is multiple of 3, it should print Fizz instead of number
    //if number is multiple of 5, it should print Buzz instead of number
    //if it's multiple of both 3 and 5, it should print FizzBuzz instead of number

//    public void Buzz(int num) {
//        for(int i = 1; i <= num; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i + " ");
//            }
//        }
//    }
//
//    public void duplicate(int[] arr){
//        int j = 0;
//        int[] temp = new int[]{};
//        for(int i = 0; i < arr.length-1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j] = arr[arr.length-1];
//        for(int a : arr){
//            System.out.print(a);
//        }
//    }
//
//
//    public void sort(int[] arr){
//     for(int i = 0; i < arr.length-1; i++){
//         for(int j = i+1; j<arr.length-1; j++){
//            if(arr[i]>arr[j]){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j]=temp;
//            }
//         }
//
//     }
//        for(int a : arr){
//            System.out.println(a);
//     }
//    }
}




