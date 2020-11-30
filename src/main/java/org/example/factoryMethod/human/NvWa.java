package org.example.factoryMethod.human;

/**
 * 女娲造人
 */
public class NvWa {

    public static void main(String[] args){
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了

        try {
            System.out.println("--造出的第一批人是白色人种--");
            Human whiteHuman = YinYangLu.createHuman(WhiteMan.class);
            whiteHuman.getColor();
            whiteHuman.talk();

            //女娲第二次造人，火候过足，于是黑人产生了
            System.out.println("\n--造出的第二批人是黑色人种--");
            Human blackHuman = YinYangLu.createHuman(BlackMan.class);
            blackHuman.getColor();
            blackHuman.talk();

            //第三次造人，火候刚刚好，于是黄色人种产生了
            System.out.println("\n--造出的第三批人是黄色人种--");
            Human yellowHuman = YinYangLu.createHuman(YellowMan.class);
            yellowHuman.getColor();
            yellowHuman.talk();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }

}
