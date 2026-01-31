class animal{
    void sound(){
    System.out.println("animals makes sound");
}
}
class mammal extends animal{
    void eat(){
        System.out.println("mammal eat");
    }
}
class Human extends mammal{

void walk(){
    System.out.println("Human walk");
} 
}
class code2{
    public static void main(String[] args) {
        mammal ml=new mammal();
        Human hm=new Human();
        ml.eat();
       hm.walk();
        
    }
}

    

