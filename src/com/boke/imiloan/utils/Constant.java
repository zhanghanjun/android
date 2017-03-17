package com.boke.imiloan.utils;

public class Constant {

	// 通用地址
	 public static final String COMMONURL = "http://develop.bokesoftware.com/MDM-QX-FINANCE/api/";
	// 用户登录地址
	public static final String MEMLOGIN = "memLogin/appMemLogin";
	// 用户注册获取验证码
	public static final String MEMREGISTER = "memRegister/appMemRegister";
	// 用户注册
	public static final String MEMREGISTERUSERSUBMIT = "memRegister/appMemRegisterSubmit";
	// 用户找回密码获取验证码
	public static final String MEMFINDPASSWORD = "memFindPassword/appMemFindPassword";
	// 用户找回密码
	public static final String MEMFINDPASSWORDSUBMIT = "memFindPassword/memFindPasswordSubmit";

	// 首页接口
	public static final String GETHOMEINFO = "home/getHomeInfo";
	// 精品推荐列表
	public static final String GETFINEPRODUCTLIST = "home/getFineProductList";

	// 贷款产品列表
	public static final String GETLOANPRODUCTLIST = "product/getLoanProductList";
	// 贷款产品详情
	public static final String GETLOANPRODUCTINFO = "product/getLoanProductInfo";
	// 获得分类产品
	public static final String GETCLASSIFYPRODUCT = "product/getClassifyProduct";
	// 产品立即申请接口
	public static final String PRODUCTAPPLY = "product/productApply";


	// 信用卡产品列表
	public static final String GETCREDITPRODUCTLIST = "product/getCreditProductList";
	// 信用卡产品详情
	public static final String GETCREDITPRODUCTINFO = "product/getCreditProductInfo";



	// 会员申请信息
	public static final String GETAPPLYINFO = "member/getApplyInfo";
	// 会员个人资料
	public static final String GETMEMBERINFO = "member/getMemberInfo";

	// 会员申请记录
	public static final String GETAPPLYTRANSACTION = "member/getApplyTransaction";

	// 会员账号信息
	public static final String GETMEMBERACCOUNTINFO = "member/getMemberAccountInfo";
	// 会员申请记录删除
	public static final String DELETEAPPLYTRANSACTION = "member/deleteApplyTransaction";
	// 个人信息保存接口
	public static final String SETMEMBERINFO = "member/setMemberInfo";
	// 会员申请信息保存接口
	public static final String SETAPPLYINFO = "member/setApplyInfo";



}
