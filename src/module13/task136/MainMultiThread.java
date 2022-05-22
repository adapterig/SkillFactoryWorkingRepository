package module13.task136;

import java.util.*;

public class MainMultiThread {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        SearchingMax searchingMax = new SearchingMax(generateList(true));
        SortingArray sortingArray = new SortingArray(generateList(false));
        RemovingArrayByIndexes removingArrayByIndexes = new RemovingArrayByIndexes(generateList(true));
        searchingMax.start();
        sortingArray.start();
        removingArrayByIndexes.start();
        try {
            searchingMax.join();
            sortingArray.join();
            removingArrayByIndexes.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }

    static List<Integer> generateList(boolean ascending) {
        List<Integer> numbers = new ArrayList<>();
        int size = 10000000;
        if (ascending) {
            for (int i = 1; i <= size; i++) {
                numbers.add(i);
            }
        } else {
            for (int i = size; i >= 1; i--) {
                numbers.add(i);
            }
        }
        return numbers;
    }

}

class SearchingMax extends Thread {
    List<Integer> numbers;

    SearchingMax(List<Integer> numbers) {
        this.numbers = numbers;

    }

    public void run() {
        int max = Collections.max(numbers);
        System.out.println("Max found: " + max);
    }
}

class SortingArray extends Thread {
    List<Integer> numbers;

    public SortingArray(List<Integer> unsorted) {
        this.numbers = unsorted;
    }

    public void run() {
        Collections.sort(numbers);
        System.out.println("List is sorted now");
    }
}

class RemovingArrayByIndexes extends Thread {
    List<Integer> numbers;

    public RemovingArrayByIndexes(List<Integer> list) {
        this.numbers = list;
    }

    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= list.size(); i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");
    }
}