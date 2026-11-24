package com.bootcamp.descuento.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DiscountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-23T14:25:51.291308358-06:00[America/Mexico_City]")
public class DiscountResponse {

  private Long productId;

  private BigDecimal percentage;

  private String description;

  public DiscountResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DiscountResponse(Long productId, BigDecimal percentage, String description) {
    this.productId = productId;
    this.percentage = percentage;
    this.description = description;
  }

  public DiscountResponse productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @NotNull 
  @Schema(name = "productId", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public DiscountResponse percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Porcentaje de descuento (0 a 100) con 2 decimales
   * minimum: 0
   * maximum: 100
   * @return percentage
  */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "percentage", example = "10.0", description = "Porcentaje de descuento (0 a 100) con 2 decimales", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percentage")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public DiscountResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull @Size(min = 1, max = 120) 
  @Schema(name = "description", example = "Promo septiembre", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountResponse discountResponse = (DiscountResponse) o;
    return Objects.equals(this.productId, discountResponse.productId) &&
        Objects.equals(this.percentage, discountResponse.percentage) &&
        Objects.equals(this.description, discountResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, percentage, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountResponse {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

