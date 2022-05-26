public class ToyThread extends Thread {
    private final Runnable target;

    public ToyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.target = target;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            target.run();
        }
    }
}
