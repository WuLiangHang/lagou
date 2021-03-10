package designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WuLiangHang
 */
public class JdkProxyFactory {
    private static JdkProxyFactory factory = new JdkProxyFactory();

    private JdkProxyFactory() {

    }

    public static JdkProxyFactory getInstance() {
        return factory;
    }

    public Object getJdkProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                System.out.println("中介收取代理费3000元");
                result = method.invoke(obj, args);
                System.out.println("客户信息卖了3毛钱");
                return result;
            }
        });
    }
}
