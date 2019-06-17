public class Parent
{
    //Declaring the variables to be used in class
    //Attributes
    int id;
    int item1;
    int item2;

    //Constructor
    Parent()
    {
        System.out.println(">> Parent Object Constructed ");
    }

    //Methods: The behaviour of objects
    //Methods fill the object with data
    void setParentBehavior(int id, int item1, int item2)
    {
        this.id=id;
        this.item1=item1;
        this.item2=item2;
    }

    //Reading Object Behaviour
    void showParentBehavior()
    {
        System.out.println("ID is id");
        System.out.println("Item1 is item1");
        System.out.println("Item2 is item2");
    }
}

//Entension of class
//Creating a Child Object
public class Child extends Parent
{

    int item3;

    //Constructor
    Child()
    {
        System.out.println(">> Parent Object Constructed ");
    }

    //Methods: The behaviour of objects
    //Methods fill the object with data
    void setParentBehavior(int id, int item1,int item2, int item3)
    {
        this.id=id;
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;
    }

    //Reading Object Behaviour
    void showParentBehavior()
    {
        System.out.println("ID is id");
        System.out.println("Item1 is item1");
        System.out.println("Item2 is item2");
        System.out.println("Item2 is item3");
    }
}

public class SourceCode
{
    pubic static void main(String args[])
    {
        //Creating the object :Parent
        Parent parent= new Parent();
        System.out.println("parent");
        //Parent is the object and parent is a hashcode or a reference variable that provides the blueprint to the object for how to behave.
        parent.setParentBehavior(2001,palak,mittal);
        parent.showParentBehavior();
        
        //Creating the object : Child
        Child child= new Child();
        child.setParentBehavior(2001,palak,mittal,wow);
        child.showParentBehavior();
    }
}