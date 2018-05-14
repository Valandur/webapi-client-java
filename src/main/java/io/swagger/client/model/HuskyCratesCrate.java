/*
 * Web-API
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # List endpoints Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  > Remember that in this case the data returned by the endpoint might be quite large.  # Debugging endpoints Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  `details`: Includes details for list endpoints  `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  `pretty`: Pretty prints the data, also good for debugging in the browser.  An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)
 *
 * OpenAPI spec version: @version@
 * Contact: inithilian@gmail.com
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
import io.swagger.client.model.HuskyCratesCrateReward;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HuskyCratesCrate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T13:42:56.227+02:00")
public class HuskyCratesCrate {
  @SerializedName("free")
  private Boolean free = null;

  @SerializedName("freeDelay")
  private Integer freeDelay = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rewards")
  private List<HuskyCratesCrateReward> rewards = new ArrayList<HuskyCratesCrateReward>();

  @SerializedName("scrambleRewards")
  private Boolean scrambleRewards = null;

  /**
   * The type of crate
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SPINNER("Spinner"),
    
    ROULETTE("Roulette"),
    
    INSTANT("Instant"),
    
    SIMPLE("Simple");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public HuskyCratesCrate free(Boolean free) {
    this.free = free;
    return this;
  }

   /**
   * True if this crate is free to open, false otherwise
   * @return free
  **/
  @ApiModelProperty(required = true, value = "True if this crate is free to open, false otherwise")
  public Boolean isFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  public HuskyCratesCrate freeDelay(Integer freeDelay) {
    this.freeDelay = freeDelay;
    return this;
  }

   /**
   * In case this crate is free, this interval specifies the time (in seconds) after which this crate can be opened again
   * @return freeDelay
  **/
  @ApiModelProperty(required = true, value = "In case this crate is free, this interval specifies the time (in seconds) after which this crate can be opened again")
  public Integer getFreeDelay() {
    return freeDelay;
  }

  public void setFreeDelay(Integer freeDelay) {
    this.freeDelay = freeDelay;
  }

  public HuskyCratesCrate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this crate
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of this crate")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public HuskyCratesCrate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the crate
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the crate")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HuskyCratesCrate rewards(List<HuskyCratesCrateReward> rewards) {
    this.rewards = rewards;
    return this;
  }

  public HuskyCratesCrate addRewardsItem(HuskyCratesCrateReward rewardsItem) {
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * The possible rewards awarded for opening this crate
   * @return rewards
  **/
  @ApiModelProperty(required = true, value = "The possible rewards awarded for opening this crate")
  public List<HuskyCratesCrateReward> getRewards() {
    return rewards;
  }

  public void setRewards(List<HuskyCratesCrateReward> rewards) {
    this.rewards = rewards;
  }

  public HuskyCratesCrate scrambleRewards(Boolean scrambleRewards) {
    this.scrambleRewards = scrambleRewards;
    return this;
  }

   /**
   * True if the rewards are scrambled, false otherwise
   * @return scrambleRewards
  **/
  @ApiModelProperty(required = true, value = "True if the rewards are scrambled, false otherwise")
  public Boolean isScrambleRewards() {
    return scrambleRewards;
  }

  public void setScrambleRewards(Boolean scrambleRewards) {
    this.scrambleRewards = scrambleRewards;
  }

  public HuskyCratesCrate type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of crate
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of crate")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HuskyCratesCrate huskyCratesCrate = (HuskyCratesCrate) o;
    return Objects.equals(this.free, huskyCratesCrate.free) &&
        Objects.equals(this.freeDelay, huskyCratesCrate.freeDelay) &&
        Objects.equals(this.id, huskyCratesCrate.id) &&
        Objects.equals(this.link, huskyCratesCrate.link) &&
        Objects.equals(this.name, huskyCratesCrate.name) &&
        Objects.equals(this.rewards, huskyCratesCrate.rewards) &&
        Objects.equals(this.scrambleRewards, huskyCratesCrate.scrambleRewards) &&
        Objects.equals(this.type, huskyCratesCrate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(free, freeDelay, id, link, name, rewards, scrambleRewards, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuskyCratesCrate {\n");
    
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    freeDelay: ").append(toIndentedString(freeDelay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    scrambleRewards: ").append(toIndentedString(scrambleRewards)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
