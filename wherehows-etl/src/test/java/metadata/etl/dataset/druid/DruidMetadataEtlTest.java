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
package metadata.etl.dataset.druid;

import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DruidMetadataEtlTest {
  DruidMetadataEtl dm;

  @BeforeTest
  public void setUp() throws Exception {
    dm = new DruidMetadataEtl(1, 0L, new Properties());
  }

  @Test
  public void extractorTest() throws Exception {
    dm.extract();
  }

  @Test
  public void transformTest() throws Exception {
    dm.transform();
  }

  @Test
  public void loadTest() throws Exception {
    dm.load();
  }
}
