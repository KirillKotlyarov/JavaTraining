package com.company.game;


public class Pull {
    public static void Fight() {
        Hero Robot1 = new Hero("Robot1", 20, 200);
        System.out.println(Robot1.getName( ));
        Hero Robot2 = new Hero("Robot2", 30, 200);
        System.out.println(Robot2.getName( ));

        int r1hp = Robot1.getHp( );
        int r2hp = Robot2.getHp( );
        while (r1hp >= 0 && r2hp >= 0) {
            r1hp = r1hp - Robot2.getPower( );
            r2hp = r2hp - Robot1.getPower( );
            if (r1hp > 0 && r2hp > 0) {
                System.out.println(Robot1.getName( ) + " наносит " + Robot2.getName( ) + " " + Robot1.getPower( ) + " урона,\n" +
                        Robot2.getName( ) + " наносит " + Robot1.getName( ) + " " + Robot2.getPower( ) + " урона,\n" +
                        "Остаток здоровья " + Robot1.getName( ) + " " + r1hp + "\n" +
                        "Остаток здоровья " + Robot1.getName( ) + " " + r2hp);

            } else if (r1hp > r2hp) {
                System.out.println("Бой закончен!");
                System.out.println("Победил " + Robot1.getName( ) + " нанеся " + Robot1.getPower( ) + " урона!");
                break;
            } else {
                System.out.println("Победил " + Robot2.getName( ) + " нанеся " + Robot2.getPower( ) + " урона!");
                break;
            }
        }
    }

    public static void HumanAndFrends() {
    Hero man = new Hero ("Виктор", 30);
    Hero woman = new Hero ("Регина", 27);
    Hero cat = new Hero ("Мурзик", 2);
    Hero dog = new Hero ("Тузик", 5);
    Hero fish = new Hero ("Немо",1);
    man.wife = woman.getName( );
    woman.husband = man.getName();
        System.out.println("Его зовут "+ man.getName()+", его жена " + man.wife );
    cat.owner = woman.getName();
    dog.owner = woman.getName();
    fish.owner = woman.getName();
        System.out.println(woman.getName() + " замужем за " +woman.husband+ "ом и ей пренадлежат: кот "+cat.getName()+", пёс "+dog.getName()+" и рыбка "+ fish.getName() );

    }
}

