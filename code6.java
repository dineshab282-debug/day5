class animal {
    animal() {
        System.out.println("hello");
    }

    void run() {
        System.out.println("animal running");
    }
}

class dog extends animal {
    dog() {
        super();
    }

    void run() {
        super.run(); // calls animal's run()
        System.out.println("dog running");
    }

    void sound() {
        System.out.println("hi");
    }
}

class code6 {
    public static void main(String[] args) {
        dog dg = new dog();
        dg.run();
        dg.sound();
    }
}
