package pojo;

/*
品牌

实体类中建议使用对应的包装类型
 */

public class Brand {
    //id 主键
    private Integer id;
    //品牌名称
    private String brandName;
    //企业名称
    private String companyName;
    //排序
    private Integer order;
    //描述信息
    private String description;
    //状态 0禁用 1启用
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", order=" + order +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
