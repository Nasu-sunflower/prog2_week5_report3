package jp.ac.uryukyu.ie.e225406;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    // private String name;
    // private int hitPoint;
    // private int attack;
    // private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */


    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        // this.name = name;
        // hitPoint = maximumHP;
        // this.attack = attack;
        // dead = false;
        // System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

         //  以下getter
    // public String getname(){return this.name;}
    // public int gethitPoint(){return this.hitPoint;}
    // public int getattack(){return this.attack;}
    // // public boolean getdead(){return this.dead;}

    // // 以下setter
    // public void setname(String name){this.name = name;}
    // public void sethitPoint(int hitPoint){this.hitPoint = hitPoint;}
    // public void setattack(int attack){this.attack = attack;}
    // public void setdead(boolean dead){this.dead = dead;}

    // /**
    //  * Enemyへ攻撃するメソッド。
    //  * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
    //  * @param e 攻撃対象
    //  */
    // public void attack(Enemy e){
    //     int damage = (int)(Math.random() * attack);
    //     System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getname(), damage);
    //     e.wounded(damage);
    // }

    // /**
    //  * 自身へ攻撃されたときのダメージ処理をするメソッド。
    //  * 指定されたダメージを hitPoint から引き、死亡判定を行う。
    //  * @param damage 受けたダメージ
    //  */
    @Override
    public void wounded(int damage){
        sethitPoint(gethitPoint() - damage);
        if( gethitPoint() <= 0 ) {
            // boolean dead = this.isDead();
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}