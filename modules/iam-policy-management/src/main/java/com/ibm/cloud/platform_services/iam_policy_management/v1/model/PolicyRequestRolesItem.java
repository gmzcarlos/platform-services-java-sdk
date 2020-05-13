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
 * PolicyRequestRolesItem.
 */
public class PolicyRequestRolesItem extends GenericModel {

  @SerializedName("role_id")
  protected String roleId;

  /**
   * Builder.
   */
  public static class Builder {
    private String roleId;

    private Builder(PolicyRequestRolesItem policyRequestRolesItem) {
      this.roleId = policyRequestRolesItem.roleId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param roleId the roleId
     */
    public Builder(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Builds a PolicyRequestRolesItem.
     *
     * @return the new PolicyRequestRolesItem instance
     */
    public PolicyRequestRolesItem build() {
      return new PolicyRequestRolesItem(this);
    }

    /**
     * Set the roleId.
     *
     * @param roleId the roleId
     * @return the PolicyRequestRolesItem builder
     */
    public Builder roleId(String roleId) {
      this.roleId = roleId;
      return this;
    }
  }

  protected PolicyRequestRolesItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.roleId,
      "roleId cannot be null");
    roleId = builder.roleId;
  }

  /**
   * New builder.
   *
   * @return a PolicyRequestRolesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the roleId.
   *
   * A role cloud resource name (CRN).
   *
   * @return the roleId
   */
  public String roleId() {
    return roleId;
  }
}

