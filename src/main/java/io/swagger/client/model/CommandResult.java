/*
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
 *
 * OpenAPI spec version: <version>
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CommandResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class CommandResult {
  @SerializedName("affectedBlocks")
  private BigDecimal affectedBlocks = null;

  @SerializedName("affectedEntities")
  private BigDecimal affectedEntities = null;

  @SerializedName("affectedItems")
  private BigDecimal affectedItems = null;

  @SerializedName("queryResult")
  private BigDecimal queryResult = null;

  @SerializedName("successCount")
  private BigDecimal successCount = null;

  public CommandResult affectedBlocks(BigDecimal affectedBlocks) {
    this.affectedBlocks = affectedBlocks;
    return this;
  }

   /**
   * The number of block that were affected.
   * @return affectedBlocks
  **/
  @ApiModelProperty(value = "The number of block that were affected.")
  public BigDecimal getAffectedBlocks() {
    return affectedBlocks;
  }

  public void setAffectedBlocks(BigDecimal affectedBlocks) {
    this.affectedBlocks = affectedBlocks;
  }

  public CommandResult affectedEntities(BigDecimal affectedEntities) {
    this.affectedEntities = affectedEntities;
    return this;
  }

   /**
   * The number of entities that were affected.
   * @return affectedEntities
  **/
  @ApiModelProperty(value = "The number of entities that were affected.")
  public BigDecimal getAffectedEntities() {
    return affectedEntities;
  }

  public void setAffectedEntities(BigDecimal affectedEntities) {
    this.affectedEntities = affectedEntities;
  }

  public CommandResult affectedItems(BigDecimal affectedItems) {
    this.affectedItems = affectedItems;
    return this;
  }

   /**
   * The number of items that were affected.
   * @return affectedItems
  **/
  @ApiModelProperty(value = "The number of items that were affected.")
  public BigDecimal getAffectedItems() {
    return affectedItems;
  }

  public void setAffectedItems(BigDecimal affectedItems) {
    this.affectedItems = affectedItems;
  }

  public CommandResult queryResult(BigDecimal queryResult) {
    this.queryResult = queryResult;
    return this;
  }

   /**
   * The query result number.
   * @return queryResult
  **/
  @ApiModelProperty(value = "The query result number.")
  public BigDecimal getQueryResult() {
    return queryResult;
  }

  public void setQueryResult(BigDecimal queryResult) {
    this.queryResult = queryResult;
  }

  public CommandResult successCount(BigDecimal successCount) {
    this.successCount = successCount;
    return this;
  }

   /**
   * The success count.
   * @return successCount
  **/
  @ApiModelProperty(value = "The success count.")
  public BigDecimal getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(BigDecimal successCount) {
    this.successCount = successCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandResult commandResult = (CommandResult) o;
    return Objects.equals(this.affectedBlocks, commandResult.affectedBlocks) &&
        Objects.equals(this.affectedEntities, commandResult.affectedEntities) &&
        Objects.equals(this.affectedItems, commandResult.affectedItems) &&
        Objects.equals(this.queryResult, commandResult.queryResult) &&
        Objects.equals(this.successCount, commandResult.successCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedBlocks, affectedEntities, affectedItems, queryResult, successCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandResult {\n");
    
    sb.append("    affectedBlocks: ").append(toIndentedString(affectedBlocks)).append("\n");
    sb.append("    affectedEntities: ").append(toIndentedString(affectedEntities)).append("\n");
    sb.append("    affectedItems: ").append(toIndentedString(affectedItems)).append("\n");
    sb.append("    queryResult: ").append(toIndentedString(queryResult)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

