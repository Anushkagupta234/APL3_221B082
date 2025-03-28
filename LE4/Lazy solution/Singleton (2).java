public class Singleton{
    private static Singleton uniqueInstance;
    static int counter;
    private Singleton(){counter++;};
    public static Singleton getInstance(){
        if(uniqueInstance==null)
        {
            uniqueInstance=new Singleton();
            System.out.println(counter);
        }
        return uniqueInstance;
    }
}