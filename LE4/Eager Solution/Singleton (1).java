public class Singleton{
    private static Singleton uniqueInstance=new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        if(uniqueInstance==null)
        {
            System.out.println("Eager Solution");
        }
        return uniqueInstance;
    }
}