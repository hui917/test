import Bean.StuBean;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author:liudenghui
 */
public class Test {

    private static List<StuBean> sl;

    public static void main(String[] args) {

        StuBean bean1 = new StuBean(1, "123");
        StuBean bean2 = new StuBean(2, "234");

        sl = new ArrayList<>();
        sl.add(bean1);
        sl.add(bean2);

        //开始实验
        List<Integer> uuid = new ArrayList<>();
        List<String> name = new ArrayList<>();

        uuid = sl.stream().map(StuBean::getUuid).collect(Collectors.toList());
        name = sl.stream().map(StuBean::getName).collect(Collectors.toList());

        System.out.println(uuid);
        System.out.println(name);

        System.out.println("=======================");

        List<Integer> test = Arrays.asList(123, -1, 10, 7, 0);

        Collections.sort(test);
        System.out.println("排序：从小到大");
        System.out.println(test);

        Collections.reverse(test);
        System.out.println("反转：");
        System.out.println(test);

        int[] a = {-10,6,0,12,1,3};

        Arrays.sort(a);

        String str = "a,b,c,d,e";

        for(String orgIdTemp : str.split(",")){
            System.out.println(orgIdTemp);
        }

    }
}
