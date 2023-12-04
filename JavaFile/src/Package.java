
/*Provides the classes necessary to create an applet and the classes an applet uses to communicate with its applet context.*/
import java.applet.*;
/*Contains all of the classes for creating user interfaces and for painting graphics and images.*/
import java.awt.*;
/*Provides classes for color spaces.*/
import java.awt.color.*;
/*Provides interfaces and classes for transferring data between and within applications.*/
import java.awt.datatransfer.*;
/*desktop*/
import java.awt.desktop.*;
/*Drag and Drop is a direct manipulation gesture found in many Graphical User Interface systems that provides
a mechanism to transfer information between two entities logically associated with presentation elements in the GUI.*/
import java.awt.dnd.*;
/*Provides interfaces and classes for dealing with different types of events fired by AWT components.*/
import java.awt.event.*;
/*Provides classes and interface relating to fonts.*/
import java.awt.font.*;
/**/
import java.awt.geom.*;
/*Provides classes and interfaces for the input method framework.*/
import java.awt.im.*;
/**/
import java.awt.im.spi.*;
/**/
import java.awt.image.*;
/**/
import java.awt.image.renderable.*;
import java.awt.print.*;
/**/
import java.beans.*;
/**/
import java.beans.beancontext.*;
/**/
import java.io.*;
/**/
import java.lang.*;
/**/
import java.lang.annotation.*;
/**/
import java.lang.instrument.*;
/**/
import java.lang.invoke.*;
/**/
import java.lang.management.*;
/**/
import java.lang.module.*;
/**/
import java.lang.ref.*;
/**/
import java.lang.reflect.*;
/**/
import java.math.*;
/*Provides the classes for implementing networking applications.*/
import java.net.*;
/*Defines buffers, which are containers for data, and provides an overview of the other NIO packages.*/
import java.nio.*;
/*Defines channels, which represent connections to entities that are capable of performing I/O operations, 
such as files and sockets; defines selectors, for multiplexed, non-blocking I/O operations.*/
import java.nio.channels.*;
/*Service-provider classes for the java.nio.channels package.*/
import java.nio.channels.spi.*;
/*Defines charsets, decoders, and encoders, for translating between bytes and Unicode characters.*/
import java.nio.charset.*;
/*Service-provider classes for the java.nio.charset package.*/
import java.nio.charset.spi.*;
/*Defines interfaces and classes for the Java virtual machine to access files, file attributes, and file systems.*/
import java.nio.file.*;
/*Interfaces and classes providing access to file and file system attributes.*/
import java.nio.file.attribute.*;
/*Service-provider classes for the java.nio.file package.*/
import java.nio.file.spi.*;
/*Provides the RMI package.*/
import java.rmi.*;
/*Provides support for RMI Object Activation.*/
import java.rmi.activation.*;
/*Provides classes and interface for RMI distributed garbage-collection (DGC).*/
import java.rmi.dgc.*;
/*Provides a class and two interfaces for the RMI registry.*/
import java.rmi.registry.*;
/*Provides classes and interfaces for supporting the server side of RMI.*/
import java.rmi.server.*;
/*Provides the classes and interfaces for the security framework.*/
import java.security.*;
/*The classes and interfaces in this package have been superseded by classes in the java.security package.*/
import java.security.acl.*;
/*Provides classes and interfaces for parsing and managing certificates, certificate revocation lists (CRLs), and certification paths.*/
import java.security.cert.*;
/*Provides interfaces for generating RSA (Rivest, Shamir and Adleman AsymmetricCipher algorithm) keys as defined 
in the RSA Laboratory Technical Note PKCS#1, and DSA (Digital Signature Algorithm) keys as defined in NIST's FIPS-186.*/
import java.security.interfaces.*;
/*Provides classes and interfaces for key specifications and algorithm parameter specifications.*/
import java.security.spec.*;
/*Provides the API for accessing and processing data stored in a data source (usually a relational database) 
using the JavaTM programming language.*/
import java.sql.*;
/*Provides classes and interfaces for handling text,dates,numbers,and messages in a manner independent of natural languages.*/
import java.text.*;
/*Service provider classes for the classes in the java.text package.*/
import java.text.spi.*;
/*The main API for dates, times, instants, and durations.*/
import java.time.*;
/*Generic API for calendar systems other than the default ISO.*/
import java.time.chrono.*;
/*Provides classes to print and parse dates and times.*/
import java.time.format.*;
/*Access to date and time using fields and units, and date time adjusters.*/
import java.time.temporal.*;
/*Support for time-zones and their rules.java.util Contains the collections framework,
legacy collection classes,event model,date and time facilities,internationalization, and 
miscellaneous utility classes(a string tokenizer,a random-number generator,and a bit array).java.util.concurrent 
Utility classes commonly useful in concurrent programming.java.util.concurrent.atomic A small toolkit of classes that 
support lock-free thread-safe programming on single variables.java.util.concurrent.locks Interfaces and classes providing a 
framework for locking and waiting for conditions that is distinct from built-in synchronization and monitors.*/
import java.time.zone.*;
/*Functional interfaces provide target types for lambda expressions and method references.*/
import java.util.function.*;
/*Provides classes for reading and writing the JAR (Java ARchive) file format, which is based on the standard ZIP file 
format with an optional manifest file.*/
import java.util.jar.*;
/*Provides the classes and interfaces of the JavaTM 2 platform's core logging facilities.*/
import java.util.logging.*;
/*This package allows applications to store and retrieve user and system preference and configuration data.*/
import java.util.prefs.*;
/*Classes for matching character sequences against patterns specified by regular expressions.*/
import java.util.regex.*;
/*Service provider classes for the classes in the java.util package.*/
import java.util.spi.*;
/*Classes to support functional-style operations on streams of elements, such as map-reduce transformations on collections.*/
import java.util.stream.*;
/*Provides classes for reading and writing the standard ZIP and GZIP file formats.*/
import java.util.zip.*;
/*Defines a contract between user-interface components and an assistive technology that provides access to those components.*/
import javax.accessibility.*;
/*Provides classes and interfaces for key specifications and algorithm parameter specifications.*/
import javax.crypto.spec.*;
/*The main package of the Java Image I/O API.*/
import javax.imageio.*;
/*A package of the Java Image I/O API dealing with synchronous notification of events during the reading and writing of images.*/
import javax.imageio.event.*;
/*A package of the Java Image I/O API dealing with reading and writing metadata.*/
import javax.imageio.metadata.*;
/*Package containing the public classes used by the built-in BMP plug-in.*/
import javax.imageio.plugins.bmp.*;
/*Classes supporting the built-in JPEG plug-in.*/
import javax.imageio.plugins.jpeg.*;
/*A package of the Java Image I/O API containing 
the plug-in interfaces for readers, writers, transcoders, 
and streams, and a runtime registry.*/
import javax.imageio.spi.*;
/*A package of the Java Image I/O API dealing with low-level I/O from files and streams.*/
import javax.imageio.stream.*;
/*Classes and hierarchies of packages used to model the Java programming language.*/
import javax.lang.model.*;
/*Interfaces used to model elements of the Java programming language.*/
import javax.lang.model.element.*;
/*Interfaces used to model Java programming language types.*/
import javax.lang.model.type.*;
/*Utilities to assist in the processing of program elements and types.*/
import javax.lang.model.util.*;

/*import javax.management	
Provides the core classes for the Java Management Extensions.
import javax.management.loading	
Provides the classes which implement advanced dynamic loading.
import javax.management.modelmbean	
Provides the definition of the ModelMBean classes.
import javax.management.monitor	
Provides the definition of the monitor classes.
import javax.management.openmbean	
Provides the open data types and Open MBean descriptor classes.
import javax.management.relation	
Provides the definition of the Relation Service.
import javax.management.remote	
Interfaces for remote access to JMX MBean servers.
import javax.management.remote.rmi	
The RMI connector is a connector for the JMX Remote API that uses RMI to transmit client requests to a remote MBean server.
import javax.management.timer	
Provides the definition of the Timer MBean.
import javax.naming	
Provides the classes and interfaces for accessing naming services.
import javax.naming.directory	
Extends the javax.naming package to provide functionality for accessing directory services.
import javax.naming.event	
Provides support for event notification when accessing naming and directory services.
import javax.naming.ldap	
Provides support for LDAPv3 extended operations and controls.
import javax.naming.spi	 
import javax.net	
Provides classes for networking applications.
import javax.net.ssl	
Provides classes for the secure socket package.
import javax.print	
Provides the principal classes and interfaces for the JavaTM Print Service API.
import javax.print.attribute	
Provides classes and interfaces that describe the types of JavaTM Print Service attributes and how they can be collected into attribute sets.
import javax.print.attribute.standard	
Package javax.print.attribute.standard contains classes for specific printing attributes.
import javax.print.event	
Package javax.print.event contains event classes and listener interfaces.
import javax.rmi	
Contains user APIs for RMI-IIOP.
import javax.rmi.CORBA	
Contains portability APIs for RMI-IIOP.
import javax.rmi.ssl	
Provides implementations of RMIClientSocketFactory and RMIServerSocketFactory over the Secure Sockets Layer (SSL) or Transport Layer Security (TLS) protocols.
import javax.script	
The scripting API consists of interfaces and classes that define Java TM Scripting Engines and provides a framework for their use in Java applications.
import javax.security.auth	
This package provides a framework for authentication and authorization.
import javax.security.auth.callback	
This package provides the classes necessary for services to interact with applications in order to retrieve information (authentication data including usernames or passwords, for example) or to display information (error and warning messages, for example).
import javax.security.auth.kerberos	
This package contains utility classes related to the Kerberos network authentication protocol.
import javax.security.auth.login	
This package provides a pluggable authentication framework.
import javax.security.auth.spi	
This package provides the interface to be used for implementing pluggable authentication modules.
import javax.security.auth.x500	
This package contains the classes that should be used to store X500 Principal and X500 Private Credentials in a Subject.
import javax.security.cert	
Provides classes for public key certificates.
import javax.security.sasl	
Contains class and interfaces for supporting SASL.
import javax.sound.midi	
Provides interfaces and classes for I/O, sequencing, and synthesis of MIDI (Musical Instrument Digital Interface) data.
import javax.sound.midi.spi	
Supplies interfaces for service providers to implement when offering new MIDI devices, MIDI file readers and writers, or sound bank readers.
import javax.sound.sampled	
Provides interfaces and classes for capture, processing, and playback of sampled audio data.
import javax.sound.sampled.spi	
Supplies abstract classes for service providers to subclass when offering new audio devices, sound file readers and writers, or audio format converters.
import javax.sql	
Provides the API for server side data source access and processing from the JavaTM programming language.
import javax.sql.rowset	
Standard interfaces and base classes for JDBC RowSet implementations.
import javax.sql.rowset.serial	
Provides utility classes to allow serializable mappings between SQL types and data types in the Java programming language.
import javax.sql.rowset.spi	
The standard classes and interfaces that a third party vendor has to use in its implementation of a synchronization provider.
import javax.swing	
Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms.
import javax.swing.border	
Provides classes and interface for drawing specialized borders around a Swing component.
import javax.swing.colorchooser	
Contains classes and interfaces used by the JColorChooser component.
import javax.swing.event	
Provides for events fired by Swing components.
import javax.swing.filechooser	
Contains classes and interfaces used by the JFileChooser component.
import javax.swing.plaf	
Provides one interface and many abstract classes that Swing uses to provide its pluggable look-and-feel capabilities.
import javax.swing.plaf.basic	
Provides user interface objects built according to the Basic look and feel.
import javax.swing.plaf.metal	
Provides user interface objects built according to the Java look and feel (once codenamed Metal), which is the default look and feel.
import javax.swing.plaf.multi	
Provides user interface objects that combine two or more look and feels.
import javax.swing.plaf.nimbus	
Provides user interface objects built according to the cross-platform Nimbus look and feel.
import javax.swing.plaf.synth	
Synth is a skinnable look and feel in which all painting is delegated.
import javax.swing.table	
Provides classes and interfaces for dealing with javax.swing.JTable.
import javax.swing.text	
Provides classes and interfaces that deal with editable and noneditable text components.
import javax.swing.text.html	
Provides the class HTMLEditorKit and supporting classes for creating HTML text editors.
import javax.swing.text.html.parser	
Provides the default HTML parser, along with support classes.
import javax.swing.text.rtf	
Provides a class (RTFEditorKit) for creating Rich-Text-Format text editors.
import javax.swing.tree	
Provides classes and interfaces for dealing with javax.swing.JTree.
import javax.swing.undo	
Allows developers to provide support for undo/redo in applications such as text editors.
import javax.tools	
Provides interfaces for tools which can be invoked from a program, for example, compilers.
import javax.transaction	
Contains three exceptions thrown by the ORB machinery during unmarshalling.
import javax.transaction.xa	
Provides the API that defines the contract between the transaction manager and the resource manager, which allows the transaction manager to enlist and delist resource objects (supplied by the resource manager driver) in JTA transactions.
import javax.xml	 
import javax.xml.bind	
Provides a runtime binding framework for client applications including unmarshalling, marshalling, and validation capabilities.
import javax.xml.bind.annotation	
Defines annotations for customizing Java program elements to XML Schema mapping.
import javax.xml.bind.annotation.adapters	
XmlAdapter and its spec-defined sub-classes to allow arbitrary Java classes to be used with JAXB.
import javax.xml.bind.attachment	
This package is implemented by a MIME-based package processor that enables the interpretation and creation of optimized binary data within an MIME-based package format.
import javax.xml.bind.helpers	
JAXB Provider Use Only: Provides partial default implementations for some of the javax.xml.bind interfaces.
import javax.xml.bind.util	
Useful client utility classes.
import javax.xml.crypto	
Common classes for XML cryptography.
import javax.xml.crypto.dom	
DOM-specific classes for the javax.xml.crypto package.
import javax.xml.crypto.dsig	
Classes for generating and validating XML digital signatures.
/*javax.xml.crypto.dsig.dom	
DOM-specific classes for the javax.xml.crypto.dsig package.
javax.xml.crypto.dsig.keyinfo	
Classes for parsing and processing KeyInfo elements and structures.
javax.xml.crypto.dsig.spec	
Parameter classes for XML digital signatures.
javax.xml.datatype	
XML/Java Type Mappings.
javax.xml.namespace	
XML Namespace processing.
javax.xml.parsers	
Provides classes allowing the processing of XML documents.
javax.xml.soap	
Provides the API for creating and building SOAP messages.
javax.xml.stream	 
javax.xml.stream.events	 
javax.xml.stream.util	 
javax.xml.transform	
This package defines the generic APIs for processing transformation instructions, and performing a transformation from source to result.
javax.xml.transform.dom	
This package implements DOM-specific transformation APIs.
javax.xml.transform.sax	
This package implements SAX2-specific transformation APIs.
javax.xml.transform.stax	
Provides for StAX-specific transformation APIs.
javax.xml.transform.stream	
This package implements stream- and URI- specific transformation APIs.
javax.xml.validation	
This package provides an API for validation of XML documents.
javax.xml.ws	
This package contains the core JAX-WS APIs.
javax.xml.ws.handler	
This package defines APIs for message handlers.
javax.xml.ws.handler.soap	
This package defines APIs for SOAP message handlers.
javax.xml.ws.http	
This package defines APIs specific to the HTTP binding.
javax.xml.ws.soap	
This package defines APIs specific to the SOAP binding.
javax.xml.ws.spi	
This package defines SPIs for JAX-WS.
javax.xml.ws.spi.http	
Provides HTTP SPI that is used for portable deployment of JAX-WS web services in containers(for e.g.
javax.xml.ws.wsaddressing	
This package defines APIs related to WS-Addressing.
javax.xml.xpath	
This package provides an object-model neutral API for the evaluation of XPath expressions and access to the evaluation environment.
org.ietf.jgss	
This package presents a framework that allows application developers to make use of security services like authentication, data integrity and data confidentiality from a variety of underlying security mechanisms like Kerberos, using a unified API.
org.omg.CORBA	
Provides the mapping of the OMG CORBA APIs to the JavaTM programming language, including the class ORB, which is implemented so that a programmer can use it as a fully-functional Object Request Broker (ORB).
org.omg.CORBA_2_3	
The CORBA_2_3 package defines additions to existing CORBA interfaces in the Java[tm] Standard Edition 6.   These changes occurred in recent revisions to the CORBA API defined by the OMG.  The new methods were added to  interfaces derived from the corresponding interfaces in the CORBA package.  This provides backward compatibility and avoids breaking the JCK tests.
org.omg.CORBA_2_3.portable	
Provides methods for the input and output of value types, and contains other updates to the org/omg/CORBA/portable package.
org.omg.CORBA.DynAnyPackage	
Provides the exceptions used with the DynAny interface (InvalidValue, Invalid, InvalidSeq, and TypeMismatch).
org.omg.CORBA.ORBPackage	
Provides the exception InvalidName, which is thrown by the method ORB.resolve_initial_references and the exception InconsistentTypeCode, which is thrown by the Dynamic Any creation methods in the ORB class.
org.omg.CORBA.portable	
Provides a portability layer, that is, a set of ORB APIs that makes it possible for code generated by one vendor to run on another vendor's ORB.
org.omg.CORBA.TypeCodePackage	
Provides the user-defined exceptions BadKind and Bounds, which are thrown by methods in in the class TypeCode.
org.omg.CosNaming	
Provides a naming service for Java IDL.
org.omg.CosNaming.NamingContextExtPackage	
This package contains the following classes, which are used in org.omg.CosNaming.NamingContextExt:
org.omg.CosNaming.NamingContextPackage	
This package contains Exception classes for the org.omg.CosNaming package.
org.omg.Dynamic	
This package contains the Dynamic module specified in the OMG Portable Interceptor specification, http://cgi.omg.org/cgi-bin/doc?ptc/2000-08-06, section 21.9.
org.omg.DynamicAny	
Provides classes and interfaces that enable traversal of the data value associated with an any at runtime, and extraction of the primitive constituents of the data value.
org.omg.DynamicAny.DynAnyFactoryPackage	
This package contains classes and exceptions from the DynAnyFactory interface of the DynamicAny module specified in the OMG The Common Object Request Broker: Architecture and Specification, http://cgi.omg.org/cgi-bin/doc?formal/99-10-07, section 9.2.2.
org.omg.DynamicAny.DynAnyPackage	
This package contains classes and exceptions from the DynAny interface of the DynamicAny module specified in the OMG The Common Object Request Broker: Architecture and Specification, http://cgi.omg.org/cgi-bin/doc?formal/99-10-07, section 9.2.
org.omg.IOP	
This package contains the IOP module specified in the OMG document The Common Object Request Broker: Architecture and Specification, http://cgi.omg.org/cgi-bin/doc?formal/99-10-07, section 13.6.
org.omg.IOP.CodecFactoryPackage	
This package contains the exceptions specified in the IOP::CodeFactory interface (as part of the Portable Interceptors spec).
org.omg.IOP.CodecPackage	
This package is generated from the IOP::Codec IDL interface definition.
org.omg.Messaging	
This package contains the Messaging module specified in the OMG CORBA Messaging specification, http://cgi.omg.org/cgi-bin/doc?formal/99-10-07.
org.omg.PortableInterceptor	
Provides a mechanism to register ORB hooks through which ORB services can intercept the normal flow of execution of the ORB.
org.omg.PortableInterceptor.ORBInitInfoPackage	
This package contains the exceptions and typedefs from the ORBInitInfo local interface of the PortableInterceptor module specified in the OMG Portable Interceptor specification, http://cgi.omg.org/cgi-bin/doc?ptc/2000-08-06, section 21.7.2.
org.omg.PortableServer	
Provides classes and interfaces for making the server side of your applications portable across multivendor ORBs.
org.omg.PortableServer.CurrentPackage	
Provides method implementations with access to the identity of the object on which the method was invoked.
org.omg.PortableServer.POAManagerPackage	
Encapsulates the processing state of the POAs it is associated with.
org.omg.PortableServer.POAPackage	
Allows programmers to construct object implementations that are portable between different ORB products.
org.omg.PortableServer.portable	
Provides classes and interfaces for making the server side of your applications portable across multivendor ORBs.
org.omg.PortableServer.ServantLocatorPackage	
Provides classes and interfaces for locating the servant.*/
/*Provides the interfaces for the Document Object Model (DOM).*/
import org.w3c.dom.*;
import org.w3c.dom.bootstrap.*;
import org.w3c.dom.events.*;
import org.w3c.dom.ls.*;
import org.w3c.dom.views.*;
/*This package provides the core SAX APIs.*/
import org.xml.sax.*;
/*This package contains interfaces to SAX2 facilities that conformant SAX drivers won't necessarily support.*/
import org.xml.sax.ext.*;
/*This package contains "helper" classes, including support for bootstrapping SAX-based applications.*/
import org.xml.sax.helpers.*;

public class Package {

}
