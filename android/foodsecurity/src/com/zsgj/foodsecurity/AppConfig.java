package com.zsgj.foodsecurity;

public class AppConfig {
	public static String SERVERIP = "123.130.113.6";
	public static String SERVERPORT = "7000";
	public static String SERVER = "http://123.130.113.6:7000/";

	// http://123.130.113.6:7000/
	// 登录接口
	public static final String LOGIN_URL = "ParentInfoWcfService.svc/CheckLogin";
	// 获取萤石云AccessToken
	public static final String GETACCESSTOKEN_URL = "InvokeYs7ServiceWcfService.svc/GetAccessToken";
	
	 //是否已经登陆
    public static boolean isLogin = false;
    //公告查询
    public static final String NOTICES_URL="NoticeWcfService.svc/GetByTimeAndSyjID";
    
    //添加日常巡查
    public static final String ADDINSPECT_URL="GeneralInspectionWcfService.svc/CreateGeneralInspection";
    //查询学校
    public static final String QUERYSCHOOL_URL="KindergartenWcfService.svc/QueryBySyjIdAndName";
    //查询投诉建议
    public static final String SUGGESTION_URL="ComplaintWcfService.svc/GetByTimeAndStatus";
    //发表投诉建议
    public static final String ADDSUGGESTION_URL="ComplaintWcfService.svc/CreateNewComplaint";
    // 获取日常巡查结果类型
    public static final String INSPECTRESULTTYPE_URL="InspectResultTypeWcfService.svc/FindAll";

}