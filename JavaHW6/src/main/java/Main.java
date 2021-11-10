public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Zaza");
        Dogs dog2 = new Dogs("Бобик");
        Dogs dog3 = new Dogs("Гера");
        Dogs dog4 = new Dogs("Морда");
        Cats cat1 = new Cats("Кiт");
        Cats cat2 = new Cats("Рыжик");
        Cats cat3 = new Cats("Мурзик");
        Cats cat4 = new Cats("Бонифаций");

        dog1.dogRun(150);
        dog2.dogRun(300);
        dog3.dogSwim(20);
        cat3.catSwim(25);
        cat2.catRun(300);
        Animals.countPrint();
    }
}
