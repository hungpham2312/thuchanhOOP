package baith10.bai1;

import java.io.*;

class MyFilterInputStream extends FilterInputStream {
    protected MyFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? c : Character.toLowerCase(c);
    }
}
