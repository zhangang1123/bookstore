package org.xulinux.pojo;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午2:13
 */
public class Tag {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
