public class Player {
    static final String[] styles = {"Attacker","Tank","Mage","Thief"};
    int hp;
    Attack[] attacks;
    int MaxHP=100;
    int style;

    public Player(int s) {
        style=s;
        hp=MaxHP;
        attacks=Attack.attacks[s];
    }

}
