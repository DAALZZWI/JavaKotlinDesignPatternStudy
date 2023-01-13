package FactoryMethodPattern.Java.Concrete;

import FactoryMethodPattern.Java.Framework.Item;
import FactoryMethodPattern.Java.Framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {

        System.out.println("데이터 베이스에서 마력 물약의 정보를 가져 옵니다");
    }

    @Override
    protected void createItemLog() {

        System.out.println("마력 물약을 새로 생성 했 습니다 " + new Date() );
    }

    @Override
    protected Item createItem() {

        return new MpPotion();
    }
}
