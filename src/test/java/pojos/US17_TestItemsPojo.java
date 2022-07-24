package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US17_TestItemsPojo {
    /*
    {
      "createdBy": "string",
      "createdDate": "2022-07-20T13:22:24.318Z",
      "defaultValMax": "string",
      "defaultValMin": "string",
      "description": "string",
      "id": 0,
      "name": "string",
      "price": 0
    }
     */
    private String createdBy;
    private String defaultValMax;
    private String getDefaultValMin;
    private String description;
    private int id;
    private String name;
    private int price;

    public US17_TestItemsPojo() {
    }

    public US17_TestItemsPojo(String createdBy, String defaultValMax, String getDefaultValMin, String description, int id, String name, int price) {
        this.createdBy = createdBy;
        this.defaultValMax = defaultValMax;
        this.getDefaultValMin = getDefaultValMin;
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public String getGetDefaultValMin() {
        return getDefaultValMin;
    }

    public void setGetDefaultValMin(String getDefaultValMin) {
        this.getDefaultValMin = getDefaultValMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "US_17_Test_Items{" +
                "createdBy='" + createdBy + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", getDefaultValMin='" + getDefaultValMin + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}

