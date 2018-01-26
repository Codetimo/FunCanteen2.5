package com.funcanteen.pojo;

public class Window {
    private Integer windowid;

    private String windowname;

    private Integer canid;
    
    private String winpwd;

    public String getWinpwd() {
		return winpwd;
	}

	public void setWinpwd(String winpwd) {
		this.winpwd = winpwd;
	}

	public Integer getWindowid() {
        return windowid;
    }

    public void setWindowid(Integer windowid) {
        this.windowid = windowid;
    }

    public String getWindowname() {
        return windowname;
    }

    public void setWindowname(String windowname) {
        this.windowname = windowname == null ? null : windowname.trim();
    }

    public Integer getCanid() {
        return canid;
    }

    public void setCanid(Integer canid) {
        this.canid = canid;
    }
}