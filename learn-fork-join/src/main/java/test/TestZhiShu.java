package test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * 筛选1～1000中的质数
 *
 * @author lipengcheng3 Created date 2019-03-15 15:42
 */
public class TestZhiShu {

    /**
     * 最基本的
     */
    public static List<Integer> method1(){
        return IntStream.range(1,100)
                .parallel()
                .filter(
                        (x)->IntStream.range(2,x)
                                .noneMatch(temp->x%temp == 0)
                )
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * 改进，只需要除以小于开平方之后的即可
     */
    public static List<Integer> method2(){
        return IntStream.range(1,100)
                .parallel()
                .filter(
                        (x)->IntStream.range(2, (int) Math.sqrt(x))
                                .noneMatch(temp->x%temp == 0)
                )
                .boxed()
                .collect(Collectors.toList());

    }


    /**
     * 改进，只需要除质数即可
     */
    public static void method3(){

    }


    public static void main(String[] args){
       method2();
    }




}
