class animal{
    animal(){
        System.out.println("hello");
    }
}
class dog extends animal{
    dog(){
        super();
    }
    void sound(){
        System.out.println("hi");
    }
}
class code5{
    public static void main(String[] args) {
        dog dg=new dog();
        dg.sound();
        
    }
}