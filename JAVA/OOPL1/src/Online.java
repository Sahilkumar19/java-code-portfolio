public class Online {
    public static void main(String[] args) {
//        About public and private variables

        Account acc=new Account();
//        acc.id=33; //can not access private variable with the object
        acc.roll_no=45;//we can access the public variable using object of that class
//        System.out.println(acc.roll_no);
//        acc.balance=22226.5; // can not access the private variables

//        we can access the private variables using the public methods or setters
        acc.setId(33);// we can access the private member through the methods or setters or getters or public methods
        acc.setBalance(1265);
        int ans=acc.getId();
//        System.out.println(ans);
        double ans2=acc.getBalance();
//        System.out.println(ans2);


//        Box mybox=new Box();
        double vol;
        double sa;
//        System.out.println(mybox.volume());
//        System.out.println(mybox.SurfaceArea());

//        constructors

//        Defconst cons=new Defconst();


        Para obj=new Para("sahil",678);
        obj.name="sahi";
        obj.id=54;
//        System.out.println("name:"+" "+obj.name);
//        System.out.println("id:"+" "+obj.id);

//
//        vol=mybox.volume();
//        sa=mybox.SufaceArea();
//        System.out.println("volume:"+" "+vol);
//        System.out.println("surface area:"+" "+sa);


        System.out.println("first obj");
        cc cc1=new cc("anand",68);
//        System.out.println(cc1.name);
//        System.out.println(cc1.id);
//        System.out.println();
        cc cc2=new cc(cc1);
        System.out.println("copy cont used second obj");
        System.out.println("name:"+cc2.name+" " + "and id:"+ cc2.id);

    }
}
class Account{
    private int id;
    public int roll_no;
    private double balance;
    public void setId(int temp){
        id=temp;
//        System.out.println(id);
    }
    public void setBalance(double temp){
        balance=temp;
//        System.out.println(balance);
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    private String AccountName;
    private double AccountBalance;

//    public withdraw();
//
//    public deposit();
//    public determineBalance();

}
//Constructors concept
class Box{
    double width;
    double height;
    double depth;

    // this is the constructor for the box
        Box() { // cons has name as the class //this is the default const.
            System.out.println("constructing box");
            width = 10;
            height = 10;
            depth = 10;
        }
        double volume(){
            return height*depth*width;


        }
        double SurfaceArea(){
            return 2*(height*depth+width*depth+height*width);
        }

}

class cc{
    String name;
    int id;
    cc(String name, int id){
        this.name=name;
        this.id=id;

    }
    //copy constructor
    cc(cc obj2){
        this.name=obj2.name;
        this.id= obj2.id;
    }
}
class Defconst{
    Defconst(){
        System.out.println("default constructor");
    }
}
class Para{
    String name;
    int id;
    Para(String name,int id){
        this.name=name;
        this.id=id;
    }



}