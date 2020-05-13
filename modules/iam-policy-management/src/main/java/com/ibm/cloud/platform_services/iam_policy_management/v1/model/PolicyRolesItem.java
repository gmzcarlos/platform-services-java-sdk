/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PolicyRolesItem.
 */
public class PolicyRolesItem extends GenericModel {

  @SerializedName("role_id")
  protected String roleId;
  @SerializedName("display_name")
  protected String displayName;
  protected String description;

  /**
   * Gets the roleId.
   *
   * The role cloud resource name granted by the policy.
   *
   * @return the roleId
   */
  public String getRoleId() {
    return roleId;
  }

  /**
   * Gets the displayName.
   *
   * The display name of the role.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the description.
   *
   * The description of the role.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }
}

