package hotel;
/**
 * 是InHotel和OutHotel的父类，实现房间状态的查询
 * @author lenovo
 *
 */

public class Empty {
	MainRun mr=new MainRun();
	boolean isEmpty(int roomNo)
	{
		if("EMPTY".equals(mr.getRoom()[roomNo/100][(roomNo%100)-1]))
			return true;
		else
			return false;
	}

}
