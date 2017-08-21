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
package utils;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.lang3.StringUtils;
import play.Logger;
import play.Play;
import play.libs.Json;


public class Tree {
  public static JsonNode loadTreeJsonNode(String key) {
    if (StringUtils.isNotBlank(key)) {
      String treeName = Play.application().configuration().getString(key);
      if (StringUtils.isNotBlank(treeName)) {
        try {
          return Json.parse(new FileInputStream(new File(treeName)));
        } catch (Exception e) {
          Logger.error(e.getMessage());
        }
      }
    }

    return Json.toJson("");
  }
}
