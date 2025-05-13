package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo5 {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //遍历
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("======================");
        //        count
        //        统计个数
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("======================");
        //   toArray
        //        把流中的元素，存储到数组中
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));


    }
}
