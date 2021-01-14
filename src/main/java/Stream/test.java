package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setAge(43);
        user.setName("aren");
        users.add(user);
        User user2 = new User();
        user2.setName("aqwe");
        user2.setAge(2);
        users.add(user2);
        List<Integer> collect = users.stream().map(User::getAge).collect(Collectors.toList());
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(4);
        objects.add( new ArrayList<Integer>(integers));
        List<Integer> collect1 = users.stream().map(User::getAge).sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
        List<User> collect2 = users.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println(collect1);
        System.out.println(collect);
        System.out.println(objects);
        System.out.println(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }
}
