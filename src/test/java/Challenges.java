import org.junit.Test;

import java.util.*;

public class Challenges {

    @Test
    public void challenges() {
        findAllPalindromesUsingBruteForceApproach("kabbaa");
    }

    public int reverseNum(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num/10;
        }
        return revNum;
    }

    public String rev1(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >=0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public Set<String> findAllPalindromesUsingBruteForceApproach(String word) {
        HashSet<String> palindromes = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                if (isPoland(word.substring(i, j))) {
                    palindromes.add(word.substring(i, j));
                }
            }
        }
        System.out.println(palindromes.toString());
        return palindromes;
    }

    public int IntegersAmount(int[] arr) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i <= arr.length; i++) {
            if (bucket.containsKey(arr[i])) {
                int result = bucket.get(arr[i]);
                bucket.put(arr[i], result + 1);
            }
            else {
                bucket.put(arr[i],i);
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(bucket.get(arr[i]) > 0) {
                max = bucket.get(arr[i]);
            }
        }
        return max;
    }




    public boolean isPoland(String word) {
        if(word.length()<2) {
            return false;
        }
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if(word.charAt(i)!=word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

//    public void prime(int num) {
//        if (num < 2) {
//            System.out.println("not");
//        }
//        for(int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                System.out.println("not");
//            }
//        }
//        System.out.println("yes");
//    }
//
//    public Boolean exampleOne(String word) {
//        int i = 0;
//        for(int j = word.length() - 1; j > i; j--) {
//            if(word.charAt(i)!=word.charAt(j)) {
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//
//
//
//
        boolean isPalindrome(String word) {
        int j = 0;
        for (int i = word.length() - 1; i >= word.length() / 2; i--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            j++;
        }
        return true;
    }
//
//
//
//
//
//    public boolean isElement(int[] arr, int target) {
//       for(int  i = 0; i < arr.length; i++){
//           if(arr[i] == target){
//               return true;
//           }
//       }
//       return false;
//    }


    // {20, 30, 1, -4, 8, 11}
    // Выучить все по массивам
    //[[20,30], [1, -4], [8, 11], [3]]

//    public void more(int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                arr[i] = arr[i] + arr[i];
//            } else if (arr[i] < 0) {
//                arr[i] = arr[i] / 2;
//            }
//        }
//        for(int a : arr){
//            System.out.println(a);
//        }
//
//    }

    // сложение строк
    // '123456789' и '87481'


    public boolean nature(int ono) {
        if(ono < 2) {
            return false;
        }
        for(int i = 2; i < ono; i++){
            if(ono % i==0){
                return false;
            }
        }
        return true;
    }

























    public void reverseNumber(int num) {
        int rev = 0;
        while (num!=0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
    }

    public void myPalindrome(int num) {
        if (num < 2) {
            System.out.println("not");;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not");
            }
        }
        System.out.println("yes");
    }






    public void myMax(int[] arr){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(secondMax < arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(firstMax < arr[i]){
                firstMax = arr[i];
            }
        }
        System.out.println(firstMax);
    }

    public static void man(String word, String target) {
        int count = 0;
        for (int i = 0; i <= (word.length() - target.length()); i++) {
            boolean match = true;
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) != word.charAt(i+j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                i = target.length() + i;
                count = count + 1;
            }
        }
        System.out.println(count);;
    }
















    public void commonCharacter(String word, String wordTarget) {
        HashSet<Character> bucket = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (!bucket.contains(word.charAt(i))) {
                bucket.add(word.charAt(i));
            }
        }
        for (int i = 0; i < wordTarget.length(); i++) {
            if (bucket.contains(wordTarget.charAt(i))) {
                System.out.println(wordTarget.charAt(i));
            }
        }
    }

    public void commonChar(String word, String wordTarget) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < wordTarget.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    System.out.println(word.charAt(i));
                }
            }
        }
    }


    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    //sorting
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //printing sorted array
        for (int a : arr) {
            System.out.println(a);
        }
        return arr;
    }

    public void duplicate(String arr) {
        HashMap<Character, Integer> bucket = new HashMap<>();
        for (int i = 0; i < arr.length(); i++) {
            if (!bucket.containsKey(arr.charAt(i))) {
                bucket.put(arr.charAt(i), 1);
            } else if (bucket.containsKey(arr.charAt(i))) {
                int a = bucket.get(arr.charAt(i));
                bucket.put(arr.charAt(i), a + 1);
            }
        }
        for (int i = 0; i < arr.length(); i++) {
            int b = bucket.get(arr.charAt(i));
            if (b > 1) {
                System.out.println(arr.charAt(i));
            }
        }
    }






    /*
    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int a : arr){
            System.out.println(a);
        }
        return arr;

    }*/

    public int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            int element = a[j];
            while (j >= 0 && a[j] > element) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = element;
        }
        return a;
    }

//    public int bunarySearch(int[] arr, int x){
//      int b = 0;
//      int e = arr.length - 1;
//      while (b <=e){
//          int m = (b + e)/2;
//          if(x > arr[m]){
//              b = m + 1;
//          }
//          else if(x < arr[m]){
//              e = m - 1;
//          }
//          else{
//              System.out.println(arr[m]);
//              return arr[m];
//          }
//      }
//      return -1;
//    }


//contains(arr, 9);
    //sum(arr, 6);
    //int[] a = {1, 5, 6, 8, 9}
    //printLn(a);
    //int[] a = {1, 2, 3, 4, 5, 6};
    //reverseArr(a);
    //String a = "Roma";
    //myReverse(a);
    //FizzBuzz(20);
    //String word = "bibasabasu";
    //count(word);

    //        String words = "balabolka";
//        String work = "bkazzh";
//        printRepeatNumbers(words,work);
//       int [] arr = {4, 8, 2, 5, 1, 6};
//       sortArray(arr);

    //'(', ')', '{', '}', '[' and ']',
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                char temp = stack.peek();
                if (temp == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (temp == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (temp == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public boolean valid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                char top = stack.peek();
                if (top == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (top == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (top == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }










    public int howMany(String word, String target) {
        int count = 0;
        int finalCount = target.length();
        int totalCount = 0;
        PriorityQueue<Character> queue = new PriorityQueue<>();
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));
        }

        while (!queue.isEmpty()) {
            int i = 0;
            while(i < target.length()) {
            if (queue.peek() == target.charAt(i)) {
                count += 1;
                queue.poll();

                if (count == finalCount) {
                    totalCount += 1;
                }
            } else if (queue.peek() != target.charAt(i)) {
                queue.poll();
            }
        }

    }
        System.out.println(totalCount);
        return totalCount;
    }





//       int target =
//        reverseWord(word);
//    }
        //    public static void main(String[] args) {
//        PracticeStack theStack = new PracticeStack(10);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//
//        while (!theStack.isEmpty()) {
//            long value = theStack.pop();
//            System.out.println(value);
//        }
//
//    class Solution {
//        public int[] twoSum(int[] arr, int target) {
//            HashSet<Integer> bucket = new HashSet<>();
//            for(int i = 0; i < arr.length; i++) {
//                if(bucket.contains(target - arr[i])){
//                    int j = target - arr[i];
//                    return new arr[] {i, j} ;
//                }
//                bucket.add(arr[i]);
//            }
//        }
////    }
//
//    }
//
//    public void reverseString(String word){
//    int i = 0;
//    int j = word.length() - 1;
//    while (i < j){
//            char temp = word.charAt(i);
//            word.charAt(i) = word.charAt(j);
//            word.charAt(j) = temp;
//        i++;
//        j--;
//        }
//
//    }
//        for(int ar : arr){
//            System.out.println(ar);
//     }
//
//        }


//    public void reverseWord(String hello) {
//        PracticeStack theStack = new PracticeStack(hello.length());
//
//        for(int i=0; i < hello.length(); i++) {
//            theStack.push(hello.charAt(i));
//        }
//        while (!theStack.isEmpty()) {
//            Character value = theStack.pop();
//            System.out.print(value);
//        }
//    }

//    Given nums = [2, 7, 11, 15], target = 9,


        // String. How many times characters is repeated. And print all hashMap.
//
//        //
//        private void count(String word) {
//            LinkedHashMap<Character, Integer> bucket = new LinkedHashMap<>();
//            for (int i = 0; i < word.length(); i++) {
//                if (bucket.containsKey(word.charAt(i))) {
//                    int j = bucket.get(word.charAt(i));
//                    bucket.put(word.charAt(i), j + 1);
//                } else {
//                    bucket.put(word.charAt(i), 1);
//                }
//            }
//
//            for (Map.Entry<Character, Integer> iterator : bucket.entrySet()) {
//                System.out.println(iterator);
//            }
//        }
//
//        // print how many times the characters are repeated in the word.
//
//
//        private void example(String word) {
//            LinkedHashMap<Character, Integer> bucket = new LinkedHashMap<>();
//            for (int i = 0; i < word.length(); i++) {
//                if (bucket.containsKey(word.charAt(i))) {
//                    int value = bucket.get(word.charAt(i));
//                    bucket.put(word.charAt(i), value + 1);
//                } else {
//                    bucket.put(word.charAt(i), 1);
//                }
//            }
//            for (Map.Entry<Character, Integer> iterator : bucket.entrySet()) {
//                System.out.println(iterator);
//            }
//        }
//
//
//        private void printRepeatNumbers(String original, String target) {
//            HashSet<Character> bucket = new HashSet<>();
//            for (int i = 0; i < original.length(); i++) {
//                if (!bucket.contains(original.charAt(i))) {
//                    bucket.add(original.charAt(i));
//                }
//            }
//            for (int i = 0; i < target.length(); i++) {
//                if (bucket.contains(target.charAt(i))) {
//                    System.out.println(target.charAt(i));
//                }
//            }
//        }
//    }


//
//    String [] pair_left = {"john", "john", "john", "mary", "mary"};
//    String [] pair_right = {"tom", "mary", "tom", "anna", "anna"};
//    //count(pair_left ,pair_right, 5);
//
//
//    int count (String[] pair_left, String[] pair_right) {
//        int count = 0;
//        HashSet<String> bucket = new HashSet<>();
//        for(int i = 0; i < pair_left.length; i++){
//            if(!bucket.contains(pair_left[i] + " " + pair_right[i])){
//                bucket.add(pair_left[i] + " " + pair_right[i]))
//                count+=1;
//                System.out.println(count);
//            }
//            else {
//                System.out.print(count);
//            }
//        }
//
//    }


    // t = 5
    //pair_left = [“john”, “john”, “john”, “mary”, “mary”]
    //pair_right = [“tom”, “mary”, “tom”, “anna”, “anna”]

//        private void count (String[] arrLeft, String[] arrRight, int n) {
//            int count = 0;
//            HashSet<ArrayList> bucket = new HashSet<>();
//            for(int k = 0; k < n - 1; k ++) {
//                ArrayList<String> list = new ArrayList<>(k);
//                list[k]
//            }
//            for(int i = 0; i < arrLeft.length; i++){
//                for(int j = 0; j < arrRight.length; j++){
//                    list.add(arrLeft[i]);
//                    list.add(arrRight[j]);
//                    if(!bucket.contains(list)){
//                        bucket.add(list);
//                        count =+1;
//                    }
//                }
//            }
//            System.out.println(count);
//        }

//    public void FizzBuzz(int num) {
//        for (int i = 1; i <= num; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz ");
//            } else if (i % 3 == 0) {
//                System.out.println("Buzz ");
//            } else if (i % 5 == 0) {
//                System.out.println("FizzBuzz ");
//            } else {
//                System.out.println(i + " ");
//            }
//        }
//    }
//
//    private void contains (int[]arr, int m) {
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i]==m) {
//                System.out.println("Contain");
//            } else {
//
//            }}
//    }
//
    //Find 2 max elements:

//
////    boolean isPalindrome(String word) {
////        int j = 0;
////        int length = word.length();
////        for (int i = length - 1; i >= length / 2; i--) {
////            if (word.charAt(i) != word.charAt(j)) {
////                return false;
////            }
////            j++;
////        }
////        return true;
////    }
//
    boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
//
//    boolean isItPrime(int num) {
//        if(num < 2){
//            return false;
//        }
//        for(int i  = 2; i < num; i++) {
//            if(i % num == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//
//    boolean isPalindrome(String word) {
//        int i = 0;
//        int length = word.length();
//        for(int j = length -1; j >= length/2; j--){
//            if(word.charAt(i)!=word.charAt(j)){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//
//
//    // hello , hi
//
//    // first non repeat char
//
//
//
//
//
//
//
//    private void reverseArr ( int[] arr){
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.print("Reversed array is ");
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//    }
//
//
////        for(int i = 0, j = arr.length-1; i < j; i++, j--){
////            int temp = arr[i];
////            arr[i] = arr[j];
////            arr[j] = temp;
////            System.out.println(arr[i]);
//
//
////    class Solution {
////        public boolean isPalindrome(int x) {
////            if(x < 0) {
////                return false;
////            } else if(x % 10 == 0){
////                return false;
////            } else if(x == 0){
////                return false;
////            }
////
////            int revertedNumber = 0;
////            while( x > revertedNumber){
////                revertedNumber = revertedNumber * 10 + x % 10;
////                x /=10;
////            }
////            return x == revertedNumber || x==revertedNumber/10;
////        }
////    }
//
//
//        private void swap ( int a, int b){
//            System.out.println("a: " + a + " b: " + b);
//            int temp = a;
//            a = b;
//            b = temp;
//            System.out.println("a: " + a + " b: " + b);
//        }
//
//        private int[] swap ( int arr[], int seq1, int seq2){
//            print(arr);
//            int temp = arr[seq1 - 1];
//            arr[seq1 - 1] = arr[seq2 - 1];
//            arr[seq2 - 1] = temp;
//            return arr;
//        }
//
//        private void print ( int[] arr){
//            for (int el : arr) {
//                System.out.print(el + " ");
//            }
//            System.out.println();
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//
//        private void goal ( int a){
//            if (a % 3 == 0 && a % 4 == 0) {
//                System.out.println("divisible by 3 AND 4");
//            } else if (a % 3 == 0) {
//                System.out.println("divisible by 3");
//            } else if (a % 5 == 0) {
//                System.out.println("divisible by 4");
//            } else {
//                System.out.println("not divisible");
//            }
//        }
//
//
//        private void goals ( int a){
//            if (a % 2 == 0 && a % 5 == 0) {
//                System.out.println("divisible by 2 AND 5");
//            } else if (a % 2 == 0) {
//                System.out.println("Divisible by 2");
//            } else if (a % 5 == 0) {
//                System.out.println("Divisible by 5");
//            } else
//                System.out.println("not divisible by 2 either 5");
//        }
//
//        //print all even number of an array
//
//        private void printEven ( int[] ar){
//            for (int i = 0; i < ar.length; i++) {
//                if (ar[i] % 2 == 0) {
//                    System.out.println("Divisible");
//                }
//            }
//
//        }
//
//        private void print ( int num){
//            for (int i = 1; i <= num; i++)
//                if (i % 15 == 0) {
//                    System.out.print("FizzBuzz ");
//                } else if (i % 3 == 0) {
//                    System.out.print("Fizz ");
//                } else if (i % 5 < 0) {
//                    System.out.print("Buzz ");
//                } else {
//                    System.out.print(i + " ");
//                }
//        }
//
//        private void printLn ( int[] a){
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] == 5) {
//                    System.out.println("Contains");
//                }
//            }
//        }
//
//        String[] strArray = {"Hi", "There", "Hello"};
//        Integer[] integers = {3, 5, 2, 3, 8};
//
//        private boolean contains (Object[]arr, Object toFind){
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals(toFind)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//
//        private String reverseSentence (String sentence){
//            String reverseSentence = "";
//            String[] arr = sentence.split(" ");
//
//            for (int i = arr.length - 1; i >= 0; i--) {
//                reverseSentence += arr[i] + " ";
//            }
//            return reverseSentence;
//        }
//
//        private String reverse (String str){
//            String reversed = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                reversed += str.charAt(i);
//            }
//            return reversed;
//        }
//
//        private void myReverse (String str){
//            String reverse = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                reverse = reverse + str.charAt(i);
//            }
//            System.out.println(reverse);
//
//        }
//
//
//        private boolean sum ( int[] arr, int sum){
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] + arr[j] == sum) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//
//        }
//
//
//        // {3, 5, 8, 3 ,11 ,1}
//        private int[] sort ( int[] arr){
//            for (int i = 0; i < arr.length; i++) {
//
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] > arr[j]) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//            return arr;
//        }








