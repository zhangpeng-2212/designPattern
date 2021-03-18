package org.example.bridge;

public class Test {

    public static void main(String[] args) {
        ClothCrop clothCrop=new ClothCrop(new Cloth());
        clothCrop.makeMoney();

        ShanzhaiCrop shanzhaiCrop=new ShanzhaiCrop(new Phone());
        shanzhaiCrop.makeMoney();
    }


}
