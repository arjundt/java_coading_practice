package com.example.java17;


public sealed class SealedClassSyntax permits Animal{

}

final class Animal extends SealedClassSyntax{
	
}