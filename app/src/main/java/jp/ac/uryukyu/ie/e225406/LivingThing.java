package jp.ac.uryukyu.ie.e225406;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    //以下getter
    public boolean isDead(){return this.dead;}
    public int gethitPoint(){return this.hitPoint;}
    public int getattack(){return this.attack;}
    public String getName(){return this.name;}

    //以下setter
    public void setDead(boolean dead){this.dead = dead;}
    public void setName(String name){this.name = name;}
    public void sethitPoint(int hitPoint){this.hitPoint = hitPoint;}
    public void setattack(int attack){this.attack = attack;}
    
    

    public void attack(LivingThing livingThing){
        int damage = (int)(Math.random() * attack);
        if (livingThing.isDead() == false && this.dead == false) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
