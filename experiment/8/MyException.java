class MyException extends Exception {
void doStuff() throws MyException {
try {
throw new MyException();
}
catch(MyException me) {
throw me;
}
}
}
