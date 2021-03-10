package designpattern.proxy.staticproxy;

/**
 * @author WuLiangHang
 */
public class Test {
    @org.junit.Test
    public void test(){
        IRentingHouse rentingHouse = new RentingHouseImpl();

        RentingHouseProxy proxy = new RentingHouseProxy(rentingHouse);
        proxy.rentHouse();
    }
}
