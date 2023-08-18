package com.mtbp;

import com.mbtp.business.service.ScreeningServiceIntegrationTest;
import com.mtbp.data.repository.ScreeningRepositoryIntegrationTest;
import com.mtbp.web.application.ScreeningControllerIntegrationTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ScreeningServiceIntegrationTest.class, ScreeningControllerIntegrationTest.class,
        ScreeningRepositoryIntegrationTest.class})
public class MovieScreeningTestSuite {
}
