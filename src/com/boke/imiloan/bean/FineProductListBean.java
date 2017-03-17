package com.boke.imiloan.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */

public class FineProductListBean {


    /**
     * data : {"banners":null,"productEntity":null,"productfineinfodto":[{"id":1,"providerName":null,"productName":"房产贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":1},{"id":1,"providerName":"中国银行","productName":"中国银行大额取现卡","saledcount":0,"productLabel":"积分可兑换3000多种礼品，还可兑换航空","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":2},{"id":2,"providerName":null,"productName":"小额贷贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":2},{"id":2,"providerName":null,"productName":"交通银行沃尔玛黑卡","saledcount":1,"productLabel":"十分优惠","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":4}],"productloanentity":null}
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
         * banners : null
         * productEntity : null
         * productfineinfodto : [{"id":1,"providerName":null,"productName":"房产贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":1},{"id":1,"providerName":"中国银行","productName":"中国银行大额取现卡","saledcount":0,"productLabel":"积分可兑换3000多种礼品，还可兑换航空","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":2},{"id":2,"providerName":null,"productName":"小额贷贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":2},{"id":2,"providerName":null,"productName":"交通银行沃尔玛黑卡","saledcount":1,"productLabel":"十分优惠","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":4}]
         * productloanentity : null
         */

        private Object banners;
        private Object productEntity;
        private Object productloanentity;
        private List<ProductfineinfodtoBean> productfineinfodto;

        public Object getBanners() {
            return banners;
        }

        public void setBanners(Object banners) {
            this.banners = banners;
        }

        public Object getProductEntity() {
            return productEntity;
        }

        public void setProductEntity(Object productEntity) {
            this.productEntity = productEntity;
        }

        public Object getProductloanentity() {
            return productloanentity;
        }

        public void setProductloanentity(Object productloanentity) {
            this.productloanentity = productloanentity;
        }

        public List<ProductfineinfodtoBean> getProductfineinfodto() {
            return productfineinfodto;
        }

        public void setProductfineinfodto(List<ProductfineinfodtoBean> productfineinfodto) {
            this.productfineinfodto = productfineinfodto;
        }

        public static class ProductfineinfodtoBean {
            /**
             * id : 1
             * providerName : null
             * productName : 房产贷
             * saledcount : 3
             * productLabel : 银行
             * mainimage : http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg
             * minRate : 0.02
             * type : 2
             * sort : 1
             */

            private int id;
            private Object providerName;
            private String productName;
            private int saledcount;
            private String productLabel;
            private String mainimage;
            private double minRate;
            private int type;
            private int sort;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getProviderName() {
                return providerName;
            }

            public void setProviderName(Object providerName) {
                this.providerName = providerName;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public int getSaledcount() {
                return saledcount;
            }

            public void setSaledcount(int saledcount) {
                this.saledcount = saledcount;
            }

            public String getProductLabel() {
                return productLabel;
            }

            public void setProductLabel(String productLabel) {
                this.productLabel = productLabel;
            }

            public String getMainimage() {
                return mainimage;
            }

            public void setMainimage(String mainimage) {
                this.mainimage = mainimage;
            }

            public double getMinRate() {
                return minRate;
            }

            public void setMinRate(double minRate) {
                this.minRate = minRate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }
        }
    }
}
