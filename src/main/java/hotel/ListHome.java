package hotel;
/**
 * ��ʾ�Ƶ���ס�����
 * @author lenovo
 *
 */
public class ListHome {
	//MainRun mr=new MainRun();
	IData iData;
	public ListHome(IData iData)
	{
		this.iData=iData;
	}
	public ListHome(){}
	public String search(){
//		for(int i=0;i<mr.getRoom().length;i++)
//		{
//			//��ӡ�����
//			for(int j=0;j<mr.getRoom()[0].length;j++)
//			{
//				if(j+1<10)
//				{
//					System.out.println(i+1+"0"+(j+1)+"");
//				}
//				else{
//					System.out.println(i+1+""+(j+1)+"");
//				}
//			}
//			//��ӡ�����״̬
//			System.out.println();
//			for(int j=0;j<mr.getRoom()[0].length;j++)
//			{
//				System.out.println(mr.getRoom()[i][j]+"");
//			}
//			System.out.println();
//		}
		return iData.search();
		
	}

}
