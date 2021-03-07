package JavaNetworking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAPI {


    @Test
    public void testSaveJsonToFile() {
        Assert.assertTrue(JsonAPI.saveJsonToFile(PropertyHandler.getInstance().getURL(), Constants.JSONDOC));

    }
    @Test
    public void testSaveToJavaObject() {
        Assert.assertTrue(JsonAPI.convertToObject(PropertyHandler.getInstance().getURL()));

    }
    @Test
    public void testSavePicture() {
        ImageDownloader imageDownloader = new ImageDownloader(PropertyHandler.getInstance().getPicURL(),Constants.IMAGENAME,new ImageDownloadListener(){
            @Override
            public void downloadStart()
            {
                System.out.println(" Image download started ");
            }

            @Override
            public void downloadFinish(String imageName)
            {
                System.out.println(" Image download finished");
            }


            @Override
            public void downloadError()
            {
                System.out.println(" Image download failed");
            }
        } );
        Thread t = new Thread(imageDownloader);
        t.start();
        Assert.assertTrue(imageDownloader.downloadImage());

    }
}
