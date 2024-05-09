import java.util.ArrayList;

public class Merchant extends Entity {
    private ArrayList<String> list_item;

    public Merchant(int lvl, double hp, ArrayList<String> list_item) {
        setLvl(lvl);
        setHp(hp);
        this.list_item = list_item;
    }

    public void entityInfo() {
        System.out.println("# MERCHANT DENGAN LEVEL : " + getLvl());
    }

    public ArrayList<String> getList_item() {
        return new ArrayList<>(this.list_item);
    }

    protected void interact(Entity entity) {
        System.out.println("Merchant : ");
        System.out.println("Barang yang tersedia hari ini");

        for (int i = 0; i < list_item.size(); i++) {
            System.out.println((i + 1) + ". " + list_item.get(i));
        }
    }
}