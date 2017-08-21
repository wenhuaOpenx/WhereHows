/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package metadata.etl.models;

import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;
import wherehows.common.jobs.JobFactory;


public class EtlJobFactoryTest {

  @Test
  public void testGetEtlJob() throws Exception {
    Properties properties = new Properties();
    DummyEtlJob job = (DummyEtlJob) JobFactory.getJob(DummyEtlJob.class.getCanonicalName(), 1, 2L, properties);

    Assert.assertEquals(job.refId, 1);
    Assert.assertEquals(job.whExecId, 2L);
    Assert.assertEquals(job.properties, properties);
  }
}
