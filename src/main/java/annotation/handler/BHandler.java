package annotation.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import annotation.service.AService;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BHandler implements IHandler {

	private int i;

	public BHandler() {
		super();
	}

	public BHandler(int i) {
		super();
		this.i = i;
	}

	@Autowired
	private AService aService;

	@Override
	public void handler() {
		aService.serviceDo();
		System.out.println("in BHandler:" + i);
	}

}