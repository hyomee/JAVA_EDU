package com.hyomee.finaltest;

public final class FinalParent {

  private void instancePrivateMethod() {
    System.out.println("Parent instancePrivateMethod Method ... ");
  }

  // Method declared 'final' in 'final' class
  // final public void finalInstancePublicMethod() {
  public void finalInstancePublicMethod() {
    System.out.println("Parent final finalInstancePublicMethod Method ... ");
    instancePrivateMethod();
  }

  // Class member declared 'protected' in 'final' class
  // protected void finalInstanceMethod() {
  void finalInstanceMethod() {
    System.out.println("Parent final Instance Method ... ");
  }
}
