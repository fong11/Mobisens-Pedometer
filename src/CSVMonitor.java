/*import java.io.File;

public class CSVMonitor implements FileListener
{
 
    private static File isoImage;
    private static File discLabel;
    private static DVDOrder dvdOrder;
    private static Order order;
    private static File job;
    private static FileMonitor fileMonitor = new FileMonitor (1000);
 
    public CSVMonitor(File iso, File img, Order order)
    {
        try
        {
            fileMonitor.addListener (this);
            CreateDisc.isoImage = iso;
...
   }
 
private static void buildJob()
    {
        Writer output = null;
        try
        {
            String isoPath = CreateDisc.isoImage.getAbsolutePath();
            String labelPath = CreateDisc.discLabel.getAbsolutePath();
            int priority = CreateDisc.order.getDiscPriority();
            String jobPath = Config.BURNER_JOB_PATH + CreateDisc.order.getCustName() + "_" + CreateDisc.order.getWebID() + ".meow";
            
            job = new File(jobPath);
            System.out.println("Adding \"job\" to the monitor...");
            fileMonitor.addFile(job);
            
            
            output = new BufferedWriter(new FileWriter(job));
 
            // Create a JobID
            output.write("JobID=" + CreateDisc.order.getCustName() + "_" + CreateDisc.order.getWebID() + "\n");
            // Create a ClientID
            output.write("ClientID=" + CreateDisc.order.getCustName() + "_" + CreateDisc.order.getWebID() + "\n");
            // Set a priority if we need one; otherwise, the application defaults to 4
            if (priority < 4)
            {
                output.write("Importance=" + priority + "\n");
            }
            // Set the ISO path
            output.write("ImageFile=" + isoPath + "\n");
            // Set the data type if it's a DVD
            if (CreateDisc.order.getDiscType().equals("DVD"))
            {
                output.write("DataImageType=UDF\n");
            }
            // Close the disc
            output.write("CloseDisc=YES\n");
            // The disc label path
            output.write("PrintLabel=" + labelPath + "\n");
            // Give the disc a name
            output.write("VolumeName=" + CreateDisc.order.getDiscName() + "\n");
            // Reject the disc if it isn't blank
            output.write("RejectIfNotBlank=YES\n");
            // Notify the client on errors
            output.write("NotifyClient=YES");
            // Set the drive ID
            //output.write("DriveID=");
            // Set the bin to pull the discs from
            //output.write("BinID=");
        }
        catch (IOException ex)
        {
            Logger.getLogger(CreateDisc.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            try
            {
                output.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(CreateDisc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
 
    public void fileChanged(File file)
    {
        System.out.println("File " + file.getName() + " has changed.");
    }*/