class Parent{
    public Parent(){}
    public void show(){
        System.out.println("Ciao! Sono la classe Parent!");
    }
}

class Child extends Parent{
    public Child(){}
    @Override
    public void show(){
        System.out.println("Ciao! Sono la classe Child!");
    }
}


public class AfterOverride {
    public static void main(String[]args){
        for(int i=0;i<1000000;i++){
        Parent p = new Parent();
        p.show();
        Parent p1 = new Child();
        p1.show();}
    }
}
