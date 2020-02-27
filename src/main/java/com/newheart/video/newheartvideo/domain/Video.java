package com.newheart.video.newheartvideo.domain;


public class Video {

  private int id;
  private String title;
  private String summary;
  private String coverImg;
  private int viewNum;
  private int price;
  private java.sql.Timestamp createTime;
  private int online;
  private double point;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public int getViewNum() {
    return viewNum;
  }

  public void setViewNum(int viewNum) {
    this.viewNum = viewNum;
  }


  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public int getOnline() {
    return online;
  }

  public void setOnline(int online) {
    this.online = online;
  }


  public double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }

}
