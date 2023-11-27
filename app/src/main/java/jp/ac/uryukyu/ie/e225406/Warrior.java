package jp.ac.uryukyu.ie.e225406;

public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing livingThing){
        int damage = (int)(getattack() * 1.5);
        if (livingThing.isDead() == false && this.isDead() == false) {
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
    }
}
