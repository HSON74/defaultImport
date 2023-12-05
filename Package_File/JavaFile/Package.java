
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
/*Provides the Java 2D classes for defining and performing operations on objects related to two-dimensional geometry.*/
import java.awt.geom.*;
/*Provides classes and interfaces for the input method framework.*/
import java.awt.im.*;
/*Provides interfaces that enable the development of input methods that can be used with any Java runtime environment.*/
import java.awt.im.spi.*;
/*Provides classes for creating and modifying images.*/
import java.awt.image.*;
/*Provides classes and interfaces for producing rendering-independent images.*/
import java.awt.image.renderable.*;
/*Provides classes and interfaces for a general printing API.*/
import java.awt.print.*;
/*Contains classes related to developing beans -- components based on the JavaBeans™ architecture.*/
import java.beans.*;
/*Provides classes and interfaces relating to bean context.*/
import java.beans.beancontext.*;
/*Provides for system input and output through data streams, serialization and the file system.*/
import java.io.*;
/*Provides classes that are fundamental to the design of the Java programming language.*/
import java.lang.*;
/*Provides library support for the Java programming language annotation facility.*/
import java.lang.annotation.*;
/*Provides services that allow Java programming language agents to instrument programs running on the JVM.*/
import java.lang.instrument.*;
/*The java.lang.invoke package contains dynamic language support provided directly by the Java core class libraries 
and virtual machine.*/
import java.lang.invoke.*;
/*Provides the management interfaces for monitoring and management of the Java virtual machine 
and other components in the Java runtime.*/
import java.lang.management.*;
/**/
import java.lang.module.*;
/*Provides reference-object classes, which support a limited degree of interaction with the garbage collector.*/
import java.lang.ref.*;
/*Provides classes and interfaces for obtaining reflective information about classes and objects.*/
import java.lang.reflect.*;
/*Provides classes for performing arbitrary-precision integer arithmetic (BigInteger) 
and arbitrary-precision decimal arithmetic (BigDecimal).*/
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
/*Provides the core classes for the Java Management Extensions.*/
import javax.management.*;
/*Provides the classes which implement advanced dynamic loading.*/
import javax.management.loading.*;
/*Provides the definition of the ModelMBean classes.*/
import javax.management.modelmbean.*;
/*Provides the definition of the monitor classes.*/
import javax.management.monitor.*;
/*Provides the open data types and Open MBean descriptor classes.*/
import javax.management.openmbean.*;
/*Provides the definition of the Relation Service.*/
import javax.management.relation.*;
/*Interfaces for remote access to JMX MBean servers.*/
import javax.management.remote.*;
/*The RMI connector is a connector for the JMX Remote API that uses RMI to transmit client requests to a remote MBean server.*/
import javax.management.remote.rmi.*;
/*Provides the definition of the Timer MBean.*/
import javax.management.timer.*;
/*Provides the classes and interfaces for accessing naming services.*/
import javax.naming.*;
/*Extends the javax.naming package to provide functionality for accessing directory services.*/
import javax.naming.directory.*;
/*Provides support for event notification when accessing naming and directory services.*/
import javax.naming.event.*;
/*Provides support for LDAPv3 extended operations and controls.*/
import javax.naming.ldap.*;
/**/
import javax.naming.spi.*;
/*Provides classes for networking applications.*/
import javax.net.*;
/*Provides classes for the secure socket package.*/
import javax.net.ssl.*;
/*Provides the principal classes and interfaces for the JavaTM Print Service API.*/
import javax.print.*;
/*Provides classes and interfaces that describe the types of JavaTM Print Service attributes and 
how they can be collected into attribute sets.*/
import javax.print.attribute.*;
/*Package javax.print.attribute.standard contains classes for specific printing attributes.*/
import javax.print.attribute.standard.*;
/*Package javax.print.event contains event classes and listener interfaces.*/
import javax.print.event.*;
/*Provides implementations of RMIClientSocketFactory and RMIServerSocketFactory over the Secure 
Sockets Layer (SSL) or Transport Layer Security (TLS) protocols.*/
import javax.rmi.ssl.*;
/*The scripting API consists of interfaces and classes that define Java TM Scripting Engines and provides a framework 
for their use in Java applications.*/
import javax.script.*;
/*This package provides a framework for authentication and authorization.*/
import javax.security.auth.*;
/*This package provides the classes necessary for services to interact with applications in order to retrieve information 
(authentication data including usernames or passwords, for example) or to display information (error and warning messages, 
for example).*/
import javax.security.auth.callback.*;
/*This package contains utility classes related to the Kerberos network authentication protocol.*/
import javax.security.auth.kerberos.*;
/*This package provides a pluggable authentication framework.*/
import javax.security.auth.login.*;
/*This package provides the interface to be used for implementing pluggable authentication modules.*/
import javax.security.auth.spi.*;
/*This package contains the classes that should be used to store X500 Principal and X500 Private Credentials in a Subject.*/
import javax.security.auth.x500.*;
/*Provides classes for public key certificates.*/
import javax.security.cert.*;
/*Contains class and interfaces for supporting SASL.*/
import javax.security.sasl.*;
/*Provides interfaces and classes for I/O, sequencing, and synthesis of MIDI (Musical Instrument Digital Interface) data.*/
import javax.sound.midi.*;
/*Supplies interfaces for service providers to implement when offering new MIDI devices, 
MIDI file readers and writers, or sound bank readers.*/
import javax.sound.midi.spi.*;
/*Provides interfaces and classes for capture, processing, and playback of sampled audio data.*/
import javax.sound.sampled.*;
/*Supplies abstract classes for service providers to subclass when offering new audio devices, 
sound file readers and writers, or audio format converters.*/
import javax.sound.sampled.spi.*;
/*Provides the API for server side data source access and processing from the JavaTM programming language.*/
import javax.sql.*;
/*Standard interfaces and base classes for JDBC RowSet implementations.*/
import javax.sql.rowset.*;
/*Provides utility classes to allow serializable mappings between SQL types and data types in the Java programming language.*/
import javax.sql.rowset.serial.*;
/*The standard classes and interfaces that a third party vendor has to use in its implementation of a synchronization provider.*/
import javax.sql.rowset.spi.*;
/*Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms.*/
import javax.swing.*;
/*Provides classes and interface for drawing specialized borders around a Swing component.*/
import javax.swing.border.*;
/*Contains classes and interfaces used by the JColorChooser component.*/
import javax.swing.colorchooser.*;
/*Provides for events fired by Swing components.*/
import javax.swing.event.*;
/*Contains classes and interfaces used by the JFileChooser component.*/
import javax.swing.filechooser.*;
/*Provides one interface and many abstract classes that Swing uses to provide its pluggable look-and-feel capabilities.*/
import javax.swing.plaf.*;
/*Provides user interface objects built according to the Basic look and feel.*/
import javax.swing.plaf.basic.*;
/*Provides user interface objects built according to the Java look and feel (once codenamed Metal), which is the default look and feel.*/
import javax.swing.plaf.metal.*;
/*Provides user interface objects that combine two or more look and feels.*/
import javax.swing.plaf.multi.*;
/*Provides user interface objects built according to the cross-platform Nimbus look and feel.*/
import javax.swing.plaf.nimbus.*;
/*Synth is a skinnable look and feel in which all painting is delegated.*/
import javax.swing.plaf.synth.*;
/*Provides classes and interfaces for dealing with javax.swing.JTable.*/
import javax.swing.table.*;
/*Provides classes and interfaces that deal with editable and noneditable text components.*/
import javax.swing.text.*;
/*Provides the class HTMLEditorKit and supporting classes for creating HTML text editors.*/
import javax.swing.text.html.*;
/*Provides the default HTML parser, along with support classes.*/
import javax.swing.text.html.parser.*;
/*Provides a class (RTFEditorKit) for creating Rich-Text-Format text editors.*/
import javax.swing.text.rtf.*;
/*Provides classes and interfaces for dealing with javax.swing.JTree.*/
import javax.swing.tree.*;
/*Allows developers to provide support for undo/redo in applications such as text editors.*/
import javax.swing.undo.*;
/*Provides interfaces for tools which can be invoked from a program, for example, compilers.*/
import javax.tools.*;
/*Provides the API that defines the contract between the transaction manager and the resource manager, 
which allows the transaction manager to enlist and delist resource objects 
(supplied by the resource manager driver) in JTA transactions.*/
import javax.transaction.xa.*;
/**/
import javax.xml.*;
/*Common classes for XML cryptography.*/
import javax.xml.crypto.*;
/*DOM-specific classes for the javax.xml.crypto package.*/
import javax.xml.crypto.dom.*;
/*Classes for generating and validating XML digital signatures.*/
import javax.xml.crypto.dsig.*;
/*DOM-specific classes for the javax.xml.crypto.dsig package.*/
import javax.xml.crypto.dsig.dom.*;
/*Classes for parsing and processing KeyInfo elements and structures.*/
import javax.xml.crypto.dsig.keyinfo.*;
/*Parameter classes for XML digital signatures.*/
import javax.xml.crypto.dsig.spec.*;
/*XML/Java Type Mappings.*/
import javax.xml.datatype.*;
/*XML Namespace processing.*/
import javax.xml.namespace.*;
/*Provides classes allowing the processing of XML documents.*/
import javax.xml.parsers.*;
/* */
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.stream.util.*;
/*This package defines the generic APIs for processing transformation instructions,and 
performing a transformation from source to result.*/
import javax.xml.transform.*;
/*This package implements DOM-specific transformation APIs.*/
import javax.xml.transform.dom.*;
/*This package implements SAX2-specific transformation APIs.*/
import javax.xml.transform.sax.*;
/*Provides for StAX-specific transformation APIs.*/
import javax.xml.transform.stax.*;
/*This package implements stream-and URI-specific transformation APIs.*/
import javax.xml.transform.stream.*;
/*This package provides an API for validation of XML documents.*/
import javax.xml.validation.*;
/*This package provides an object-model neutral API for the evaluation of XPath expressions and access to the evaluation environment.*/
import javax.xml.xpath.*;

/*This package presents a framework that allows application developers to make use of security 
services like authentication, data integrity and data confidentiality from a variety of underlying 
security mechanisms like Kerberos, using a unified API.*/
import org.ietf.jgss.*;
import org.xml.sax.*;
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
