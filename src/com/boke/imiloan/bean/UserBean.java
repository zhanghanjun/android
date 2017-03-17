package com.boke.imiloan.bean;

public class UserBean{

	/**
	 * data : {"member":{"id":4,"tokenTime":1489477495398,"cellPhone":"13862034937","memberName":"13862034937","password":"25d55ad283aa400af464c76d713c07ad","birthday":null,"gender":null,"login_token":null,"province":null,"city":null,"district":null,"address":null,"isCar":null,"isHouse":null,"isBankWater":null,"isOnduty":null,"isIncome":null,"isSecurity":null},"token":"1820d69d17db40b2830f8c3a63ed4bc8"}
	 * errorCode : 0
	 * status : 1
	 * message : 登录成功
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
		 * member : {"id":4,"tokenTime":1489477495398,"cellPhone":"13862034937","memberName":"13862034937","password":"25d55ad283aa400af464c76d713c07ad","birthday":null,"gender":null,"login_token":null,"province":null,"city":null,"district":null,"address":null,"isCar":null,"isHouse":null,"isBankWater":null,"isOnduty":null,"isIncome":null,"isSecurity":null}
		 * token : 1820d69d17db40b2830f8c3a63ed4bc8
		 */

		private MemberBean member;
		private String token;

		public MemberBean getMember() {
			return member;
		}

		public void setMember(MemberBean member) {
			this.member = member;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public static class MemberBean {
			/**
			 * id : 4
			 * tokenTime : 1489477495398
			 * cellPhone : 13862034937
			 * memberName : 13862034937
			 * password : 25d55ad283aa400af464c76d713c07ad
			 * birthday : null
			 * gender : null
			 * login_token : null
			 * province : null
			 * city : null
			 * district : null
			 * address : null
			 * isCar : null
			 * isHouse : null
			 * isBankWater : null
			 * isOnduty : null
			 * isIncome : null
			 * isSecurity : null
			 */

			private int id;
			private long tokenTime;
			private String cellPhone;
			private String memberName;
			private String password;
			private Object birthday;
			private Object gender;
			private Object login_token;
			private Object province;
			private Object city;
			private Object district;
			private Object address;
			private Object isCar;
			private Object isHouse;
			private Object isBankWater;
			private Object isOnduty;
			private Object isIncome;
			private Object isSecurity;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public long getTokenTime() {
				return tokenTime;
			}

			public void setTokenTime(long tokenTime) {
				this.tokenTime = tokenTime;
			}

			public String getCellPhone() {
				return cellPhone;
			}

			public void setCellPhone(String cellPhone) {
				this.cellPhone = cellPhone;
			}

			public String getMemberName() {
				return memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Object getBirthday() {
				return birthday;
			}

			public void setBirthday(Object birthday) {
				this.birthday = birthday;
			}

			public Object getGender() {
				return gender;
			}

			public void setGender(Object gender) {
				this.gender = gender;
			}

			public Object getLogin_token() {
				return login_token;
			}

			public void setLogin_token(Object login_token) {
				this.login_token = login_token;
			}

			public Object getProvince() {
				return province;
			}

			public void setProvince(Object province) {
				this.province = province;
			}

			public Object getCity() {
				return city;
			}

			public void setCity(Object city) {
				this.city = city;
			}

			public Object getDistrict() {
				return district;
			}

			public void setDistrict(Object district) {
				this.district = district;
			}

			public Object getAddress() {
				return address;
			}

			public void setAddress(Object address) {
				this.address = address;
			}

			public Object getIsCar() {
				return isCar;
			}

			public void setIsCar(Object isCar) {
				this.isCar = isCar;
			}

			public Object getIsHouse() {
				return isHouse;
			}

			public void setIsHouse(Object isHouse) {
				this.isHouse = isHouse;
			}

			public Object getIsBankWater() {
				return isBankWater;
			}

			public void setIsBankWater(Object isBankWater) {
				this.isBankWater = isBankWater;
			}

			public Object getIsOnduty() {
				return isOnduty;
			}

			public void setIsOnduty(Object isOnduty) {
				this.isOnduty = isOnduty;
			}

			public Object getIsIncome() {
				return isIncome;
			}

			public void setIsIncome(Object isIncome) {
				this.isIncome = isIncome;
			}

			public Object getIsSecurity() {
				return isSecurity;
			}

			public void setIsSecurity(Object isSecurity) {
				this.isSecurity = isSecurity;
			}
		}
	}
}
