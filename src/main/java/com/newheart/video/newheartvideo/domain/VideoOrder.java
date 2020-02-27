package com.newheart.video.newheartvideo.domain;


public class VideoOrder {

  private int id;
  private String openid;
  private String outTradeNo;
  private int state;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp notifyTime;
  private int totalFee;
  private String nickname;
  private String headImg;
  private int videoId;
  private String videoTitle;
  private String videoImg;
  private int userId;
  private String ip;
  private int del;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getNotifyTime() {
    return notifyTime;
  }

  public void setNotifyTime(java.sql.Timestamp notifyTime) {
    this.notifyTime = notifyTime;
  }


  public int getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(int totalFee) {
    this.totalFee = totalFee;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public int getVideoId() {
    return videoId;
  }

  public void setVideoId(int videoId) {
    this.videoId = videoId;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoImg() {
    return videoImg;
  }

  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public int getDel() {
    return del;
  }

  public void setDel(int del) {
    this.del = del;
  }

}
