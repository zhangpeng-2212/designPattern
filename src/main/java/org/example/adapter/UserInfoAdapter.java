package org.example.adapter;


import java.util.Map;

/**
 * 员工信息支配器，将外部员工信息转成内部员工信息
 * 客户端获取外部员工信息的时候，通过适配器的方法获取，适配器内部将外部员工转成内部员工，该操作对客户端无感知
 */
public class UserInfoAdapter implements IInnerUserInfo{
    private Map baseInfoMap;
    private Map officeInfoMap;

    public UserInfoAdapter(IOuterUserBaseInfo baseInfo,IOuterUserOfficeInfo officeInfo){
        this.baseInfoMap= baseInfo.getUserBaseInfoMap();
        this.officeInfoMap= officeInfo.getUserOfficeInfoMap();
    }


    @Override
    public String getName() {
        return (String) baseInfoMap.get("name");
    }

    @Override
    public int getAge() {
        return (int) baseInfoMap.get("age");
    }

    @Override
    public String getPosition() {
        return (String) officeInfoMap.get("position");
    }

    @Override
    public String getPhoneNo() {
        return (String) officeInfoMap.get("phoneNo");
    }
}
