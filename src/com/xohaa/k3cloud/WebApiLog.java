package com.xohaa.k3cloud;
import java.sql.SQLException;
import com.xohaa.SQLDB.HandleSQLCon;
import java.sql.PreparedStatement;
/**
 * 接口日志
 * @author chenjianxiong
 *
 */
public class WebApiLog {
	private String CaoZuoR = null;
	private String URL = null;
	private String Session = null;
	private String Input = null;
	private String Output = null;
	private String FlowNo = null;
	private String DBName = null;
	private String MainUNID = null;
	private String FormID = null;
	private String msg = null;
	private String LeiXing = null;
	private int JieKouZT = 0;
	
	public void setLeiXing(String leiXing) {
		LeiXing = leiXing;
	}

	private int status = 0;
	private HandleSQLCon F = null;
	public WebApiLog(HandleSQLCon f) {
		F = f;
	}
	public void setDBName(String name) {
		DBName = name;
	}
	public void setMainUNID(String mainUNID) {
		MainUNID = mainUNID;
	}
	public void setFormID(String formID) {
		FormID = formID;
	}
	public void setFlowNo(String flowNo) {
		FlowNo = flowNo;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setCaoZuoR(String caoZuoR) {
		CaoZuoR = caoZuoR;
	}

	public void setURL(String url) {
		URL = url;
	}

	public void setSession(String session) {
		Session = session;
	}

	public void setInput(String input) {
		Input = input;
	}

	public void setOutput(String output) {
		Output = output;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public void setJieKouZT(int jiekouzt) {
		this.JieKouZT = jiekouzt;
	}
	
	/**
	 * 
	 * @param F
	 * @throws SQLException
	 */
	public void update() throws SQLException{
		int i = 1;
		StringBuffer sql = new StringBuffer(50);
		sql.append("INSERT INTO Log_Kingdee(CaoZuoSJ,CaoZuoR,FlowNo,URL,Session,Input,Output,Status,DBName,MainUNID,FormID,msg,LeiXing,JieKouZT) ")
		.append(" VALUES (getDate(),?,?,?,?,?,?,?,?,?,?,?,?,?)");
		PreparedStatement pst = F.getCon().prepareStatement(sql.toString());
		pst.setString(i++,this.CaoZuoR); //3.操作人
		pst.setString(i++,this.FlowNo); //4.单据号
		pst.setString(i++,this.URL); //5.接口地址
		pst.setString(i++,this.Session); //6.Session
		pst.setString(i++,this.Input); //7.传入参数
		pst.setString(i++,this.Output); //8.输出参数
		pst.setLong(i++,this.status); //9.状态值
		pst.setString(i++,this.DBName);
		pst.setString(i++,this.MainUNID);
		pst.setString(i++,this.FormID);
		pst.setString(i++,this.msg);
		pst.setString(i++,this.LeiXing);
		pst.setInt(i++,this.JieKouZT);
		
		pst.executeUpdate();
		pst.close();
		
		if(!F.getCon().getAutoCommit()){
			F.Commit();
		}
		//System.out.println("--->写入金蝶日志");
	}
}
