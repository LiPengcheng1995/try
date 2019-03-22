package com;

import java.io.IOException;

/**
 * 字符串池的问题，大概想明白了。
 * <p>
 * "李"，"四"，"李四"是在编译加载时就创建的变量，所以在创建str1时，如果我们执着于运行时，
 * 其实只创建了在堆中创建了1个String对象。指向字符串池中的"李四"。
 * <p>
 * 所以第一个返回的是false：因为等号左边是堆中对象的引用，右边是字符串常量池中的"李四"
 * 第二个返回的是false： 在java7以后做了优化， intern() 返回的是第一个出现的实例，由
 * 于"李四"是在编译加载时创建的，所以等号左边是"李四"，右边是堆中的String对象。
 * <p>
 * <p>
 * 改变：注释掉第一个 print。返回是什么？
 * 因为只有"李"，"四"。所以我们在编译加载时只创建了这两个。
 * 在创建str1时我们在堆中创建了一个String对象，字符串常量池中记录了创建了这个实例的地址，所以
 * 在后面调用intern（）时返回创建的第一个"李四"实例，就是str1指向的堆中的对象，所以：
 * 等号左边是堆中的对象，右边也是，所以输出true。
 *
 * @author lipengcheng3 Created date 2019-03-20 14:42
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        String str1 =  new StringBuilder("李").append("四").toString();
//
//
//        System.out.println(str1 == "李四");
//        System.out.println(str1.intern() == str1);


        // 个人尝试
        // 这个就很清晰了
        String str1 = new StringBuilder("李").append("四").toString();
        String str2 = new StringBuilder("李").append("四").append("天").toString().substring(0,2);

        System.out.println(str1 == str2);
        System.out.println(str1 == str1.intern());
        System.out.println(str2 == str2.intern());
        System.out.println(str1 == str2.intern());
        System.out.println(str1.intern() == str2.intern());
    }
}
