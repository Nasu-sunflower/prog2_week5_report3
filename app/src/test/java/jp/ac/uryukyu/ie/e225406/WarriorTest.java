package jp.ac.uryukyu.ie.e225406;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackTest() {
        int IdealAttackPower = 150;
        for(int i = 0; i < 3; i++){
            System.out.printf("%d回目のテスト\n",i+1);
            Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
            Enemy slime = new Enemy("スライムもどき", 300, 100);
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior);
            assertEquals(IdealAttackPower, slime.gethitPoint());
        }
    }
}
