package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Window;

public interface Adminservice {
	 Admin selAdminByaname(String aname);
     List<Window> selwindowAll();
     Window selWinByWid(Integer wid);
     void addWindow(Window win);
     void delWindowByWid(Integer wid);
     void updateWin(Window win);
}
