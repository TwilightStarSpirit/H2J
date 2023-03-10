package com.project1.charactor;

public class ADHero extends Hero implements AD {
    public void attack() {
        System.out.println(heroName + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(heroName + "对" + h1.heroName + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(heroName + "同时对" + h1.heroName + "和" + h2.heroName + "进行了攻击 ");
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.heroName = "赏金猎人";

        Hero h1 = new Hero();
        h1.heroName = "盖伦";
        Hero h2 = new Hero();
        h2.heroName = "提莫";

        bh.attack();
        bh.attack(h1);
        bh.attack(h1, h2);
    }
    public void attack(Hero... heros){
        for (int i = 0; i < heros.length; i++) {
            System.out.println(heroName + " 攻击了 " + heros[i].heroName);

        }
    }

    @Override
    public void physicAttack() {
        System.out.println("进行了物理攻击");
    }
}
