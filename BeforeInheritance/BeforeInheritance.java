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

public class BeforeInheritance{
    public static void main(String[]args){
        for(int i=0;i<10000;i++){
        Parent p = new Parent();
        Child c = new Child();}
    }
}
