import static org.junit.Assert.*;
import hotel.IData;
import hotel.ListHome;
import hotel.OutHotel;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class ListHomeTest {
	private Mockery context=new Mockery();
	private IData iData=null;
	private ListHome lh=null;

	@Before
	public void setUp()throws Exception{
		iData=context.mock(IData.class);
		lh=new ListHome(iData);
		context.checking(new Expectations(){{
			oneOf(iData).search();
			will(returnValue("显示所有房间信息"));
		}});
		
	}
	@Test
	public void testSearch() {
		assertEquals("显示所有房间信息", lh.search());
	}

}
