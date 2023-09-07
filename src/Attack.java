public class Attack {
    int damage;
    int spread;
    int accuracy;
    String name;
    boolean aoe;
    int hits;
    static Attack[][] attacks = {
            new Attack[] {
                    new Attack("slash",10,1,5,false),
                    new Attack("giga blade",50,10,1,false),
                    new Attack("giga quake",30,10,1,true),
                    new Attack("quick hit",5,1,10,false)
            },
            new Attack[] {
                    new Attack("super punch",15,1,3,false),
                    new Attack("giga punch",50,10,1,false),
                    new Attack("power slam",30,10,1,false),
                    new Attack("punch",5,2,10,false)
            },
            new Attack[] {
                    new Attack("water burst",20,1,3,true),
                    new Attack("force burst",10,1,1,true),
                    new Attack("fire burst",50,10,7,true),
                    new Attack("quick hit",5,1,10,false)
            },
            new Attack[] {
                    new Attack("hidden blade",10,1,9,false),
                    new Attack("poison gas",10,5,7,true),
                    new Attack("slash",10,1,2,false),
                    new Attack("quick hit",10,1,10,false)
            },
    };
    public Attack(String n,int d,int s,int a, boolean e) {
        damage=d;
        spread=s;
        accuracy=a;
        name=n;
        aoe=e;
    }
    public int attack() {
        if(Main.randomint(10)<accuracy) {
            return 0;
        }
        return damage+(Main.randomint(10)/spread);
    }

}
