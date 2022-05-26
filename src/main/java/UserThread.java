public class UserThread extends Thread {
    private final int SLEEP_TIME = 2000;
    private int iterationCounter;
    private final Runnable target;

    public UserThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.target = target;
    }

    @Override
    public void run() {
        try {
            while (iterationCounter < 3) {
                target.run();
                Thread.sleep(SLEEP_TIME);
                iterationCounter++;
            }
        } catch (InterruptedException ignore) {
        }
    }
}
