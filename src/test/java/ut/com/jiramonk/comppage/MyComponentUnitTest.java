package ut.com.jiramonk.comppage;

import org.junit.Test;
import com.jiramonk.comppage.api.MyPluginComponent;
import com.jiramonk.comppage.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}