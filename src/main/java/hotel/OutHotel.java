package hotel;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * �����˷���
 * @author lenovo
 *
 */
//extends Empty 
public class OutHotel {
	IData iData;
	public OutHotel(IData iData)
	{
		this.iData=iData;
	}
	public OutHotel(){}
	public String out(int roomNo)
	{
//		MainRun mr=new MainRun();
//		if(isEmpty(roomNo))
//		{
//			return "�÷���û�п�����ס���˷�ʧ��!";
//			
//		}
//		else{
//			mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]="EMPTY";
//			return roomNo+"�˷��ɹ���";
//		}
		return iData.in_Out_Room(roomNo, "EMPTY");
		
	}
	

}
