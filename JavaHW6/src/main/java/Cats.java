public class Cats extends Animals{
    public Cats(String name){
        this.setName(name);
        this.setSwim(0);
        this.setRun(200);
        count ++;
    }
    public void catRun(int i){
        if(i<getRun()) System.out.println("Кот " + getName() + " пробежал: " + i);
        else System.out.println("Кот " + getName() + " не может пробежать более 200м");
    }
    public void catSwim(int i){
        System.out.println("Кот " + getName() + " не умеет плавать");
    }

}
