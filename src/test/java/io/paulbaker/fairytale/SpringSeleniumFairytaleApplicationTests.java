package io.paulbaker.fairytale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringSeleniumFairytaleApplication.class)
public class SpringSeleniumFairytaleApplicationTests {

  @Autowired
  private FairyTale fairyTale;

	@Test
	public void contextLoads() {
    while(true){
      fairyTale.update();
    }
	}

}
