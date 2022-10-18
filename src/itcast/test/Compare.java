package itcast.test;


import itcast.Student;

public class Compare {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(12);
        Student s2 = new Student();
        s2.setUsername("李四");
        s2.setAge(6);
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }
    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        //result<0 则c1比c2小
        //result>0 则c1比c2大
        //=0 一样大
        if(result>0){
            return c1;
        }else {
            return c2;
        }
    }
}
