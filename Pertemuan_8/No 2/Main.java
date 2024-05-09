import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list_item = new ArrayList<>() {{
            add("SWORD");
            add("SHIELD");
            add("POTION");
        }};
        Player P1 = new Player(10, 50, "Fahrul");
        Merchant merchant1 = new Merchant(20, 20, list_item);
        Zombie zombie1 = new Zombie(5, 30, Zombie.type.MEELE);
        Zombie zombie2 = new Zombie(5, 15, Zombie.type.RANGED);

        System.out.println("TEST OBJEK INFO : ");
        P1.entityInfo();
        merchant1.entityInfo();
        zombie1.entityInfo();
        zombie2.entityInfo();
        System.out.println("==================================");

        System.out.println("\nTEST INTERAKSI MERCHANT : ");
        P1.interact(merchant1);
        System.out.println("");
        P1.attack(merchant1);
        P1.attack(merchant1);
        P1.interact(merchant1);
        System.out.println("===================================");

        System.out.println("\nTEST SERANG ZOMBIE :");
        P1.attack(zombie1);
        P1.attack(zombie1);
        P1.attack(zombie1);
        zombie1.attack(P1);
        System.out.println("====================================");

        System.out.println("\nTEST SERANG PLAYER :");
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        P1.interact(merchant1);
        P1.attack(zombie1);
    }
}