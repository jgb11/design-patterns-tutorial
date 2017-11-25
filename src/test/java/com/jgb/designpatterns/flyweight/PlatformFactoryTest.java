package com.jgb.designpatterns.flyweight;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author jgb
 * @since 25/11/2017 10:59
 */
public class PlatformFactoryTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetPlatformInstance() throws Exception {
        Code cCode = new Code();
        cCode.setCodeToExecute("C Code...");
        Platform cPlatform1 = PlatformFactory.getPlatformInstance("C");
        assertThat("platform must be tye C", cPlatform1, instanceOf(CPlatform.class));
        cPlatform1.execute(cCode);
        System.out.println("-------------------------------------");
        Code cCode2 = new Code();
        cCode2.setCodeToExecute("C Code2...");
        Platform cPlatform2 = PlatformFactory.getPlatformInstance("C");
        assertEquals("C platforms must be the same", cPlatform1, cPlatform2);
        cPlatform2.execute(cCode2);
        System.out.println("-------------------------------------");
        Code javaCode = new Code();
        javaCode.setCodeToExecute("JAVA Code...");
        Platform javaPlatform1 = PlatformFactory.getPlatformInstance("JAVA");
        assertThat("platform must be tye JAVA", javaPlatform1, instanceOf(JavaPlatform.class));
        javaPlatform1.execute(javaCode);
        System.out.println("-------------------------------------");
        Code javaCode2 = new Code();
        javaCode2.setCodeToExecute("JAVA Code2...");
        Platform javaPlatform2 = PlatformFactory.getPlatformInstance("JAVA");
        assertEquals("JAVA platforms must be the same", javaPlatform1, javaPlatform2);
        javaPlatform2.execute(javaCode2);
        System.out.println("-------------------------------------");
        Code rubyCode = new Code();
        rubyCode.setCodeToExecute("RUBY Code...");
        Platform rubyPlatform1 = PlatformFactory.getPlatformInstance("RUBY");
        assertThat("platform must be tye RUBY", rubyPlatform1, instanceOf(RubyPlatform.class));
        rubyPlatform1.execute(rubyCode);
        System.out.println("-------------------------------------");
        Code rubyCode2 = new Code();
        rubyCode2.setCodeToExecute("RUBY Code2...");
        Platform rubyPlatform2 = PlatformFactory.getPlatformInstance("RUBY");
        assertEquals("RUBY platforms must be the same", rubyPlatform1, rubyPlatform2);
        rubyPlatform2.execute(rubyCode2);
    }

}