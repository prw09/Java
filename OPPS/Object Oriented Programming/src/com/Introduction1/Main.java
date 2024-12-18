package com.Introduction1;


public class Main {
    public static void main(String[] args) {
//        Student details = new Student();
//        System.out.println(details.name);
//        System.out.println(details.roll_number);
//        System.out.println(details.marks);
//        Student desc = new Student();
//        System.out.println(desc.name);
        Student student = new Student("Piyush", 34, 85.80f);
//        System.out.println(student.name);
//        System.out.println(student.roll_number);
//        System.out.println(student.marks);

        Student random = new Student(student);
//        System.out.println(random.name);
//        System.out.println(random.roll_number);
//        System.out.println(random.marks);

        Student bala = new Student("Bala", 44, 78.5f);
//        System.out.println(bala.name);
//        System.out.println(bala.marks);
//        System.out.println(bala.roll_number);

        Student one = new Student();
        Student two = one;

        one.name = "Abhiraj";
        System.out.println(two.name);
    }

      static class Student {
        String name;
        int roll_number;
        float marks;

        Student (Student other){
            this.name = other.name;
            this.marks = other.marks;
            this.roll_number = other.roll_number;

        }
        Student(){
            this("Ram",45, 91.2f);
        }

        Student(String name, int roll_number, float marks) {
            this.name = name;
            this.roll_number = roll_number;
            this.marks = marks;
        }
      }

}
