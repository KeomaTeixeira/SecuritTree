# SecuriTree


### Overview

SecuriTree is a desktop application that provides a visual tree view of the security and 
access control units. This application will allow authorised security operatives 
to monitor and manage each physical security and access control unit.<br />

SecuriTree is developed with Java since Java is platform-independent. 
Its programs can be easily accessed on any OS or processor since the 
java virtual machine can identify platforms and convert the codes accordingly.<br />

Using Java allows for object oriented programming to reuse functions and make n an object-oriented system, 
the amount of work involved in revising and maintaining the system is reduced, 
since many problems can be detected and corrected in the design phase.<br />

Java includes many libraries which allows you to expand what Java can do and rely on code that's
already tested and working. Libraries allows for fast and simple GUI creation SecuriTree's GUI was developed by using
built in Java libraries.<br />

SecuriTree uses an embedded Java database , Apache Derby which is an open source relational database implemented entirely 
in Java. Derby is based on the Java, JDBC, and SQL standards andprovides an embedded JDBC driver that lets you embed Derby 
in any Java-based solution.<br />

The reasons SecuriTree uses Apache Derby : 

Platform independent − Derby uses on-disc database format where the databases in it are stored in a file in the disc within the directory with the same name as the database.

No modifying data − Because of this, you can move derby databases to other machines without modifying the data.

Transactional support − Derby provides complete support for transactions ensuring data integrity.

Including databases − You can include pre-build/existing databases into your current derby applications.

Less space − Derby database has a small footprint, i.e., it occupies less space and it is easy to use and deploy it.

Embed with Java Application − Derby provides an embedded database engine which can be embedded in to Java applications and it will be run in the same JVM as the application. Simply loading the driver starts the database and it stops with the applications.

Derby allows you to configure a database for encryption when you create it SecuriTree uses a encrypted database to ensure all data is secure.<br />


### The GUI
The GUI consists of the following interfaces which a user interacts with.

#### Login Interface
The  user will be able to enter his/her credentials , then a connection will be made to the database to verify the credentials ,
if the incorrect credentials is provided the application will display a error message stating the credentials is incorrect.
The application does not specify which credentials is incorrect username or password this making it more secure. 

#### Security Dashboard
After successfull login to the application the user will be displayed with three options View Hierarchy, Manage Doors and Logout.

#### Manage Doors
A user will be allowed to open or close doors from the Manage Doors Interface.<br /><br />
<br />
<br />


### Architecture Diagram
![System Architecture](https://user-images.githubusercontent.com/49724009/119129139-cfaaa700-ba36-11eb-905d-0221638028b2.png)

### Setup Instructions
1. Download the SecuriTree Application Folder the folder includes the database and neccesary libraries.
2. Run SecuriTree.exe (The exe requires Java Runtime Environment).
3. When promted to install Java Runtime Environment continue with the installation steps provided.
4. After Java Runtime Environment is installed you can open SecuriTree.exe
