package org.xtext;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
//import org.xtext.example.mydsl.MyDslStandaloneSetup;
//import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.bankSystem.BankSystemPackage;

import com.google.inject.Injector;

/**
* The ExportXMI program gets an instance of XtextResource 
* and an instance of XMIResource and saves the input xtext
* file in xmi form.
*
* @author  Ruchika Kumar
* @version 1.0
* @since   2016-11-28 
*/
public class ExportXMI {

	public static void main(String[] args) {
		
		Injector injector = new BankSystemStandaloneSetup().createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	    //change this to the path of your input turn file
	    String inputURI = "C:\\Users\\grego\\Documents\\test.bank";
	    //change this to the path of your output xmi file
	    String outputURI = "C:\\Users\\grego\\Documents\\Github\\ECSE439\\src\\xmifiles\\output.xmi";
	    //used to parse a File path string
	    URI inUri = URI.createFileURI(inputURI);
	    URI outUri=URI.createFileURI(outputURI);
	    //registers the turn package 
	    BankSystemPackage.eINSTANCE.eClass();
	    resourceSet.getPackageRegistry().put(BankSystemPackage.eNS_URI, BankSystemPackage.eINSTANCE);
	    //gets xtext resource
	     resourceSet.createResource(inUri);
	     Resource xtextResource = resourceSet.getResource(inUri, true);
	     TreeIterator<EObject> iterator = xtextResource.getAllContents();
	    while(iterator.hasNext()) {System.out.println(iterator.next().toString());}
	    //creates an xmi resource
	    XMIResource xmiResource = new XMIResourceImpl(outUri);
	    EcoreUtil.resolveAll(xtextResource);
	    //save xtext contents in xmi
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
