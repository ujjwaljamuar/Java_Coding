package Infosys;
import java.util.*;

class Monster{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int exp = sc.nextInt();
        int mons[] = new int[m];
        int bonus[] = new int[m];

        for(int i= 0;i<m;i++){
            mons[i] = sc.nextInt();
        }
        
        for(int i= 0;i<m;i++){
            bonus[i] = sc.nextInt();
        }

        class Monst{
            private final int power, bonus;
            public Monst(int power,int bonus){
                this.power = power;
                this.bonus = bonus;
            }
        }

        Monst[] monsters = new Monst[m];
        for(int i = 0;i<m;i++){
            monsters[i] = new Monst(mons[i],bonus[i]);
        }
        //Arrays.sort(monsters,Comparator.comparingInt(n-> n.power));

        int count =0 ;
        for (Monst mo : monsters) {
            if (exp <mo.power) {
                break;
            }
            exp += mo.bonus;
            ++count;
        }
        System.out.println(count);

        sc.close();
    }
}
