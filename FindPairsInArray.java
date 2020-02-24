{\rtf1\ansi\ansicpg1252\cocoartf1561\cocoasubrtf400
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 using System.Collections.Generic;\
using System;\
\
public class Program\
\{\
	public static void Main()\
	\{\
		int[] input = new int[]\{10,10,10,20,0,0\};\
		Console.WriteLine(FindPairsInArray(input));\
		\
	\}\
	\
	public static int FindPairsInArray(int[] input)\
	\{\
		var dict = new Dictionary<int,int>();\
		var count = 0;\
		\
		for(int i = 0; i< input.Length; i++)\
		\{\
			if(dict.ContainsKey(input[i]))\
			\{\
				dict[input[i]] += 1;\
			\}\
			else \
			\{\
				dict.Add(input[i], 1);\
			\}\
		\}\
		\
		foreach(var entry in dict)\
		\{\
			count += entry.Value /2;\
		\}\
		\
		return count;\
	\}\
\}}