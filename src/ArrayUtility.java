public class ArrayUtility {

    public static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + ", ");
        }
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double average(int[] array) {
        double average = (double) sum(array)/array.length;
        int big = (int) (average * 100.0);
        return (double) big / 100.0;
    }

    public static int minimum(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int maximum(int[] array) {
        int biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = reverseOne(array)[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String s : array) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += String.valueOf(array[i]);
            result += ", ";
        }
        return result.substring(0, result.length() - 2);
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for (int j = 0; j < array.length - 1; j++) {
            array[j+1] = temp[j];
        }
        array[0] = temp[array.length - 1];
    }

    public static void shiftLeft(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for (int j = 0; j < array.length - 1; j++) {
            array[j] = temp[j+1];
        }
        array[array.length - 1] = temp[0];
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        for(int i = 0; i < n; i++) {
            array[i] = temp[temp.length- n + i];
        }
        for(int j = n; j <array.length; j++) {
            array[j] = temp[j - n];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for(int i = 0; i < array.length-n; i++) {
            array[i] = temp[i+n];
        }
        for(int j = array.length - n; j < array.length; j++) {
            array[j] = temp[j - (array.length - n)];
        }
    }


}
