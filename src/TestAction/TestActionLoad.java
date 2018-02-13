package TestAction;

import com.opensymphony.xwork2.ActionSupport;

public class TestActionLoad extends ActionSupport{
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	private String loginName;
	private String loginPwd;
	public String execute() throws Exception{
		if(getLoginName().equalsIgnoreCase("ad")&&
				getLoginPwd().equalsIgnoreCase("12")){
			return INPUT;
		}else {
			return ERROR;
		}
	}
	public void vaildate(){
		if (getLoginName()==null || getLoginPwd()== null) {
				addFieldError("loginName", "µÇÂ½ÕËºÅ²»ÄÜÎª¿Õ");
		}
	}
	
}
