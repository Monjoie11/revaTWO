package reva.two;

public class A {
  void m(){System.out.println("hello m");}
  void n(){
    System.out.println("hello n");
//m();//same as this.m()
    this.m();  // By default added by the compiler
  }
}
class Animal{
  void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
  void eat(){System.out.println("eating bread...");}
  void bark(){System.out.println("barking...");}
  void work(){
    super.eat();  // Calling the parent class eat() method using super keyword
    bark();
  }
}
class TestSuper2{
  public static void main(String args[]){
    Dog d=new Dog();
    d.work();
  }}