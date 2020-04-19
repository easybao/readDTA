package com.lvcai;


public class Demo {
    private Integer uniqueId;
    private Integer sectionId;
    private String channelName;
    private String programName;
    private Integer duration;
    private String updateTime;
    private Integer channelId;
    private Integer type;
    private Integer sequence;
    String startTime;
    String endTime;
    boolean biggiePlayPage;
    String createTime;
    boolean isFree;

    @Override
    public String toString() {
        return "Demo{" +
                "uniqueId=" + uniqueId +
                ", sectionId=" + sectionId +
                ", channelName='" + channelName + '\'' +
                ", programName='" + programName + '\'' +
                ", duration=" + duration +
                ", updateTime='" + updateTime + '\'' +
                ", channelId=" + channelId +
                ", type=" + type +
                ", sequence=" + sequence +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", biggiePlayPage=" + biggiePlayPage +
                ", createTime='" + createTime + '\'' +
                ", isFree=" + isFree +
                '}';
    }

    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isBiggiePlayPage() {
        return biggiePlayPage;
    }

    public void setBiggiePlayPage(boolean biggiePlayPage) {
        this.biggiePlayPage = biggiePlayPage;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
