public class thread implements Runnable {
    public SingletonChocolateBoiler s;
    public String name;
    public thread(String n) {
        s = SingletonChocolateBoiler.getInstance();
        name = n;
    }
    public void run()
    {
        s = SingletonChocolateBoiler.getInstance();
        System.out.println(name);
    }
}
public class Main {


    public static void main(String[] args) {
        thread t1 = new thread("thread 1");
        thread t2 = new thread("thread 2");
        thread t3 = new thread("thread 3");
    }


}
