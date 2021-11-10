public class Dogs extends Animals{


    public Dogs(String name){
       this.setName(name);
       this.setSwim(10);
       this.setRun(500);
       count ++;
    }
    public void dogRun(int i){
        if(i<getRun()) System.out.println("Собака " + getName() + " пробежала: " + i);
        else System.out.println("Собака " + getName() + " не может пробежать более 500м");
    }
    public void dogSwim(int i){
        if(i<getSwim()) System.out.println("Собака " + getName() + " проплыла: " + i);
        else System.out.println("Собака " + getName() + " не может пробежать более 10м");
    }
}
