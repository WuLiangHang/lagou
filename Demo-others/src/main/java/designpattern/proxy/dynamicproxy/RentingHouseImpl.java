package designpattern.proxy.dynamicproxy;


/**
 * 委托方（委托对象）
 * @author WuLiangHang
 */
public class RentingHouseImpl implements IRentingHouse {
    public void rentHouse() {
        System.out.println("我要租用一室一厅的房子");
    }
}