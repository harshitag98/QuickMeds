package com.example.harshitagrawal.quickmeds;

public class OrderList {
    String id,docName,userName,status;
    String med1,med2,med3,med4,med5;
    String quan1,quan2,quan3,quan4,quan5;
    public OrderList()
    {

    }

    public OrderList(String id,String docName, String userName, String status, String med1, String med2, String med3, String med4, String med5, String quan1, String quan2, String quan3, String quan4, String quan5) {
        this.id=id;
        this.docName = docName;
        this.userName = userName;
        this.status = status;
        this.med1 = med1;
        this.med2 = med2;
        this.med3 = med3;
        this.med4 = med4;
        this.med5 = med5;
        this.quan1 = quan1;
        this.quan2 = quan2;
        this.quan3 = quan3;
        this.quan4 = quan4;
        this.quan5 = quan5;
    }

    public String getId() {
        return id;
    }

    public String getDocName() {
        return docName;
    }

    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public String getMed1() {
        return med1;
    }

    public String getMed2() {
        return med2;
    }

    public String getMed3() {
        return med3;
    }

    public String getMed4() {
        return med4;
    }

    public String getMed5() {
        return med5;
    }

    public String getQuan1() {
        return quan1;
    }

    public String getQuan2() {
        return quan2;
    }

    public String getQuan3() {
        return quan3;
    }

    public String getQuan4() {
        return quan4;
    }

    public String getQuan5() {
        return quan5;
    }
}
