package dev.ganto.shop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comments {
    private int id;
    private String content;
    private String publisher;
    private String createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        System.out.println("----------------------------------------" + createtime);
        if(createtime != null && createtime.trim() != "" && createtime.trim().length() != 0) {
            this.createtime = createtime;
        }else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.createtime = sdf.format(new Date());
        }
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", publisher='" + publisher + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
