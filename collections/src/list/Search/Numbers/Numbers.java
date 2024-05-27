package list.Search.Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {
    private List<Integer> numbers;

    public Numbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> sortAscending() {
        List<Integer> sortedAscending = new ArrayList<>(numbers);

        Collections.sort(sortedAscending);

        return sortedAscending;
    }

    public List<Integer> sortDescending() {
        List<Integer> sortDescending = new ArrayList<>(numbers);

        Collections.sort(sortDescending, Collections.reverseOrder());

        return sortDescending;
    }

    public int calculateTotal() {
        int total = 0;

        for (Integer integer : numbers) {
            total += integer;
        }

        return total;
    }

    public int findLargest() {
        int largest = numbers.get(0);

        for (Integer number : numbers) {
            if (number >= largest) {
                largest = number;
            }
        }

        return largest;
    }

    public int findSmallest() {
        int smallest = numbers.get(0);

        for (Integer number : numbers) {
            if (number <= smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public List<Integer> showNumbers() {
        return numbers;
    }
}
