import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter {

    public Long countNonUnique(List<Integer> numbers ){


        Map<Integer, Long> numbersOrdered = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long nonUniqueAmount = 0l;
        for (Integer numberOrdered : numbersOrdered.keySet()) {
            if (numbersOrdered.get(numberOrdered) > 1){
                nonUniqueAmount ++;
            }
        }

        return nonUniqueAmount;
    }


    public static void main(String[] args) {
        Counter c  =  new Counter();

        List<Integer> test = new ArrayList<>();
        test.add(1);test.add(3);test.add(3);test.add(4);test.add(4);

        System.out.println(c.countNonUnique(test));
    }
}
