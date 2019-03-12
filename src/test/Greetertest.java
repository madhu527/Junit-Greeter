package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.Greeter;

public class Greetertest
{
	@Test
	public void testGreeter()
	{
		Greeter greeter = new Greeter();
		assertEquals("Hello",greeter.greet());
	}
}