import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("Scaffold usage WITH SAFE AREA"),
        ),
        body: Container(
          child: SafeArea(
            child: Center(
              child: Text(
                'This is scaffold area',
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
          ),
        ),
      ),
    ),
  );
}


	import 'package:flutter/cupertino.dart';
	import 'package:flutter/material.dart';
	void main(){
	  runApp(MaterialApp(
	    home: Text(
	      "Without Safearea",
	      textAlign: TextAlign.center,
	      style: TextStyle(
	        fontSize: 40,
	        fontWeight: FontWeight.w500,
	        color: Colors.deepPurple
	      ),
	    ),
	  ));
	}
