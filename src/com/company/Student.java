package com.company;

/**
 * @Date: 2019/2/2 0002 19:26
 * @Author: Luck
 */
public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)",name,score);
    }

    public static void main(String[] args) {
        Array<Student> arr=new Array<>();
        arr.addLast(new Student("Alice",90));
        arr.addLast(new Student("Bob",86));
        arr.addLast(new Student("Peter",89));
        System.out.println(arr.toString());
    }
}
