public class Main {
    public static void main(String[] args) {
        //threadStart();
        //Java 8方式：
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
    }

    private static void threadStart() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动!");
            }
        }).start();
    }
}
