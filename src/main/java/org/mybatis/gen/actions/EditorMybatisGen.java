package org.mybatis.gen.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.mybatis.framework.beanmanage.Component;
import org.mybatis.framework.beanmanage.Inject;
import org.mybatis.gen.process.GenProcess;

/**
 * org.mybatis.gen.actions [workset]
 * Created by chieftain on 2019-02-01
 *
 * @author chieftain on 2019-02-01
 */
@Component
public class EditorMybatisGen extends AnAction {

    @Inject
    private GenProcess genProcess;

    @Override
    public void actionPerformed(AnActionEvent event) {
        genProcess.process(event);
    }
}
