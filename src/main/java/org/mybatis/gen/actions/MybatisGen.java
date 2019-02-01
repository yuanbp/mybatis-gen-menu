package org.mybatis.gen.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.mybatis.gen.process.GenProcess;

/**
 * org.mybatis.gen [workset]
 * Created by chieftain on 2019-01-31
 *
 * @author chieftain on 2019-01-31
 */
public class MybatisGen extends AnAction {

    private Project project;

    @Override
    public void update(AnActionEvent event) {}

    @Override
    public void actionPerformed(AnActionEvent event) {
        GenProcess genProcess = GenProcess.getGenProcess();
        genProcess.process(event);
    }
}
