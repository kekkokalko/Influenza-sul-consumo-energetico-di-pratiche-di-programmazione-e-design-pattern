class Parent{
    public Parent(){
    }
    public void showP(){
        System.out.println("Ciao! Sono la classe Parent!");
    }
}

class Child extends Parent{

    public Child(){}
    public void showC(){
        System.out.println("Ciao! Sono la classe Child!");

    }
}

public class AfterInheritance{
    public static void main(String[]args){
        Parent p = new Parent();
        Parent c = new Child();
    }
}
