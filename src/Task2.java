public class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask2 Started");
        for (int i =201;i<299;i++)

            System.out.print(i + " ");


        System.out.println("\nTast2 Done");
    }
}
