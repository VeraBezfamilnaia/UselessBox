public class Tumbler {
    private volatile boolean isSwitchedOn;

    public void switchOn() {
        isSwitchedOn = true;
        printMessage("Пользователь включил тумблер");
    }

    public void switchOff() {
        while (!isSwitchedOn) {
            Thread.onSpinWait();
        }
        isSwitchedOn = false;
        printMessage("Игрушка выключила тумблер");
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
