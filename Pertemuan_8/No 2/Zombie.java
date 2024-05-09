public class Zombie extends Entity {
    enum type {
        MEELE,
        RANGED
    }

    private type type;

    public Zombie(int lvl, double hp, type type) {
        setLvl(lvl);
        setHp(hp);
        this.type = type;
    }

    public void entityInfo() {
        System.out.println("# ZOMBIE DENGAN TYPE : " + type + ", DAN LEVEL : " + getLvl());
    }

    protected void attack(Entity entity) {
        if (type.equals(type.MEELE)) {
            if (entity instanceof Player) {
                if (getHp() > 0) {
                    entity.setHp(entity.getHp() - 20);
                    System.out.println("# PLAYER : UGHHH");
                } else {
                    System.out.println("# ZOMBIE SUDAH DIKALAHKAN DAN TIDAK BERNYAWA");
                }
            } else if (entity instanceof Merchant) {
                if (getHp() > 0) {
                    entity.setHp(entity.getHp() - 20);
                    System.out.println("# MERCHANT : TOLONGGGG TOKOKU DISERANGGG TOLONGGG AAAAA");
                } else {
                    System.out.println("# ZOMBIE SUDAH DIKALAHKAN DAN TIDAK BERNYAWA");
                }
            }
        } else if (type.equals(type.RANGED)) {
            if (entity instanceof Player) {
                if (getHp() > 0) {
                    entity.setHp(entity.getHp() - 15);
                    System.out.println("# PLAYER : UGHHH");
                } else {
                    System.out.println("# ZOMBIE SUDAH DIKALAHKAN DAN TIDAK BERNYAWA");
                }
            } else if (entity instanceof Merchant) {
                if (getHp() > 0) {
                    entity.setHp(entity.getHp() - 15);
                    System.out.println("# MERCHANT : TOLONGGGG TOKOKU DISERANGGG TOLONGGG AAAAA");
                } else {
                    System.out.println("# ZOMBIE SUDAH DIKALAHKAN DAN TIDAK BERNYAWA");
                }
            }
        }
    }
}
