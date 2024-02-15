import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshuyi
 * @description
 * @create 2024/2/14 12:08
 */
public class TestA {
    public static void main(String[] args) {
        System.out.println("hello world");


        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        Map<Object, Object> map = new HashMap<>();
        System.out.println(objectObjectMap.equals(map));
    }
}
