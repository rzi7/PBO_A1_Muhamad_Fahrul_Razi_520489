
public class Player extends Entity {
    private String name;
    private int serangMerchant = 0;


    public Player(int lvl, double hp, String name) {
        setLvl(lvl);
        setHp(hp);
        this.name = name;
    }

    public void entityInfo() {
        System.out.println("# PLAYER DENGAN NAMA : " + name + ", DAN LEVEL : " + getLvl());
    }

    protected void attack(Entity entity) {
        if (entity instanceof Merchant) {
            if (getHp() > 0) {
                if (serangMerchant <= 1) {
                    System.out.println("Merchan : heyy heyy, ngapain nyerang");
                    serangMerchant++;
                } else if(serangMerchant > 1 && serangMerchant < 3) {
                    System.out.println("Merchan : apaanlu");
                    System.out.println("Merchan : AUAH MALES JUALAN");
                } else {
                    System.out.println("Merchan : ..............");
                }
            } else {
                System.out.println("# PLAYER SUDAH TEWAS");
            }
        } else if(entity instanceof Zombie) {
            if (getHp() > 0) {
                entity.setHp(entity.getHp() - 10);
                if (entity.getHp() > 0) {
                    System.out.println("Zombie : GRAAAAAA!");
                } else if (entity.getHp() <= 0){
                   System.out.println("Zombie : GRAAAAAA! ");
                   System.out.println("# ZOMBIE MATI");
                }
            } else {
                System.out.println("# PLAYER SUDAH TEWAS");
            }
        }
    }
    
    protected void interact(Merchant entity) {
        if (serangMerchant > 1) {
            System.out.println("Merchant : auahhh malesss");
            System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
        } else {
            entity.interact(this);
        }
    }
}
