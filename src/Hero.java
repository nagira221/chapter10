public class Hero {
    String name = "ミナト";
    int hp = 100;

    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }
    // 戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
    }
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }
    //　逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
    public void test(){
        System.out.println("親test");

    }
}

