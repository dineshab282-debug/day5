class animal{
    void sound(){
        System.out.println("Hello");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("hi");
    }
}
class code4{
    public static void main(String[] args) {
        dog dg=new dog();
        dg.sound();
    }
}