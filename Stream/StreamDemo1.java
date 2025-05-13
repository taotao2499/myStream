package Stream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("周杰伦");
        list1.add("蔡依林");
        list1.add("林俊杰");
        list1.add("周晓晓");

        list1.stream()
                .filter(s -> s.startsWith("蔡"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

    }
}
