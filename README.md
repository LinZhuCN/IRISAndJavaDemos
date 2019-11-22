# IRISAndJavaDemos
Demos to illustrate IRIS-Java integration


# JavaIRISDemos

# SpringMyBatisIRISDemo

A Demo Integrating Spring-MyBatis-IRIS togather.

Before running the demo, creating an ObjectScript class to create the table and populate data in IRIS. The codes is as below:

Class DataModel.Patient Extends (%Persistent, %Library.Populate, %XML.Adaptor, %JSON.Adaptor) {

Property FirstName As %String;

Property LastName As %String;

Property Gender As %String(VALUELIST = ",M,F");

ClassMethod Prepare(){ w ##class(DataModel.Patient).Populate(100) }

}

Then in any IRIS terminal and under the namespace, use command
Do ##class(DataModel.Patient).Prepare() 
to generate sample data.
