package hotel;
/**
 * ������ס�Ƶ���
 * @author lenovo
 *
 */
// extends Empty
public class InHotel {
	private int room;
	IData iData;
	public InHotel(IData iData)
	{
		this.iData=iData;
	}
	public InHotel(){}
	
	public String in(int roomNo,String name)
	{
//		MainRun mr=new MainRun();
//		room=(roomNo%100)-1;
//		if(isEmpty(roomNo))
//		{
//			mr.getRoom()[(roomNo/100)-1][room]=name;
//			return name+"�ɹ���ס"+roomNo+"����!";
//		}
//		else {
//			return "�÷����Ѿ��п�����ס";
//		}
		return iData.in_Out_Room(roomNo, name);
	}
//	public boolean isEmpty(int roomNo)
//	{
//		String room=mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1];
//		if("EMPTY".equals(room))
//		{
//			return true;
//		}
//		else
//			return false;
//	}
	

}
