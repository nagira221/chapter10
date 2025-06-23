public class SuperHero extends Hero {
    boolean flying;

    public SuperHero() {
        super();
        System.out.println("Heroのコンストラクタの動作");
    }
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run() {
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
        if (this.flying) {
            System.out.println(this.name + "の攻撃！");
            m.hp -= 5;
            System.out.println("5ポイントのダメージをあたえた！");
        }
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
    public void test() {
        super.test();
        System.out.println("子test");
    }
}

