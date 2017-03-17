package com.boke.imiloan.bean;

/**
 * Created by Administrator on 2017/3/16.
 */

public class LoanProductInfoBean {

    /**
     * data : {"id":1,"classifyId":null,"productType":null,"productName":"房产贷","productLabel":null,"saledcount":7,"productsummary":"贷款","productCode":null,"supplierId":null,"supplierName":null,"mainimage":"http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg","loan":null,"minLoan":10000,"maxLoan":30000,"repay":null,"minRepay":20,"maxRepay":50,"rate":null,"minRate":0.02,"maxRate":0.43,"appCondition":"有车","auritInstruction":"毕业证，结婚证。毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证","shelfflag":null,"shelfflagName":null,"shelftime":null,"thirdpartyUrl":null,"clickCount":null,"isFine":null,"isValid":null,"providerName":null}
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
         * id : 1
         * classifyId : null
         * productType : null
         * productName : 房产贷
         * productLabel : null
         * saledcount : 7
         * productsummary : 贷款
         * productCode : null
         * supplierId : null
         * supplierName : null
         * mainimage : http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg
         * loan : null
         * minLoan : 10000.0
         * maxLoan : 30000.0
         * repay : null
         * minRepay : 20
         * maxRepay : 50
         * rate : null
         * minRate : 0.02
         * maxRate : 0.43
         * appCondition : 有车
         * auritInstruction : 毕业证，结婚证。毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证毕业证，结婚证
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
        private String productsummary;
        private Object productCode;
        private Object supplierId;
        private Object supplierName;
        private String mainimage;
        private Object loan;
        private double minLoan;
        private double maxLoan;
        private Object repay;
        private int minRepay;
        private int maxRepay;
        private Object rate;
        private double minRate;
        private double maxRate;
        private String appCondition;
        private String auritInstruction;
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

        public String getProductsummary() {
            return productsummary;
        }

        public void setProductsummary(String productsummary) {
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

        public double getMinLoan() {
            return minLoan;
        }

        public void setMinLoan(double minLoan) {
            this.minLoan = minLoan;
        }

        public double getMaxLoan() {
            return maxLoan;
        }

        public void setMaxLoan(double maxLoan) {
            this.maxLoan = maxLoan;
        }

        public Object getRepay() {
            return repay;
        }

        public void setRepay(Object repay) {
            this.repay = repay;
        }

        public int getMinRepay() {
            return minRepay;
        }

        public void setMinRepay(int minRepay) {
            this.minRepay = minRepay;
        }

        public int getMaxRepay() {
            return maxRepay;
        }

        public void setMaxRepay(int maxRepay) {
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

        public double getMaxRate() {
            return maxRate;
        }

        public void setMaxRate(double maxRate) {
            this.maxRate = maxRate;
        }

        public String getAppCondition() {
            return appCondition;
        }

        public void setAppCondition(String appCondition) {
            this.appCondition = appCondition;
        }

        public String getAuritInstruction() {
            return auritInstruction;
        }

        public void setAuritInstruction(String auritInstruction) {
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
