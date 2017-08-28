package lesson16;

import java.io.*;

/**
 * Created by hillel on 21.08.17.
 */
public class NewClass implements Externalizable{
    private int i;
    private String s;
    private int ii;

    public NewClass(){

    }

    public NewClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public NewClass(int i, String s, int ii) {
        this.i = i;
        this.s = s;
        this.ii = ii;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", ii=" + ii +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(this.i);
        out.writeObject(this.s);
        out.writeInt(this.ii);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.i = in.readInt();
        this.s = (String) in.readObject();
        this.ii = in.readInt();
    }
}
