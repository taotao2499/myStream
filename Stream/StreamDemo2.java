package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        //单列集合
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "周杰伦", "蔡依林", "林俊杰", "周晓晓");

//        Stream<String>  stream1 = list1.stream();
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //简化
        list1.stream()
                .forEach(s -> System.out.println(s));

        //双列集合
        //创建双列集合
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("周杰伦", 18);
        hm.put("蔡依林", 20);
        hm.put("林俊杰", 22);
        hm.put("周晓晓", 19);

        //获取键值对
        hm.entrySet().stream()
                .forEach(entry -> System.out.println(entry));

        //第二种方式获取键值对
        hm.keySet().stream().forEach(s -> System.out.println(s));



        //数组  Arrays工具类中的静态方法
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"周杰伦", "蔡依林", "林俊杰", "周晓晓"};
        //获取流
        Arrays.stream(arr1).forEach(s -> System.out.println(s));
        System.out.println("======================");
        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        System.out.println("======================");
        //一堆零散数据
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(s -> System.out.println(s));
        System.out.println("======================");
        Stream.of("周杰伦", "蔡依林", "林俊杰", "周晓晓").forEach(s -> System.out.println(s));



    }
}
