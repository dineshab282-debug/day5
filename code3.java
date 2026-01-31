 class animal{
    void sound(){
    System.out.println("animals makes sound");
}
}
class cat extends animal{
    void eat(){
        System.out.println("cat eat");
    }
}
class dog extends mammal{

void walk(){
    System.out.println("dog walk");
} 
}
class code3{
    public static void main(String[] args) {
        cat ca=new cat();
        dog dg=new dog();
        ca.eat();
       dg.walk();
        
    }
}


