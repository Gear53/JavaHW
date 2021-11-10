public class Animals {
    private int swim;
    private int run;
    private String name;
    static int count = 0;

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public static void countPrint(){
        System.out.println(count);
    }
}
