package com.boke.imiloan.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */

public class LoanProductListBean {


    /**
     * data : {"banners":null,"productEntity":null,"productfineinfodto":null,"productloanentity":[{"id":1,"classifyId":null,"productType":null,"productName":"房产贷","productLabel":null,"saledcount":7,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.02,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":2,"classifyId":null,"productType":null,"productName":"小额贷贷","productLabel":null,"saledcount":3,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.02,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":9,"classifyId":null,"productType":null,"productName":"阿双方的部分","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.2,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":11,"classifyId":null,"productType":null,"productName":"又是欢乐贷","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.66,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":12,"classifyId":null,"productType":null,"productName":"啊第三次撒","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.23,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":13,"classifyId":null,"productType":null,"productName":"阿萨德vgf","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.11,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":14,"classifyId":null,"productType":null,"productName":"发表发表","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":11,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":15,"classifyId":null,"productType":null,"productName":"飞的候鸟","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":17,"classifyId":null,"productType":null,"productName":"大v分v被","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":18,"classifyId":null,"productType":null,"productName":"发送时间","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null}]}
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
         * productfineinfodto : null
         * productloanentity : [{"id":1,"classifyId":null,"productType":null,"productName":"房产贷","productLabel":null,"saledcount":7,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.02,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":2,"classifyId":null,"productType":null,"productName":"小额贷贷","productLabel":null,"saledcount":3,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.02,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":9,"classifyId":null,"productType":null,"productName":"阿双方的部分","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.2,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":11,"classifyId":null,"productType":null,"productName":"又是欢乐贷","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.66,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":12,"classifyId":null,"productType":null,"productName":"啊第三次撒","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.23,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":13,"classifyId":null,"productType":null,"productName":"阿萨德vgf","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":0.11,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":14,"classifyId":null,"productType":null,"productName":"发表发表","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":11,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":15,"classifyId":null,"productType":null,"productName":"飞的候鸟","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":17,"classifyId":null,"productType":null,"productName":"大v分v被","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null},{"id":18,"classifyId":null,"productType":null,"productName":"发送时间","productLabel":null,"saledcount":0,"productsummary":null,"productCode":null,"supplierId":null,"supplierName":null,"mainimage":null,"loan":null,"minLoan":null,"maxLoan":null,"repay":null,"minRepay":null,"maxRepay":null,"rate":null,"minRate":1,"maxRate":null,"appCondition":null,"auritInstruction":null,"shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null}]
         */

        private Object banners;
        private Object productEntity;
        private Object productfineinfodto;
        private List<ProductloanentityBean> productloanentity;

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

        public Object getProductfineinfodto() {
            return productfineinfodto;
        }

        public void setProductfineinfodto(Object productfineinfodto) {
            this.productfineinfodto = productfineinfodto;
        }

        public List<ProductloanentityBean> getProductloanentity() {
            return productloanentity;
        }

        public void setProductloanentity(List<ProductloanentityBean> productloanentity) {
            this.productloanentity = productloanentity;
        }

        public static class ProductloanentityBean {
            /**
             * id : 1
             * classifyId : null
             * productType : null
             * productName : 房产贷
             * productLabel : null
             * saledcount : 7
             * productsummary : null
             * productCode : null
             * supplierId : null
             * supplierName : null
             * mainimage : http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg
             * loan : null
             * minLoan : null
             * maxLoan : null
             * repay : null
             * minRepay : null
             * maxRepay : null
             * rate : null
             * minRate : 0.02
             * maxRate : null
             * appCondition : null
             * auritInstruction : null
             * shelfflag : null
             * shelfflagName : null
             * shelftime : null
             * thirdpartyUrl : null
             * clickCount : null
             * isFine : null
             * isValid : null
             * providerName : null
             */

            private int id;
            private Object classifyId;
            private Object productType;
            private String productName;
            private Object productLabel;
            private int saledcount;
            private Object productsummary;
            private Object productCode;
            private Object supplierId;
            private Object supplierName;
            private String mainimage;
            private Object loan;
            private Object minLoan;
            private Object maxLoan;
            private Object repay;
            private Object minRepay;
            private Object maxRepay;
            private Object rate;
            private double minRate;
            private Object maxRate;
            private Object appCondition;
            private Object auritInstruction;
            private Object shelfflag;
            private Object shelfflagName;
            private Object shelftime;
            private Object thirdpartyUrl;
            private Object clickCount;
            private Object isFine;
            private Object isValid;
            private Object providerName;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getClassifyId() {
                return classifyId;
            }

            public void setClassifyId(Object classifyId) {
                this.classifyId = classifyId;
            }

            public Object getProductType() {
                return productType;
            }

            public void setProductType(Object productType) {
                this.productType = productType;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public Object getProductLabel() {
                return productLabel;
            }

            public void setProductLabel(Object productLabel) {
                this.productLabel = productLabel;
            }

            public int getSaledcount() {
                return saledcount;
            }

            public void setSaledcount(int saledcount) {
                this.saledcount = saledcount;
            }

            public Object getProductsummary() {
                return productsummary;
            }

            public void setProductsummary(Object productsummary) {
                this.productsummary = productsummary;
            }

            public Object getProductCode() {
                return productCode;
            }

            public void setProductCode(Object productCode) {
                this.productCode = productCode;
            }

            public Object getSupplierId() {
                return supplierId;
            }

            public void setSupplierId(Object supplierId) {
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

            public Object getLoan() {
                return loan;
            }

            public void setLoan(Object loan) {
                this.loan = loan;
            }

            public Object getMinLoan() {
                return minLoan;
            }

            public void setMinLoan(Object minLoan) {
                this.minLoan = minLoan;
            }

            public Object getMaxLoan() {
                return maxLoan;
            }

            public void setMaxLoan(Object maxLoan) {
                this.maxLoan = maxLoan;
            }

            public Object getRepay() {
                return repay;
            }

            public void setRepay(Object repay) {
                this.repay = repay;
            }

            public Object getMinRepay() {
                return minRepay;
            }

            public void setMinRepay(Object minRepay) {
                this.minRepay = minRepay;
            }

            public Object getMaxRepay() {
                return maxRepay;
            }

            public void setMaxRepay(Object maxRepay) {
                this.maxRepay = maxRepay;
            }

            public Object getRate() {
                return rate;
            }

            public void setRate(Object rate) {
                this.rate = rate;
            }

            public double getMinRate() {
                return minRate;
            }

            public void setMinRate(double minRate) {
                this.minRate = minRate;
            }

            public Object getMaxRate() {
                return maxRate;
            }

            public void setMaxRate(Object maxRate) {
                this.maxRate = maxRate;
            }

            public Object getAppCondition() {
                return appCondition;
            }

            public void setAppCondition(Object appCondition) {
                this.appCondition = appCondition;
            }

            public Object getAuritInstruction() {
                return auritInstruction;
            }

            public void setAuritInstruction(Object auritInstruction) {
                this.auritInstruction = auritInstruction;
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

            public Object getThirdpartyUrl() {
                return thirdpartyUrl;
            }

            public void setThirdpartyUrl(Object thirdpartyUrl) {
                this.thirdpartyUrl = thirdpartyUrl;
            }

            public Object getClickCount() {
                return clickCount;
            }

            public void setClickCount(Object clickCount) {
                this.clickCount = clickCount;
            }

            public Object getIsFine() {
                return isFine;
            }

            public void setIsFine(Object isFine) {
                this.isFine = isFine;
            }

            public Object getIsValid() {
                return isValid;
            }

            public void setIsValid(Object isValid) {
                this.isValid = isValid;
            }

            public Object getProviderName() {
                return providerName;
            }

            public void setProviderName(Object providerName) {
                this.providerName = providerName;
            }
        }
    }
}
