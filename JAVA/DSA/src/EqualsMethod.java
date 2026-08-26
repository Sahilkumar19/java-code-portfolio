public abstract class EqualsMethod {
    public static void main(String[] args) {
        Parrot obj1 = new Parrot();
        Parrot obj2 = new Parrot();
        obj1.name = "Amazon";
        obj2.name = "Amazon";

        System.out.println(obj1.name + "\t" + obj2.name);
        Parrot obj3 = obj1;
        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1.equals(obj3));
        System.out.println(obj3.equals(obj1));
    }
}
