package com.boke.imiloan.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */

public class CreditProductListBean {

    /**
     * data : [{"id":1,"productName":"中国银行大额取现卡","productLabel":"积分可兑换3000多种礼品，还可兑换航空","saledcount":0,"productsummary":"年费150/年，免首年年费，刷卡6次免次年年费。单笔消费大1500元 即可自由分期","productCode":"PC01111","supplierId":25,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":"qwefdsg2","clickCount":21},{"id":2,"productName":"交通银行沃尔玛黑卡","productLabel":"十分优惠","saledcount":1,"productsummary":"办卡8折优惠","productCode":"PC00001","supplierId":32,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":"www.baidu.com","clickCount":22}]
     * errorCode : 0
     * status : 1
     * message : null
     */

    private String errorCode;
    private int status;
    private Object message;
    private List<DataBean> data;

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

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * productName : 中国银行大额取现卡
         * productLabel : 积分可兑换3000多种礼品，还可兑换航空
         * saledcount : 0
         * productsummary : 年费150/年，免首年年费，刷卡6次免次年年费。单笔消费大1500元 即可自由分期
         * productCode : PC01111
         * supplierId : 25
         * supplierName : null
         * mainimage : http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg
         * shelfflag : null
         * shelfflagName : null
         * shelftime : null
         * thirdpartyUrl : qwefdsg2
         * clickCount : 21
         */

        private int id;
        private String productName;
        private String productLabel;
        private int saledcount;
        private String productsummary;
        private String productCode;
        private int supplierId;
        private Object supplierName;
        private String mainimage;
        private Object shelfflag;
        private Object shelfflagName;
        private Object shelftime;
        private String thirdpartyUrl;
        private int clickCount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductLabel() {
            return productLabel;
        }

        public void setProductLabel(String productLabel) {
            this.productLabel = productLabel;
        }

        public int getSaledcount() {
            return saledcount;
        }

        public void setSaledcount(int saledcount) {
            this.saledcount = saledcount;
        }

        public String getProductsummary() {
            return productsummary;
        }

        public void setProductsummary(String productsummary) {
            this.productsummary = productsummary;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public int getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(int supplierId) {
            this.supplierId = supplierId;
        }

        public Object getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(Object supplierName) {
            this.supplierName = supplierName;
        }

        public String getMainimage() {
            return mainimage;
        }

        public void setMainimage(String mainimage) {
            this.mainimage = mainimage;
        }

        public Object getShelfflag() {
            return shelfflag;
        }

        public void setShelfflag(Object shelfflag) {
            this.shelfflag = shelfflag;
        }

        public Object getShelfflagName() {
            return shelfflagName;
        }

        public void setShelfflagName(Object shelfflagName) {
            this.shelfflagName = shelfflagName;
        }

        public Object getShelftime() {
            return shelftime;
        }

        public void setShelftime(Object shelftime) {
            this.shelftime = shelftime;
        }

        public String getThirdpartyUrl() {
            return thirdpartyUrl;
        }

        public void setThirdpartyUrl(String thirdpartyUrl) {
            this.thirdpartyUrl = thirdpartyUrl;
        }

        public int getClickCount() {
            return clickCount;
        }

        public void setClickCount(int clickCount) {
            this.clickCount = clickCount;
        }
    }
}
