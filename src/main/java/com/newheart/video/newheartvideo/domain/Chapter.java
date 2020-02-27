package com.newheart.video.newheartvideo.domain;


public class Chapter {

  private int id;
  private int videoId;
  private String title;
  private int ordered;
  private java.sql.Timestamp createTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getVideoId() {
    return videoId;
  }

  public void setVideoId(int videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public int getOrdered() {
    return ordered;
  }

  public void setOrdered(int ordered) {
    this.ordered = ordered;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
