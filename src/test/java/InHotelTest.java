import static org.junit.Assert.*;
import hotel.IData;
import hotel.InHotel;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class InHotelTest {

	//1.首先需要构造一个Mockery对象
	private Mockery context=new Mockery();
	private IData iData=null;
	private InHotel ih=null;
	//2.用构造出来的Mockery对象实例来构造一个模拟的IDate对象
	@Before
	public void setUp() throws Exception{
		iData=context.mock(IData.class);
		ih=new InHotel(iData);
		context.checking(new Expectations(){{
			allowing(iData).in_Out_Room(901,"Marry");
			//will(returnValue("Marry成功入住了901房间！"));
			will(returnValue("该房间已有人入住！"));
			//will(onConsecutiveCalls(returnValue("Marry成功入住了901房间！"),returnValue("fjian")));
		}
		});
	}

	//3.最后来进行测试


	/**
	 *
	 * 	context.checking(new Expectations(){{
	 atLeast(2).of(iData).in_Out_Room(901,"Marry");
	 will(onConsecutiveCalls(returnValue("Marry成功入住了901房间！"),returnValue("Marry成功入住了901房间！")));
	 }
	 });
	 */


	@Test
	public void testIn() {
		//assertEquals("Marry成功入住了901房间！",ih.in(901, "Marry"));
		assertEquals("该房间已有人入住！",ih.in(901, "Marry"));
		//assertEquals("fjian",ih.in(901, "Marry"));
//		assertEquals("Marry成功入住了901房间！",ih.in(901, "Marry"));
	}

}
