package ch12.animal;

public class Test {
    static void main(String[] args) {
        Dog a = new Dog();
//        Animals paul = new Dog();
//        paul.eat();     //부모에게 물려받은 메서드
//        paul.bark();    //추가한 메서드
        animalCare(a);

//        Notebook book = new Notebook();
//        animalCare(book);

        Cat c = new Cat();
        animalCare(c);
    }

    static void animalCare(Animals a){
        a.eat();
        a.move();
        a.sleep();
//        a.bark();
//        a.liquefy();


    }

//    static void animalCare(Dog a){
//        a.eat();
//        a.sleep();
//        a.move();
//        a.bark(); // Animal에는 정의되어 있지 않음
//    }
//
//    static void animalCare(Cat a){
//        a.eat();
//        a.sleep();
//        a.move();
//        a.liquefy(); // Animal에는 정의되어 있지 않음
//    }



}
