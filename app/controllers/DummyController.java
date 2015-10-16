package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import javax.inject.Inject;
import models.Dummy;

public class DummyController extends Controller {

	@Inject
	Dummy dummy;

    public Result test() {
        return ok("test");
    }

	public Result dummy() {
		if(dummy == null){
			System.out.println("dummy not injected");
		}
        return ok(dummy.toString());
    }
}
