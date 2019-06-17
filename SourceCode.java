public class Parent
{
    //Declaring the variables to be used in class
    //Attributes
    protected int id;       //ID can't be added from main but involves te use of the class methods
    public String item1;       //Attributes declared as public can be accessed or defined from main itself without involving the class methods
    public String item2;

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

    //setter
    void setid(int id)
    {
        this.id=id;
    }

    //Getter: If you directly want to get an id name
    int getid()
    {
        return id;
    }
}

//Entension of class
//Creating a Child Object
public class Child extends Parent
{

    String item3;

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
        parent.setParentBehavior(2001,"palak","mittal");
        parent.showParentBehavior();

        Parent.parent2= new Parent();
        //The below used line will give the error
        //parent2.id=1997;
        parent2.id=getid(1997);
        parent2.item1="vishal";
        parent2.item2="mittal";
        parent.showParentBehavior();

        //Creating the object : Child
        Child child= new Child();
        child.setParentBehavior(2001,"palak","mittal","wow");
        child.showParentBehavior();
    }
}