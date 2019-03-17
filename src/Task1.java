
public class Task1 extends Thread {

    private int number;
    public Task1(int number){
        this.number = number;
    }

    public void run(){
        System.out.println("\nTask1 " +number+" started");
        for (int i =number*100;i<number*100+99;i++)
            System.out.print(i + " ");
        System.out.println("\nTask1 "+number+" Done");
    }
}
