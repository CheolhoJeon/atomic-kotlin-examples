package chap5.ClassDelegation

interface AI
class A : AI

class B(val a: A) : AI by a