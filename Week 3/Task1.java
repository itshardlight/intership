
public class Task1 {
    public static void main(String[] args) {
        StudentTask1 objStd = new StudentTask1();
        objStd.setName("Ram Thapa");
        objStd.setRoll_number(12);
        objStd.setMark_sub1(55);
        objStd.setMark_sub2(68);
        objStd.setMark_sub3(89);
        System.out.println("Average of 3 Subject: " + objStd.averageMarks());
        System.out.println(objStd.toString());
    }
}