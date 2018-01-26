package com.funcanteen.pojo;

import java.util.Date;

import org.eclipse.swt.widgets.DateTime;

public class Evaluate {
    private Integer evaluateid;

    private String evaluatecontent;
    
    private String evaluatepic;
    
    private int evaluatestar;

    private Date evaluatetime;

    private Integer uid;

    private Integer windowesid;

    private Integer ordeid;
    
    

    public String getEvaluatepic() {
		return evaluatepic;
	}

	public void setEvaluatepic(String evaluatepic) {
		this.evaluatepic = evaluatepic;
	}

	public int getEvaluatestar() {
		return evaluatestar;
	}

	public void setEvaluatestar(int evaluatestar) {
		this.evaluatestar = evaluatestar;
	}

	public Integer getEvaluateid() {
        return evaluateid;
    }

    public void setEvaluateid(Integer evaluateid) {
        this.evaluateid = evaluateid;
    }

    public String getEvaluatecontent() {
        return evaluatecontent;
    }

    public void setEvaluatecontent(String evaluatecontent) {
        this.evaluatecontent = evaluatecontent == null ? null : evaluatecontent.trim();
    }

    public Date getEvaluatetime() {
        return evaluatetime;
    }

    public void setEvaluatetime(Date evaluatetime) {
        this.evaluatetime = evaluatetime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWindowesid() {
        return windowesid;
    }

    public void setWindowesid(Integer windowesid) {
        this.windowesid = windowesid;
    }

    public Integer getOrdeid() {
        return ordeid;
    }

    public void setOrdeid(Integer ordeid) {
        this.ordeid = ordeid;
    }
}