class animal{
    void sound(){
    System.out.println("animals makes sound");
}
}
class dog extends animal{
    void bark(){
        System.out.println("dog bark");
    }
}
class code1{
    public static void main(String[] args) {
        dog dg=new dog();
        dg.sound();
        dg.bark();
        
    }
}