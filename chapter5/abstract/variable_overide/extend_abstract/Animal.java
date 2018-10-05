public abstract class Animal{

	private abstract void testPrivate(); // won't work
	public final abstract void testFinal(); // final method not allowed

	public abstract void noBody(){} // no body is not allowed


}
