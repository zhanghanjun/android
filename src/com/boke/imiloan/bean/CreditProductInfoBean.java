package com.boke.imiloan.bean;

/**
 * Created by Administrator on 2017/3/16.
 */

public class CreditProductInfoBean {


    /**
     * data : {"id":null,"productname":"中国银行大额取现卡","productlabel":"积分可兑换3000多种礼品，还可兑换航空","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","productsummary":"年费150/年，免首年年费，刷卡6次免次年年费。单笔消费大1500元 即可自由分期","amount":7}
     * errorCode : 0
     * status : 1
     * message : 成功
     */

    private DataBean data;
    private String errorCode;
    private int status;
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * id : null
         * productname : 中国银行大额取现卡
         * productlabel : 积分可兑换3000多种礼品，还可兑换航空
         * mainimage : http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg
         * productsummary : 年费150/年，免首年年费，刷卡6次免次年年费。单笔消费大1500元 即可自由分期
         * amount : 7
         */

        private Object id;
        private String productname;
        private String productlabel;
        private String mainimage;
        private String productsummary;
        private int amount;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getProductlabel() {
            return productlabel;
        }

        public void setProductlabel(String productlabel) {
            this.productlabel = productlabel;
        }

        public String getMainimage() {
            return mainimage;
        }

        public void setMainimage(String mainimage) {
            this.mainimage = mainimage;
        }

        public String getProductsummary() {
            return productsummary;
        }

        public void setProductsummary(String productsummary) {
            this.productsummary = productsummary;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
