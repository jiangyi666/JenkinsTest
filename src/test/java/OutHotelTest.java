import static org.junit.Assert.*;
import hotel.IData;
import hotel.OutHotel;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.auto.Mock;
import org.junit.Before;
import org.junit.Test;

public class OutHotelTest {
	
	private Mockery context=new Mockery();
	private IData iData=null;
	private OutHotel oh=null;
	
	@Before
	public void setUp()throws Exception{
		iData=context.mock(IData.class);
		oh=new OutHotel(iData);
		context.checking(new Expectations(){{
			oneOf(iData).in_Out_Room(701,"EMPTY");
			will(returnValue("701退房成功！"));
		}});
		
	}

	@Test
	public void testOut() {
		assertEquals("701退房成功！", oh.out(701));
	}

}
