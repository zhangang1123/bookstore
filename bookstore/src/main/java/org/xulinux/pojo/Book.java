package org.xulinux.pojo;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午3:44
 */
public class Book {
    private int id;
    private String name;
    private String url;
    private String describe;
    private String type;
    private int downloads;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", describe='" + describe + '\'' +
                ", type='" + type + '\'' +
                ", downloads=" + downloads +
                '}';
    }
}
