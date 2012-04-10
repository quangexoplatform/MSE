package org.exoplatform.webservice.test;
 
import junit.framework.TestCase;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.container.*;
import org.exoplatform.webservice.*;
 
public class ServiceTestCase extends TestCase {
    private NewCommer newCommer;
    private ExoLogger exoLogger;
 
    public void setUp() throws Exception {
         StandaloneContainer myContainer = StandaloneContainer.getInstance();
         //ExoContainer myContainer = ExoContainerContext.getCurrentContainer();
         this.newCommer = (NewCommer) myContainer.getComponentInstance(NewCommer.class);
         this.exoLogger = (ExoLogger) myContainer.getComponentInstance(ExoLogger.class);
    }
 
    public void testService(){
         this.newCommer.test();
    }
}
