public class Return{

	public void runVoid(){}
	public void runVoid2(){return;} // remember you can't create method with same name

//	public void testReturn(){ return 1;} // compile error
//	public void testReturnNull(){return null;} // compile error

//	public int testIntReturn(){return null;//remember autoboxing it can't  autobox null to int.
	public long testIntReturn(){return 3;} // it returns int
	public double testFloatToDouble(){ return 3.5F;} // float literal
	public int testShort(){
		short sh=42;
		return sh;
	}

	public long testByte(){
		byte b=3;
		return b + 3 + 42L; // remember the numerical promotion rules -> this returns long
	}
	public float testLongToFloat(){
	
		return testByte();
	}

}
