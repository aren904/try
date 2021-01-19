package Agency;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: try
 * @Package: Agency
 * @ClassName: GirlFamily
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/19 10:09
 * @Version: 1.0
 */
public class GirlFamily implements InvocationHandler {

    private Girl girl;


    public GirlFamily(Girl girl){
        this.girl=girl;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomethingBefore(method);
        Object invoke = method.invoke(girl, args);
        doSomethingAfter(method);
        return invoke;
    }



    private void doSomethingBefore(Method method){
        System.out.println(Thread.currentThread().getName()+"女孩的父母说：我要先去调查一下男孩子的背景");
    }


    private void doSomethingAfter(Method method){
        System.out.println(Thread.currentThread().getName()+"女孩的父母说:见面结束了感觉如何");
    }

    public  Object getProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }



}
