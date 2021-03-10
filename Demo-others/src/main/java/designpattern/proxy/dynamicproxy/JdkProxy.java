package designpattern.proxy.dynamicproxy;

/**
 * @author WuLiangHang
 */
public class JdkProxy {

    public static void main(String[] args) {
        IRentingHouse rentingHouse = new RentingHouseImpl();
        IRentingHouse obj = (IRentingHouse) JdkProxyFactory.getInstance().getJdkProxy(rentingHouse);
        obj.rentHouse();

    }
}
