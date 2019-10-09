package com.efostach.creational.prototype;

public class CloudConfiguration implements Copyable{

    private int id;
    private String cloudName;
    private String cloudConfiguration;

    public CloudConfiguration(int id, String cloudName, String cloudConfiguration) {
        this.id = id;
        this.cloudName = cloudName;
        this.cloudConfiguration = cloudConfiguration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCloudName() {
        return cloudName;
    }

    public void setCloudName(String cloudName) {
        this.cloudName = cloudName;
    }

    public String getCloudConfiguration() {
        return cloudConfiguration;
    }

    public void setCloudConfiguration(String cloudConfiguration) {
        this.cloudConfiguration = cloudConfiguration;
    }

    @Override
    public Object copy() {
        CloudConfiguration copy = new CloudConfiguration(id, cloudName, cloudConfiguration);
        return copy;
    }

    @Override
    public String toString() {
        return "CloudConfiguration{" +
                "id=" + id +
                ", cloudName='" + cloudName + '\'' +
                ", cloudConfiguration='" + cloudConfiguration + '\'' +
                '}';
    }
}
