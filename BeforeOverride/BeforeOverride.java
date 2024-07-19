impost java.util.*;

class Parent{
    public Parent(){
    }
    public void showP(){
        System.out.println("Ciao! Sono la classe Parent!");
    }
}

class Child{

    public Child(){}
    public void showC(){
        System.out.println("Ciao! Sono la classe Child!");

    }
}

public class BeforeOverride {
    public static void main(String[]args){
        for(int i=0;i<1000;i++){
        Parent p = new Parent();
        p.showP();
        Child c = new Child();
        c.showC();}
        System.out.println(i);
    }
}
