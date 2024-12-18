package com.Introduction2;

class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

public class InnerClasses {
//      making this static method
//    static class Test{
//        String name;
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    public static void main(String[] args) {
        Test obj = new Test("Piyush");
    }
}
