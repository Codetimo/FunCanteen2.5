package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funcanteen.dao.AdminMapper;
import com.funcanteen.dao.WindowMapper;
import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Window;

@Service
public class Adminserviceimpl implements Adminservice {
    @Autowired
	private WindowMapper wmapper;
    @Autowired
    private AdminMapper amapper;
    
    
	@Override
	public List<Window> selwindowAll() {
		return wmapper.selWindAll();
	}

	@Override
	public Window selWinByWid(Integer wid) {
		return wmapper.selectByPrimaryKey(wid);
	}

	@Override
	public void addWindow(Window win) {
		wmapper.insert(win);
	}

	@Override
	public void delWindowByWid(Integer wid) {
		wmapper.deleteByPrimaryKey(wid);
	}

	@Override
	public void updateWin(Window win) {
		wmapper.updateByPrimaryKey(win);
	}

	@Override
	public Admin selAdminByaname(String aname) {
		return amapper.selAdminByaname(aname);
	}

}
