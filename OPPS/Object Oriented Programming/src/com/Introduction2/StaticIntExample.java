package com.Introduction2;

class StaticIntExample {
    static int staticVariable;

    // Static block for initialization
    static {
        staticVariable = 100;
        System.out.println("Static block executed.");
    }

    static int staticVariable01 = 50; // Inline initialization

    static {
        staticVariable01 += 50; // Additional logic in static block
    }

    static int staticVariable02 = initializeStaticVariable();

    // Static method for initialization
    static int initializeStaticVariable() {
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Static Variable: " + staticVariable);

    }
}
