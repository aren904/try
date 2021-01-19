package Agency;

/**
 * @ProjectName: try
 * @Package: Agency
 * @ClassName: Girl
 * @Author: zxcdr
 * @Description: interface,动态代理----可衍生到aop动态代理，@Transaction，@Cacheable，@Async 此类注解都是通过spring进行拦截然后去对所注解方法进行方法的加强
 * @Date: 2021/1/19 10:05
 * @Version: 1.0
 */
public interface Girl {
    void date();
    void watchMovie();
}
