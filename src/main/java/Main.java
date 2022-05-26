public class Main {
    public static void main(String[] args) throws InterruptedException {
       UselessBox uselessBox = new UselessBox();

        Thread user = new UserThread(null, uselessBox::switchOnTumbler, "Пользователь");
        user.start();
        Thread toy = new ToyThread(null, uselessBox::switchOffTumbler, "Игрушка");
        toy.start();

        user.join();
        toy.interrupt();
    }
}
