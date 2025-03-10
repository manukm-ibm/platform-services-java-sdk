/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.context_based_restrictions.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Service API Type details.
 */
public class APIType extends GenericModel {

  @SerializedName("api_type_id")
  protected String apiTypeId;
  @SerializedName("display_name")
  protected String displayName;
  protected String description;
  protected String type;
  protected List<Action> actions;
  @SerializedName("enforcement_modes")
  protected List<String> enforcementModes;

  protected APIType() { }

  /**
   * Gets the apiTypeId.
   *
   * The id of the API type.
   *
   * @return the apiTypeId
   */
  public String getApiTypeId() {
    return apiTypeId;
  }

  /**
   * Gets the displayName.
   *
   * The displayed name of the API type.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the description.
   *
   * The description of the API type.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * The type of the API type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the actions.
   *
   * The actions available for the API type.
   *
   * @return the actions
   */
  public List<Action> getActions() {
    return actions;
  }

  /**
   * Gets the enforcementModes.
   *
   * The enforcement modes supported by the API type.
   *
   * @return the enforcementModes
   */
  public List<String> getEnforcementModes() {
    return enforcementModes;
  }
}

