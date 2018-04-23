package com.jiramonk.comppage.jira.tabpanels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.plugin.projectpanel.impl.AbstractProjectTabPanel;
import com.atlassian.jira.plugin.projectpanel.ProjectTabPanel;
import com.atlassian.jira.plugin.projectpanel.ProjectTabPanelModuleDescriptor;
import com.atlassian.jira.project.browse.BrowseContext;


public class compImpProjectTabPanel extends AbstractProjectTabPanel implements ProjectTabPanel
{
    private static final Logger log = LoggerFactory.getLogger(compImpProjectTabPanel.class);

    public boolean showPanel(BrowseContext context)
    {
        return true;
    }
}
