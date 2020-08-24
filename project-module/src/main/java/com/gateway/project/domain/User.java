//package com.gateway.project.domain;
//
//import org.apache.ibatis.jdbc.SQL;
//
///**
// * @author: lipengcheng3
// * @create: 2018-09-03 16:50
// * @description:
// **/
//public class User {
//    private int id;
//
//    private String name;
//
//    private int age;
//
//    public static String getUsersByAgeRange(int minAge, boolean minAgeClosed, int maxAge, boolean maxAgeClosed) {
//        String tmpMin = minAgeClosed ? ">=" : ">";
//        String tmpMax = maxAgeClosed ? "<=" : "<";
//
//        SQL sql = new SQL().SELECT("*").FROM("user").WHERE("age" + tmpMin + minAge, "age" + tmpMax + maxAge);
//
//        return sql.toString();
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
