package lv.javaguru.demo.HomeWork.Lection6.ArrayService;

public class LookupArrayService {
    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

//    public int findMin(int[] array) {    }
//
//    public int indexOfMax(int[] array) {    }
//
//    public int indexOfMin(int[] array) {    }
//
//    public int indexOf(int[] array, int value) {    }
}
