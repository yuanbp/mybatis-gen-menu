package org.mybatis.framework.beanmanage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * org.mybatis.framework.beanmanage [workset]
 * Created by chieftain on 2019-02-03
 *
 * @author chieftain on 2019-02-03
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

}
