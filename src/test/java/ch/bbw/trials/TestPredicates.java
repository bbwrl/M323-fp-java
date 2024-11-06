package ch.bbw.trials;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class TestPredicates {

    private List<Integer> numbers = Arrays.asList(15, 5, 20, 10);

    @Test
    public void testPredicate() {
        Predicate<Integer> isGreaterThanTen = (num) -> num > 10;
        numbers.stream()
                .filter((num) -> num > 10)
                .forEach(System.out::println);
    }

    @Test
    public void testComparator() {
        Comparator<Integer> comparator = (n1, n2) -> n1.compareTo(n2);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        sortedNumbers.forEach(System.out::println);
    }

}
