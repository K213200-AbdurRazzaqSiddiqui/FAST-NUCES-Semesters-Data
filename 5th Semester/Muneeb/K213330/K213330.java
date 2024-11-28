interface ImageReader {
    void readFile(String fileName);
}

class BMPReader implements ImageReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("BMP file: " + fileName);
    }
}

class GifReader implements ImageReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("GIF file: " + fileName);
    }
}

class JpegReader implements ImageReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("JPEG file: " + fileName);
    }
}

class TiffReader implements ImageReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("TIFF file: " + fileName);
    }
}

class PSDReader implements ImageReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("PSD file: " + fileName);
    }
}

interface ImageReaderFactory {
    ImageReader createReader();
}

class BMPReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new BMPReader();
    }
}

class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new GifReader();
    }
}

class JpegReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new JpegReader();
    }
}

class TiffReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new TiffReader();
    }
}

class PSDReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new PSDReader();
    }
}

// K213330 class (client code)
public class K213330 {
    public static void main(String[] args) {
        ImageReaderFactory bmpFactory = new BMPReaderFactory();
        ImageReader bmpReader = bmpFactory.createReader();
        bmpReader.readFile("example.bmp");

        ImageReaderFactory gifFactory = new GifReaderFactory();
        ImageReader gifReader = gifFactory.createReader();
        gifReader.readFile("example.gif");

        ImageReaderFactory jpegFactory = new JpegReaderFactory();
        ImageReader jpegReader = jpegFactory.createReader();
        jpegReader.readFile("example.jpeg");

        ImageReaderFactory tiffFactory = new TiffReaderFactory();
        ImageReader tiffReader = tiffFactory.createReader();
        tiffReader.readFile("example.tiff");

        ImageReaderFactory psdFactory = new PSDReaderFactory();
        ImageReader psdReader = psdFactory.createReader();
        psdReader.readFile("example.psd");
    }
}
