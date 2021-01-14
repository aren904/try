package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> collect = list.stream().map(i -> i + 1).collect(Collectors.toList());
        System.out.println(collect);

    }
}
