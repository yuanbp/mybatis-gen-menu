package org.mybatis.gen.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.mybatis.gen.process.GenProcess;

/**
 * org.mybatis.gen.actions [workset]
 * Created by chieftain on 2019-02-01
 *
 * @author chieftain on 2019-02-01
 */
public class EditorMybatisGen extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        GenProcess genProcess = GenProcess.getGenProcess();
        genProcess.process(event);
    }
}
