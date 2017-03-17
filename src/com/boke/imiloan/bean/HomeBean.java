package com.boke.imiloan.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */

public class HomeBean {

    /**
     * data : {"banners":[{"id":3,"createBy":"maxb","createTime":1489461762000,"updateBy":"maxb","updateTime":1489461765000,"memo":"sdf","prepic":"http://pic66.nipic.com/file/20150507/7755667_212101166669_2.jpg","isDefault":1,"targeturl":"www.baidu.com","isValid":0,"type":1},{"id":18,"createBy":null,"createTime":null,"updateBy":null,"updateTime":null,"memo":"www.baidu.com","prepic":"http://img1.3lian.com/2015/a2/232/d/110.jpg","isDefault":1,"targeturl":"www.baidu.com","isValid":0,"type":1},{"id":21,"createBy":null,"createTime":null,"updateBy":null,"updateTime":null,"memo":"baidu","prepic":"http://img1.3lian.com/2015/a2/232/d/110.jpg","isDefault":1,"targeturl":"baidu","isValid":0,"type":1}],"productEntity":[{"id":1,"createBy":"maxuebin","createTime":1489400009000,"productId":null,"linkurl":null,"classify":"sdf","sort":1,"isValid":0,"updataTime":null,"updataBy":null},{"id":2,"createBy":"msdf","createTime":1489400041000,"productId":null,"linkurl":null,"classify":"435","sort":0,"isValid":0,"updataTime":null,"updataBy":null}],"productfineinfodto":[{"id":1,"providerName":null,"productName":"房产贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":1},{"id":1,"providerName":"中国银行","productName":"中国银行大额取现卡","saledcount":0,"productLabel":"积分可兑换3000多种礼品，还可兑换航空","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":2},{"id":2,"providerName":null,"productName":"小额贷贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":2},{"id":2,"providerName":null,"productName":"交通银行沃尔玛黑卡","saledcount":1,"productLabel":"十分优惠","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":4}],"productloanentity":null}
     * errorCode : null
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
         * banners : [{"id":3,"createBy":"maxb","createTime":1489461762000,"updateBy":"maxb","updateTime":1489461765000,"memo":"sdf","prepic":"http://pic66.nipic.com/file/20150507/7755667_212101166669_2.jpg","isDefault":1,"targeturl":"www.baidu.com","isValid":0,"type":1},{"id":18,"createBy":null,"createTime":null,"updateBy":null,"updateTime":null,"memo":"www.baidu.com","prepic":"http://img1.3lian.com/2015/a2/232/d/110.jpg","isDefault":1,"targeturl":"www.baidu.com","isValid":0,"type":1},{"id":21,"createBy":null,"createTime":null,"updateBy":null,"updateTime":null,"memo":"baidu","prepic":"http://img1.3lian.com/2015/a2/232/d/110.jpg","isDefault":1,"targeturl":"baidu","isValid":0,"type":1}]
         * productEntity : [{"id":1,"createBy":"maxuebin","createTime":1489400009000,"productId":null,"linkurl":null,"classify":"sdf","sort":1,"isValid":0,"updataTime":null,"updataBy":null},{"id":2,"createBy":"msdf","createTime":1489400041000,"productId":null,"linkurl":null,"classify":"435","sort":0,"isValid":0,"updataTime":null,"updataBy":null}]
         * productfineinfodto : [{"id":1,"providerName":null,"productName":"房产贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":1},{"id":1,"providerName":"中国银行","productName":"中国银行大额取现卡","saledcount":0,"productLabel":"积分可兑换3000多种礼品，还可兑换航空","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":2},{"id":2,"providerName":null,"productName":"小额贷贷","saledcount":3,"productLabel":"银行","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0.02,"type":2,"sort":2},{"id":2,"providerName":null,"productName":"交通银行沃尔玛黑卡","saledcount":1,"productLabel":"十分优惠","mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","minRate":0,"type":1,"sort":4}]
         * productloanentity : null
         */

        private Object productloanentity;
        private List<BannersBean> banners;
        private List<ProductEntityBean> productEntity;
        private List<ProductfineinfodtoBean> productfineinfodto;

        public Object getProductloanentity() {
            return productloanentity;
        }

        public void setProductloanentity(Object productloanentity) {
            this.productloanentity = productloanentity;
        }

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public List<ProductEntityBean> getProductEntity() {
            return productEntity;
        }

        public void setProductEntity(List<ProductEntityBean> productEntity) {
            this.productEntity = productEntity;
        }

        public List<ProductfineinfodtoBean> getProductfineinfodto() {
            return productfineinfodto;
        }

        public void setProductfineinfodto(List<ProductfineinfodtoBean> productfineinfodto) {
            this.productfineinfodto = productfineinfodto;
        }

        public static class BannersBean {
            /**
             * id : 3
             * createBy : maxb
             * createTime : 1489461762000
             * updateBy : maxb
             * updateTime : 1489461765000
             * memo : sdf
             * prepic : http://pic66.nipic.com/file/20150507/7755667_212101166669_2.jpg
             * isDefault : 1
             * targeturl : www.baidu.com
             * isValid : 0
             * type : 1
             */

            private int id;
            private String createBy;
            private long createTime;
            private String updateBy;
            private long updateTime;
            private String memo;
            private String prepic;
            private int isDefault;
            private String targeturl;
            private int isValid;
            private int type;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public String getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public String getMemo() {
                return memo;
            }

            public void setMemo(String memo) {
                this.memo = memo;
            }

            public String getPrepic() {
                return prepic;
            }

            public void setPrepic(String prepic) {
                this.prepic = prepic;
            }

            public int getIsDefault() {
                return isDefault;
            }

            public void setIsDefault(int isDefault) {
                this.isDefault = isDefault;
            }

            public String getTargeturl() {
                return targeturl;
            }

            public void setTargeturl(String targeturl) {
                this.targeturl = targeturl;
            }

            public int getIsValid() {
                return isValid;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class ProductEntityBean {
            /**
             * id : 1
             * createBy : maxuebin
             * createTime : 1489400009000
             * productId : null
             * linkurl : null
             * classify : sdf
             * sort : 1
             * isValid : 0
             * updataTime : null
             * updataBy : null
             */

            private int id;
            private String createBy;
            private long createTime;
            private Object productId;
            private Object linkurl;
            private String classify;
            private int sort;
            private int isValid;
            private Object updataTime;
            private Object updataBy;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public Object getProductId() {
                return productId;
            }

            public void setProductId(Object productId) {
                this.productId = productId;
            }

            public Object getLinkurl() {
                return linkurl;
            }

            public void setLinkurl(Object linkurl) {
                this.linkurl = linkurl;
            }

            public String getClassify() {
                return classify;
            }

            public void setClassify(String classify) {
                this.classify = classify;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getIsValid() {
                return isValid;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public Object getUpdataTime() {
                return updataTime;
            }

            public void setUpdataTime(Object updataTime) {
                this.updataTime = updataTime;
            }

            public Object getUpdataBy() {
                return updataBy;
            }

            public void setUpdataBy(Object updataBy) {
                this.updataBy = updataBy;
            }
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
