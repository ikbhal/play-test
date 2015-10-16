import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.contentAsString;

import org.junit.BeforeClass;
import org.junit.Test;

import controllers.DummyController;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Result;
import play.test.WithApplication;



public class DummyControllerTest extends WithApplication {

    public static Application application;

    @BeforeClass
    public static void setup(){
         application = new GuiceApplicationBuilder()
            .build();
    }
    //@Test
    public void test1() {
        System.out.println("Inside DummyControllerTest:test1");
        int a = 1 + 1;
        assertEquals(2, a);
    }

     //@Test
    public void test2() {
        System.out.println("Inside DummyControllerTest:test2");
        DummyController dummyController = application.injector().instanceOf(DummyController.class);
        Result result = dummyController.test();
        assertEquals(OK, result.status());
        //assertEquals("text/html", result.contentType().get());
        //assertEquals("utf-8", result.charset().get());
        assertTrue(contentAsString(result).contains("test"));
    }

    @Test
    public void testDummy() {
        System.out.println("Inside DummyControllerTest:testDummy");
        DummyController dummyController = application.injector().instanceOf(DummyController.class);
        assertNotNull(dummyController);
        Result result = dummyController.dummy();
        assertEquals(OK, result.status());
        //assertEquals("text/html", result.contentType().get());
        //assertEquals("utf-8", result.charset().get());
        assertTrue(contentAsString(result).contains("ikbhal"));
    }
}
