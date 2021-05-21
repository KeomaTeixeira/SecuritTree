


//Importing all needed components
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;
import java.sql.*;
public class JavaTreeWithDB extends JFrame {
// Declaring all variables locally to reuse in every function    
    JTree tree;
    JTextField jtf;
    Connection conn;
    Statement stmt,stmt1,stmt2;
    ResultSet rs,rs1,rs2;
    public JavaTreeWithDB(){
    
        Container contentPane=getContentPane();
        
        contentPane.setLayout(new BorderLayout());
//-----------------------------------------------------------------------------------------------------------------------------------------------        
/*
 * PLEASE NOTE THE SAME CODE IS REUSED FOR EACH SECTION OF THE HIERARCHY
 * DOORS_PARENT_AREA IS CHANGING IN EVERY SECTION THIS MAKING THE DOORS IN THAT AREA DISPLAY AND NOT ALL.
 * ACCESS_RULES_DOORS IS CHANGING IN EVERY SECTION THIS MAKING THE ACCESS RULES ONLY IN THAT AREA DISPLAY AND NOT ALL.
 */

//-----------------------------------------------------------------------------------------------------------------------------------------------     
// Wonka Factory

        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Wonka Factory");               
        
        DefaultMutableTreeNode DoorsWonkaFactory=new DefaultMutableTreeNode("Doors");  //Creating Basic Structure for the Hierarchy
        root.add(DoorsWonkaFactory);
        
        DefaultMutableTreeNode AccessRulesWonkaFactory=new DefaultMutableTreeNode("Access Rules");
        root.add(AccessRulesWonkaFactory);
        
        //database Connection
        String currentDir=System.getProperty("user.dir");
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='6C4E2C5D-BBBB-4386-AA71-B7F56727433C'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='EA0F4EAA-5666-4439-9E5D-6A4FFEB578DF' OR access_rules_doors='126A73D3-2148-4DA9-9332-867571884AA1'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status")); //Assigning values to the hierarchy from db.
            DoorsWonkaFactory.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name")); //Assigning values to the hierarchy from db.
            AccessRulesWonkaFactory.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------        
// Chocolate Room

        DefaultMutableTreeNode ChocolateRoom=new DefaultMutableTreeNode("Chocolate Room");
        root.add(ChocolateRoom);
        
        DefaultMutableTreeNode ChocolateRoomDoors=new DefaultMutableTreeNode("Doors");
        ChocolateRoom.add(ChocolateRoomDoors);
        
        DefaultMutableTreeNode AccessRulesChocolateRoom=new DefaultMutableTreeNode("Access Rules");
        ChocolateRoom.add(AccessRulesChocolateRoom);
        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='CBB8569D-C331-4629-A1F7-236BFA1A2822'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='FD9FFD2F-B8F4-4670-ACE3-82A1D6E09441' OR access_rules_doors='BF8F4D8D-26AC-4650-85E0-3CD672B93EEB'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            ChocolateRoomDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesChocolateRoom.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------        
// Chocolate River

        DefaultMutableTreeNode ChocolateRiver=new DefaultMutableTreeNode("Chocolate River");
        ChocolateRoom.add(ChocolateRiver);
        
        DefaultMutableTreeNode ChocolateRiverDoors=new DefaultMutableTreeNode("Doors");
        ChocolateRiver.add(ChocolateRiverDoors);
        
        DefaultMutableTreeNode AccessRulesChocolateRiver=new DefaultMutableTreeNode("Access Rules");
        ChocolateRiver.add(AccessRulesChocolateRiver);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='64F25F3B-0F65-45EE-92A7-2B53E58B5CDD'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='FD9FFD2F-B8F4-4670-ACE3-82A1D6E09441'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            ChocolateRiverDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesChocolateRiver.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Chocolate RiverPipeLineOne

        DefaultMutableTreeNode ChocolateRiverPipeLineOne=new DefaultMutableTreeNode("Chocolate River Pipeline One");
        ChocolateRiver.add(ChocolateRiverPipeLineOne);
        

        
        DefaultMutableTreeNode ChocolateRiverPipeLineOneDoors=new DefaultMutableTreeNode("Doors");
        ChocolateRiverPipeLineOne.add(ChocolateRiverPipeLineOneDoors);

        DefaultMutableTreeNode AccessRulesChocolateRiverPipeLineOnee=new DefaultMutableTreeNode("Access Rules");
        ChocolateRiverPipeLineOne.add(AccessRulesChocolateRiverPipeLineOnee); 
        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='7EE29BBE-259C-402B-B870-7C32FC845674'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_id='A81EAF69-E737-4DCB-925A-B4F27BD3C119' OR access_rules_id='186DD659-EC26-4AA2-8389-706E58284171' OR access_rules_id='DC872B88-2D3C-4E1A-87E1-85D45D1503C9'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            ChocolateRiverPipeLineOneDoors.add(Doors);
            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesChocolateRiverPipeLineOnee.add(Access);
            }
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                  
// Chocolate RiverPipeLineTwentyThree

        DefaultMutableTreeNode ChocolateRiverPipeLineTwentyThree=new DefaultMutableTreeNode("Chocolate River Pipeline Twenty Three");
        ChocolateRiver.add(ChocolateRiverPipeLineTwentyThree);
        
        DefaultMutableTreeNode ChocolateRiverPipeLineTwentyThreeDoors=new DefaultMutableTreeNode("Doors");
        ChocolateRiverPipeLineTwentyThree.add(ChocolateRiverPipeLineTwentyThreeDoors);
        
        DefaultMutableTreeNode AccessRulesChocolateRiverPipeLineTwentyThree=new DefaultMutableTreeNode("Access Rules");
        ChocolateRiverPipeLineTwentyThree.add(AccessRulesChocolateRiverPipeLineTwentyThree);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='24D54F49-1D8C-417A-9B43-AC12F43DE294'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_id='A81EAF69-E737-4DCB-925A-B4F27BD3C119' OR access_rules_id='186DD659-EC26-4AA2-8389-706E58284171' OR access_rules_id='DC872B88-2D3C-4E1A-87E1-85D45D1503C9'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            ChocolateRiverPipeLineTwentyThreeDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesChocolateRiverPipeLineTwentyThree.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------------------------                
// Sugar Grass Meadows

        DefaultMutableTreeNode SugarGrassMeadows=new DefaultMutableTreeNode("Sugar Grass Meadows");
        ChocolateRoom.add(SugarGrassMeadows);
        
        DefaultMutableTreeNode SugarGrassMeadowsDoors=new DefaultMutableTreeNode("Doors");
        SugarGrassMeadows.add(SugarGrassMeadowsDoors);
        
        DefaultMutableTreeNode AccessRulesSugarGrassMeadows=new DefaultMutableTreeNode("Access Rules");
        SugarGrassMeadows.add(AccessRulesSugarGrassMeadows);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='F29B9474-CABC-46E3-8B75-66281ABFBA92'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='78A2F6A7-A20B-4E99-BCB8-439C28D92825' OR access_rules_doors='094F5C91-0E13-4712-8382-1B4B829C4111'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            SugarGrassMeadowsDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesSugarGrassMeadows.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                        
// Lawn Mower Shed

        DefaultMutableTreeNode LawnMowerShed=new DefaultMutableTreeNode("Lawn Mower Shed");
        SugarGrassMeadows.add(LawnMowerShed);
        
        DefaultMutableTreeNode LawnMowerShedDoors=new DefaultMutableTreeNode("Doors");
        LawnMowerShed.add(LawnMowerShedDoors);
        
        DefaultMutableTreeNode AccessRulesLawnMowerShed=new DefaultMutableTreeNode("Access Rules");
        LawnMowerShed.add(AccessRulesLawnMowerShed);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='EB3741EF-929D-430C-B637-EA5425ABB0E7'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='78A2F6A7-A20B-4E99-BCB8-439C28D92825'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            LawnMowerShedDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesLawnMowerShed.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------------------------                
// Fear Tunnel

        DefaultMutableTreeNode FearTunnel=new DefaultMutableTreeNode("Fear Tunnel");
        ChocolateRoom.add(FearTunnel );
        
        DefaultMutableTreeNode FearTunnelDoors=new DefaultMutableTreeNode("Doors");
        FearTunnel.add(FearTunnelDoors);
        
        DefaultMutableTreeNode AccessRulesFearTunnel=new DefaultMutableTreeNode("Access Rules");
        FearTunnel.add(AccessRulesFearTunnel);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='A44424B0-3253-4EE7-9060-7C977F4840C8'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='AB296B73-8C37-4549-AD03-26D35541F37E' OR access_rules_doors='FD86E996-9087-4B0B-A61D-CC821B7CCC9F'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            FearTunnelDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesFearTunnel.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------
// Research & Development

        DefaultMutableTreeNode ResearchDevelopment=new DefaultMutableTreeNode("Research & Development");
        root.add(ResearchDevelopment);
        
        DefaultMutableTreeNode ResearchDevelopmentDoors=new DefaultMutableTreeNode("Doors");
        ResearchDevelopment.add(ResearchDevelopmentDoors);
        
        DefaultMutableTreeNode AccessRulesResearchDevelopment=new DefaultMutableTreeNode("Access Rules");
        ResearchDevelopment.add(AccessRulesResearchDevelopment);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='B8501AFC-AD8F-4EBD-B733-87D9DA6AD713'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='25B59AFC-3E85-4793-815D-1E2B2ECD0253' OR access_rules_doors='CC46EA77-4326-4F41-BD5A-CD8510D208BF' OR access_rules_doors='413CC597-47A5-4624-B409-9E1FFC85D325'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            ResearchDevelopmentDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesResearchDevelopment.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------        
// Lick-Able Wallpaper Wall

        DefaultMutableTreeNode LickableWallpaper=new DefaultMutableTreeNode("Lick-Able Wallpaper Wall");
        ResearchDevelopment.add(LickableWallpaper);
        
        DefaultMutableTreeNode LickableWallpaperDoors=new DefaultMutableTreeNode("Doors");
        LickableWallpaper.add(LickableWallpaperDoors);
        
        DefaultMutableTreeNode AccessRulesLickableWallpaper=new DefaultMutableTreeNode("Access Rules");
        LickableWallpaper.add(AccessRulesLickableWallpaper);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='57569BE4-FF4A-4C56-A274-A24CBB7E4672'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='90B28026-FDBF-4F52-AFE8-A5774B10DADD'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            LickableWallpaperDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesLickableWallpaper.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Juicing Room

        DefaultMutableTreeNode JuicingRoom=new DefaultMutableTreeNode("Juicing Room");
        ResearchDevelopment.add(JuicingRoom);
        
        DefaultMutableTreeNode JuicingRoomDoors=new DefaultMutableTreeNode("Doors");
        JuicingRoom.add(JuicingRoomDoors);
        
        DefaultMutableTreeNode AccessRulesJuicingRoom=new DefaultMutableTreeNode("Access Rules");
        JuicingRoom.add(AccessRulesJuicingRoom);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='A31CDB07-17EE-4F50-B635-247BB9163EDF'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='78A2F6A7-A20B-4E99-BCB8-439C28D92825'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            JuicingRoomDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesJuicingRoom.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Fizzy-Lifting Drink Room

        DefaultMutableTreeNode FizzyDrink=new DefaultMutableTreeNode("Fizzy-Lifting Drink Room");
        ResearchDevelopment.add(FizzyDrink);
        
        DefaultMutableTreeNode FizzyDrinkDoors=new DefaultMutableTreeNode("Doors");
        FizzyDrink.add(FizzyDrinkDoors);
        
        DefaultMutableTreeNode AccessRulesFizzyDrink=new DefaultMutableTreeNode("Access Rules");
        FizzyDrink.add(AccessRulesFizzyDrink);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='F33941A1-7623-4192-80E0-7B1511C17883'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='90B28026-FDBF-4F52-AFE8-A5774B10DADD'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            FizzyDrinkDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesFizzyDrink.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Nut Room

        DefaultMutableTreeNode NutRoom=new DefaultMutableTreeNode("Nut Room");
        ResearchDevelopment.add(NutRoom);
        
        DefaultMutableTreeNode NutRoomDoors=new DefaultMutableTreeNode("Doors");
        NutRoom.add(NutRoomDoors);
        
        DefaultMutableTreeNode AccessRulesNutRoom=new DefaultMutableTreeNode("Access Rules");
        NutRoom.add(AccessRulesNutRoom);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='93179369-BD5D-42CE-A266-8F164D9C0700'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='CC46EA77-4326-4F41-BD5A-CD8510D208BF'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            NutRoomDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesNutRoom.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Garbage Chute

        DefaultMutableTreeNode Garbage=new DefaultMutableTreeNode("Garbage Chute");
        NutRoom.add(Garbage);
        
        DefaultMutableTreeNode GarbageDoors=new DefaultMutableTreeNode("Doors");
        Garbage.add(GarbageDoors);
        
        //DefaultMutableTreeNode GarbageDoorss=new DefaultMutableTreeNode("Access Rule");
        //Garbage.add(GarbageDoorss);
        
        DefaultMutableTreeNode AccessRulesGarbage=new DefaultMutableTreeNode("Access Rules");
        Garbage.add(AccessRulesGarbage);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='51E7ABC4-7F01-42EF-A6F2-E8E3379FBB26'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='4415D5B1-AA7D-4732-BEA6-99B610B2FDBF'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            GarbageDoors.add(Doors);
            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesGarbage.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------        
// INCINERATOR

        DefaultMutableTreeNode Incinerator=new DefaultMutableTreeNode("Incinerator");
        Garbage.add(Incinerator);
        
        DefaultMutableTreeNode IncineratorDoors=new DefaultMutableTreeNode("Doors");
        Incinerator.add(IncineratorDoors);
        
        DefaultMutableTreeNode AccessRulesIncinerator=new DefaultMutableTreeNode("Access Rules");
        Incinerator.add(AccessRulesIncinerator);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='C9191B2C-08D1-48F0-8F19-FE4FA92A852A'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='4415D5B1-AA7D-4732-BEA6-99B610B2FDBF'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            IncineratorDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesIncinerator.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------
// WonkaVision Studio

        DefaultMutableTreeNode Studio=new DefaultMutableTreeNode("Wonkavision Studio");
        ResearchDevelopment.add(Studio);
        
        DefaultMutableTreeNode StudioDoors=new DefaultMutableTreeNode("Doors");
        Studio.add(StudioDoors);
        
        DefaultMutableTreeNode AccessRulesStudio=new DefaultMutableTreeNode("Access Rules");
        Studio.add(AccessRulesStudio);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='A7DF2E8E-71DD-4C32-AE92-EE33E2D4DF18'");
            rs1=stmt1.executeQuery("SELECT DISTINCT access_rules_name FROM system_data WHERE access_rules_doors='9EB36867-9AAD-4A3B-B436-0476CDC10624' OR access_rules_doors='094F5C91-0E13-4712-8382-1B4B829C4111'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            StudioDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesStudio.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------                
// Mount Fudge

        DefaultMutableTreeNode MountFudge=new DefaultMutableTreeNode("Mount Fudge");
        ResearchDevelopment.add(MountFudge);
        
        DefaultMutableTreeNode MountFudgeDoors=new DefaultMutableTreeNode("Doors");
        MountFudge.add(MountFudgeDoors);
        
        DefaultMutableTreeNode AccessRulesMountFudge=new DefaultMutableTreeNode("Access Rules");
        MountFudge.add(AccessRulesMountFudge);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='BD506F8D-F4CD-4E19-ABCA-573808390FB6'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='2D8D7EA3-0AE4-4127-987F-C7A69726BDBF'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            MountFudgeDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesMountFudge.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------         
// Rock Candy Mine

        DefaultMutableTreeNode RockCandyMine=new DefaultMutableTreeNode("Rock Candy Mine");
        MountFudge.add(RockCandyMine);
        
        DefaultMutableTreeNode RockCandyMineDoors=new DefaultMutableTreeNode("Doors");
        RockCandyMine.add(RockCandyMineDoors);
        
        DefaultMutableTreeNode AccessRulesRockCandyMine=new DefaultMutableTreeNode("Access Rules");
        RockCandyMine.add(AccessRulesRockCandyMine);        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            rs=stmt.executeQuery("select * from system_data WHERE doors_parent_area='36BFBBB6-15ED-4222-9528-9830434A59FC'");
            rs1=stmt1.executeQuery("select * from system_data WHERE access_rules_doors='2D8D7EA3-0AE4-4127-987F-C7A69726BDBF'");
            while(rs.next())
            {          
            DefaultMutableTreeNode Doors=new DefaultMutableTreeNode(rs.getString("doors_name")+(" ")+rs.getString("doors_status"));
            RockCandyMineDoors.add(Doors);

            }
            
            while(rs1.next()){
            DefaultMutableTreeNode Access=new DefaultMutableTreeNode(rs1.getString("access_rules_name"));
            AccessRulesRockCandyMine.add(Access);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------------------------------------        
               
// Adding All components to Jframe
        tree=new JTree(root);
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp=new JScrollPane(tree,v,h);
        contentPane.add(jsp,BorderLayout.CENTER);
        jtf=new JTextField(" ",20);
        contentPane.add(jtf,BorderLayout.SOUTH);
        tree.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent me){
        doMouseClicked(me);
        }

// Display Current Directory in Hierarchy        
        private void doMouseClicked(MouseEvent me){
            TreePath tp=tree.getPathForLocation(me.getX(),me.getY());
            
            if(tp!=null)
                jtf.setText(tp.toString());
                else
                jtf.setText(" ");
        }
       
        });
      this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Closes the hierarchy and return to main application.
        

    }
    
    public static void main(String[] args) {
        JavaTreeWithDB obj= new JavaTreeWithDB();
        obj.setVisible(true);
        obj.setSize(600,1000);
        obj.setLocationRelativeTo(null);
        

        
    }
    
}
