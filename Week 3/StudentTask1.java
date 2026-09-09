public class StudentTask1 {
    private String name;
    private int roll_number;
    private float mark_sub1;
    private float mark_sub2;
    private float mark_sub3;

    StudentTask1() {
        System.out.println("This is Constructor!!");

    }

    public float averageMarks() {
        return (mark_sub1 + mark_sub2 + mark_sub3) / 3;
    }

    @Override
    public String toString() {
        return "Name of the Student is " + name + ", With roll number " + roll_number + ", Obtained marks in Maths: "
                + mark_sub1 + ", Obtained marks in Science:" + mark_sub2 + ", Obtained marks in Nepali:" + mark_sub3;
    }

    public String getString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public float getMark_sub1() {
        return mark_sub1;
    }

    public void setMark_sub1(float mark_sub1) {
        this.mark_sub1 = mark_sub1;
    }

    public float getMark_sub2() {
        return mark_sub2;
    }

    public void setMark_sub2(float mark_sub2) {
        this.mark_sub2 = mark_sub2;
    }

    public float getMark_sub3() {
        return mark_sub3;
    }

    public void setMark_sub3(float mark_sub3) {
        this.mark_sub3 = mark_sub3;
    }

}