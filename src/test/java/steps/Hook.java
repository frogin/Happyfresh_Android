package steps;

import Base.BaseUtil;
import io.cucumber.java.*;

import java.io.IOException;

public class Hook extends BaseUtil{

    public BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        System.out.println("HOOK BEFORE");
        setupAppium("localURL");
    }


    @After
    public void closeAppSwitch() {
        System.out.println("HOOK AFTER");
  //      driver.resetApp();
    }


    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
 //       System.out.println("Before every step " + scenario.getName());
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        //System.out.println("Before every step " + stepTestStep.getId());
    }

}
