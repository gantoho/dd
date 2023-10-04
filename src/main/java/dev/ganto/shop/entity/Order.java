package dev.ganto.shop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private int id;
    private String ordernumber;
    private String ordercontent;
    private String orderaddress;
    private String orderremarks;
    private int orderquantity;
    private String createtime;
    private int uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        if(ordernumber != null && ordernumber.trim() != "" && ordernumber.trim().length() != 0) {
            this.ordernumber = ordernumber;
        }else{
            this.ordernumber = String.valueOf( new Date().getTime());
        }
    }

    public String getOrdercontent() {
        return ordercontent;
    }

    public void setOrdercontent(String ordercontent) {
        this.ordercontent = ordercontent;
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public void setOrderaddress(String orderaddress) {
        this.orderaddress = orderaddress;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks;
    }

    public int getOrderquantity() {
        return orderquantity;
    }

    public void setOrderquantity(int orderquantity) {
        this.orderquantity = orderquantity;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        if(createtime != null && createtime.trim() != "" && createtime.trim().length() != 0) {
            this.createtime = createtime;
        }else{
            // this.createtime = String.valueOf( new Date().getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.createtime = sdf.format(new Date());
        }
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordernumber='" + ordernumber + '\'' +
                ", ordercontent='" + ordercontent + '\'' +
                ", orderaddress='" + orderaddress + '\'' +
                ", orderremarks='" + orderremarks + '\'' +
                ", orderquantity=" + orderquantity +
                ", createtime='" + createtime + '\'' +
                ", uid=" + uid +
                '}';
    }
}
