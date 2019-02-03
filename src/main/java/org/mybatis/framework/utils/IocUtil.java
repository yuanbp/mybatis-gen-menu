package org.mybatis.framework.utils;/**
 * org.mybatis.framework.utils [workset]
 * Created by chieftain on 2019-02-03
 *
 * @author chieftain on 2019-02-03
 */

import org.mybatis.framework.beanmanage.Inject;
import org.mybatis.framework.beanmanage.IocContext;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @description IocUtil
 * @author chieftain
 * @create 2019-02-03 09:43
 */
public class IocUtil {
    public static void inject() {
        Map<Class<?>, Object> map = IocContext.applicationContext;
        try {
            for (Map.Entry<Class<?>, Object> entry : map.entrySet()) {
                Class<?> clazz = entry.getKey();
                Object obj = entry.getValue();
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Inject.class)) {
                        Class<?> fieldClazz = field.getType();
                        field.setAccessible(true);
                        Object fieldObj = map.get(fieldClazz);
                        field.set(obj, fieldObj);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
