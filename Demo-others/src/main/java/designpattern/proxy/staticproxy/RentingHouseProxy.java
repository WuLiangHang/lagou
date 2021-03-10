package designpattern.proxy.staticproxy;

public class RentingHouseProxy implements IRentingHouse {
    private IRentingHouse rentingHouse;

    public RentingHouseProxy(IRentingHouse rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("中介收取代理费3000元");
        rentingHouse.rentHouse();
        System.out.println("客户信息卖了3毛钱");
    }
}
