package com.asiainfo.ahato.shiro.constant;

/**
 * @Author kezh
 * @Function : ����״̬ö��
 * @Date 2021/1/13 15:32
 */
public enum DimissionEnum {

    TAG_0(0,"����"),
    TAG_1(1,"ʧЧ"),
    TAG_2(2,"����");

    private int code;
    private String description;

    DimissionEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}